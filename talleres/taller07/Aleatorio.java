package Taller7;
import java.util.Random;

public class Aleatorio {
	

	 public static int[] alea(int size, int max) {
		 int[] array = new int[size];
		 Random generator = new Random();
		 for (int i =0; i<size; i++) {
			 array[i] = generator.nextInt(max);
		 }
		 return array;
	 }

}
