package com.example.babybuy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.babybuy.R;

public class HomeActivity extends AppCompatActivity {
    TextView t;
    ImageButton backtocategoryy;


    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        t = findViewById(R.id.textView4);
        backtocategoryy = findViewById(R.id.backtocategory);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = this.getWindow();
//            window.setStatusBarColor(this.getResources().getColor(R.color.blue));
//        }

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });

        backtocategoryy.setOnClickListener(v ->{
            redirecttocategory();
        });
    }
    public void redirecttocategory(){
        startActivity(new Intent(HomeActivity.this, MainActivity.class));
    }
}