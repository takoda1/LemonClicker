
public class stand {
	int numStands;
	int lemPerSec;
	int costForStand;
	int costIncrease15percent;
	
	stand() {
		numStands = 0;
	}
	
	public void secPassed(Lemon lem) {
		lem.numLemons += numStands*lemPerSec;
	}
	
	public void buy(Lemon lem) {
		if(lem.numLemons >= costForStand) {
			lem.numLemons = lem.numLemons-costForStand;
			costForStand += costForStand*.1;
			numStands++;
		}
	}
	
	public void plus15percent(Lemon lem) {
		if(lem.numLemons >= costIncrease15percent) {
			lemPerSec += lemPerSec*.15;
			lem.numLemons -= costIncrease15percent;
			costIncrease15percent += costIncrease15percent*.15;
		}
	}
}
