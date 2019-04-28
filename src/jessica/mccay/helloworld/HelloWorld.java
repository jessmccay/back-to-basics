package jessica.mccay.helloworld;

import com.godtsoft.diyjava.DIYWindow;

public class HelloWorld extends DIYWindow {

	public HelloWorld() {
		String title1 = "Jessica's";
		String title2 = "delightful";
		String title3 = "blog";
		String name = "Brixton";
		setFontSize(20);
		print("Hello, " + name + ".");
		print();
		print("Your mommy loves you.");
		print(title1);
		print(title2);
		print(title3);
		String statement = title1 +" " + title2 + " " + title3;
		print(statement);
		String greeting = "Hello, " + name  + ". \n\n\n\n\nHow are you?";
		print(greeting);
		print(name + " said to say \"hi\"");
	}

	public static void main(String[] args) {
		new HelloWorld();
	}

}
