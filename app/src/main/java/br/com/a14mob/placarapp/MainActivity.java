package br.com.a14mob.placarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etTime1;
    private EditText etTime2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTime1 = (EditText) findViewById(R.id.etTime1);
        etTime2 = (EditText) findViewById(R.id.etTime2);
    }

    public void comecarJogo(View v) {

        if (etTime1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Informe o time da casa", Toast.LENGTH_SHORT).show();
            return;
        }

        if (etTime2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Informe o time visitante", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent proximaTela = new Intent(this, GameActivity.class);
        proximaTela.putExtra("TIME1", etTime1.getText().toString());
        proximaTela.putExtra("TIME2", etTime2.getText().toString());
        startActivity(proximaTela);
    }
}
