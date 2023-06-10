package com.example.b76711_b87581_b83364_proyectointeligencias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MatchActivity extends AppCompatActivity {

    TextView intelligenceLabel, userLabel, match1Label, match2Label, match3Label, match4Label, match5Label, match6Label, match7Label;
    ImageView intelligenceImage;

    private ArrayList<User> userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        match1Label = findViewById(R.id.match1Label);
        match2Label = findViewById(R.id.match2Label);
        match3Label = findViewById(R.id.match3Label);
        match4Label = findViewById(R.id.match4Label);
        match5Label = findViewById(R.id.match5Label);
        match6Label = findViewById(R.id.match6Label);
        match7Label = findViewById(R.id.match7Label);


        userLabel = findViewById(R.id.userLabel);
        intelligenceImage = (ImageView) findViewById(R.id.intelligenceImage);
        intelligenceLabel = findViewById(R.id.intelligenceLabel);


        userLabel.setText(getIntent().getStringExtra("user") + ",");
        switch (getIntent().getStringExtra("intelligence")){

            case "Espacial":
                intelligenceImage.setImageResource(R.drawable.espacialimage);
                break;

            case "Musical":
                intelligenceImage.setImageResource(R.drawable.musicalimage);
                break;

            case "Lingüístico-Verbal":
                intelligenceImage.setImageResource(R.drawable.linguisticoverbalimage);
                break;

            case "Lógico-Matemática":
                intelligenceImage.setImageResource(R.drawable.logicomatematicoimage);
                break;

            case "Corporal-Cinestésica":
                intelligenceImage.setImageResource(R.drawable.corporalcinestesicaimage);
                break;

            case "Intrapersonal":
                intelligenceImage.setImageResource(R.drawable.intrapersonalimage);
                break;

            case "Interpersonal":
                intelligenceImage.setImageResource(R.drawable.interpersonalimage);
                break;

            case "Naturalista":
                intelligenceImage.setImageResource(R.drawable.naturalistaimage);
                break;

            case "Existencial":
                intelligenceImage.setImageResource(R.drawable.existencialimage);
                break;

            case "Creativa":
                intelligenceImage.setImageResource(R.drawable.creativaimage);
                break;

            case "Emocional":
                intelligenceImage.setImageResource(R.drawable.emocionalimage);
                break;

            case "Colaborativa":
                intelligenceImage.setImageResource(R.drawable.colaborativaimage);
                break;

        }
        intelligenceLabel.setText(getIntent().getStringExtra("intelligence"));

        DataBaseObject dataBaseObject = new DataBaseObject(MatchActivity.this);
        this.userlist = dataBaseObject.getEveryone();

        EuclideanDistance euclideanDistance = new EuclideanDistance();

        User userA = new User(getIntent().getStringExtra("user"));
        User[] userMatch = new User[this.userlist.size()-1];
        int index = 0;

        try {

            for (User user : this.userlist) {
                if(user.getName().equals(getIntent().getStringExtra("user"))){
                    userA.setIntelligence(user.getIntelligence());
                }else{
                    userMatch[index] = user;
                    index++;
                }
            }

            for(int i = 0; i < userMatch.length; i++){
                userMatch[i].setDistance(euclideanDistance.getEuclideanDistance(userA, userMatch[i]));
            }

            Arrays.sort(userMatch, Comparator.comparingInt(User::getDistance));

            match1Label.setText("1) " + userMatch[0].getName() + " - " + userMatch[0].getPrincipalIntelligence());
            match2Label.setText("2) " + userMatch[1].getName() + " - " + userMatch[1].getPrincipalIntelligence());
            match3Label.setText("3) " + userMatch[2].getName() + " - " + userMatch[2].getPrincipalIntelligence());
            match4Label.setText("4) " + userMatch[3].getName() + " - " + userMatch[3].getPrincipalIntelligence());
            match5Label.setText("5) " + userMatch[4].getName() + " - " + userMatch[4].getPrincipalIntelligence());
            match6Label.setText("6) " + userMatch[5].getName() + " - " + userMatch[5].getPrincipalIntelligence());
            match7Label.setText("7) " + userMatch[6].getName() + " - " + userMatch[6].getPrincipalIntelligence());

        } catch (Exception ArrayIndexOutOfBoundsException){

        }

    }
}