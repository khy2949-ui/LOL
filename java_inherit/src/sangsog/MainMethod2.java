package sangsog;

import Animals.Bird;
import Animals.Cat;
import Animals.Dog;
import Animals.Hamster;
import Animals.Rabbit;
import common.Animal;

public class MainMethod2 {

	public static void main(String[] args) {
		
		Animal[] animals = {
				new Dog("복실이 ", "시고르자브종"),
				new Cat("까리 "),
				new Rabbit("느림보 "),
				new Bird("앵무 "),
				new Hamster("자몽이")
		}; 
		
		for( Animal a : animals ) {
			a.sound();
			a.sleep();
			if(a instanceof Dog)
				((Dog)a).getBread();
			
			System.out.println();
		}
		
//		int a = (int)3.14f;
//		float f = 24.5f;
//		System.out.println( (int)f );
		
//		((Dog) animals[0]).getBread();
//		Dog dog = (Dog)animals[0];
//		
//		Dog d = new Dog("a","b");
//		Animal aa = d;
	}

}

//	Bird 클래스를 만드시오
// 짹짹 소리 나게 하시오















