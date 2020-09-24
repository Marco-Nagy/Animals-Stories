package com.example.animalsstorys;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
private ListStories listView;
private ArrayList<Story> stories;

    public CustomAdapter(ListStories listView, ArrayList<Story> stories) {
        this.listView = listView;
        this.stories = stories;
    }

    @Override
    public int getCount() {
        return stories.size();
    }

    @Override
    public Object getItem(int position) {
        return (position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View View, ViewGroup parent) {
        LayoutInflater inflater=listView.getLayoutInflater();
        View=inflater.inflate(R.layout.list_view,parent,false);
        TextView textView= View.findViewById(R.id.text_list);
        ImageView imageView=View.findViewById(R.id.image_list);
        textView.setText(stories.get(position).getName());
        imageView.setImageResource(stories.get(position).getPic());
        return View;
    }
}
