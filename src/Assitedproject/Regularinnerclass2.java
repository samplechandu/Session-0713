package Assitedproject;


public class Regularinnerclass2 {
		public int w = 98;
		private String r = "Shekar";
		class inner {
		public void display() {
			System.out.println("Number is:" +w);
			System.out.println("Name is:" +r);
		}
	}
		public static void main(String[] args) {
			Regularinnerclass2 get = new Regularinnerclass2();
			Regularinnerclass2.inner going = get.new inner();
			going.display();

	}

}
