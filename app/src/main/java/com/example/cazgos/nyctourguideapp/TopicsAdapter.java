package com.example.cazgos.nyctourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopicsAdapter extends ArrayAdapter<Topics> {
    public TopicsAdapter(Context context, ArrayList<Topics> contents) {
        super(context, 0, contents);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_guide, parent, false);
        }

        Topics currentTopics = getItem(position);

        TextView contentNameTextView = listItemView.findViewById(R.id.name_text_view);
        contentNameTextView.setText(currentTopics.getContentName());

        ImageView imageView =  listItemView.findViewById(R.id.image_places);
        imageView.setImageResource(currentTopics.getContentImageId());

        if (currentTopics.hasImage()) {
            imageView.setImageResource(currentTopics.getContentImageId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
