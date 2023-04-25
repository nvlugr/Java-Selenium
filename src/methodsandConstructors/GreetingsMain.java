package methodsandConstructors;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greetings gr=new Greetings();
		gr.greeting1();
		
		
		String str =gr.greeting2();
		System.out.println(str);
		

		gr.greeting3("Neval");
		
		String mun = gr.greeting4("Munir");
		System.out.println(mun);
		
		
		
	}

}
