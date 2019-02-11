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
public class NYCTech extends Fragment {


    public NYCTech() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_guide, container, false);
        final ArrayList<Topics> topicsList = new ArrayList<Topics>();
        topicsList.add(new Topics(getString(R.string.nycCodeBar), R.drawable.codebar_nyc));
        topicsList.add(new Topics(getString(R.string.nycPursuit), R.drawable.pursuit_nyc));
        topicsList.add(new Topics(getString(R.string.nycWHC), R.drawable.women_who_code_nyc));

        TopicsAdapter adapter = new TopicsAdapter(getActivity(),topicsList);
        ListView listView = (ListView) rootView.findViewById(R.id.list_places);
        listView.setAdapter(adapter);
        return rootView;
    }

}
