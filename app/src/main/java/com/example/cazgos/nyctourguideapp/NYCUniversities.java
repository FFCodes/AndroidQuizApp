package com.example.cazgos.nyctourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NYCUniversities extends Fragment {


    public NYCUniversities() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_guide, container, false);
        final ArrayList<Topics> topicsList = new ArrayList<Topics>();
        topicsList.add(new Topics(getString(R.string.columbiaU), R.drawable.columbia));
        topicsList.add(new Topics(getString(R.string.cityC), R.drawable.city_college_logo));
        topicsList.add(new Topics(getString(R.string.hunterC), R.drawable.hunter_college_logo));
        topicsList.add(new Topics(getString(R.string.baruchC), R.drawable.baruch_college_logo));
        topicsList.add(new Topics(getString(R.string.nyu), R.drawable.nyu_logo));

        TopicsAdapter adapter = new TopicsAdapter(getActivity(),topicsList);
        ListView listView = (ListView) rootView.findViewById(R.id.list_places);
        listView.setAdapter(adapter);
        return rootView;
    }

}
