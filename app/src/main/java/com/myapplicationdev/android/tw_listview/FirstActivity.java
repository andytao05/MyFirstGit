package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        al = new ArrayList<String>();
        al.add("Year 1");

        //***Start***
        al.add("Year 2");
        al.add("Year 3");

        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);

        lv = findViewById(R.id.years);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("pos", position);
                startActivity(intent);
            }
        });
        //***End***
    }
}
