package com.example.user.calendarexemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String[] data = new String[42];
    String[] data1 = new String[42];
    String[] data2 = new String[42];

    GridView gvMain;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Arrays.fill(data,"");
        Arrays.fill(data1,"");
        Arrays.fill(data2,"");
        int j = 1;
        for (int i = 5; i < 36; i++) {
            data[i] = String.valueOf(j);
            data1[i] = "00:00";
            data2[i] = "4";
            j++;
        }
        Adapter adapter = new Adapter(this, data, data1, data2);
        gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(adapter);
        adjustGridView();

    }//onCreate

    private void adjustGridView() {
        gvMain.setNumColumns(7);//numColumns – кол-во столбцов в сетке
    }
}//MainActivity
