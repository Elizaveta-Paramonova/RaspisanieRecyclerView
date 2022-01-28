package com.example.raspisanierecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        TextView textView = findViewById(R.id.textView);
        Button btnChislitel = findViewById(R.id.btnChislitel);
        btnChislitel.setOnClickListener(view -> {
            textView.setText("Числитель");
            List<Item> items = new ArrayList<Item>();
            items.add(new Item("Понедельник","1: ____________________", "2: Разработка мобильный приложений",
                    "3: Разработка программных модулей", "4: Технология разработки и защиты баз данных",
                    "5: Инструментальные средства разработки ПО"));
            items.add(new Item("Вторник", "1: ПРАКТИКА", "2: ПРАКТИКА", "3: ПРАКТИКА", "4: ПРАКТИКА", "5: ПРАКТИКА"));
            items.add(new Item("Среда", "1: ПРАКТИКА", "2: ПРАКТИКА", "3: ПРАКТИКА", "4: ПРАКТИКА", "5: ПРАКТИКА"));
            items.add(new Item("Четверг", "1: ____________________", "2: Иностранный язык в профессиональной деятельности",
                    "3: Разработка мобильных приложений", "4: Технология разработки программного обеспечения", "5: Системное программирование"));
            items.add(new Item("Пятница", "1: Физическая культура", "2: Разработка программных модулей",
                    "3: Технология разработки программного обеспечения", "4: Технология разработки и защиты баз данных",
                    "5: ____________________"));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
        });
        Button btnZnamenatil = findViewById(R.id.btnZnamenatel);
        btnZnamenatil.setOnClickListener(view -> {
            textView.setText("Знаменатель");
            List<Item> items = new ArrayList<Item>();
            items.add(new Item("Понедельник",
                    "1: ____________________", "2: Разработка программных модулей", "3: Разработка программных модулей",
                    "4: Системное программирование", "5: Инструментальные средства разработки ПО"
            ));
            items.add(new Item("Вторник", "1: ПРАКТИКА", "2: ПРАКТИКА", "3: ПРАКТИКА", "4: ПРАКТИКА", "5: ПРАКТИКА"));
            items.add(new Item("Среда", "1: ПРАКТИКА", "2: ПРАКТИКА", "3: ПРАКТИКА", "4: ПРАКТИКА", "5: ПРАКТИКА"));
            items.add(new Item("Четверг", "1: ____________________", "2: Иностранный язык в профессиональной деятельности",
                    "3: Разработка мобильных приложений", "4: Технология разработки программного обеспечения", "5: Системное программирование"));
            items.add(new Item("Пятница", "1: Физическая культура", "2: Разработка программных модулей",
                    "3: Инструментальные средства разработки ПО", "4: Технология разработки и защиты баз данных",
                    "5: ____________________"
            ));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
        });
    }
}