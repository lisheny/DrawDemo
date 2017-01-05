package com.anbaoxing.drawdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.anbaoxing.drawdemo.CustomViews.CustomCurveChart;
import com.anbaoxing.drawdemo.CustomViews.CustomSuperCurveChart;

import java.util.ArrayList;
import java.util.List;

/**
 * 折线图、曲线图的使用列子展示
 */
public class CurveChartActivity extends AppCompatActivity {

    private LinearLayout  customCurveChart1,customCurveChart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curve_chart);

        customCurveChart1 = (LinearLayout) findViewById(R.id.customCurveChart1);
        initCurveChart1();

        customCurveChart2 = (LinearLayout) findViewById(R.id.customCurveChart2);
        initCurveChart2();

        initCurveChart3();
    }

    /**
     * 初始化CurveChart
     * addView()的第六个参数设为false： 不显示Y轴标注信息
     */
    private void initCurveChart1() {
        String[] xLabel = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","1", "2", "3", "4", "5", "6", "7", "8", " ", "10"};
        String[] yLabel = {"30", "60", "90", "120", "150", "180", "210","240",""};
        int[] data1 =  {120, 150, 125, 135, 123, 103, 152,144,123, 133, 154, 110, 123, 103, 152,144,154, 110, 123, 103, 152,144, };
        int[] data2 = {210, 215, 240, 195, 115, 162, 180,172,153, 146, 180, 143, 159, 162, 180,172,180, 143, 159, 162, 180,172};
        int[] data3 = {30, 60, 35, 45, 85, 68, 88,70,62, 59, 83, 76, 90, 68, 88,70, 83, 76, 90, 68, 88,70};
        List<int[]> data = new ArrayList<>();
        List<Integer> color = new ArrayList<>();
        data.add(data1);
        color.add(R.color.color14);
        data.add(data2);
        color.add(R.color.color13);
        data.add(data3);
        color.add(R.color.color25);
        CustomCurveChart mCustomCurveChart1 = new CustomCurveChart(this, xLabel, yLabel, data, color, false);
        //绘制折线
        mCustomCurveChart1.setCurve(false);
        customCurveChart1.addView(mCustomCurveChart1);
    }

    /**
     * 初始化CurveChart
     * addView()的第六个参数设为true： 显示Y轴标注信息
     */
    private void initCurveChart2() {
        String[] xLabel = {"0点", "1点", "2点", "3点", "4点", "5点", "6点", "7点", "8点", "9点", "10点", "11点"};
        String[] yLabel = {"0", "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000", "1100"};
        int[] data1 = {300, 500, 550, 500, 300, 700, 800, 750, 550, 600, 400, 300};
        int[] data2 = {500, 505, 750, 700, 500, 900, 1000, 950, 750, 800, 600, 500};
        List<int[]> data = new ArrayList<>();
        List<Integer> color = new ArrayList<>();
        data.add(data1);
        color.add(R.color.color26);
        data.add(data2);
        color.add(R.color.color14);
        CustomCurveChart mCustomCurveChart2 = new CustomCurveChart(this, xLabel, yLabel, data, color, true);
        //绘制曲线
        mCustomCurveChart2.setCurve(true);
        customCurveChart2.addView(mCustomCurveChart2);
    }

    /**
     * CustomSuperCurveChart是在CustomCurveChart的基础上修改成的
     * 点击可显示某条数据详情
     *
     * 这里并没有像上面两个那样先new一个LinearLayout来添加视图，
     * 而是直接把CustomSuperCurveChart设定的Xml布局中
     */
    private void initCurveChart3() {
        String[] xLabel = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","1", "2", "3", "4", "5", "6", "7", "8", " 9", "10"};
        String[] yLabel = {"30", "60", "90", "120", "150", "180", "210","240",""};
        int[] data1 =  {120, 150, 125, 135, 123, 103, 152,144,123, 133, 154, 110, 123, 103, 152,144,154, 110, 123, 103, 152,144, };
        int[] data2 = {210, 215, 240, 195, 115, 162, 180,172,153, 146, 180, 143, 159, 162, 180,172,180, 143, 159, 162, 180,172};
        int[] data3 = {30, 60, 35, 45, 85, 68, 88,70,62, 59, 83, 76, 90, 68, 88,70, 83, 76, 90, 68, 88,70};
        List<int[]> data = new ArrayList<>();
        List<Integer> color = new ArrayList<>();
        data.add(data1);
        color.add(R.color.color14);
        data.add(data2);
        color.add(R.color.color13);
        data.add(data3);
        color.add(R.color.color25);
        CustomSuperCurveChart customCurveChart3 =(CustomSuperCurveChart)findViewById(R.id.customCurveChart3);
        assert customCurveChart3 != null;
        customCurveChart3.setInfo(xLabel, yLabel, xLabel, data, color, true);
    }
}
