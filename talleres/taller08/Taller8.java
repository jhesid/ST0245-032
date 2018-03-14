package Taller8;
import java.util.*;
public class Taller8 {

	public static Queue punto(Stack <Integer> a){
		Queue<Integer> antidepresivo= new LinkedList();
		while(!a.empty()){

			antidepresivo.add(a.pop());
		}
		return antidepresivo;
	}

	public static void punto2(Queue <String> a){
		while(!a.isEmpty()){
			System.out.println("atiendo a "+a.poll());
		}
	}

	public static int punto3(String str) throws Exception{
		Stack <Integer> op=new Stack();
		str.split(" ");
		int c=0;
		int a=0;
		int b=0;


		for (String x:str.split(" ")){
			if ((!x.equals("+"))||(!x.equals("-"))||
					(!x.equals("/"))||(!x.equals("*"))) {
				
				op.add(convertir(x));
				c=c+1;
			}
			else if(((x.equals("+"))||(x.equals("-"))||
					(x.equals("/"))||(x.equals("*")))&&(c>=2)){

				if (x.equals("+")) {
					a=op.pop();
					b=op.pop();
					op.add(a+b);
				}
				if (x.equals("-")) {
					a=op.pop();
					b=op.pop();
					if (a>b) {
						op.add(a-b);
					}else{
						op.add(b-a);
					}                       
				}
				if (x.equals("*")) {
					a=op.pop();
					b=op.pop();                       
					op.add(a*b);                        
				}
				if (x.equals("/")) {
					a=op.pop();
					b=op.pop();
					if (a>b) {
						op.add(a/b);
					}else{
						op.add(b/a);
					}                        
				}                     
			}else{
				System.out.println("INGRESA UNA CADENA VALIDA OME");
				break;
			}
		}          
		int j=op.pop();
		return j;
	}

	public static int convertir(String a)throws java.lang.Exception{
		int d=0;
		try
		{
			d = Integer.parseInt(a);
		}catch(NumberFormatException nfe){        
		} 
		return d;
	}

}
