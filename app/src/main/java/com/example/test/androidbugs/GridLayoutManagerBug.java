package com.example.test.androidbugs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class GridLayoutManagerBug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout_manager_bug);
        init();
    }

    private void init() {
        final int columnCount = 4;
        RecyclerView recyclerView = findViewById(R.id.recycler_view_with_grid_layout_manager);

        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext());
        recyclerView.setAdapter(simpleAdapter);
        final GridLayoutManager layoutManager = new GridLayoutManager(
                getApplicationContext(),
                columnCount);
        recyclerView.setLayoutManager(layoutManager);
    }
}
