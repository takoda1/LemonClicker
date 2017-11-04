package edu.unc.takoda.lemonclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BuyActivity extends AppCompatActivity {

    static Lemon mainLemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy);
        Intent i = getIntent();
        mainLemon = (Lemon)i.getSerializableExtra("Lemon");
    }

    public void LemonStand(View v) {

    }

    public void LemonOrchard(View v) {
        //
    }

}