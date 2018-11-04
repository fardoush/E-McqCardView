package com.example.sherin.mcqcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView bangla,english,math,ict;
    private ListView listView;
    private SearchView searchView;

/*
    String selected = topics_name[i];
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        final String[] bangla = getResources().getStringArray(R.array.bangla_topics);

        final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.bangla_sample_layout, R.id.banglaMCQId, bangla);

        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                adapter.getFilter().filter(s);

                return false;
            }
        });
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

        listView = findViewById(R.id.lvId);
        searchView = findViewById(R.id.searchViewId);

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
/*
            intent.putExtra("tropics_name", selected);
*/

            startActivity(intent);
        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


               /* adapterView.getSelectedItem();
                adapterView.getItemAtPosition(i);*/
               // String selected = bangla[i];

                // Go Details Activity
                Intent intent = new Intent(MainActivity.this, BanglaActivity.class);
               // intent.putExtra("bangla", selected);
                startActivity(intent);


            }
        });
    }
}
