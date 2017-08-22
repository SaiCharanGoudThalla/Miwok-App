package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("red","weṭeṭṭi",R.drawable.color_red));
        words.add(new word("green","chokokki",R.drawable.color_green));
        words.add(new word("brown","ṭakaakki",R.drawable.color_brown));
        words.add(new word("gray","ṭopopp",R.drawable.color_gray));
        words.add(new word("black","kululli",R.drawable.color_black));
        words.add(new word("white","temmokka",R.drawable.color_white));
        words.add(new word("dusty yellow","kelelli",R.drawable.color_dusty_yellow));
        words.add(new word("mustard yellow","ṭopiisә",R.drawable.color_mustard_yellow));



        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
