package com.example.memorygame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    EditText nameInput;

    public HomeFragment() {
        // Required empty public constructor
    }

    public void saveName(View view) {
        String name = nameInput.getText().toString();

        Log.d("NAME", name);
        if (name.isEmpty()) {
            Toast.makeText(getActivity(), "No name is entered, so it will not be saved in the high scores list.", Toast.LENGTH_LONG).show();
        } else {
            ((MainActivity)getActivity()).namesList.add(name); // add user to names list (for top scores)
            Toast.makeText(getActivity(), "Name may be added to high scores list.", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnSaveName = v.findViewById(R.id.btnSaveName);
        btnSaveName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveName(view);
            }
        });

        nameInput = v.findViewById(R.id.txtInputName);

        return v;
    }
}