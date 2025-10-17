class Moto {
		public String model;
		public int horsepower;
		public static String motoName;
	public static void printMotName() {
		System.out.print("Марка мотоцикла " + motoName);
		}
	public void printMotInfo() {
		System.out.print ("Марка мотоцикла " + motoName + model + horsepower);
	} 
public static void main (String[] args) {
		Moto motobike = new Moto();
		motobike.motoName = "Yamaha";
		motobike.printMotName();
}	
}	