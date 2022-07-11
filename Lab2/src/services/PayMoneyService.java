package services;

public class PayMoneyService {
	public void inspect(int[] transactionArr, int targetValue) {
		int no = transactionArr.length;
		int sum = 0;
		int i = 0;
		while (sum <= targetValue && i < no) {
			sum = sum + transactionArr[i];
			i++;
		}
		if (sum >= targetValue) {
			System.out.println("Target achieved after " + (i) + " transaction");
		} else {
			System.out.println("Given target is not achieved ");
		}
	}
}
