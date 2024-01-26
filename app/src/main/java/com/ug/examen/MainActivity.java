package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText nota1EditText;
    private EditText nota2EditText;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1EditText = findViewById(R.id.nota1);
        nota2EditText = findViewById(R.id.nota2);
        resultadoTextView = findViewById(R.id.result_text);

        Button calcularButton = findViewById(R.id.button);
        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularPromedio();
            }
        });
    }

    private void calcularPromedio() {
        float nota1 = Float.parseFloat(nota1EditText.getText().toString());
        float nota2 = Float.parseFloat(nota2EditText.getText().toString());

        float suma = nota1 + nota2;
        float promedio = suma / 2;

        resultadoTextView.setText("Promedio: " + promedio);
}

}