public class project1 {

	public static void main(String[] args) {
		//metoder er funktioner i klasser, som kan operere nogle objekter
		//For eksempel er Integer.max(); en metode fra Integer klassen
		//objekter er en instans af en klasse, for eksempel er x i
		String x = "hello";
		//et objekt af klassen String
		testclass rasmus = new testclass();
		rasmus.firstName = "Rasmus Hauge"; //sæt en property for objektet rasmus
		rasmus.lastName = "Hansen";
		System.out.println(rasmus.getFullName());
	}
}

//vi prøver noget med flere klasser fordi det ville være smart at dokumentere og bliver nok nødvendigt 

