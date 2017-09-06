package com.example.george.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {
    ListView list = (ListView) findViewById(R.id.List);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.setClickable(TRUE);
    }


    //test test test
}
