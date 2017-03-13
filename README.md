## 自定义折线图、曲线图CustomCurveChart使用方法 ##
1、将CustomCurveChart复制到你管理视图的分包中；

2、在Activity或Fragment 的xml布局文件中贴入代码：

                <LinearLayout
                    android:id="@+id/customCurveChart1"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingBottom="10dp"
                    android:paddingTop="10dp">
                </LinearLayout>

3、出于演示目的，这里初始化了需要填充的数据，在Activity的onCreate（）中贴如下代码（假如使用的是fragment,可以在onActivityCreated（）等适当的地方写入下面这段代码使用）：

    private LinearLayout  customCurveChart1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curve_chart);

        customCurveChart1 = (LinearLayout) findViewById(R.id.customCurveChart1);
        initCurveChart1();
    }

    /**
     * 初始化CurveChart
     * addView()的第六个参数设为false： 不显示Y轴标注信息
     */
    private void initCurveChart1() {
        //X轴要显示的坐标
        String[] xLabel = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","1", "2", "3", "4", "5", "6", "7", "8", " ", "10"};
        
        //Y轴要显示的坐标
        String[] yLabel = {"30", "60", "90", "120", "150", "180", "210","240",""};
        
        //这添加了三项数据，所以将绘制三条曲、折线
        int[] data1 =  {120, 150, 125, 135, 123, 103, 152,144,123, 133, 154, 110, 123, 103, 152,144,154, 110, 123, 103, 152,144, };
        int[] data2 = {210, 215, 240, 195, 115, 162, 180,172,153, 146, 180, 143, 159, 162, 180,172,180, 143, 159, 162, 180,172};
        int[] data3 = {30, 60, 35, 45, 85, 68, 88,70,62, 59, 83, 76, 90, 68, 88,70, 83, 76, 90, 68, 88,70};
        List<int[]> data = new ArrayList<>();
        List<Integer> color = new ArrayList<>();
        data.add(data1);

        //设置绘制的线条的颜色，这里的颜色
        color.add(R.color.color14);
        data.add(data2);
        color.add(R.color.color13);
        data.add(data3);
        color.add(R.color.color25);

        CustomCurveChart mCustomCurveChart1 = new CustomCurveChart(this, xLabel, yLabel, data, color, false);
        //设为false时，绘制折线图，true时绘制曲线图，默认为true
        mCustomCurveChart1.setCurve(false);

        //将mCustomCurveChart1添加到customCurveChart1中显示出来
        customCurveChart1.addView(mCustomCurveChart1);
    }

4、完成，要了解更加详细，请查看Demo。

Demo的运行效果： 
<img src="https://github.com/lisheny/DrawDemo/blob/master/tupian/Screenshot_20170105-174439.png?raw=true" width="300" height="550" alt="图片演示"/>
