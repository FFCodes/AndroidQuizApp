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
public class NYCHomeFragment extends Fragment {


    public NYCHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_guide, container, false);
        final ArrayList<Topics> topicsList = new ArrayList<Topics>();
        topicsList.add(new Topics(getString(R.string.nycTitle), R.drawable.nypl_logo));
        topicsList.add(new Topics(getString(R.string.nycOldestPrivateCollege), R.drawable.columbia));
        topicsList.add(new Topics(getString(R.string.nycOldestPublicCollege), R.drawable.city_college_logo));
        topicsList.add(new Topics(getString(R.string.nycStemFuture), R.drawable.women_who_code_nyc));


        TopicsAdapter adapter = new TopicsAdapter(getActivity(),topicsList);
        ListView listView = (ListView) rootView.findViewById(R.id.list_places);
        listView.setAdapter(adapter);
        return rootView;
    }

}
