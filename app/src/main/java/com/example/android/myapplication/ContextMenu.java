package com.example.android.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ContextMenu extends AppCompatActivity {
    Button b;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        b = findViewById(R.id.b1);
        registerForContextMenu(b);
        t1 = findViewById(R.id.t1);
    }

    // option menu text

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid;
        itemid = item.getItemId();
        if (itemid == R.id.cm1)
            t1.setText("Menu1 is selected");
        if (itemid == R.id.cm2)
            t1.setText("Menu2 is selected");
        if (itemid == R.id.cm3)
            t1.setText("Menu3 is selected");


        return super.onOptionsItemSelected(item);
    }

    // context menu button

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu, menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int itemid;
        itemid = item.getItemId();
        if (itemid == R.id.cm1) {
            Toast.makeText(this, "This is Home menu", Toast.LENGTH_SHORT).show();
        }
        if (itemid == R.id.cm2) {
            Toast.makeText(this, "This is Insert menu", Toast.LENGTH_SHORT).show();
        }
        if (itemid == R.id.cm3) {
            Toast.makeText(this, "This is Update menu", Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }
}