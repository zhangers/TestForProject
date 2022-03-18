package com.example.testforproject;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.testforproject.dataclass.Appinfo;
import com.example.testforproject.dataclass.Fruit;
import com.example.testforproject.dataclass.FruitAdapter;
import com.example.testforproject.function.GetAppInfo;
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
    private List<Appinfo> appinfoList=new ArrayList<Appinfo>();
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
        initapplist();

        FruitAdapter adapter=new FruitAdapter(main_page.this,R.layout.fruit_item,fruitList);
        ListView listView=(ListView) findViewById(R.id.FruitList);
        listView.setAdapter(adapter);
    }

    private void initapplist() {
        GetAppInfo recordinfo= new GetAppInfo();
        recordinfo.allPackage(main_page.this);
    }

    private void initfruit() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple","1");
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana","1");
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange","1");
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon","1");
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear","1");
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape","1");
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple","1");
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry","1");
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry","1");
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango","1");
            fruitList.add(mango);
        }
    }



}