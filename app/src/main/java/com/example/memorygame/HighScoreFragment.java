package com.example.memorygame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class HighScoreFragment extends Fragment {

    public HighScoreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_high_score, container, false);

        TextView highScoresList = v.findViewById(R.id.txtHighScoresList);

        MainActivity mainActivity = (MainActivity) getActivity();
        ArrayList<String> namesList = mainActivity.namesList;
        StringBuilder highScoresString = new StringBuilder();

        for (String name : namesList.toArray(new String[0])) {
            highScoresString.append(name).append("\n");
        }
        highScoresList.setText(highScoresString);

        return v;
    }
}