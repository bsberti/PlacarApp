package br.com.a14mob.placarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private String time1;
    private String time2;

    private TextView tvTime1;
    private TextView tvTime2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvTime1 = (TextView) findViewById(R.id.tvTime1);
        tvTime2 = (TextView) findViewById(R.id.tvTime2);

        if(getIntent() != null) {
            time1 = getIntent().getStringExtra("TIME1");
            time2 = getIntent().getStringExtra("TIME2");

            tvTime1.setText(time1);
            tvTime2.setText(time2);
        }
    }
}
