package com.example.exercice2tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listelange = findViewById(R.id.lang);
        ArrayList<String> lange=new ArrayList<>();
        lange.add("java");
        lange.add("C#");
        lange.add("Python");
        lange.add("Flutter");
        lange.add("Kotlin");
        lange.add("Swift");
//        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice,lange);
//      listelange.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//      listelange.setAdapter(adapter);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice,lange);
        listelange.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listelange.setAdapter(adapter);
    }
}