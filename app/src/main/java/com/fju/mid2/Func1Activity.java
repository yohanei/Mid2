package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }

    public void roll(View view){
        Random random = new Random();
        int i = random.nextInt(6) + 1;
        new AlertDialog.Builder(this)
                .setMessage("點數" + i)
                .show();
    }

}
