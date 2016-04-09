package com.tonyjs.sample.multiitemadapter.adapter.advanced;

import android.view.ViewGroup;

import com.tonyjs.sample.multiitemadapter.adapter.advanced.viewholder.AViewHolder;
import com.tonyjs.sample.multiitemadapter.adapter.advanced.viewholder.BViewHolder;
import com.tonyjs.sample.multiitemadapter.core.MultiItemAdapter;
import com.tonyjs.sample.multiitemadapter.core.viewholder.BaseViewHolder;

/**
 * Created by tonyjs on 16. 4. 9..
 */
public class AdvancedItemAdapter extends MultiItemAdapter {

    public static final int VIEW_TYPE_A = 0;
    public static final int VIEW_TYPE_B = 1;

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_A) {
            return AViewHolder.newInstance(parent);
        } else {
            return BViewHolder.newInstance(parent);
        }
    }

}