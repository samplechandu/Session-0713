package Assitedproject;

public class Methodlocalinnerclass1 {
		public void display() {
			class inner {
				int a = 10;
				void print() {
					System.out.println("Method of innner classes");
					System.out.println("value of a "+a);
				}
				
			}
			inner show = new inner();
			show.print(); 
			}
			public static void main(String[] args ) {
				Methodlocalinnerclass1 outer = new Methodlocalinnerclass1();
				outer.display(); }
			}


