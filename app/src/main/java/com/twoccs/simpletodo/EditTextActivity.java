package com.twoccs.simpletodo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class EditTextActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    public void onSubmit(View v) {
        this.finish();
    }

}
