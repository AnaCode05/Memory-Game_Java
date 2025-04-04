package com.example.memorygame;

import static android.view.View.*;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.helper.widget.Grid;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.Random;

public class GameFragment extends Fragment {
    GridLayout gridGame;
    Random random = new Random();


    public GameFragment() {
        // Required empty public constructor
    }

    public void highlightSquares() {
        // generate 4 random "coordinates" between 0 and 5
        int randomRow1 = random.nextInt(0,6);
        int randomRow2 = random.nextInt(0,6);
        int randomRow3 = random.nextInt(0,6);
        int randomRow4 = random.nextInt(0,6);
        int randomColumn1 = random.nextInt(0,6);
        int randomColumn2 = random.nextInt(0,6);
        int randomColumn3 = random.nextInt(0,6);
        int randomColumn4 = random.nextInt(0,6);



        // foreach element in gridGame layout:
        // if the name's last 2 characters equal to the row and column, set the square to background
        // color of blue
        GridLayout gridLayout = getView().findViewById(R.id.gridGame); // get the grid

        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            CardView square = (CardView) gridLayout.getChildAt(i); // get the CardView square



            square.setCardBackgroundColor(getResources().getColor(R.color.blue_1));

//            String squareFullName = square.getResources().getResourceName(getView().getId()); // get the ID of the square
//            String squareName = squareFullName.substring(squareFullName.lastIndexOf("/")+1);
//            Log.d("TAG", "Square name/ID: "+squareName);
//            // Extract row & column from view id (name)
//            int clickedRow = Integer.parseInt(""+squareName.charAt(squareName.length() - 2));
//            int clickedColumn = Integer.parseInt(""+squareName.charAt(squareName.length() - 1));
        }

    }

    private void declareWinner() {
        // Make the grid not clickable after a win

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