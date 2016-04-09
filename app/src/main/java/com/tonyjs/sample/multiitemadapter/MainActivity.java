package com.tonyjs.sample.multiitemadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;

import com.tonyjs.sample.multiitemadapter.adapter.advanced.AdvancedItemAdapter;
import com.tonyjs.sample.multiitemadapter.adapter.normal.NormalItemAdapter;
import com.tonyjs.sample.multiitemadapter.core.MultiItemAdapter;
import com.tonyjs.sample.multiitemadapter.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NormalItemAdapter mNormalItemAdapter;
    private AdvancedItemAdapter mAdvancedItemAdapter;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recylcerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);

        mAdvancedItemAdapter = new AdvancedItemAdapter();
        mNormalItemAdapter = new NormalItemAdapter();

        changeToAdvancedItemAdapter();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_change_to_advanced_adapter:
                changeToAdvancedItemAdapter();
                return true;
            case R.id.action_change_to_normal_adapter:
                changeToNormalAdapter();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void changeToAdvancedItemAdapter() {
        mRecyclerView.setAdapter(mAdvancedItemAdapter);
        setItemsToAdvancedItemAdapter(Item.getSampleItems());

        getSupportActionBar().setTitle("AdvancedItemAdapter");
    }

    public void setItemsToAdvancedItemAdapter(List<Item> items) {
        List<MultiItemAdapter.Row<?>> rows = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (TextUtils.equals(item.getType(), "A")) {
                rows.add(MultiItemAdapter.Row.create(item, AdvancedItemAdapter.VIEW_TYPE_A));
            } else {
                rows.add(MultiItemAdapter.Row.create(item, AdvancedItemAdapter.VIEW_TYPE_B));
            }
        }

        mAdvancedItemAdapter.setRows(rows);
        mAdvancedItemAdapter.notifyDataSetChanged();
    }

    private void changeToNormalAdapter() {
        mRecyclerView.setAdapter(mNormalItemAdapter);
        setItemsToNormalItemAdapter(Item.getSampleItems());

        getSupportActionBar().setTitle("NormalItemAdapter");
    }

    private void setItemsToNormalItemAdapter(List<Item> items) {
        mNormalItemAdapter.setItems(items);
        mNormalItemAdapter.notifyDataSetChanged();
    }


}
