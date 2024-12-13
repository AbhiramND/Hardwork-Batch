package oopsConcept;

public abstract class AbstrsctWhatsapp {

	public abstract void send();
	public abstract void vidoe();
	public static void main(String[] args) {
		Whatsapp wa=new Whatsapp() {
			
			@Override
			public void vidoe() {
				// TODO Auto-generated method stub
				
			}
		};
		wa.send();
	}
}
abstract class Whatsapp extends AbstrsctWhatsapp{
	public void send() {
		System.out.println("hello");
	}
	public abstract void vidoe();
}
class Whatsapp1{
	public static void main(String[] args) {
		Whatsapp wa=new Whatsapp() {
			
			@Override
			public void vidoe() {
				// TODO Auto-generated method stub
				
			}
		};
		wa.send();
	}
}