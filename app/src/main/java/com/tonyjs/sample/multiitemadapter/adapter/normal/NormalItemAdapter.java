package com.tonyjs.sample.multiitemadapter.adapter.normal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tonyjs.sample.multiitemadapter.adapter.normal.viewholder.AViewHolder;
import com.tonyjs.sample.multiitemadapter.adapter.normal.viewholder.BViewHolder;
import com.tonyjs.sample.multiitemadapter.domain.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyjs on 16. 4. 9..
 */
public class NormalItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int VIEW_TYPE_A = 0;
    public static final int VIEW_TYPE_B = 1;

    private List<Item> mItems = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_A) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(android.R.layout.simple_list_item_1, parent, false);
            return new AViewHolder(itemView);
        } else {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(android.R.layout.simple_list_item_1, parent, false);
            return new BViewHolder(itemView);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof AViewHolder) {
            Item item = getItem(position);
            ((AViewHolder) holder).getTextView().setText(item.getName());
        } else {
            ((BViewHolder) holder).getTextView().setText("I am B.");
        }
    }

    private Item getItem(int position) {
        return mItems.get(position);
    }

    public void setItems(List<Item> items) {
        mItems.clear();
        mItems.addAll(items);
    }

    @Override
    public int getItemViewType(int position) {
        if (getItem(position).getType().equals(Item.ITEM_TYPE_A)) {
            return VIEW_TYPE_A;
        } else {
            return VIEW_TYPE_B;
        }
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
