package com.tonyjs.sample.multiitemadapter.core.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by tonyjs on 16. 1. 19..
 */
public abstract class BaseViewHolder<ITEM> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindView(ITEM item);

}
