package com.example.android.recipe_book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);

        iv = findViewById(R.id.imageView);

        Bundle extras = getIntent().getExtras();


        //String recipeName = getIntent().getStringExtra("recipeName");
        //String contentFull = getIntent().getStringExtra("contentFull");


        /*if(recipeName != null) {
            setTitle(recipeName);
        }*/

        //iv.setImageResource(R.drawable.p1);
        //iv.setImageURI(Uri.parse("@drawable/p1"));
        setTitle(extras.get("head").toString());
        int drawableId = this.getResources().getIdentifier(extras.get("image").toString(), "drawable", getApplicationContext().getPackageName());
        iv.setImageResource(drawableId);

//        TextView textName = (TextView) findViewById(R.id.recipeName);
//        textName.setText(extras.get("head").toString());

        TextView textrecipeFull = (TextView) findViewById(R.id.recipeFull);
        textrecipeFull.setText(extras.get("content").toString());
    }
}