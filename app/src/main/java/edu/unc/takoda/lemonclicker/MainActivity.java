package edu.unc.takoda.lemonclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView scoreView;
    public static Lemon mainLemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLemon = new Lemon();
        scoreView = (TextView) findViewById(R.id.score);
        new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    mainLemon.secondPassed();
                }
            }
        }).start();
    }

    public void lemonClick(View v){
        mainLemon.clickLemon();

        scoreView.setText(String.valueOf(mainLemon.numLemons));
    }

    public void buyClick(View v) {
        Intent buyIntent = new Intent(this, BuyActivity.class);
        buyIntent.putExtra("Lemon", mainLemon);
        startActivity(buyIntent);
    }
}
