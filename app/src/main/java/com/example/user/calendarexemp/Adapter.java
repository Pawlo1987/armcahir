package com.example.user.calendarexemp;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Adapter extends BaseAdapter {
    private Context context;
    String[] data = new String[42];
    String[] data1 = new String[42];
    String[] data2 = new String[42];

    public Adapter(Context context, String[] data, String[] data1, String[] data2) {
        this.context = context;
        this.data = data;
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View grid;
        grid = new View(context);
        //LayoutInflater inflater = getLayoutInflater();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        grid = inflater.inflate(R.layout.day, parent, false);
        TextView textView = (TextView) grid.findViewById(R.id.textView);
        TextView textView2 = (TextView) grid.findViewById(R.id.textView2);
        TextView textView3 = (TextView) grid.findViewById(R.id.textView3);
        textView.setText(data[position]);
        textView2.setText(data1[position]);
        textView3.setText(data2[position]);

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, data[position], Toast.LENGTH_SHORT).show();
            }
        });

        return grid;
    }
}
