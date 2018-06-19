package com.example.test.androidbugs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class  SimpleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;

    SimpleAdapter(Context context) {
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext)
                .inflate(R.layout.tile_view, null);;

        return new RecyclerView.ViewHolder(view) {};
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        TextView textView = (TextView) ((LinearLayout) holder.itemView).getChildAt(0);
        textView.setText("Item" + String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
