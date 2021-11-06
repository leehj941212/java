package coffee1;

public class InsertCoin {

	// วเภง
	public void plus(NowCoin nowCoin, int plusCoin) {
		int coin = nowCoin.getCoin();
		coin = coin + plusCoin;
		nowCoin.setCoin(coin);
	}

}