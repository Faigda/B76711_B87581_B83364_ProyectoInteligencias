package com.example.b76711_b87581_b83364_proyectointeligencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity{

    TextView progressLabel, questionLabel;
    Button pocoButton, normalButton, muchoButton;

    int totalQuestions;
    int currentQuestion = 0;

    private QuestionList questionList;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        progressLabel = findViewById(R.id.progressLabel);
        questionLabel = findViewById(R.id.questionLabel);
        pocoButton = findViewById(R.id.pocoButton);
        normalButton = findViewById(R.id.normalButton);
        muchoButton = findViewById(R.id.muchoButton);

        this.questionList = new QuestionList();
        totalQuestions = this.questionList.getQuestions().size();

        progressLabel.setText("Progreso: " + currentQuestion + " / " + totalQuestions);

        loadNewQuestion();

        user = new User(getIntent().getStringExtra("user"));
    }

    public void onClick(View v) {

        Button clickedButton = (Button) v;

        if(clickedButton.getId()==R.id.pocoButton){
            for(Intelligence intelligence : this.user.getIntelligence()) {
                if(intelligence.getName().equals(this.questionList.getQuestions().get(currentQuestion).getIntelligence().getName())){
                    intelligence.addScore(6);
                }
            }
        }

        if(clickedButton.getId()==R.id.normalButton){
            for(Intelligence intelligence : this.user.getIntelligence()) {
                if(intelligence.getName().equals(this.questionList.getQuestions().get(currentQuestion).getIntelligence().getName())){
                    intelligence.addScore(12);
                }
            }
        }

        if(clickedButton.getId()==R.id.muchoButton){
            for(Intelligence intelligence : this.user.getIntelligence()) {
                if(intelligence.getName().equals(this.questionList.getQuestions().get(currentQuestion).getIntelligence().getName())){
                    intelligence.addScore(18);
                }
            }
        }

        currentQuestion++;
        loadNewQuestion();

    }

    private void loadNewQuestion(){

        if(currentQuestion==totalQuestions){
            nextActivity();

        } else {
            questionLabel.setText(this.questionList.getQuestions().get(currentQuestion).getQuestion());
            progressLabel.setText("Progreso: " + (currentQuestion+1) + " / " + totalQuestions);
        }

    }

    private void nextActivity(){

        int finalScore = 0;
        String intelligenceName = "";

        //Se decide cual es la inteligencia principal
        for (Intelligence intelligence : this.user.getIntelligence()) {
            if(intelligence.getScore() > finalScore){
                finalScore = intelligence.getScore();
                intelligenceName = intelligence.getName();
            }
        }

        this.user.setPrincipalIntelligence(intelligenceName);

        //Se guarda la info en la bd.
        DataBaseObject dataBaseObject = new DataBaseObject(QuestionsActivity.this);
        boolean success = dataBaseObject.addOne(this.user);
        if(success){
            Intent intent = new Intent(QuestionsActivity.this, MatchActivity.class);
            intent.putExtra("user", this.user.getName());
            intent.putExtra("intelligence", intelligenceName);

            startActivity(intent);
        } else {
            Toast.makeText(QuestionsActivity.this, "Ocurrió un error al ingresar la información en la base de datos.", Toast.LENGTH_SHORT).show();
        }

    }

}