package com.example.test.androidbugs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // GridLayoutManager Bug
        Button gridLayoutManagerBug = findViewById(R.id.grid_layout_manager_bug);
        gridLayoutManagerBug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridLayoutManagerBug.class);
                startActivity(intent);
            }
        });

        // StaggeredGridLayoutManager Bug
        Button staggeredGridLayoutManagerBug = findViewById(R.id.staggered_grid_layout_manager_bug);
        staggeredGridLayoutManagerBug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StaggeredGridLayoutManagerBug.class);
                startActivity(intent);
            }
        });
    }
}
