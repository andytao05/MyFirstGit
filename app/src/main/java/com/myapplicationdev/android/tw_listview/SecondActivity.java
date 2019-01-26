package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> alModules = new ArrayList<>();
    ArrayAdapter<Module> aaModules = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = this.findViewById(R.id.lvModules);
        tvYear = findViewById(R.id.tvYear);

        Intent i = getIntent();
        int year = i.getIntExtra("year", 0);
        tvYear.setText("Year " + year);

        if (year == 1) {
            alModules.add(new Module("C208", true));
            alModules.add(new Module("C200", false));
        } else if(year == 2) {
            alModules.add(new Module("C346", true));
            alModules.add(new Module("C200", false));
        } else if (year == 3){
            alModules.add(new Module("C347", true));
            alModules.add(new Module("C200", false));
        } else {

        }

        aaModules = new ModuleAdapter(this, R.layout.row, alModules);
        lv.setAdapter(aaModules);


    }



}
