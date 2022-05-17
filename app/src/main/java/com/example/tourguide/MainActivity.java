package com.example.tourguide;


import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference to our viewPager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // This hides the shadow of the appbar
        getSupportActionBar().setElevation(0);

        // The CategoryAdapter determines which Fragment to be displayed
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        // This sets the adapter on our ViewPager
        viewPager.setAdapter(adapter);

        // Reference to our TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // This connects the ViewPager and TabLayout
        tabLayout.setupWithViewPager(viewPager);

    }




}

