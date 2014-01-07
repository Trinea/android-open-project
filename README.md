Android Open Source Projects
====================
*经常有朋友问某个效果怎么实现或是否有某个库完成某个功能，  
于是分类汇总了那些不错的Android开源项目，供大家一起学习*

欢迎大家推荐好的Android开源项目，请`Star`、`Fork`或在 [收集&提交页](https://github.com/Trinea/android-open-project/issues/1) 中告诉我 :) 

## 目前包括：  
>[Android开源项目第一篇——个性化控件(View)篇](http://www.trinea.cn/android/android-open-source-projects-view/)  
*&nbsp;&nbsp;包括ListView、ActionBar、Menu、ViewPager、Gallery、GridView、ImageView、ProgressBar等等*  
[Android开源项目第二篇——工具库篇](http://www.trinea.cn/android/android-open-source-projects-dev-lib/)  
*&nbsp;&nbsp;包括依赖注入框架、图片缓存、网络相关、数据库ORM建模、Android公共库、高版本向低版本兼容库、多媒体等等*  
[Android开源项目第三篇——优秀项目篇](http://www.trinea.cn/android/android-open-source-projects-excellent-project/)  
*&nbsp;&nbsp;比较有意思的完整的Android项目*  
[Android开源项目第四篇——开发及测试工具篇](http://www.trinea.cn/android/android-open-source-projects-dev-tool/)  
*&nbsp;&nbsp;包括开发自测、自动化测试、编译打包相关工具*  
[Android开源项目第五篇——优秀个人和团体篇](http://www.trinea.cn/android/android-open-source-projects-excellent-personal-group/)  
*&nbsp;&nbsp;乐于分享并且有一些很不错的开源项目的个人和组织，包括JakeWharton、Chris Banes、Koushik Dutta等大牛*
  
*感谢[youxiachai](https://github.com/youxiachai)补充*  
## 第一部分 个性化控件(View)  
主要介绍那些不错个性化的View，包括ListView、ActionBar、Menu、ViewPager、Gallery、GridView、ImageView、ProgressBar及其他如Dialog、Toast、EditText、TableView、Activity Animation等等。  
#### 一、ListView  
1. android-pulltorefresh 一个强大的拉动刷新开源项目，支持各种控件下拉刷新  
ListView、ViewPager、WevView、ExpandableListView、GridView、(Horizontal  
)ScrollView、Fragment上下左右拉动刷新，比下面johannilsson那个只支持ListView的强大的多。并且他实现的下拉刷新ListView在item不足一屏情况下也不会显示刷新提示，体验更好。  
项目地址：https://github.com/chrisbanes/Android-PullToRefresh  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/pull-to-refreshview-demo.apk?raw=true  
APP示例：新浪微博各个页面  
   
2. android-pulltorefresh-listview 下拉刷新ListView  
项目地址：https://github.com/johannilsson/android-pulltorefresh  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/pull-to-refresh-listview-demo.apk?raw=true  
PS：这个被很多人使用的项目实际有不少bug，推荐使用上面的android-pulltorefresh  
   
3. DropDownListView 下拉刷新及滑动到底部加载更多ListView  
项目地址：https://github.com/Trinea/AndroidCommon  
Demo地址：https://play.google.com/store/apps/details?id=cn.trinea.android.demo  
文档介绍：http://www.trinea.cn/?p=523  
   
4. DragSortListView 拖动排序的ListView  
同时支持ListView滑动item删除，各个Item高度不一、单选、复选、CursorAdapter做为适配器、拖动背景变化等  
项目地址：https://github.com/bauerca/drag-sort-listview  
Demo地址：https://play.google.com/store/apps/details?id=com.mobeta.android.demodslv  
APP示例：Wordpress Android  
   
5. SwipeListView 支持定义ListView左右滑动事件，支持左右滑动位移，支持定义动画时间  
项目地址：https://github.com/47deg/android-swipelistview  
Demo地址：https://play.google.com/store/apps/details?id=com.fortysevendeg.android.swipelistview  
APP示例：微信  
   
6. Android-SwipeToDismiss 滑动Item消失ListView  
项目地址：https://github.com/romannurik/Android-SwipeToDismiss  
支持3.0以下版本见：https://github.com/JakeWharton/SwipeToDismissNOA  
Demo地址：https://github.com/JakeWharton/SwipeToDismissNOA/SwipeToDismissNOA.apk/qr_code  
   
7. StickyListHeaders GroupName滑动到顶端时会固定不动直到另外一个GroupName到达顶端的ExpandListView，支持快速滑动，支持Android2.3及以上  
项目地址：https://github.com/emilsjolander/StickyListHeaders  
APP示例：Android 4.0联系人  
效果图：![Renderings](https://raw.github.com/emilsjolander/StickyListHeaders/master/demo.gif)  
   
8. pinned-section-listview GroupName滑动到顶端时会固定不动直到另外一个GroupName到达顶端的ExpandListView  
项目地址：https://github.com/beworker/pinned-section-listview  
效果图：![Renderings](https://raw.github.com/beworker/pinned-section-listview/master/screen1.png)  
   
9. PinnedHeaderListView GroupName滑动到顶端时会固定不动直到另外一个GroupName到达顶端的ExpandListView  
项目地址：https://github.com/JimiSmith/PinnedHeaderListView  
   
10. QuickReturnHeader ListView/ScrollView的header或footer，当向下滚动时消失，向上滚动时出现  
项目地址：https://github.com/ManuelPeinado/QuickReturnHeader  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/quick-return-header-demo.apk?raw=true  
APP示例：google plus  
   
11. IndexableListView ListView右侧会显示item首字母快捷索引，点击可快速滑动到某个item  
项目地址：https://github.com/woozzu/IndexableListView  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/indexable-listview.apk?raw=true  
APP示例：微信通讯录、小米联系人  
   
12. CustomFastScrollView ListView快速滑动，同时屏幕中间PopupWindows显示滑动到的item内容或首字母  
项目地址：https://github.com/nolanlawson/CustomFastScrollViewDemo  
效果图：![Renderings](https://raw.github.com/nolanlawson/CustomFastScrollViewDemo/master/example.png)  
   
13. Android-ScrollBarPanel ListView滑动时固定的Panel指示显示在scrollbar旁边  
项目地址：https://github.com/rno/Android-ScrollBarPanel  
效果展示：https://github.com/rno/Android-ScrollBarPanel/raw/master/demo_capture.png  
   
14. SlideExpandableListView 用户点击listView item滑出固定区域，其他item的区域收缩  
项目地址：https://github.com/tjerkw/Android-SlideExpandableListView  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/slide-expandable-listView-demo.apk?raw=true  
   
15. JazzyListView ListView及GridView item以特殊动画效果进入屏幕，效果包括grow、cards、curl、wave、flip、fly等等  
项目地址：https://github.com/twotoasters/JazzyListView  
Demo地址：https://play.google.com/store/apps/details?id=com.twotoasters.jazzylistview.sample  
效果展示：http://lab.hakim.se/scroll-effects/  
   
16. ListViewAnimations 带Item显示动画的ListView，动画包括底部飞入、其他方向斜飞入、下层飞入、渐变消失、滑动删除等  
项目地址：https://github.com/nhaarman/ListViewAnimations  
Demo地址：https://play.google.com/store/apps/details?id=com.haarman.listviewanimations  
APP示例：Google plus、Google Now卡片式进入、小米系统中应用商店、联系人、游戏中心、音乐、文件管理器的ListView、Ultimate、Light Flow Lite、TreinVerkeer、Running Coach、Pearl Jam Lyrics、Calorie Chart、Car Hire、Super BART、DK FlashCards、Counter Plus、Voorlees Verhaaltjes 2.0  
   
17. DevsmartLib-Android 横向ListView  
项目地址：https://github.com/dinocore1/DevsmartLib-Android  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/horizontal-listview-demo.apk?raw=true  
   
#### 二、ActionBar  
1. ActionBarSherlock 为Android所有版本提供统一的ActionBar，解决4.0以下ActionBar的适配问题  
项目地址：https://github.com/JakeWharton/ActionBarSherlock  
Demo地址：https://play.google.com/store/apps/details?id=com.actionbarsherlock.sample.demos  
APP示例：太多了。。现在连google都在用  
   
2. ActionBar-PullToRefresh 下拉刷新，ActionBar出现加载中提示  
项目地址：https://github.com/chrisbanes/ActionBar-PullToRefresh  
Demo地址：https://play.google.com/store/apps/details?id=uk.co.senab.actionbarpulltorefresh.samples.stock  
APP示例：Gmail，Google plus，知乎等  
   
3. FadingActionBar ListView向下滚动逐渐显现的ActionBar  
项目地址：https://github.com/ManuelPeinado/FadingActionBar  
Demo地址：https://play.google.com/store/apps/details?id=com.manuelpeinado.fadingactionbar.demo  
APP示例：google music，知乎  
   
4. NotBoringActionBar google music下拉收缩的ActionBar  
项目地址：https://github.com/flavienlaurent/NotBoringActionBar  
Demo地址：http://flavienlaurent.com/blog/2013/11/20/making-your-action-bar-not-boring/  
APP示例：Google音乐  
   
5. RefreshActionItem 带进度显示和刷新按钮的ActionBar  
项目地址：https://github.com/ManuelPeinado/RefreshActionItem  
Demo地址：https://play.google.com/store/apps/details?id=com.manuelpeinado.refreshactionitem.demo  
APP示例：The New York Times，DevAppsDirect.  
   
6. GlassActionBar 类似玻璃的有一定透明度的ActionBar  
项目地址：https://github.com/ManuelPeinado/GlassActionBar  
Demo地址：https://play.google.com/store/apps/details?id=com.manuelpeinado.glassactionbardemo  
APP示例：google music  
   
#### 三、Menu   
1. MenuDrawer 滑出式菜单，通过拖动屏幕边缘滑出菜单，支持屏幕上下左右划出，支持当前View处于上下层，支持Windows边缘、ListView边缘、ViewPager变化划出菜单等。  
项目地址：https://github.com/SimonVT/android-menudrawer  
Demo地址：http://simonvt.github.io/android-menudrawer/  
APP示例：Gmail、Google Music等大部分google app  
   
2. SlidingMenu 滑出式菜单，通过拖动屏幕边缘滑出菜单，支持屏幕左右划出，支持菜单zoom、scale、slide up三种动画样式出现。  
项目地址：https://github.com/jfeinstein10/SlidingMenu  
Demo地址：https://play.google.com/store/apps/details?id=com.slidingmenu.example  
APP示例：Foursquare, LinkedIn, Zappos, Rdio, Evernote Food, Plume, VLC for Android, ESPN ScoreCenter, MLS MatchDay, 9GAG, Wunderlist 2, The Verge, MTG Familiar, Mantano Reader, Falcon Pro (BETA), MW3 Barracks  
MenuDrawer和SlidingMenu比较：SlidingMenu支持菜单动画样式出现，MenuDrawer支持菜单view处于内容的上下层  
   
3. ArcMenu 支持类似Path的左下角动画旋转菜单及横向划出菜单、圆心弹出菜单  
项目地址：https://github.com/daCapricorn/ArcMenu  
APP示例：Path  
效果图：![Renderings](https://dl.dropboxusercontent.com/u/11369687/preview0.png)  
https://dl.dropboxusercontent.com/u/11369687/preview1.png  
https://dl.dropboxusercontent.com/u/11369687/raymenu.png  
   
4. android-satellite-menu 类似Path的左下角动画旋转菜单  
项目地址：https://github.com/siyamed/android-satellite-menu  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/satellite-menu-demo.apk?raw=true  
APP示例：Path  
   
5. radial-menu-widget 圆形菜单，支持二级菜单  
项目地址：https://code.google.com/p/radial-menu-widget/  
效果图：http://farm8.staticflickr.com/7377/11621125154_d1773c2dcc_o.jpg  
   
6. Android Wheel Menu 圆形旋转选取菜单  
项目地址：https://github.com/anupcowkur/Android-Wheel-Menu  
效果图：![Renderings](https://raw.github.com/anupcowkur/Android-Wheel-Menu/master/graphics/wheel.gif)  
   
7. FoldingNavigationDrawer滑动并以折叠方式打开菜单  
项目地址：https://github.com/tibi1712/FoldingNavigationDrawer-Android  
使用介绍：https://play.google.com/store/apps/details?id=com.ptr.folding.sample  
效果图：![Renderings](https://lh6.ggpht.com/VnKUZenAozQ0KFAm5blFTGqMaKFjvX-BK2JH-jrX1sIXVTqciACqRhqFH48hc4pm2Q=h310-rw)  
   
#### 四、ViewPager 、Gallery  
1. Android-ViewPagerIndicator 配合ViewPager使用的Indicator，支持各种位置和样式  
项目地址：https://github.com/JakeWharton/Android-ViewPagerIndicator  
Demo地址：https://play.google.com/store/apps/details?id=com.viewpagerindicator.sample  
APP示例：太多了。。  
   
2. JazzyViewPager 支持Fragment切换动画的ViewPager，动画包括转盘、淡入淡出、翻页、层叠、旋转、方块、翻转、放大缩小等  
项目地址：https://github.com/jfeinstein10/JazzyViewPager  
Demo地址：https://github.com/jfeinstein10/JazzyViewPager/blob/master/JazzyViewPager.apk?raw=true  
效果类似桌面左右切换的各种效果，不过桌面并非用ViewPager实现而已  
   
3. Android-DirectionalViewPager 支持横向和纵向(垂直)的ViewPager  
项目地址：https://github.com/JakeWharton/Android-DirectionalViewPager  
Demo地址：https://market.android.com/details?id=com.directionalviewpager.sample  
   
4. android-pulltorefresh 支持下拉刷新的ViewPager  
项目地址：https://github.com/chrisbanes/Android-PullToRefresh  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/pull-to-refreshview-demo.apk?raw=true  
APP示例：新浪微博各个页面  
   
5. FancyCoverFlow支持Item切换动画效果的类似Gallery View  
项目地址：https://github.com/davidschreiber/FancyCoverFlow  
Demo地址：https://play.google.com/store/apps/details?id=at.technikum.mti.fancycoverflow.samples  
效果图：![Renderings](https://github-camo.global.ssl.fastly.net/ef5ced52b7b54652b50499521ed797c0188c7a6b/687474703a2f2f64617669647363687265696265722e6769746875622e696f2f46616e6379436f766572466c6f772f73637265656e73686f74322e706e67)  
   
6. AndroidTouchGallery 支持双击或双指缩放的Gallery(用ViewPager实现)  
相比下面的PhotoView，在被放大后依然能滑到下一个item，并且支持直接从url和文件中获取图片，  
项目地址：https://github.com/Dreddik/AndroidTouchGallery  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/touch-gallery-demo.apk?raw=true  
APP示例：类似微信中查看聊天记录图片时可双击放大，并且放大情况下能正常左右滑动到前后图片  
   
7. Salvage view 带View缓存的Viewpager PagerAdapter，很方便使用  
项目地址：https://github.com/JakeWharton/salvage  
   
#### 五、GridView  
1. StaggeredGridView 允许非对齐行的GridView  
类似Pinterest的瀑布流，并且跟ListView一样自带View缓存，继承自ViewGroup  
项目地址：https://github.com/maurycyw/StaggeredGridView  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/staggered-gridview-demo.apk?raw=true  
APP示例：Pinterest等  
   
2. AndroidStaggeredGrid 允许非对齐行的GridView  
类似Pinterest的瀑布流，继承自AbsListView  
项目地址：https://github.com/etsy/AndroidStaggeredGrid  
APP示例：Pinterest等  
   
3. PinterestLikeAdapterView 允许非对齐行的GridView  
类似Pinterest的瀑布流，允许下拉刷新  
项目地址：https://github.com/GDG-Korea/PinterestLikeAdapterView  
APP示例：Pinterest等  
   
4. DraggableGridView Item可拖动交换位置的GridView，类似桌面的单屏效果  
项目地址：https://github.com/thquinn/DraggableGridView  
Demo地址：https://github.com/thquinn/DraggableGridView/blob/master/bin/DraggableGridViewSample.apk?raw=true  
   
#### 六、ImageView  
1. PhotoView 支持双击或双指缩放的ImageView  
在ViewPager等Scrolling view中正常使用，相比上面的AndroidTouchGallery，不仅支持ViewPager，同时支持单个ImageView  
项目地址：https://github.com/chrisbanes/PhotoView  
Demo地址：https://play.google.com/store/apps/details?id=uk.co.senab.photoview.sample  
APP示例：photup  
   
2. android-gif-drawable 支持gif显示的view  
项目地址：https://github.com/koral--/android-gif-drawable  
用jni实现的，编译生成so库后直接xml定义view即可，而且本身不依赖于其他开源项目所以相对下面的ImageViewEx简单的多  
  
3. ImageViewEx 支持Gif显示的ImageView  
项目地址：https://github.com/frapontillo/ImageViewEx  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/imageviewex-demo.apk?raw=true  
依赖很多，编译过程很繁琐!|_|!
   
4. RoundedImageView 带圆角的ImageView  
项目地址：https://github.com/vinc3m1/RoundedImageView  
效果图：![Renderings](https://raw.github.com/makeramen/RoundedImageView/master/screenshot.png)  
   
#### 七、ProgressBar  
1. SmoothProgressBar 水平进度条  
项目地址：https://github.com/castorflex/SmoothProgressBar  
Demo地址：https://play.google.com/store/apps/details?id=fr.castorflex.android.smoothprogressbar.sample  
   
2. ProgressWheel 支持进度显示的圆形ProgressBar  
项目地址：https://github.com/Todd-Davies/ProgressWheel  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/progress-wheel-demo.apk?raw=true  
   
3. android-square-progressbar 在图片周围显示进度  
项目地址：https://github.com/mrwonderman/android-square-progressbar  
Demo地址：https://play.google.com/store/apps/details?id=net.yscs.android.square_progressbar_example  
APP示例：square  
效果图：![Renderings](https://googledrive.com/host/0BwESwPCuXtw7eExwSFVLQkR2TTg/newscreen1.png)  
   
4. HoloCircularProgressBar Android4.1 时钟App样式  
项目地址：https://github.com/passsy/android-HoloCircularProgressBar  
APP示例：Android4.1时钟App  
效果图：https://raw.github.com/passsy/android-HoloCircularProgressBar/master/raw/screenshot1.png  
   
#### 八、其他  
1. achartengine 强大的图标绘制工具  
支持折线图、面积图、散点图、时间图、柱状图、条图、饼图、气泡图、圆环图、范围（高至低）条形图、拨号图/表、立方线图及各种图的结合  
项目地址：https://code.google.com/p/achartengine/  
官方网站：http://www.achartengine.org/  
效果图：![Renderings](http://www.achartengine.org/dimages/average_temperature.png)  
http://www.achartengine.org/dimages/sales_line_and_area_chart.png  
http://www.achartengine.org/dimages/temperature_range_chart.png  
http://www.achartengine.org/dimages/combined_chart.png  
http://www.achartengine.org/dimages/budget_chart.png  
APP示例：Wordpress Android，Google Analytics  
   
2. GraphView 绘制图表和曲线图的View  
可用于Android上的曲形图、柱状图、波浪图展示  
项目地址：https://github.com/jjoe64/GraphView  
Demo工程：https://github.com/jjoe64/GraphView-Demos  
Demo地址：https://play.google.com/store/apps/details?id=com.sothree.umano  
APP示例：Wordpress Android，Google Analytics  
   
3. android-flip 类似Flipboard翻转动画的实现  
项目地址：https://github.com/openaphid/android-flip  
Demo地址：https://github.com/openaphid/android-flip/blob/master/FlipView/Demo/APK/Aphid-FlipView-Demo.apk?raw=true  
APP示例：flipboard  
   
4. FlipImageView 支持x、y、z及动画选择的翻转动画的实现  
项目地址：https://github.com/castorflex/FlipImageView  
Demo地址：https://play.google.com/store/apps/details?id=fr.castorflex.android.flipimageview  
   
5. SwipeBackLayout 左右或向上滑动返回的Activity  
项目地址：https://github.com/Issacw0ng/SwipeBackLayout  
Demo地址：https://play.google.com/store/apps/details?id=me.imid.swipebacklayout.demo  
APP示例：知乎  
   
6. Cards-UI 卡片式View，支持单个卡片，item为卡片的ListView  
项目地址：https://github.com/afollestad/Cards-UI  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/cards-ui-demo.apk?raw=true  
   
7. cardslib 卡片式View，支持单个卡片，item为卡片的ListView和GridView  
项目地址：https://github.com/gabrielemariotti/cardslib  
Demo地址：https://play.google.com/store/apps/details?id=it.gmariotti.cardslib.demo  
   
8. android-styled-dialogs 可自定义样式的dialog  
默认与Holo主题样式一致，在Android2.2以上同一样式  
项目地址：https://github.com/inmite/android-styled-dialogs  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/styled-dialogs-demo.apk?raw=true  
   
9. Crouton 丰富样式的Toast  
允许alert、comfirm、info样式及点击消失样式，允许设置Toast显示时间，允许自定义View。  
项目地址：https://github.com/keyboardsurfer/Crouton  
Demo地址：http://play.google.com/store/apps/details?id=de.keyboardsurfer.app.demo.crouton  
   
10. supertooltips 带动画效果的Tips显示  
项目地址：https://github.com/nhaarman/supertooltips  
Demo地址：https://play.google.com/store/apps/details?id=com.haarman.supertooltips  
   
11. Android ViewBadger为其他View添加角标等  
项目地址：https://github.com/jgilfelt/android-viewbadger  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/android-viewbadger.apk?raw=true  
效果图：https://github-camo.global.ssl.fastly.net/a705a3e88c75ae2394943bd7c56f725697616ea8/687474703a2f2f7777772e6a65666667696c66656c742e636f6d2f766965776261646765722f76622d31612e706e67  
   
12. Android Sliding Up Panel 可拖动的View，能在当前Activity上扶起一个可拖动的Panel  
项目地址：https://github.com/umano/AndroidSlidingUpPanel  
Demo地址：https://play.google.com/store/apps/details?id=com.sothree.umano  
APP示例：Google Music精简播放栏  
   
13. android-times-square Android日历部件  
支持选取单个日期，多个日期，及日期区间段和对话框形式显示  
项目地址：https://github.com/square/android-times-square  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/times-square-demo.apk?raw=true  
   
14. android-calendar-card 日历  
项目地址：https://github.com/kenumir/android-calendar-card  
Demo地址：https://play.google.com/store/apps/details?id=com.wt.calendarcardsample  
效果图：![Renderings](https://raw.github.com/kenumir/android-calendar-card/master/calendar-card-sample/_work/device-2013-10-12-151801.png)  
   
15. ColorPickerView 颜色选择器，支持PopupWindows或新的Activity中打开  
项目地址：https://code.google.com/p/color-picker-view/  
效果图：![Renderings](http://oi41.tinypic.com/33c6mm8.jpg)  
   
16. HoloColorPicker 颜色选择器  
项目地址：https://github.com/LarsWerkman/HoloColorPicker  
Demo地址：https://docs.google.com/file/d/0BwclyDTlLrdXRzVnTGJvTlRfU2s/edit  
   
17. AndroidWheel Android Wheel支持城市、多种日期时间、密码、图片  
项目地址：https://github.com/sephiroth74/AndroidWheel  
效果图：![Renderings](http://farm6.staticflickr.com/5532/11621528786_220c040ba5_o.jpg)  
   
18. android-flowtextview文字自动环绕其他View的Layout  
项目地址：https://code.google.com/p/android-flowtextview/  
效果图：http://i949.photobucket.com/albums/ad332/vostroman1500/1.png  
   
19. Segmented Radio Buttons for Android iOS’s segmented controls的实现  
项目地址：https://github.com/vinc3m1/android-segmentedradiobutton  
Demo地址：https://github.com/thquinn/DraggableGridView/blob/master/bin/DraggableGridViewSample.apk?raw=true  
效果图：![Renderings](https://raw.github.com/vinc3m1/android-segmentedradiobutton/master/screens/segmentedradio.png)  
   
20. TableFixHeaders 第一列固定的Table  
项目地址：https://github.com/InQBarna/TableFixHeaders  
Demo地址：http://bit.ly/13buAIq  
   
21. Android Form EditText 验证输入合法性的编辑框  
支持输入、英文、ip、url等多种正则验证  
项目地址：https://github.com/vekexasia/android-edittext-validator  
Demo地址：https://play.google.com/store/apps/details?id=com.andreabaccega.edittextformexample  
   
22. UITableView ios风格控件  
包括Button、ListView、TableView  
项目地址：https://github.com/thiagolocatelli/android-uitableview  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/ui-tableview-demo.apk?raw=true  
   
23. ATableView ios风格控件  
项目地址：https://github.com/dmacosta/ATableView  
Demo地址：https://play.google.com/store/apps/details?id=com.nakardo.atableview.demo  
   
24. UndoBar屏幕底部显示取消或是确认的PopupWindows  
项目地址：https://github.com/soarcn/UndoBar  
效果图：![Renderings](https://github.com/soarcn/UndoBar/blob/master/art/redo.png?raw=true)  
   
25. Inscription可用于展示应用change和new feature信息  
项目地址：https://github.com/MartinvanZ/Inscription  
   
26. ActivityTransition Activity切换动画，包括渐变、flip、某个位置进入等等  
项目地址：https://github.com/ophilbert/ActivityTransition  
使用介绍：https://github.com/jfeinstein10/JazzyViewPager/blob/master/JazzyViewPager.apk?raw=true  
效果图：类似桌面左右切换的各种效果，不过桌面并非用ViewPager实现而已  
   
27. Cropper 图片局部剪切工具，可触摸控制选择区域或旋转  
项目地址：https://github.com/edmodo/cropper  
使用介绍：https://github.com/edmodo/cropper/wiki  
效果图：![Renderings](https://github-camo.global.ssl.fastly.net/e4fde77bf41d4a60b234b4e268e5cfa8c17d9b6f/687474703a2f2f692e696d6775722e636f6d2f334668735467666c2e6a7067)  
   
28. GlowPadBackport将Android4.2的锁屏界面解锁扩展到Android1.6及1.6+  
项目地址：https://github.com/rock3r/GlowPadBackport  
Demo地址：https://play.google.com/store/apps/details?id=net.sebastianopoggi.samples.ui.GlowPadSample  
效果图：![Renderings](https://lh6.ggpht.com/U070b6Lh6cVsVwx4jN-5nq0xqiB1PBzrYABPeJIEe2hZQ5UWOxc-FDUG77wADelToHA=h310-rw)  
   
29. GlowPadView Android4锁屏界面解锁  
项目地址：https://github.com/nadavfima/GlowPadView  
效果图：https://raw.github.com/nadavfima/GlowPadView/master/example.png  
   
30. android-lockpattern Android的图案密码解锁  
项目地址：https://code.google.com/p/android-lockpattern/  
Demo地址：https://play.google.com/store/apps/details?id=group.pals.android.lib.ui.lockpattern.demo  
使用介绍：https://code.google.com/p/android-lockpattern/wiki/QuickUse  
示例APP：Android开机的图案密码解锁，支付宝的密码解锁  
  
## 第二部分 工具库  
主要包括那些不错的开发库，包括依赖注入框架、图片缓存、网络相关、数据库ORM建模、Android公共库、Android 高版本向低版本兼容、多媒体相关及其他。  
#### 一、依赖注入DI  
通过依赖注入减少View、服务、资源简化初始化，事件绑定等重复繁琐工作  

1. AndroidAnnotations(Code Diet)android快速开发框架  
项目地址：https://github.com/excilys/androidannotations  
文档介绍：https://github.com/excilys/androidannotations/wiki  
官方网站：http://androidannotations.org/  
特点：(1) 依赖注入：包括view，extras，系统服务，资源等等  
(2) 简单的线程模型，通过annotation表示方法运行在ui线程还是后台线程  
(3) 事件绑定：通过annotation表示view的响应事件，不用在写内部类  
(4) REST客户端：定义客户端接口，自动生成REST请求的实现  
(5) 没有你想象的复杂：AndroidAnnotations只是在在编译时生成相应子类  
(6) 不影响应用性能：仅50kb，在编译时完成，不会对运行时有性能影响。  
PS：与roboguice的比较：roboguice通过运行时读取annotations进行反射，所以可能影响应用性能，而AndroidAnnotations在编译时生成子类，所以对性能没有影响  
   
2. roboguice 帮你处理了很多代码异常，利用annotation使得更少的代码完成项目  
项目地址：https://github.com/roboguice/roboguice  
文档介绍：https://github.com/roboguice/roboguice/wiki  
   
3. butterknife 利用annotation帮你快速完成View的初始化，减少代码  
项目地址：https://github.com/JakeWharton/butterknife  
文档介绍：http://jakewharton.github.io/butterknife/  
   
4. Dagger 依赖注入，适用于Android和Java  
项目地址：https://github.com/square/dagger  
文档介绍：http://square.github.io/dagger/  
   
#### 二、图片缓存  
1. Android-Universal-Image-Loader 图片缓存  
目前使用最广泛的图片缓存，支持主流图片缓存的绝大多数特性。  
项目地址：https://github.com/nostra13/Android-Universal-Image-Loader  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/universal-imageloader-demo.apk?raw=true  
文档介绍：http://www.intexsoft.com/blog/item/74-universal-image-loader-part-3.html  
   
2. picasso square开源的图片缓存  
项目地址：https://github.com/square/picasso  
文档介绍：http://square.github.io/picasso/  
特点：(1)可以自动检测adapter的重用并取消之前的下载  
(2)图片变换  
(3)可以加载本地资源  
(4)可以设置占位资源  
(5)支持debug模式  
   
3. ImageCache 图片缓存，包含内存和Sdcard缓存  
项目地址：https://github.com/Trinea/AndroidCommon  
Demo地址：https://play.google.com/store/apps/details?id=cn.trinea.android.demo  
文档介绍：http://www.trinea.cn/?p=704  
特点：(1)支持预取新图片，支持等待队列  
(2)包含二级缓存，可自定义文件名保存规则  
(3)可选择多种缓存算法(FIFO、LIFO、LRU、MRU、LFU、MFU等13种)或自定义缓存算法  
(4)可方便的保存及初始化恢复数据  
(5)支持不同类型网络处理  
(6)可根据系统配置初始化缓存等  
   
#### 三、网络相关  
1. Asynchronous Http Client for Android Android异步Http请求  
项目地址：https://github.com/loopj/android-async-http  
文档介绍：http://loopj.com/android-async-http/  
特点：(1) 在匿名回调中处理请求结果  
(2) 在UI线程外进行http请求  
(3) 文件断点上传  
(4) 智能重试  
(5) 默认gzip压缩  
(6) 支持解析成Json格式  
(7) 可将Cookies持久化到SharedPreferences  
   
2. android-query 异步加载，更少代码完成Android加载  
项目地址：https://github.com/androidquery/androidquery或https://code.google.com/p/android-query/  
文档介绍：https://code.google.com/p/android-query/#Why_AQuery?  
Demo地址：https://play.google.com/store/apps/details?id=com.androidquery  
特点：https://code.google.com/p/android-query/#Why_AQuery?  
   
3. Async Http Client Java异步Http请求  
项目地址：https://github.com/AsyncHttpClient/async-http-client  
文档介绍：http://sonatype.github.io/async-http-client/  
   
4. Ion 支持图片、json、http post等异步请求  
项目地址：https://github.com/koush/ion  
文档介绍：https://github.com/koush/ion#more-examples  
   
5. HttpCache Http缓存  
项目地址：https://github.com/Trinea/AndroidCommon  
Demo地址：https://play.google.com/store/apps/details?id=cn.trinea.android.demo  
Demo代码：https://github.com/Trinea/AndroidDemo/blob/master/src/cn/trinea/android/demo/HttpCacheDemo.java  
特点是：(1) 根据cache-control、expires缓存http请求  
(2) 支持同步、异步Http请求  
(3) 在匿名回调中处理请求结果  
(4) 在UI线程外进行http请求  
(5) 默认gzip压缩  
   
6. Http Request  
项目地址：https://github.com/kevinsawicki/http-request  
文档介绍：https://github.com/kevinsawicki/http-request#examples  
   
7. okhttp square开源的http工具类  
项目地址：https://github.com/square/okhttp  
文档介绍：http://square.github.io/okhttp/  
特点：(1) 支持SPDY(http://zh.wikipedia.org/wiki/SPDY)协议。SPDY协议是Google开发的基于传输控制协议的应用层协议，通过压缩，多路复用(一个TCP链接传送网页和图片等资源)和优先级来缩短加载时间。  
(2) 如果SPDY不可用，利用连接池减少请求延迟  
(3) Gzip压缩  
(4) Response缓存减少不必要的请求  
   
8. Retrofit RESTFUL API设计  
项目地址：https://github.com/square/retrofit  
文档介绍：http://square.github.io/retrofit/  
   
#### 四、数据库 orm工具包  
orm的db工具类，简化建表、查询、更新、插入、事务、索引的操作  

1. greenDAO Android Sqlite orm的db工具类  
项目地址：https://github.com/greenrobot/greenDAO  
文档介绍：http://greendao-orm.com/documentation/  
官方网站：http://greendao-orm.com/  
特点：(1) 性能佳  
(2) 简单易用的API  
(3) 内存小好小  
(4) 库大小小  
   
2. ActiveAndroid Android Sqlite orm的db工具类  
项目地址：https://github.com/pardom/ActiveAndroid  
文档介绍：https://github.com/pardom/ActiveAndroid/wiki/_pages  
   
3. Sprinkles Android Sqlite orm的db工具类  
项目地址：https://github.com/emilsjolander/sprinkles  
文档介绍：http://emilsjolander.github.io/blog/2013/12/18/android-with-sprinkles/  
特点：比较显著的特点就是配合https://github.com/square/retrofit能保存从服务器获取的数据  
   
4. ormlite-android  
项目地址：https://github.com/j256/ormlite-android  
文档介绍：http://ormlite.com/sqlite_java_android_orm.shtml   
  
#### 五、Android公共库  
1. Guava Google的基于java1.6的类库集合的扩展项目  
包括collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O等等. 这些高质量的API可以使你的JAVa代码更加优雅，更加简洁  
项目地址：https://code.google.com/p/guava-libraries/  
文档介绍：https://code.google.com/p/guava-libraries/wiki/GuavaExplained  
   
2. AndroidCommon Android公共库  
项目地址：https://github.com/Trinea/AndroidCommon  
Demo地址：https://play.google.com/store/apps/details?id=cn.trinea.android.demo  
文档介绍：http://www.trinea.cn/?p=778  
包括：(1)缓存(图片缓存、预取缓存、网络缓存)  
(2) 公共View(下拉及底部加载更多ListView、底部加载更多ScrollView、滑动一页Gallery)  
(3) Android常用工具类(网络、下载、Android资源操作、shell、文件、Json、随机数、Collection等等)  
   
#### 六、Android 高版本向低版本兼容  
1. ActionBarSherlock 为Android所有版本提供统一的ActionBar，解决4.0以下ActionBar的适配问题  
项目地址：https://github.com/JakeWharton/ActionBarSherlock  
Demo地址：https://play.google.com/store/apps/details?id=com.actionbarsherlock.sample.demos  
APP示例：太多了。。现在连google都在用  
   
2. Nine Old Androids 将Android 3.0(Honeycomb)所有动画API(ObjectAnimator ValueAnimator等)兼容到Android1.0  
项目地址：https://github.com/JakeWharton/NineOldAndroids  
Demo地址：https://play.google.com/store/apps/details?id=com.jakewharton.nineoldandroids.sample  
文档介绍：http://nineoldandroids.com/  
   
3. HoloEverywhere 将Android 3.0的Holo主题兼容到Android2.1++  
项目地址：https://github.com/Prototik/HoloEverywhere  
Demo地址：https://raw.github.com/Prototik/HoloEverywhere/repo/org/holoeverywhere/demo/2.1.0/demo-2.1.0.apk  
文档介绍：http://android-developers.blogspot.com/2012/01/holo-everywhere.html  
   
#### 七、多媒体相关  
1. cocos2d-x 跨平台的2d游戏框架，支持Android、IOS、Linux、Windows等众多平台  
项目地址：https://github.com/cocos2d/cocos2d-x  
文档介绍：http://www.cocos2d-x.org/wiki  
官方网站：http://www.cocos2d-x.org/  
   
2. Vitamio 是一款Android与iOS平台上的全能多媒体开发框架  
项目地址：https://github.com/yixia/VitamioBundle  
网站介绍：http://www.vitamio.org/docs/  
特点：(1) 全面支持硬件解码与GPU渲染  
(2) 能够流畅播放720P甚至1080P高清MKV，FLV，MP4，MOV，TS，RMVB等常见格式的视频  
(3) 在Android与iOS上跨平台支持 MMS, RTSP, RTMP, HLS(m3u8)等常见的多种视频流媒体协议，包括点播与直播。  
   
3. PhotoProcessing 利用ndk处理图片库，支持Instafix、Ansel、Testino、XPro、Retro、BW、Sepia、Cyano、Georgia、Sahara、HDR、Rotate、Flip  
项目地址：https://github.com/lightbox/PhotoProcessing  
Demo地址：https://github.com/Trinea/TrineaDownload/blob/master/photo-processing.apk?raw=true  
   
4. Android StackBlur 图片模糊效果工具类  
项目地址：https://github.com/kikoso/android-stackblur  
Demo地址：https://github.com/kikoso/android-stackblur/blob/master/StackBlurDemo/bin/StackBlurDemo.apk?raw=true  
文档介绍：https://github.com/kikoso/android-stackblur#usage  
   
#### 八、其他  
1. Salvage view 带View缓存的Viewpager PagerAdapter，很方便使用  
项目地址：https://github.com/JakeWharton/salvage  
   
2. Android-PasscodeLock 应用锁，每次启动或从任何Activity启动应用都需要输入四位数字的密码方可进入  
项目地址：https://github.com/wordpress-mobile/Android-PasscodeLock  
Demo地址：https://play.google.com/store/apps/details?id=com.sothree.umano  
APP示例：Wordpress Android，支付宝，挖财  
   
3. android-lockpattern Android的图案密码解锁  
项目地址：https://code.google.com/p/android-lockpattern/  
Demo地址：https://play.google.com/store/apps/details?id=group.pals.android.lib.ui.lockpattern.demo  
使用介绍：https://code.google.com/p/android-lockpattern/wiki/QuickUse  
示例APP：Android开机的图案密码解锁，支付宝的密码解锁  
   
4. GlowPadBackport将Android4.2的锁屏界面解锁扩展到Android1.6及1.6+  
项目地址：https://github.com/rock3r/GlowPadBackport  
Demo地址：https://play.google.com/store/apps/details?id=net.sebastianopoggi.samples.ui.GlowPadSample  
效果图：![Renderings](https://lh6.ggpht.com/U070b6Lh6cVsVwx4jN-5nq0xqiB1PBzrYABPeJIEe2hZQ5UWOxc-FDUG77wADelToHA=h310-rw)  
   
5. GlowPadView Android4锁屏界面解锁  
项目地址：https://github.com/nadavfima/GlowPadView  
效果图：![Renderings](https://raw.github.com/nadavfima/GlowPadView/master/example.png)  
   
6. Android Priority Job Queue Android后台任务队列  
项目地址：https://github.com/path/android-priority-jobqueue  
文档介绍：https://github.com/path/android-priority-jobqueue#getting-started  
   
7. jsoup 一个解析html的java库，可方便的提取和操作数据  
项目地址：https://github.com/jhy/jsoup  
官方网站：http://jsoup.org/  
作用：(1) 从一个url、文件或string获得html并解析  
(2) 利用dom遍历或css选择器查找、提取数据  
(3) 操作html元素  
(4) 根据白名单去除用于提交的非法数据防止xss攻击  
(5) 输出整齐的html  
   
8. ZIP java压缩和解压库  
项目地址：https://github.com/zeroturnaround/zt-zip  
文档介绍：https://github.com/zeroturnaround/zt-zip#examples  
作用：(1) 解压和压缩，并支持文件夹内递归操作  
(2) 支持包含和排除某些元素  
(3) 支持重命名元素  
(4) 支持遍历zip包内容  
(5) 比较两个zip包等功能  
   
9. Cobub Razor 开源的mobile行为分析系统，包括web端、android端，支持ios和window phone  
项目地址：https://github.com/cobub/razor  
Demo地址：http://demo.cobub.com/razor  
网站介绍：http://dev.cobub.com/  
   
10. aFileChooser 文件选择器，可内嵌到程序中，而无需使用系统或三方文件选择器。  
项目地址：https://github.com/iPaulPro/aFileChooser  
   
11. androidpn 基于xmpp协议的消息推送解决方案，包括服务器端和android端。  
项目地址：https://github.com/dannytiehui/androidpn  
   
12. Android插件式开发  
项目地址：https://github.com/umeng/apf  
  
## 第三部分 优秀项目  
主要介绍那些Android还不错的完整项目，目前包含的项目主要依据是项目有意思或项目分层规范比较好。  
Linux  
项目地址：https://github.com/torvalds/linux  
Android  
项目地址：https://android.googlesource.com/或https://github.com/android  
以上两个项目，不解释  
   
(1) ZXing 二维码扫描工具  
项目地址：https://github.com/zxing/zxing或https://code.google.com/p/zxing/  
APK地址：https://play.google.com/store/apps/details?id=com.google.zxing.client.android  
PS：现在市面上很多应用的二维码扫描功能都是从这个修改而来  
   
(2) photup 编辑机批量上传照片到facebook上  
项目地址：https://github.com/chrisbanes/photup  
APK地址：https://play.google.com/store/apps/details?id=uk.co.senab.photup  
PS：代码分包合理，很棒。不过这个项目依赖的开源项目比较多，比较难编译  
  
   
(3) Github的Android客户端项目  
项目地址：https://github.com/github/android  
APK地址：https://play.google.com/store/apps/details?id=com.github.mobile  
   
(4) MIUI便签  
项目地址：https://github.com/MiCode/Notes  
APK地址：https://github.com/Trinea/TrineaDownload/blob/master/miui-note-demo.apk?raw=true  
PS：项目分包比较合理，相比较miui的文件管理器https://github.com/MiCode/FileExplorer代码规范较好得多  
   
(5) 四次元-新浪微博客户端  
项目地址：https://github.com/qii/weiciyuan  
APK地址：https://play.google.com/store/apps/details?id=org.qii.weiciyuan  
   
(6) gnucash-一个记账理财软件  
项目地址：https://github.com/codinguser/gnucash-android  
APK地址：http://play.google.com/store/apps/details?id=org.gnucash.android  
   
(7) AntennaPod支持rss订阅、音乐订阅  
项目地址：https://github.com/danieloeh/AntennaPod  
APK地址：https://play.google.com/store/apps/details?id=de.danoeh.antennapod  
   
(8) ChaseWhisplyProject 打鬼游戏  
项目地址：https://github.com/tvbarthel/ChaseWhisplyProject  
APK地址：https://play.google.com/store/apps/details?id=fr.tvbarthel.games.chasewhisply  
   
(9) Tweet Lanes 功能完整的Twitter客户端  
项目地址：https://github.com/chrislacy/TweetLanes  
APK地址：https://play.google.com/store/apps/details?id=com.tweetlanes.android  
  
## 第四部分 开发工具及测试工具  
主要介绍和Android开发工具和测试工具相关的开源项目。  

1. Buck  
facebook开源的Android编译工具，效率是ant的两倍。主要优点在于：  
(1) 加快编译速度，通过并行利用多核cpu和跟踪不变资源减少增量编译时间实现  
(2) 可以在编译系统中生成编译规则而无须另外的系统生成编译规则文件  
(3) 编译同时可生成单元测试结果  
(4) 既可用于IDE编译也可用于持续集成编译  
(5) facebook持续优化中  
项目地址：https://github.com/facebook/buck  
   
2. Android Maven Plugin  
Android Maven插件，可用于对android三方依赖进行管理。在J2EE开发中，maven是非常成熟的依赖库管理工具，可统一管理依赖库。  
项目地址：https://github.com/jayway/maven-android-plugin  
   
3. Spoon  
可用于android不同机型设备自动化测试，能将应用apk和测试apk运行在不同机器上并生成相应测试报告。  
项目地址：https://github.com/square/spoon  
   
4. Android FEST  
提供一些列方便的断言，可用于提高编写Android自测代码效率  
项目地址：https://github.com/square/fest-android  
   
5. SelectorChapek for Android  
Android Studio插件，可根据固定文件名格式资源自动生成drawable selectors xml文件。  
项目地址：https://github.com/inmite/android-selector-chapek  
   
6. Android Resource Navigator  
chrome插件，可以方便的查看github上android源码工程的styles.xml和themes.xml。主要功能：  
(1) 快速打开android styles.xml themes.xml  
(2) 方便在资源间跳转。styles.xml themes.xml文件中资源链接跳转，可以方便跳转到某个资源  
(3) 方便查找某个style和theme。chrome地址栏输入arn+tab+搜索内容回车即可  
(4) 自动下载不同分辨率下的drawable  
(5) 通过映射查找那些不是按照固定命名规则命名的style和theme  
项目地址：https://github.com/jgilfelt/android-resource-navigator  
示例：https://chrome.google.com/webstore/detail/android-resource-navigato/agoomkionjjbejegcejiefodgbckeebo?hl=en&gl=GB  
   
7. Android Action Bar Style Generator  
Android ActionBar样式生成器，可在线选择ActionBar样式自动生成所需要的图片资源及xml文件  
项目地址：https://github.com/jgilfelt/android-actionbarstylegenerator  
在线演示：http://jgilfelt.github.io/android-actionbarstylegenerator/  
   
8. ViewServer  
允许app运行在任何手机上都可以用HierarchyViewer查看  
项目地址：https://github.com/romainguy/ViewServer  
   
9. GridWichterle for Android  
在整个系统上显示一个grid，用来帮助查看应用布局及使得布局更美观，可设置grid网格大小和颜色，android推荐48dp和8dp，可见 Android Design Guidelines – Metrics and Grids  
项目地址：https://github.com/inmite/android-grid-wichterle  
APK地址：https://play.google.com/store/apps/details?id=eu.inmite.android.gridwichterle  
PS：比起hierarchyviewer相差甚远，不过偶尔可用来作为布局查看工具。  
   
10. 渠道打包工具  
允许app运行在任何手机上都可以用HierarchyViewer查看  
项目地址：https://github.com/umeng/umeng-muti-channel-build-tool  
另可参见Google的构建系统Gradle：http://tools.android.com/tech-docs/new-build-system/user-guide  
   
11. Catlog  
手机端log查看工具，支持不同颜色显示、关键字过滤、级别过滤、进程id过滤、录制功能等  
项目地址：https://github.com/nolanlawson/Catlog  
在线演示：https://play.google.com/store/apps/details?id=com.nolanlawson.logcat  
   
12. PID Cat  
根据package查看logcat日志  
项目地址：https://github.com/JakeWharton/pidcat  
   
13. Hugo  
用于打印函数信息及执行时间的工具，仅在debug模式生效  
项目地址：https://github.com/JakeWharton/hugo  
   
14. scalpel  
在应用下面添加一层用于界面调试，待详细补充 // TODO   
项目地址：https://github.com/JakeWharton/scalpel  
  
## 第五部分  
主要介绍那些乐于分享并且有一些很不错的开源项目的个人和组织。Follow大神，深挖大神的项目和following，你会发现很多。  
#### 一、个人  
1. JakeWharton 就职于Square  
Github地址：https://github.com/JakeWharton  
代表作：ActionBarSherlock，Android-ViewPagerIndicator，Nine Old Androids，SwipeToDismissNOA，hugo，butterknife，Android-DirectionalViewPager, scalpel    
pidcat另外对square及其他开源项目有很多贡献  
博客：http://jakewharton.com/  
绝对牛逼的大神，项目主要集中在Android版本兼容，ViewPager及开发工具上.  
   
2. Chris Banes  
Github地址：https://github.com/chrisbanes  
代表作：ActionBar-PullToRefresh，PhotoView，Android-BitmapCache，Android-PullToRefresh  
博客：http://chris.banes.me/  
   
3. Koushik Dutta就职于ClockworkMod  
Github地址：https://github.com/koush  
代表作：Superuser，AndroidAsync，UrlImageViewHelper，ion, 另外对https://github.com/CyanogenMod 的开源项目有很多贡献  
博客：http://koush.com/  
   
4. Simon Vig  
Github地址：https://github.com/SimonVT  
代表作：android-menudrawer，MessageBar  
博客：http://simonvt.net/  
   
5. Manuel Peinado  
Github地址：https://github.com/ManuelPeinado  
代表作：FadingActionBar，GlassActionBar，RefreshActionItem，QuickReturnHeader  
   
6. Emil Sj?lander  
Github地址：https://github.com/emilsjolander  
代表作：StickyListHeaders，sprinkles，android-FlipView  
博客：http://emilsjolander.se/  
   
7. greenrobot  
Github地址：https://github.com/greenrobot  
代表作：greenDAO，EventBus  
网址：http://greenrobot.de/  
   
8. Jeff Gilfelt  
Github地址：https://github.com/jgilfelt  
代表作：android-mapviewballoons，android-viewbadger，android-actionbarstylegenerator，android-sqlite-asset-helper  
网址：http://jeffgilfelt.com  
   
Ps: ViewServer作者的个人摄影作品http://www.flickr.com/photos/romainguy ，感觉超赞  
   
#### 二、组织  
1. Square  
Github地址：https://github.com/square   
代表作：okhttp、fest-android，android-times-square、picasso、dagger、spoon等等    
网址：http://square.github.io/  
有态度有良心的企业，很多不错的分享  
   
2. Inmite s.r.o.  
Github地址：https://github.com/inmite  
代表作：android-styled-dialogs，android-grid-wichterle，android-selector-chapek  
网址：http://www.inmite.eu/  
  
[![githalytics.com alpha](https://cruel-carlota.pagodabox.com/a900f4d3b4aa67d4f98e3a143b8dea9e "githalytics.com")](http://githalytics.com/Trinea/android-open-project)
