package com.example.botanicalbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Plant> animals = new ArrayList<Plant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_plant);
        PlantAdapter adapter = new PlantAdapter(this, animals);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData() {
        animals.add( new Plant("Колокольчик", "Многолетние, реже одно-двулетние травы" +
                " с цельными очерёдными листьями. Венчик по большей части явственно колокольчатый, голубой" +
                " или фиолетовый разных оттенков, порой лиловый, изредка белый. Соцветия обычно метельчатые" +
                " или кистевидные, редко одноцветковые. Коробчатый плод раскрывается четырьмя — шестью щелевидными отверстиями. ",
                R.drawable.bell_flower, "Численность средняя"));
        animals.add( new Plant("Роза", "Роза-это древесное многолетнее цветущее " +
                "растение рода Rosa семейства Rosaceae, или цветок, который она несет. Существует более " +
                "трехсот видов и десятки тысяч сортов. [цитата необходима] Они образуют группу растений," +
                " которые могут быть прямостоячими кустарниками, вьющимися или тянущимися, со стеблями," +
                " которые часто вооружены острыми колючками.Их цветки различаются по размеру и форме и" +
                "обычно большие и эффектные, цвета варьируются от белого до желтого и красного.",
                R.drawable.rose, "Численность большая"));
        animals.add( new Plant("Шиповник", "Шиповник - колючий кустарник из семейства" +
                " розоцветных, высотой до 2 м с красно-коричневыми блестящими ветвями с парными небольшими," +
                " крепкими, несколько изогнутыми шипами. Листья очередные, опушенные, нёравноперистые из 5—7" +
                " пильчатых листочков. Цветки крупные, розовые, пятилепестные, на коротких цветоносах, одиночные," +
                " иногда по 2—3.",
                R.drawable.shipovnik, "Численность большая"));
    }
}