package com.example.practicefragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.practicefragment.fragments.FirstFragment;
import com.example.practicefragment.fragments.FourthFragment;
import com.example.practicefragment.fragments.SecondFragment;
import com.example.practicefragment.fragments.ThirdFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(R.id.First, (new FirstFragment()));
        loadFragment(R.id.Second, (new SecondFragment()));
        loadFragment(R.id.Third, (new ThirdFragment()));
        loadFragment(R.id.Fourth, (new FourthFragment()));
    }

    public void loadFragment(int containerId, Fragment fragmentToLoad) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment currentFragment = manager.findFragmentById(containerId);
        if (currentFragment == null)
            transaction.add(containerId, fragmentToLoad);
        else
            transaction.replace(containerId, fragmentToLoad);
        transaction.commit();

    }
}
