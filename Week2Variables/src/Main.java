
public class Main {

	public static void main(String[] args) {
	
	boolean isHotOutside = true;
	boolean isWeekday = true;
    boolean hasMoneyInPocket = false;
    
    double costOfMilk = 2.00;
    double moneyInWallet = 10.00;
    int thirstLevel = 5;
    
    boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
    boolean willGoSwimming = isHotOutside && isWeekday;
    boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekDay;
    boolean willBuyMilk = thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk;
    
    
	}

}
