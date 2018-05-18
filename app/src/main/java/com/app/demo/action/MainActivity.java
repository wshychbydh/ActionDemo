package com.heshidai.app.monitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.heshidai.app.monitor.other.OtherActivity;
import com.heshidai.app.monitor.view.ChartView2;
import com.heshidai.app.monitor.view.GoldTariffHelper;
import com.plugin.monitor.util.SystemUtils;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChartView2 chartView = (ChartView2) findViewById(R.id.chartView);
        chartView.setData(GoldTariffHelper.getCoordX(), GoldTariffHelper.getCoordY());
        new Thread(new Runnable() {
            @Override
            public void run() {
                String operator = SystemUtils.INSTANCE.getOperator(MainActivity.this);
                String networkInfo = SystemUtils.INSTANCE.getNetworkInfo(MainActivity.this);
                Log.i("tag", "operator------>" + operator);
                Log.i("tag", "networkInfo------>" + networkInfo);
            }
        }).start();
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, OtherActivity.class));
    }
}
