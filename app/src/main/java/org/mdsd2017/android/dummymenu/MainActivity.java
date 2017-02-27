package org.mdsd2017.android.dummymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "In-MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.item_add:
                Log.i(MainActivity.TAG, "Add option");
                break;
            case R.id.item_like:
                Log.i(MainActivity.TAG, "Like option");
                break;
            case R.id.item_dislike:
                Log.i(MainActivity.TAG, "Dislike option");
                break;
            default:
                Log.i(MainActivity.TAG, "Other option");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
