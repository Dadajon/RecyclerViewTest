package com.example.dadajonjurakuziev.citiesrecyclerview;

public class Experiences {
    private int exp_id;
    private String exp_title, exp_desc;
    private int exp_image;

    public Experiences(int exp_id, String exp_title, String exp_desc, int exp_image) {
        this.exp_id = exp_id;
        this.exp_title = exp_title;
        this.exp_desc = exp_desc;
        this.exp_image = exp_image;
    }

    public int getExp_id() { return exp_id; }

    public String getExp_title() { return exp_title; }

    public String getExp_desc() { return exp_desc; }

    public int getExp_image() { return exp_image; }
}
