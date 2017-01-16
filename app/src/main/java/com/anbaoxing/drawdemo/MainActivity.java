package com.anbaoxing.drawdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button btnCCChart = (Button) findViewById(R.id.btn_ccchart);
        Button btnBCChart = (Button) findViewById(R.id.btn_bcchart);

        assert btnCCChart != null;
        btnCCChart.setOnClickListener(this);
        assert btnBCChart != null;
        btnBCChart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ccchart:
                Intent gotoCurveChartAty = new Intent(MainActivity.this, CurveChartActivity.class);
                startActivity(gotoCurveChartAty);
                break;
            case R.id.btn_bcchart:
                Intent gotoBarChartAty = new Intent(MainActivity.this, BarChartActivity.class);
                startActivity(gotoBarChartAty);
                break;
            default:
                break;
        }
    }
}
