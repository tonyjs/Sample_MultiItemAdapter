package com.tonyjs.sample.multiitemadapter.adapter.normal.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tonyjs.sample.multiitemadapter.domain.Item;

/**
 * Created by tonyjs on 16. 4. 9..
 */
public class BViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public static BViewHolder newInstance(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new BViewHolder(itemView);
    }

    public BViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(android.R.id.text1);
    }

    public TextView getTextView() {
        return mTextView;
    }
}

