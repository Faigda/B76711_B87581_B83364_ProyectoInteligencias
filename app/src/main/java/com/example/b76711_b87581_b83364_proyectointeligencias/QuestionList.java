package com.example.b76711_b87581_b83364_proyectointeligencias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuestionList {
    private ArrayList<Question> questions;

    public QuestionList(){

        //Creacion de inteligencias
        Intelligence intelligenceEspacial = new Intelligence("Espacial");
        Intelligence intelligenceMusical = new Intelligence("Musical");
        Intelligence intelligenceLinguisticoVerbal = new Intelligence("Lingüístico-Verbal");
        Intelligence intelligenceLogicoMatematica = new Intelligence("Lógico-Matemática");
        Intelligence intelligenceCorporalCinestesica = new Intelligence("Corporal-Cinestésica");
        Intelligence intelligenceIntrapersonal = new Intelligence("Intrapersonal");
        Intelligence intelligenceInterpersonal = new Intelligence("Interpersonal");
        Intelligence intelligenceNaturalista = new Intelligence("Naturalista");
        Intelligence intelligenceExistencial = new Intelligence("Existencial");
        Intelligence intelligenceCreativa = new Intelligence("Creativa");
        Intelligence intelligenceEmocional = new Intelligence("Emocional");
        Intelligence intelligenceColaborativa = new Intelligence("Colaborativa");

        //Creacion de preguntas

        //Espacial
        Question questionEspacial1 = new Question("¿Disfrutas resolver rompecabezas visuales o juegos de construcción?", intelligenceEspacial);
        Question questionEspacial2 = new Question("¿Te resulta fácil orientarte en nuevos entornos o mapas?", intelligenceEspacial);
        Question questionEspacial3 = new Question("¿Prefieres actividades que involucren la visualización de imágenes o diseños?", intelligenceEspacial);

        //Musical
        Question questionMusical1 = new Question("¿Te gusta escuchar música de diferentes géneros?", intelligenceMusical);
        Question questionMusical2 = new Question("¿Eres capaz de distinguir diferentes tonos y ritmos con facilidad?", intelligenceMusical);
        Question questionMusical3 = new Question("¿Te gusta tocar algún instrumento musical o cantar?", intelligenceMusical);

        //Lingüístico-Verbal
        Question questionLinguisticoVerbal1 = new Question("¿Disfrutas leer libros o escribir historias?", intelligenceLinguisticoVerbal);
        Question questionLinguisticoVerbal2 = new Question("¿Te gusta aprender nuevos idiomas o jugar con palabras?", intelligenceLinguisticoVerbal);
        Question questionLinguisticoVerbal3 = new Question("¿Disfrutas tener conversaciones profundas o debatir temas?", intelligenceLinguisticoVerbal);

        //Lógico-Matemática
        Question questionLogicoMatematica1 = new Question("¿Te gustan los desafíos matemáticos o resolver problemas lógicos?", intelligenceLogicoMatematica);
        Question questionLogicoMatematica2 = new Question("¿Eres bueno/a en identificar patrones o relaciones entre conceptos?", intelligenceLogicoMatematica);
        Question questionLogicoMatematica3 = new Question("¿Te atrae el pensamiento analítico y la resolución de problemas?", intelligenceLogicoMatematica);

        //Corporal-Cinestésica
        Question questionCorporalCinestesica1 = new Question("¿Disfrutas practicar deportes o actividades físicas?", intelligenceCorporalCinestesica);
        Question questionCorporalCinestesica2 = new Question("¿Tienes habilidades para el baile, las acrobacias o la coordinación motriz?", intelligenceCorporalCinestesica);
        Question questionCorporalCinestesica3 = new Question("¿Te gusta realizar actividades que requieran movimientos corporales precisos?", intelligenceCorporalCinestesica);

        //Intrapersonal
        Question questionIntrapersonal1 = new Question("¿Eres consciente de tus propias emociones y pensamientos?", intelligenceIntrapersonal);
        Question questionIntrapersonal2 = new Question("¿Disfrutas pasar tiempo a solas para reflexionar o meditar?", intelligenceIntrapersonal);
        Question questionIntrapersonal3 = new Question("¿Eres capaz de identificar tus fortalezas y debilidades con facilidad?", intelligenceIntrapersonal);

        //Interpersonal
        Question questionInterpersonal1 = new Question("¿Disfrutas interactuar y trabajar en equipo con otras personas?", intelligenceInterpersonal);
        Question questionInterpersonal2 = new Question("¿Eres sensible a las emociones y necesidades de los demás?", intelligenceInterpersonal);
        Question questionInterpersonal3 = new Question("¿Te consideras una persona empática y capaz de resolver conflictos?", intelligenceInterpersonal);

        //Naturalista
        Question questionNaturalista1 = new Question("¿Te sientes conectado/a con la naturaleza y disfrutas pasar tiempo al aire libre?", intelligenceNaturalista);
        Question questionNaturalista2 = new Question("¿Eres capaz de reconocer diferentes especies de plantas o animales?", intelligenceNaturalista);
        Question questionNaturalista3 = new Question("¿Te interesa aprender sobre el medio ambiente y la ecología?", intelligenceNaturalista);

        //Existencial
        Question questionExistencial1 = new Question("¿Te cuestionas el propósito y el significado de la vida?", intelligenceExistencial);
        Question questionExistencial2 = new Question("¿Disfrutas explorar temas filosóficos o espirituales?", intelligenceExistencial);
        Question questionExistencial3 = new Question("¿Te gusta reflexionar sobre el sentido de la existencia humana?", intelligenceExistencial);

        //Creativa
        Question questionCreativa1 = new Question("¿Te gusta inventar historias o crear obras de arte?", intelligenceCreativa);
        Question questionCreativa2 = new Question("¿Eres capaz de encontrar soluciones originales a los problemas?", intelligenceCreativa);
        Question questionCreativa3 = new Question("¿Disfrutas pensar de manera divergente y explorar ideas nuevas?", intelligenceCreativa);

        //Emocional
        Question questionEmocional1 = new Question("¿Eres consciente de tus emociones y las de los demás?", intelligenceEmocional);
        Question questionEmocional2 = new Question("¿Tienes habilidades para manejar el estrés y regular tus emociones?", intelligenceEmocional);
        Question questionEmocional3 = new Question("¿Te consideras capaz de establecer relaciones emocionalmente saludables?", intelligenceEmocional);

        //Colaborativa
        Question questionColaborativa1 = new Question("¿Te gusta trabajar en equipo y participar en proyectos conjuntos?", intelligenceColaborativa);
        Question questionColaborativa2 = new Question("¿Eres capaz de escuchar y entender diferentes perspectivas?", intelligenceColaborativa);
        Question questionColaborativa3 = new Question("¿Te sientes cómodo/a compartiendo conocimientos y colaborando con otros?", intelligenceColaborativa);

        this.questions = new ArrayList<>();

        this.questions.add(questionEspacial1);
        this.questions.add(questionEspacial2);
        this.questions.add(questionEspacial3);
        this.questions.add(questionMusical1);
        this.questions.add(questionMusical2);
        this.questions.add(questionMusical3);
        this.questions.add(questionLinguisticoVerbal1);
        this.questions.add(questionLinguisticoVerbal2);
        this.questions.add(questionLinguisticoVerbal3);
        this.questions.add(questionLogicoMatematica1);
        this.questions.add(questionLogicoMatematica2);
        this.questions.add(questionLogicoMatematica3);
        this.questions.add(questionCorporalCinestesica1);
        this.questions.add(questionCorporalCinestesica2);
        this.questions.add(questionCorporalCinestesica3);
        this.questions.add(questionIntrapersonal1);
        this.questions.add(questionIntrapersonal2);
        this.questions.add(questionIntrapersonal3);
        this.questions.add(questionInterpersonal1);
        this.questions.add(questionInterpersonal2);
        this.questions.add(questionInterpersonal3);
        this.questions.add(questionNaturalista1);
        this.questions.add(questionNaturalista2);
        this.questions.add(questionNaturalista3);
        this.questions.add(questionExistencial1);
        this.questions.add(questionExistencial2);
        this.questions.add(questionExistencial3);
        this.questions.add(questionCreativa1);
        this.questions.add(questionCreativa2);
        this.questions.add(questionCreativa3);
        this.questions.add(questionEmocional1);
        this.questions.add(questionEmocional2);
        this.questions.add(questionEmocional3);
        this.questions.add(questionColaborativa1);
        this.questions.add(questionColaborativa2);
        this.questions.add(questionColaborativa3);

        Collections.shuffle(this.questions);

    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }
}
