package com.example.videoproject;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class VideoActivity extends AppCompatActivity {

    private static final int REQUEST_VIDEO_CAPTURE = 1;
    private String videoPath;
    private ImageView thumbnailView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        thumbnailView = findViewById(R.id.thumbnailView);

        // Assuming there's a button to start video recording
        findViewById(R.id.recordButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakeVideoIntent();
            }
        });

        // Assuming there's a button to play the recorded video
        findViewById(R.id.playButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPlayButtonClicked();
            }
        });
    }

    private void dispatchTakeVideoIntent() {
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (takeVideoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_OK) {
            Uri videoUri = data.getData();
            videoPath = getRealPathFromURI(videoUri);

            // Refresh media store
            refreshMediaStore(this, videoPath);

            // Generate and display thumbnail immediately after recording
            Bitmap thumbnail = getVideoThumbnail(videoPath);
            if (thumbnail != null) {
                thumbnailView.setImageBitmap(thumbnail);
            }
        }
    }

    private String getRealPathFromURI(Uri contentUri) {
        String[] proj = {MediaStore.Video.Media.DATA};
        Cursor cursor = getContentResolver().query(contentUri, proj, null, null, null);
        if (cursor == null) return null;
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA);
        cursor.moveToFirst();
        String path = cursor.getString(column_index);
        cursor.close();
        return path;
    }

    private Bitmap getVideoThumbnail(String videoPath) {
        return ThumbnailUtils.createVideoThumbnail(videoPath, MediaStore.Video.Thumbnails.MINI_KIND);
    }

    private void refreshMediaStore(Context context, String videoPath) {
        Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        File videoFile = new File(videoPath);
        Uri contentUri = Uri.fromFile(videoFile);
        mediaScanIntent.setData(contentUri);
        context.sendBroadcast(mediaScanIntent);
    }

    private void onPlayButtonClicked() {
        // Play the video
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoPath));
        intent.setDataAndType(Uri.parse(videoPath), "video/mp4");
        startActivity(intent);

        // Generate thumbnail after playback
        Bitmap thumbnail = getVideoThumbnail(videoPath);
        if (thumbnail != null) {
            thumbnailView.setImageBitmap(thumbnail);
        }
    }
}
