import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double value = 0.0;
		double res = 0.0;
		
		System.out.println("Welcome to the Currency Converter");
		System.out.println("Please choose your currency: USD - EUR - JPY");
		String currency = scan.next();
		System.out.println("Enter a quantity:");
		value = scan.nextDouble();
				System.out.println("Now choose the currency you wish to convert to: USD - EUR - JPY");
		String currency2 = scan.next();
		
		if(currency2.equals(currency)){System.out.println(value+" "+currency2);}
		
		//EURO
		if(currency.equals("EUR") && currency2.equals("USD"))
			{res = value*1.16; System.out.println(res+" "+currency2);}
		if(currency.equals("EUR") && currency2.equals("JPY"))
			{res = value*131.79; System.out.println(res+" "+currency2);}
		
		//USD
		if(currency.equals("USD") && currency2.equals("EUR"))
			{res = value*0.86; System.out.println(res+" "+currency2);}
		if(currency.equals("USD") && currency2.equals("JPY"))
			{res = value*113.94; System.out.println(res+" "+currency2);}
		
		//JPY
		if(currency.equals("JPY") && currency2.equals("USD"))
			{res = value*0.0088; System.out.println(res+" "+currency2);}
		if(currency.equals("JPY") && currency2.equals("EUR"))
			{res = value*0.0076; System.out.println(res+" "+currency2);}
	}
}

// Coded by SebastianDuarteGH on 31 OCT 2021