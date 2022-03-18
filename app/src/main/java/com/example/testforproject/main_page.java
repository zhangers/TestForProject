package com.example.testforproject;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.testforproject.dataclass.Fruit;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.testforproject.databinding.ActivityMainPageBinding;

import java.util.ArrayList;
import java.util.List;

public class main_page extends AppCompatActivity {

    private ActivityMainPageBinding binding;
    private List<Fruit> fruitList=new ArrayList<Fruit>();
    private String[] data ={"apple","banana","pear","peach","pineapple","apple","banana","pear","peach","pineapple","apple","banana","pear","peach","pineapple","apple","banana","pear","peach","pineapple"
    ,"apple","banana","pear","peach","pineapple","apple","banana","pear","peach","pineapple","apple","banana","pear","peach","pineapple","apple","banana","pear","peach","pineapple"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main_page);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        initfruit();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(main_page.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView) findViewById(R.id.FruitList);
        listView.setAdapter(adapter);
    }


    private void initfruit() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple");
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana");
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange");
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon");
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear");
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape");
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple");
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry");
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry");
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango");
            fruitList.add(mango);
        }
    }

}