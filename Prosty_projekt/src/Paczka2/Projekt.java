package Paczka2;
import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Math.*;
public class Projekt {
	
	public static void main(String [] args) {
		Wlasciwa w = new Wlasciwa();
		w.d();
	}
}

	class Dane{
	double r,a,b,c,p,o;
	int m;
	Scanner s = new Scanner(System.in);
	
	}
	class PK extends Dane{
		public void vPK(double r, double p) {
			System.out.println("Podaj promien kola: ");
			r = s.nextDouble();
			p = 3.14*r*r;
			System.out.println("Pole wynosi: "+p);
		}
	}
	class OK extends Dane{
		public void vOK(double r, double o) {
		System.out.println("Podaj promien kola: ");
	
		r = s.nextDouble();
		o = 2*r*3.14;
		System.out.println("Obwód wynosi: "+o);
		
		}
	}
	class PT extends Dane{
		public void vPT(double a,double b,double p) {
			
			System.out.println("Podaj wysokosc oraz podstawe: ");
			a = s.nextDouble();
			b = s.nextDouble();
			p = (a*b)/2;
			System.out.println("Pole wynosi: "+p);
		}
	}
	class OT extends Dane{
		public void vOT(double a,double b,double c, double o) {
		System.out.println("Podaj 3 boki trójkata: ");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		o = a+b+c;
		System.out.println("Obwód trójkata wynosi: "+o);
		}
	}
		
	
	class Wlasciwa extends Dane{
		public void d(){
			System.out.println("1 - kolo, 2 - trojkat");
			m = s.nextInt();
			switch(m)
			{
			case 1:
			{
				System.out.println("1 - Pole, 2 - obwod");
						m = s.nextInt();
						switch(m)
						{
						case 1:
						{
							PK k = new PK();
							k.vPK(r, p);
							break;
						}
						case 2:
						{
							OK k = new OK();
							k.vOK(r, o);
							break;
							
						}
						}
						
					break;
			}
			case 2:
			{
				System.out.println("1 - Pole, 2 - Obwod");
				m = s.nextInt();
				switch(m)
				{
					case 1:
					{
					PT t = new PT();
					t.vPT(a,b,p);
					break;
					}
					case 2:
					{
						OT t = new OT();
						t.vOT(a,b,c,o);
						break;
					}
				}
			}
			}
			
			
		}
		
	} 


