package com.akbar.malay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String[] words = new String[10];
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("yes", "ya"));
        words.add(new Word("no", "tidak"));
        words.add(new Word("don't", "jangan"));
        words.add(new Word("goodbye", "selamat tinggal"));
        words.add(new Word("please", "tolong"));
        words.add(new Word("help", "tolong" +
                ""));
        words.add(new Word("I", "saya"));
        words.add(new Word("me", "aku"));
        words.add(new Word("you", "kamu"));
        words.add(new Word("he/she", "dia"));
        words.add(new Word("we", "kami"));
        words.add(new Word("start", "mula"));
        words.add(new Word("stop", "berhenti"));
        words.add(new Word("go", "pergi"));
        words.add(new Word("come", "datang"));
        words.add(new Word("welcome", ""));
        words.add(new Word("eat", "makan"));
        words.add(new Word("drink", "minum"));
        words.add(new Word("breakfast", "sarapan pagi "));
        words.add(new Word("lunch", "makan tengah hari"));
        words.add(new Word("dinner", "makan malam"));
        words.add(new Word("afternoon tea", "minum petang"));
        words.add(new Word("maybe", "mungkin"));
        words.add(new Word("later", "nanti"));
        words.add(new Word("wait", "tunggu"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}