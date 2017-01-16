package com.anbaoxing.drawdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anbaoxing.drawdemo.CustomViews.BarChartView;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
    }

    @Override
    protected void onResume() {
        super.onResume();

        BarChartView barChartView = (BarChartView)findViewById(R.id.barcharview);
        assert barChartView != null;
        barChartView.setInfo(23, 12, 30, 5, 77, 45);
    }
}
