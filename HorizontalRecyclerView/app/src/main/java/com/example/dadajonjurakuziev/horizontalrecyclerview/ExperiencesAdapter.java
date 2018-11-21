package com.example.dadajonjurakuziev.horizontalrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class ExperiencesAdapter extends RecyclerView.Adapter<ExperiencesAdapter.ViewHolder>{
    private static final String TAG = "ExperiencesAdapter";

    //vars
    private ArrayList<String> exNames;
    private ArrayList<String> exImageUrls;
    private Context exCtx;

    ExperiencesAdapter(Context exCtx, ArrayList<String> exNames, ArrayList<String> exImageUrls ){
        this.exNames = exNames;
        this.exImageUrls = exImageUrls;
        this.exCtx = exCtx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_inside_experiencesitem, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: Inner recyclerView called.");

        Glide.with(exCtx)
                .asBitmap()
                .load(exImageUrls.get(i))
                .into(viewHolder.exp_image);

        viewHolder.exp_title.setText(exNames.get(i));
        viewHolder.exp_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on inner image: "+exNames.get(i));
                Toast.makeText(exCtx, exNames.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() { return exNames.size(); }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView exp_image;
        TextView exp_title;
        CardView exp_cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            exp_image = itemView.findViewById(R.id.experience_image);
            exp_title = itemView.findViewById(R.id.experience_title);
            exp_cardView = itemView.findViewById(R.id.experience_cardView);
        }
    }
}
