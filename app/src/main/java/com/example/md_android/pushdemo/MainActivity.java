package com.example.md_android.pushdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(){
        int x=2;
        int y=2;
        int z=x+y;
    }

    public void minus(){
        int a=9;
        int y=2;
        int z=a-y;
    }

    public void sub(){
        int c=3;
        int d=3;
        int m=c*d;
    }
}
