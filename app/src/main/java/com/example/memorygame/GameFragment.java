package com.example.memorygame;

import static android.view.View.*;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class GameFragment extends Fragment {

    public GameFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_game, container, false);

        // find the try again button
        Button btnPlayAgain = v.findViewById(R.id.btnPlayAgain);
        btnPlayAgain.setVisibility(INVISIBLE);

        return v;
    }
}