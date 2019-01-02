package com.sopan.androidpiebarchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        BarChart chart = findViewById(R.id.barchart);

        ArrayList NoOfEmp = new ArrayList();

        NoOfEmp.add(new BarEntry(15, 0));
        NoOfEmp.add(new BarEntry(40, 1));
        NoOfEmp.add(new BarEntry(20, 2));
        NoOfEmp.add(new BarEntry(99, 3));
        NoOfEmp.add(new BarEntry(48, 4));
        NoOfEmp.add(new BarEntry(90, 5));
        NoOfEmp.add(new BarEntry(45, 6));
        NoOfEmp.add(new BarEntry(88, 7));
        NoOfEmp.add(new BarEntry(35, 8));
        NoOfEmp.add(new BarEntry(75, 9));

        ArrayList year = new ArrayList();

        /*year.add("2008");
        year.add("2009");
        year.add("2010");
        year.add("2011");
        year.add("2012");
        year.add("2013");
        year.add("2014");
        year.add("2015");
        year.add("2016");
        year.add("2017");*/
        year.add("Exam");
        year.add("Total");
        year.add("Practice");
        year.add("Total");
        year.add("Tutorial");
        year.add("Total");
        year.add("Topic");
        year.add("Total");
        year.add("ModelTest");
        year.add("Total");

        BarDataSet bardataset = new BarDataSet(NoOfEmp, "Progress Report");
        chart.setDescription("");
        chart.animateY(3000);
        BarData data = new BarData(year, bardataset);
        bardataset.setColors(ColorTemplate.PASTEL_COLORS);
        chart.setData(data);
    }
}