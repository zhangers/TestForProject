package com.example.testforproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"启动",Toast.LENGTH_SHORT).show();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        goto_main_page();

    }

    private void goto_main_page(){
        Intent intent =new Intent();
        intent.setClass(MainActivity.this,main_page.class);
        startActivity(intent);
        MainActivity.this.finish();
    }
}