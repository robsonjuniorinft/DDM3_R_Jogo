package com.example.ddm3_r_jogo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtNum;
    private TextView txtResultado;

    private Button btnNum1;
    private Button btnNum2;
    private Button btnNum3;

    private Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum = findViewById(R.id.txtNum);
        txtResultado = findViewById(R.id.txtResultado);

        btnNum1 = findViewById(R.id.btnNum1);
        btnNum2 = findViewById(R.id.btnNum2);
        btnNum3 = findViewById(R.id.btnNum3);



        btnNum1.setOnClickListener(new EscutadorBotaoNum1());
        btnNum2.setOnClickListener(new EscutadorBotaoNum2());
        btnNum3.setOnClickListener(new EscutadorBotaoNum3());

    }

    class EscutadorBotaoNum1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int numero = random.nextInt(3);

            String msg = "";

            msg = ""+numero+"";

            txtNum.setText(msg);

            if (numero == 1) {
                String result = "Acertou";
                txtResultado.setText(result);

            } else {
                String result = "Errou";
                txtResultado.setText(result);
            }

        }
    }

    class EscutadorBotaoNum2 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int numero = random.nextInt(4);

            String msg = "";

            msg = ""+numero+"";

            txtNum.setText(msg);

            if (numero == 2) {
                String result = "Acertou";
                txtResultado.setText(result);

            } else {
                String result = "Errou";
                txtResultado.setText(result);
            }

        }
    }

    class EscutadorBotaoNum3 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int numero = random.nextInt(3);

            String msg = "";

            msg = ""+numero+"";

            txtNum.setText(msg);

            if (numero == 3) {
                String result = "Acertou";
                txtResultado.setText(result);

            } else {
                String result = "Errou";
                txtResultado.setText(result);
            }

        }
    }
}