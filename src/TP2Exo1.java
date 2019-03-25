import java.util.Scanner;

public class TP2Exo1 {
	public static void main(String[] args) {
		//1. déclarer et construire un Polynome p1 avec les valeurs par défaut;
		Polynome p1;
		p1=new Polynome();
		//2. donner la valeur 1 à tous les coefficients de p1 ;
	      p1.seta(1);
	      p1.setb(1);
          p1.setc(1);		
		//3. déclarer et construire un Polynôme p2 avec les valeurs 1, -2, -3 ;
	     Polynome p2=new Polynome(1,-2,-3);
		//4. afficher p1 puis p2 ;
	     p1.afficher();
	     p2.afficher();
		//5. afficher la valeur de p2 pour l'entier 2 ;
	     System.out.println("la valeur de p2 pour l entier 2 est="+p2.evaluer(2));
		//6. afficher la valeur de la dérivée p2 pour l'entier 2 ;
	     System.out.println("la valeur de la derivee de p2 pour l entier 2 est="+p2.evaluerderive(2));
		//7. déclarer un polynôme p3 et l'initialiser à la dérivée de p2;
	     Polynome p3=new Polynome(0,2,-2);
		//8. afficher p3 ;
	     p3.afficher();
		//9. afficher le discriminant de p2 ;
	     System.out.println("le discriminant de p2 est="+p2.discriminant());
		//10. afficher les racines de p2 ;
	     p2.afficherRacines();
		//11. afficher le discriminant de p1 ;
	     System.out.println("le discriminant de p1 est="+p1.discriminant());
		//12. afficher les racines de p1 ;
	     p1.afficherRacines();
		//13. ajouter p2 à p1 puis afficher p1 ;
	     p2.somme(p1);
	     p1.afficher();
		//14. mettre à zéro le coefficient de degré 2 de p1 ;
	     p1.seta(0);
		//15. mettre à zéro les coefficients de degré 2 et 1 de p3 ;
		p3.seta(0);
		p3.setb(0);
		int k;
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		System.out.println("le carre de "+ k+ " est="+(k*k));
	}

}
