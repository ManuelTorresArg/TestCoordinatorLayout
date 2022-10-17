package com.example.bottomapbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomAppBar = findViewById(R.id.bottomAppBar);

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.search:
                        Toast.makeText(MainActivity.this, "Search!!", Toast.LENGTH_SHORT).show();
                        Log.d("Announcement", "Received Search");
                        break;
                    case R.id.more:
                        Toast.makeText(MainActivity.this, "More!!", Toast.LENGTH_SHORT).show();
                        Log.d("Announcement", "Received More");
                        break;
                }

                return false;
            }
        });

        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}