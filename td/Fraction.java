
public class Fraction {

		 private int numerateur;
		 private int denominateur;


		/**Constructeur**/
			  
			 public Fraction(int unNumerateur,int unDenominateur){
			  this.numerateur=unNumerateur;
			  this.denominateur=unDenominateur;
			 }
		 
		/**Affichage**/
		@Override
		 public String toString(){
		  if(this.denominateur!=0){
			  
		    return this.numerateur +" "+ this.denominateur ; 
		    
		   }
		 
		 return "impossible";
		 }
		 
		 }
