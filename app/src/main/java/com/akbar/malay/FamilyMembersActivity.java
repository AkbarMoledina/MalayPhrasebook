package com.akbar.malay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String[] words = new String[10];
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "bapa"));
        words.add(new Word("mother", "ibu"));
        words.add(new Word("son", "anak lelaki"));
        words.add(new Word("daughter", "anak perempuan"));
        words.add(new Word("elder sister", "kakak"));
        words.add(new Word("elder brother", "abang"));
        words.add(new Word("younger brother", "adik lelaki"));
        words.add(new Word("younger sister", "adik perempuan"));
        words.add(new Word("grandfather", "datuk"));
        words.add(new Word("grandmother", "nenek"));
        words.add(new Word("uncle", "bapa saudara"));
        words.add(new Word("aunt", "ibu saudara"));
        words.add(new Word("nephew", "anak saudara lelaki"));
        words.add(new Word("niece", "anak saudara perempuan"));
        words.add(new Word("cousin", "sepupu"));
        words.add(new Word("grandchild", "cucu"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}