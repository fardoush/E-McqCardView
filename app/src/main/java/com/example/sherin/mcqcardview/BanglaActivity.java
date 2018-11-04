package com.example.sherin.mcqcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

public class BanglaActivity extends AppCompatActivity{
        private ListView listView;
        private SearchView searchView;
        private String bangla = "Not Found";

        private TextView tvTitle, tvDetails;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);


            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {

                bangla = bundle.getString("dist");
            }

            initView();
        }

        private void initView() {

            tvTitle = findViewById(R.id.tvDistId);
            tvDetails = findViewById(R.id.tvDetailsInfoId);
            tvTitle.setText(bangla);

           // Typeface  typeface = Typeface.createFromAsset(getAssets(), "BrotherTattoo_Demo.ttf");

           // tvTitle.setTypeface(typeface);

            if (bangla.equalsIgnoreCase("bangla1")) {

                // String s = getResources().getString(R.string.dhaka);
                tvDetails.setText(getText(R.string.bangla_1st));

            }
            else if (bangla.equalsIgnoreCase("bangla2")) {

                String s = getResources().getString(R.string.bangla_2nd);
                tvDetails.setText(s);

            }
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