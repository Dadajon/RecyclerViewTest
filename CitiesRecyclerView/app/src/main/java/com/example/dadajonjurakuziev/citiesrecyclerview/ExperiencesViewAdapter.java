package com.example.dadajonjurakuziev.citiesrecyclerview;

/*
*   RecylerView.Adapter
*   RecyclerView.ViewHolder
* */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ExperiencesViewAdapter extends RecyclerView.Adapter<ExperiencesViewAdapter.ExperiencesViewHolder>{
    private static final String TAG = "ExperiencesViewAdapter";

    //vars
    private Context expContext;
    private List<Experiences> experiencesList;
    private List<Cities> citiesList;

    public ExperiencesViewAdapter(Context expContext, List<Experiences> experiencesList) {
        this.expContext = expContext;
        this.experiencesList = experiencesList;
    }

    @NonNull
    @Override
    public ExperiencesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(expContext).inflate(R.layout.top_experiences_layout, viewGroup, false);
        return new ExperiencesViewAdapter.ExperiencesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExperiencesViewHolder experiencesViewHolder, int i) {
        final Experiences experiences = experiencesList.get(i);

        experiencesViewHolder.expTitle.setText(experiences.getExp_title());
        experiencesViewHolder.expDesc.setText(experiences.getExp_desc());
        experiencesViewHolder.expImageView.setImageResource(experiences.getExp_image());

        experiencesViewHolder.expCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on experience in " + experiences.getExp_title());

                Toast.makeText(expContext, "Clicked on "+experiences.getExp_title(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return experiencesList.size();
    }

    class ExperiencesViewHolder extends RecyclerView.ViewHolder{
        ImageView expImageView;
        TextView expTitle, expDesc;
        CardView expCardView;
        LinearLayout expLayout;

        public ExperiencesViewHolder(@NonNull View itemView) {
            super(itemView);
            expImageView = itemView.findViewById(R.id.experience_bg);
            expTitle = itemView.findViewById(R.id.experience_title);
            expDesc = itemView.findViewById(R.id.experience_desc);
            expCardView = itemView.findViewById(R.id.experience_cardView);
            expLayout = itemView.findViewById(R.id.exp_layout);
        }
    }
}
