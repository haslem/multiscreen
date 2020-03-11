package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "miwok1"));
        words.add(new Word("two", "miwok2"));
        words.add(new Word("three", "miwok3"));
        words.add(new Word("four", "miwok4"));
        words.add(new Word("five", "miwok5"));
        words.add(new Word("six", "miwok6"));
        words.add(new Word("seven", "miwok7"));
        words.add(new Word("eight", "miwok8"));
        words.add(new Word("nine", "miwok9"));


        //android.R.layout.simple_list_item_1  - predefined by Android
        //it is one of predefined layouts in R.layout
        //android.R.layout.simple_list_item_1 - predefined layout, that contains one textview
        //https://developer.android.com/reference/android/R.layout
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));

    }
}
