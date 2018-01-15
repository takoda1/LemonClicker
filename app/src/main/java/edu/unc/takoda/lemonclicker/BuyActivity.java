package edu.unc.takoda.lemonclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuyActivity extends AppCompatActivity {

    static Lemon mainLemon;
    private TextView numLemonStands;
    private TextView costLemonStands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy);
        Intent i = getIntent();
        mainLemon = (Lemon)i.getSerializableExtra("Lemon");
        numLemonStands = findViewById(R.id.numLemonStand);
        numLemonStands.setText("Amount: " + mainLemon.lemStan.numStands); //messy
        costLemonStands = findViewById(R.id.costLemonStand);
        costLemonStands.setText("Cost: " + mainLemon.lemStan.costForStand);
    }

    public void BuyStand(View v) {
        mainLemon.lemStan.buy(mainLemon);
        numLemonStands.setText("Amount: " + mainLemon.lemStan.numStands);
        costLemonStands.setText("Cost: " + mainLemon.lemStan.costForStand);
    }

    public void BuyOrchard(View v) {
        mainLemon.orchStan.buy(mainLemon);
    }

    public void BuyFarm(View v){

    }

    public void BuyStartUp(View v){

    }
    public void BuyCompany(View v){

    }
    public void BuyCorporation(View v){

    }

    public void backClick(View v){
        Intent backIntent = new Intent(this, MainActivity.class);
        backIntent.putExtra("Lemon", mainLemon);
        startActivity(backIntent);
    }

}