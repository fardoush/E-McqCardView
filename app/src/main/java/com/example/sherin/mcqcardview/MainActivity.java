package com.example.sherin.mcqcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView bangla,english,math,ict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bangla=findViewById(R.id.banglaId);
        english=findViewById(R.id.englishId);
        math=findViewById(R.id.mathId);
        ict=findViewById(R.id.ictId);

        bangla.setOnClickListener(this);
        english.setOnClickListener(this);
        math.setOnClickListener(this);
        ict.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.banglaId)
        {
            Intent intent=new Intent(MainActivity.this,BanglaActivity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.englishId)
        {
            Intent intent=new Intent(MainActivity.this,EnglishActivity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.mathId)
        {
            Intent intent=new Intent(MainActivity.this,MathActivity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.ictId)
        {
            Intent intent=new Intent(MainActivity.this,ICTActivity.class);
            startActivity(intent);
        }
    }
}
