package com.akbar.malay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String[] words = new String[10];
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "merah"));
        words.add(new Word("blue", "biru"));
        words.add(new Word("yellow", "kuning"));
        words.add(new Word("purple", "ungu"));
        words.add(new Word("orange", "jingga"));
        words.add(new Word("pink", "merah jambu"));
        words.add(new Word("white", "putih"));
        words.add(new Word("black", "hitam"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}