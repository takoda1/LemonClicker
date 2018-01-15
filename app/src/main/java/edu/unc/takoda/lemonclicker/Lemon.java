package edu.unc.takoda.lemonclicker;

import java.io.Serializable;

/**
 * Created by takoda on 11/4/2017.
 */


public class Lemon implements Serializable{
    int numLemons;
    int lemPerClick;
    LemonStand lemStan;
    LemonOrchard orchStan;

    Lemon() {
        numLemons = 0;
        lemPerClick = 1;
        lemStan = new LemonStand();
        orchStan = new LemonOrchard();
    }

    //////////////////////////////////////////////
    //           CLICK OR SECOND                //
    //////////////////////////////////////////////

    public void clickLemon() {
        numLemons += lemPerClick;
    }

    public void secondPassed() {
        lemStan.secPassed(this);
        orchStan.secPassed(this);
    }

    //////////////////////////////////////////////
    //         BUY AND UPGRADES                 //
    //////////////////////////////////////////////

    public void buy(String selection) {
        if(selection.equals("LemonStand")) {
            lemStan.buy(this);
        }
    }

    public void buyUpgrade(String upgrade) {
        if(upgrade.equals("LemonStand+15%")) {
            lemStan.plus15percent(this);
        }
    }
}
