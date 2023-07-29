package com.example.demojavaapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();
    }
    void intView(){
        Button main_menu = findViewById(R.id.main_menu);
        main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(20,"Nurlibek");
                openUserActive(user);
            }
        });
    }
    void openUserActive(User userAccount){
        Intent intent = new Intent(this,UserActive.class);
        intent.putExtra("user",userAccount);
        startActivity(intent);
    }
}