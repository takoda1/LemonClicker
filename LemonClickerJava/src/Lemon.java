
public class Lemon {
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
