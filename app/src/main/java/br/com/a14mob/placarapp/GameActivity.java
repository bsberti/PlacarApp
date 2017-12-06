package br.com.a14mob.placarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameActivity extends AppCompatActivity {

    private String time1;
    private String time2;

    private TextView tvTime1;
    private TextView tvTime2;
    private TextView tvPlacar1;
    private TextView tvPlacar2;

    private int placar1;
    private int placar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        placar1 = 0;
        placar2 = 0;

        tvTime1 = (TextView) findViewById(R.id.tvTime1);
        tvTime2 = (TextView) findViewById(R.id.tvTime2);

        tvPlacar1 = (TextView) findViewById(R.id.tvPlacar1);
        tvPlacar2 = (TextView) findViewById(R.id.tvPlacar2);

        if(getIntent() != null) {
            time1 = getIntent().getStringExtra("TIME1");
            time2 = getIntent().getStringExtra("TIME2");

            tvTime1.setText(time1);
            tvTime2.setText(time2);
        }
    }

    public void golTime1(View v) {
        placar1++;

        tvPlacar1.setText(placar1);
    }

    public void golTime2(View v) {
        placar2++;

        tvPlacar2.setText(placar2);
    }
}
