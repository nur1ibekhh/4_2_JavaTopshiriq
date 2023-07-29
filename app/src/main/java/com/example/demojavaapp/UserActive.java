package com.example.demojavaapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActive extends AppCompatActivity {
    static  final String TAG = UserActive.class.toString();
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_layout);
        printMe();
    }
    void printMe(){
        TextView active_menu_layot = findViewById(R.id.active_menu_layot);

        User user =(User) getIntent().getSerializableExtra("user");
        Log.d(TAG,user.toString());
        active_menu_layot.setText("Yoshi va ismi: "+user.toString());
    }
}
