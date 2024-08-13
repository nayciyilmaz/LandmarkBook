package com.nayciyilmaz.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.nayciyilmaz.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel","France",R.drawable.eyfel);
        Landmark colosseum = new Landmark("Colleseum","Italy",R.drawable.colleseum);
        Landmark londonBridge = new Landmark("London Bridge","UK",R.drawable.londra);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonBridge);

        binding.reyclerView.setLayoutManager(new LinearLayoutManager(this));
        LanmarkAdapter lanmarkAdapter = new LanmarkAdapter(landmarkArrayList);
        binding.reyclerView.setAdapter(lanmarkAdapter);

    }
}