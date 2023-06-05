package com.example.b76711_b87581_b83364_proyectointeligencias;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataBaseObject extends SQLiteOpenHelper {

    public static final String USER_TABLE = "USER_TABLE";
    public static final String ESPACIAL = "Espacial";
    public static final String MUSICAL = "Musical";
    public static final String LINGUISTICO_VERBAL = "Lingüístico-Verbal";
    public static final String LOGICO_MATEMATICA = "Lógico-Matemática";
    public static final String CORPORAL_CINESTESICA = "Corporal-Cinestésica";
    public static final String INTRAPERSONAL = "Intrapersonal";
    public static final String INTERPERSONAL = "Interpersonal";
    public static final String NATURALISTA = "Naturalista";
    public static final String EXISTENCIAL = "Existencial";
    public static final String CREATIVA = "Creativa";
    public static final String EMOCIONAL = "Emocional";
    public static final String COLABORATIVA = "Colaborativa";
    public static final String NAME = "NAME";


    public static final String COLUNM_ESPACIAL = "ESPACIAL";
    public static final String COLUNM_MUSICAL = "MUSICAL";
    public static final String COLUNM_LINGUISTICO_VERBAL = "LINGUISTICO_VERBAL";
    public static final String COLUNM_LOGICO_MATEMATICA = "LOGICO_MATEMATICA";
    public static final String COLUNM_CORPORAL_CINESTESICA = "CORPORAL_CINESTESICA";
    public static final String COLUNM_INTRAPERSONAL = "INTRAPERSONAL";
    public static final String COLUNM_INTERPERSONAL = "INTERPERSONAL";
    public static final String COLUNM_NATURALISTA = "NATURALISTA";
    public static final String COLUNM_EXISTENCIAL = "EXISTENCIAL";
    public static final String COLUNM_CREATIVA = "CREATIVA";
    public static final String COLUNM_EMOCIONAL = "EMOCIONAL";
    public static final String COLUNM_COLABORATIVA = "COLABORATIVA";

    public DataBaseObject(@Nullable Context context) {
        super(context, "user.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + USER_TABLE + " (" + NAME + " STRING PRIMARY KEY, " + COLUNM_ESPACIAL + " INT, " + COLUNM_MUSICAL + " INT, " + COLUNM_LINGUISTICO_VERBAL + " INT, " + COLUNM_LOGICO_MATEMATICA + " INT, " + COLUNM_CORPORAL_CINESTESICA + " INT, " + COLUNM_INTRAPERSONAL + " INT, " + COLUNM_INTERPERSONAL + " INT, " + COLUNM_NATURALISTA + " INT, " + COLUNM_EXISTENCIAL + " INT, " + COLUNM_CREATIVA + " INT, " + COLUNM_EMOCIONAL + " INT, " + COLUNM_COLABORATIVA + " INT, INTELLIGENCE TEXT)";

        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addOne(User user){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(NAME, user.getName());

        for (Intelligence intelligence: user.getIntelligence()) {
            if(intelligence.getName().equals(ESPACIAL)){
                cv.put(COLUNM_ESPACIAL, intelligence.getScore());
            }
            if(intelligence.getName().equals(MUSICAL)){
                cv.put(COLUNM_MUSICAL, intelligence.getScore());
            }
            if(intelligence.getName().equals(LINGUISTICO_VERBAL)){
                cv.put(COLUNM_LINGUISTICO_VERBAL, intelligence.getScore());
            }
            if(intelligence.getName().equals(LOGICO_MATEMATICA)){
                cv.put(COLUNM_LOGICO_MATEMATICA, intelligence.getScore());
            }
            if(intelligence.getName().equals(CORPORAL_CINESTESICA)){
                cv.put(COLUNM_CORPORAL_CINESTESICA, intelligence.getScore());
            }
            if(intelligence.getName().equals(INTRAPERSONAL)){
                cv.put(COLUNM_INTRAPERSONAL, intelligence.getScore());
            }
            if(intelligence.getName().equals(INTERPERSONAL)){
                cv.put(COLUNM_INTERPERSONAL, intelligence.getScore());
            }
            if(intelligence.getName().equals(NATURALISTA)){
                cv.put(COLUNM_NATURALISTA, intelligence.getScore());
            }
            if(intelligence.getName().equals(EXISTENCIAL)){
                cv.put(COLUNM_EXISTENCIAL, intelligence.getScore());
            }
            if(intelligence.getName().equals(CREATIVA)){
                cv.put(COLUNM_CREATIVA, intelligence.getScore());
            }
            if(intelligence.getName().equals(EMOCIONAL)){
                cv.put(COLUNM_EMOCIONAL, intelligence.getScore());
            }
            if(intelligence.getName().equals(COLABORATIVA)){
                cv.put(COLUNM_COLABORATIVA, intelligence.getScore());
            }

        }

        cv.put("INTELLIGENCE", user.getPrincipalIntelligence());

        long insert = db.insert(USER_TABLE, null, cv);

        if(insert == -1){
            return false;
        } else {
            return true;
        }

    }

    public ArrayList<User> getEveryone(){

        ArrayList<User> userList = new ArrayList<>();

        String query = "SELECT * FROM " + USER_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                User user = new User(cursor.getString(0));
                user.getIntelligence().get(0).setScore(cursor.getInt(1));
                user.getIntelligence().get(1).setScore(cursor.getInt(2));
                user.getIntelligence().get(2).setScore(cursor.getInt(3));
                user.getIntelligence().get(3).setScore(cursor.getInt(4));
                user.getIntelligence().get(4).setScore(cursor.getInt(5));
                user.getIntelligence().get(5).setScore(cursor.getInt(6));
                user.getIntelligence().get(6).setScore(cursor.getInt(7));
                user.getIntelligence().get(7).setScore(cursor.getInt(8));
                user.getIntelligence().get(8).setScore(cursor.getInt(9));
                user.getIntelligence().get(9).setScore(cursor.getInt(10));
                user.getIntelligence().get(10).setScore(cursor.getInt(11));
                user.getIntelligence().get(11).setScore(cursor.getInt(12));
                user.setPrincipalIntelligence(cursor.getString(13));

                System.out.println("Usuario: " + user.getName());

                userList.add(user);

            } while (cursor.moveToNext());
        } else {
            return null;
        }

        cursor.close();
        db.close();
        return userList;

    }

    public boolean existingUser(String name){

        String query = "SELECT NAME FROM " + USER_TABLE + " WHERE '" + name + "' = " + NAME;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            cursor.close();
            db.close();
            return true;
        } else {
            cursor.close();
            db.close();
            return false;
        }

    }

}
