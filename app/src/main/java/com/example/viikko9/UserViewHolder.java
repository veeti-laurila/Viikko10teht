package com.example.viikko9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userPicture;
    TextView name, degreeProgram, email, degrees, degrees2;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        userPicture = itemView.findViewById(R.id.imageViewPicture);
        name = itemView.findViewById(R.id.textViewName);
        degreeProgram = itemView.findViewById(R.id.textViewDegree);
        email = itemView.findViewById(R.id.textViewEmail);
        degrees = itemView.findViewById(R.id.textViewDegrees);
        degrees2 = itemView.findViewById(R.id.textViewDegrees2);
    }
}
