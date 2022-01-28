package com.example.raspisanierecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Понедельник","Пара 1","Пара 2","Пара 3","Пара 4",""));
        items.add(new Item("Вторник","","Пара 2","Пара 3","Пара 4","Пара 5"));
        items.add(new Item("Среда","","Пара 2","Пара 3","Пара 4",""));
        items.add(new Item("Четверг","Пара 1","Пара 2","","",""));
        items.add(new Item("Пятница","Пара 1","Пара 2","Пара 3","Пара 4",""));
        items.add(new Item("Суббота","Пара 1","Пара 2","","",""));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}