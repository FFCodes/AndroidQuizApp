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
public class NYCLibraries extends Fragment {


    public NYCLibraries() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_guide, container, false);
        final ArrayList<Topics> topicsList = new ArrayList<Topics>();
        topicsList.add(new Topics(getString(R.string.nypl), R.drawable.nypl_logo));
        topicsList.add(new Topics(getString(R.string.nyplCentral), R.drawable.nypl_main_location));
        topicsList.add(new Topics(getString(R.string.bklynpl), R.drawable.brooklyn_public_library_logo));
        topicsList.add(new Topics(getString(R.string.bklynplCentral), R.drawable.bklyn_pl_main));

        TopicsAdapter adapter = new TopicsAdapter(getActivity(),topicsList);
        ListView listView = (ListView) rootView.findViewById(R.id.list_places);
        listView.setAdapter(adapter);
        return rootView;
    }

}
