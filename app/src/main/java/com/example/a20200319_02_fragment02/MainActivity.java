package com.example.a20200319_02_fragment02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.a20200319_02_fragment02.adapters.MainViewPagerAdapter;
import com.example.a20200319_02_fragment02.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    MainViewPagerAdapter mvpa;

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        mvpa = new MainViewPagerAdapter(getSupportFragmentManager());

        binding.mainViewPager.setAdapter(mvpa);

    }
}
