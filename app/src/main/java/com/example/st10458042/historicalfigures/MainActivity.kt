package com.example.st10458042.historicalfigures

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.clearButton)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /* Declarations */

        val processButton = findViewById<Button>(R.id.processButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val AgeNumText = findViewById<EditText>(R.id.AgeNumText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        processButton.setOnClickListener {


            /* if else statement */
            val age = AgeNumText.text.toString().toIntOrNull()
            if (age == null) {
                resultTextView.text = "Please enter a valid age"


            } else {

                if (age < 20 || age > 100) {
                    resultTextView.text = "please enter a valid age between 20 to 100"
                    AgeNumText.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                        31 -> "Steve Biko was an anti-apartheid activistband the co-founder of South African Students' organization."
                        74 -> "Muhammad Ali was a three-time heavyweieght boxing champion with an impressive 56-win record."
                        25 -> "one of the top-selling artists of all time, rapper and actor Tupac Shakur embodied the 1990s gansta-rap aesthetic and ,in death has become an icon symbolizing noble struggle."
                        82 -> "soccer legend Pele became a superstar with his perfomance in the 1958 World cup.Pele played professionally in Brazil for two decades,winning three world cups along the way,before joining New York Cosmos late in his career."
                        52 -> "William Shakespeare was an English poet,playwright and an actor of the Renaissance"
                        39 -> "Martin Luther King J. was a Baptist minister and civil rights activist who had a seismic impact on race relations in the United States."
                        41 -> "Former pro basketball player Kobe Bryant won five NBA tittles with the Los Angles Lakers while establishing himself as one of the game's all time greats"
                        60 -> "Diego Maradona was an Argentine soccer legend who was widely regarded as one of the best players of all time,he also famously starred for Argentinean team that won the world cup in 1986."
                        56 -> "Steve Jobs was an American inventor,designer and an entrepreneur who was the co-founder,CEO and chairman of Aplle inc."
                        76 -> "A gifted singer and pianist,Arethra Franklin became the first female artist to be inducted into the Rock and Rall Hall of fame and in 2008 she won her 18th Grammy Award."

                        else -> "No one Died at this age, try a different one!"

                    }
                    resultTextView.text = result

                }

            }
            clearButton.setOnClickListener {
                AgeNumText.text.clear()
                resultTextView.text = ""
            }


        }



    }


}


