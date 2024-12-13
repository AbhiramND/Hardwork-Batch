package oopsConcept;

public class ThisCallingStatement {

	// pen
	String colour;
	double price;
	String company;

	ThisCallingStatement(String colour, String company) {
		this.colour = colour;
		this.company = company;
	}

	ThisCallingStatement(String colour, String company, double price) {
		this(colour, company);
		this.price = price;
	}
}

class Pen {

	public static void main(String[] args) {
				new ThisCallingStatement("blue", "butterfly", 20);
				System.out.println("executed");
			}
}
