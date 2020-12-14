package com.duykhai.kiemtrath3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {
    private Context context_417;
    private String[] title_417;
    private int[] image_row_417;

    public GridViewAdapter(Context context, String[] title, int[] image_row) {
        this.context_417 = context;
        this.title_417 = title;
        this.image_row_417 = image_row;
    }

    @Override
    public int getCount() {
        return title_417.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context_417.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.grid_row, null);
        TextView textView = convertView.findViewById(R.id.textView_row_417);
        ImageView imageView = convertView.findViewById(R.id.imageView_row_417);
        textView.setText(title_417[position]);
        imageView.setImageResource(image_row_417[position]);
        return convertView;
    }
}

