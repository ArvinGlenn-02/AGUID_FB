package com.example.aguid_ma1_fb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button frag1btn;
    Button frag2btn;
    Button frag3btn;
    Button frag4btn;
    Button frag5btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1btn = findViewById(R.id.fragment1btn);
        frag2btn = findViewById(R.id.fragment2btn);
        frag3btn = findViewById(R.id.fragment3btn);
        frag4btn = findViewById(R.id.fragment4btn);
        frag5btn = findViewById(R.id.fragment5btn);

        if (savedInstanceState == null) {
            replaceFragment(new NewsFeedFragment());
        }
    }

    public void showNewsFeedFragment(View v) {
        replaceFragment(new NewsFeedFragment());
    }

    public void showVideoFragment(View v) {
        replaceFragment(new VideoFragment());
    }

    public void showNotificationFragment(View v) {
        replaceFragment(new NotificationFragment());
    }

    public void showGamingFragment(View v) {
        replaceFragment(new GamingFragment());
    }

    public void showMarketPlaceFragment(View v) {
        replaceFragment(new MarketPlaceFragment());
    }

    public void showMenuFragment(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, new MenuFragment())
                .commit();
    }


    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}
