package com.example.dadajonjurakuziev.citiesrecyclerview;


import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.ArrayList;
import java.util.List;

public class CityActivity extends AppCompatActivity {
    private static final String TAG = "CityActivity";
    ExpandableTextView expandableTextView;
    ImageButton imageButton;

    //vars for RecyclerView
    RecyclerView expRecyclerView;
    ExperiencesViewAdapter expAdapter;
    List<Experiences> experiencesList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        Log.d(TAG, "onCreate: started.");
        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        Bundle bundle = getIntent().getExtras();

        expRecyclerView = findViewById(R.id.experience_recyclerView);
        expRecyclerView.setHasFixedSize(true);
        expRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        if (bundle != null){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            int cityBg = bundle.getInt("city_bg");
            String cityTitle = bundle.getString("city_title");
            String cityDesc = bundle.getString("city_desc");

            assert cityTitle != null;
            //Tashkent
            if(cityTitle.equals("Tashkent")){ Tashkent(); }
            //Bukhara
            if(cityTitle.equals("Bukhara")){ Bukhara(); }
            //Samarkand
            if(cityTitle.equals("Samarkand")){ Samarkand(); }
            //Khiva
            if(cityTitle.equals("Khiva")){ Khiva(); }
            //Nukus
            if(cityTitle.equals("Nukus")){ Nukus(); }
            //Kokand
            if(cityTitle.equals("Kokand")){ Kokand(); }
            //Fergana
            if(cityTitle.equals("Fergana")){ Fergana(); }
            //Termiz
            if(cityTitle.equals("Termiz")){ Termiz(); }
            //Andijon
            if(cityTitle.equals("Andijon")){ Andijon(); }
            //Shakhrisabz
            if(cityTitle.equals("Shakhrisabz")){ Shakhrisabz(); }

            setImage(cityBg, cityTitle, cityDesc);
        }

        expAdapter = new ExperiencesViewAdapter(this, experiencesList);
        expRecyclerView.setAdapter(expAdapter);
    }
    
    private void setImage(int city_Bg, String cityTitle, String cityDesc){
        Log.d(TAG, "setImage: setting image and name to widgets.");

        ImageView cBG = findViewById(R.id.city_image);
        cBG.setImageResource(city_Bg);


        TextView cTitle = findViewById(R.id.city_title);
        cTitle.setText(cityTitle);

        expandableTextView = findViewById(R.id.expandable_text_view);
        expandableTextView.setText(cityDesc);

        imageButton = findViewById(R.id.expand_collapse);
        imageButton.setColorFilter(0xff78849E, PorterDuff.Mode.SRC_ATOP);
    }

    /**
     * Tashkent Experiences
     */
    private void Tashkent(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Bukhara Experiences
     */
    private void Bukhara(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Samarkand Experiences
     */
    private void Samarkand(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Khiva Experiences
     */
    private void Khiva(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Nukus Experiences
     */
    private void Nukus(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Kokand Experiences
     */
    private void Kokand(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Fergana Experiences
     */
    private void Fergana(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Termiz Experiences
     */
    private void Termiz(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Andijon Experiences
     */
    private void Andijon(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

    /**
     * Shakhrisabz Experiences
     */
    private void Shakhrisabz(){
        experiencesList = new ArrayList<>();
        List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.andijan));
    }

}
