package com.example.android.miwok;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.WorkSource;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one","lutti",R.drawable.number_one));
        words.add(new word("two","otiiko",R.drawable.number_two));
        words.add(new word("Three","tolookosu",R.drawable.number_three));
        words.add(new word("Four","oyyisa",R.drawable.number_four));
        words.add(new word("Five","massokka",R.drawable.number_five));
        words.add(new word("Six","temmokka",R.drawable.number_six));
        words.add(new word("Seven","kenekaku",R.drawable.number_seven));
        words.add(new word("Eight","kawinta",R.drawable.number_eight));
        words.add(new word("Nine","wo’e",R.drawable.number_nine));
        words.add(new word("Ten","na’aacha",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

