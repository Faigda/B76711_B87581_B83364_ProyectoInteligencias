package com.example.b76711_b87581_b83364_proyectointeligencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameText;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.nameText);
        startButton = findViewById(R.id.startButton);

        DataBaseObject dataBaseObject = new DataBaseObject(MainActivity.this);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nameText.getText().toString().equals("")){

                    Toast.makeText(MainActivity.this, "Ingrese un nombre antes de continuar.", Toast.LENGTH_SHORT).show();

                } else if(dataBaseObject.existingUser(nameText.getText().toString())) {

                    Toast.makeText(MainActivity.this, "Este nombre de usuario ya existe.", Toast.LENGTH_SHORT).show();

                } else {

                    //Aqui pasa a la siguiente ventana.
                    Intent intent = new Intent(MainActivity.this, QuestionsActivity.class);
                    intent.putExtra("user", nameText.getText().toString());
                    startActivity(intent);
                }
            }
        });

    }
}