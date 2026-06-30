package financialForecasting;

import java.util.Scanner;

public class Forecasting {
	public static double futureValue(double currentAmount,double growthRate,int years) {
		if(years==0) return currentAmount;
		return (futureValue(currentAmount,growthRate,years-1)* (1+growthRate));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Current Amount : ");
		double currentAmount=sc.nextDouble();
		System.out.println("Growth Rate : ");
		double growthRate=sc.nextDouble();
		System.out.println("Years : ");
		int years=sc.nextInt();
		if(years<0) {
			System.out.println("Years can not be negative");
			return;
		}
		double predictedFutureValues=futureValue(currentAmount,growthRate,years);
		System.out.println("Future values based on past growth rates: "+predictedFutureValues);
				

	}

}
