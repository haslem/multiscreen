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
        words.add(new Word("one", "miwok1", R.drawable.number_one));
        words.add(new Word("two", "miwok2", R.drawable.number_two));
        words.add(new Word("three", "miwok3", R.drawable.number_three));
        words.add(new Word("four", "miwok4", R.drawable.number_four));
        words.add(new Word("five", "miwok5", R.drawable.number_five));
        words.add(new Word("six", "miwok6", R.drawable.number_six));
        words.add(new Word("seven", "miwok7", R.drawable.number_seven));
        words.add(new Word("eight", "miwok8", R.drawable.number_eight));
        words.add(new Word("nine", "miwok9", R.drawable.number_nine));


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
