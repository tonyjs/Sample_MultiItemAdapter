package com.tonyjs.sample.multiitemadapter.adapter.normal.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tonyjs on 16. 4. 9..
 */
public class AViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public AViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(android.R.id.text1);
    }

    public TextView getTextView() {
        return mTextView;
    }

}

