package com.akbar.malay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String[] words = new String[10];
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("how are you?", "apa khabar?"));
        words.add(new Word("I'm fine", "khabar baik"));
        words.add(new Word("thank you", "terima kasih"));
        words.add(new Word("good morning", "selamat pagi"));
        words.add(new Word("good afternoon", "selamat tengah hari"));
        words.add(new Word("good evening", "selamat petang"));
        words.add(new Word("good night", "selamat malam"));
        words.add(new Word("sudah makan", "have you eaten"));
        words.add(new Word("how much is this?", "berapa harga ini?"));
        words.add(new Word("I like you", "saya suka awak"));
        words.add(new Word("I miss you", "saya rindu awak"));
        words.add(new Word("I don't know", "saya tidak tahu"));
        words.add(new Word("I don't understand", "saya tidak/tak faham"));
        words.add(new Word("have a safe journey", "selamat jalan"));
        words.add(new Word("take care", "jaga diri"));
        words.add(new Word("pleased to meet you", "selamat berkenalan"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}