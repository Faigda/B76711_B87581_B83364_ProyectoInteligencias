package com.example.b76711_b87581_b83364_proyectointeligencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                    intelligence.addScore(1);
                }
            }
        }

        if(clickedButton.getId()==R.id.normalButton){
            for(Intelligence intelligence : this.user.getIntelligence()) {
                if(intelligence.getName().equals(this.questionList.getQuestions().get(currentQuestion).getIntelligence().getName())){
                    intelligence.addScore(3);
                }
            }
        }

        if(clickedButton.getId()==R.id.muchoButton){
            for(Intelligence intelligence : this.user.getIntelligence()) {
                if(intelligence.getName().equals(this.questionList.getQuestions().get(currentQuestion).getIntelligence().getName())){
                    intelligence.addScore(6);
                }
            }
        }

        currentQuestion++;
        loadNewQuestion();

    }

    private void loadNewQuestion(){

        if(currentQuestion==totalQuestions){
            saveInfo();
        } else {
            questionLabel.setText(this.questionList.getQuestions().get(currentQuestion).getQuestion());
            progressLabel.setText("Progreso: " + (currentQuestion+1) + " / " + totalQuestions);
        }

    }

    private void saveInfo(){
        //Se guarda la info en la bd.
        System.out.println("Espacial: "+ this.user.getIntelligence().get(0).getScore());
    }

}