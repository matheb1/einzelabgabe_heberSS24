package com.example.einzelabgabe_heberss24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;
    private TextView textView2;
    private Button button2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        button2 = findViewById(R.id.button2);

        /* Nimmt die angegebene Matrikelnummer aus dem editText speichert es in den String input und created einen EBThread mit dem
        übergebenen Input.
        mit start() wird der Thread gestartet. Mit join wird auf das Ende des threads gewartet sonst ein Error geschickt.
         */

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText = findViewById(R.id.editText);
                String input = editText.getText().toString();
                EBThread t = new EBThread(input);
                t.start();
                try {
                    t.join();
                    textView.setText(t.getResponse());
                } catch (InterruptedException e) {
                    textView.setText("Error");
                }

            }
        });

        /*
        Button für aufgabe 2.2
        speichert wieder den Wert vom eingabefeld als input und im Ausgabefeld wird die funktion primeNumber aufgerufen,
        die einen String zurückgibt und diesen dann ins zweite textView speichert.
         */

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText = findViewById(R.id.editText);
                String input = editText.getText().toString();
                String output = primeNumber(input);
                textView2.setText(output);
            }
        });
    }

    /* 11739932%7 = 1
    * Nur jene Ziffern ausgeben, die Primzahlen sind.
    * ganze Zahl, die größer als 1 und nur durch 1 und sich selbst teilbar ist
    */


    /*
    Funktion zur ermittlung der Primzahlen in Matrikelnummer
     */
    public String primeNumber(String s) {



        return null;

    }
}