public class DataType{
	public static void main(String[] args){
		//integer Type
		byte age = 90;
		System.out.printf("You are %d years old%n",age );
		
		short quantity = 30000;
		System.out.printf("I bought %,d quantities of phones%n", quantity);
		
		int population = 2025375869;
		System.out.printf("The population in Nigeria is %,d%n", population);
		
		long worldpopulation = 72345678923456L;
		System.out.printf("The world's popuulation is %,d%n", worldpopulation);
		
		//Float-Point
		float myBalance = 67060742.8672F;
		System.out.printf("My account balance is $%,.2f%n", myBalance);
		
		double cbnBalance = 235475844884884.476647447443;
		System.out.printf("The CBN Balance is $%,.2f%n", cbnBalance);
		
		char symbol = '@';
		System.out.printf("Your email address is ohamsx%cgmail.com%n", symbol);
		
		boolean isJava = true;
		System.out.printf("Do you love learning java? %b%n", isJava);
	}
}	