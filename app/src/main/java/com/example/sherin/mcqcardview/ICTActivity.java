package com.example.sherin.mcqcardview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ICTActivity extends AppCompatActivity {
    private String ict = "Android MCQ ";

    private TextView tvTitle, tvDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ict);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            ict = bundle.getString("ict");
        }

        initView();
    }

    private void initView() {

        tvTitle = findViewById(R.id.tvDistId);
        tvDetails = findViewById(R.id.tvDetailsInfoId);
        tvTitle.setText(ict);

        String s = getResources().getString(R.string.ict);
        tvDetails.setText(s);


       /* Typeface typeface = Typeface.createFromAsset(getAssets(), "BrotherTattoo_Demo.ttf");

        tvTitle.setTypeface(typeface);*/


       /* if (ict.equalsIgnoreCase("ict")) {

            String s = getResources().getString(R.string.ict);
            tvDetails.setText(s);

        }
        else{
            Toast.makeText(this, "no sucessfully", Toast.LENGTH_SHORT).show();
        }*/
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}