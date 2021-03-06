package com.tonyjs.sample.multiitemadapter.adapter.advanced.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tonyjs.sample.multiitemadapter.core.viewholder.BaseViewHolder;
import com.tonyjs.sample.multiitemadapter.domain.Item;

/**
 * Created by tonyjs on 16. 4. 9..
 */
public class AViewHolder extends BaseViewHolder<Item> {

    private TextView mTextView;

    public static AViewHolder newInstance(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new AViewHolder(itemView);
    }

    public AViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(android.R.id.text1);
    }

    @Override
    public void onBindView(Item item) {
        mTextView.setText(item.getName());
    }

}

