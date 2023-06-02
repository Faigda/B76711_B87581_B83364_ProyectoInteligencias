package com.example.b76711_b87581_b83364_proyectointeligencias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MatchActivity extends AppCompatActivity {

    TextView intelligenceLabel, userLabel, match1Label, match2Label, match3Label, match4Label, match5Label, match6Label, match7Label;
    ImageView intelligenceImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

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

    }
}