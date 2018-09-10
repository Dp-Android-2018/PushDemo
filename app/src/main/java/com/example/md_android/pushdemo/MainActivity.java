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

        int l=3;
        int k=3;
        int v=l*k;
    }

    public void divide(){
        int x=8;
        int y=4;
        int result=x%y;
    }

    public void print(){
        System.out.println("123456");
        int result=1;
        System.out.println("Result :"+result);
    }

    public void exp(){
        System.out.println("Exp ");
    }

    public void func(){
        System.out.println("bbbbbbbbbbbbbbbbbbbb");
    }
}
