package messagerie.models;

public class Utilisateur {
 private String nom = "Maurice";
 private String prenom;
 private int age;

 
 public Utilisateur(String nom, String prenom, int age ) {
	 this.nom = nom;
	 this.prenom = prenom; 
	 this.age = age;
	 
	 
 }
 
 public Utilisateur(String nom, String prenom) {
	 this(nom, prenom, 0);
	 
}
 
 public Utilisateur() {
	this("?", "?", 0);
}
 
 public String getNom() {
	 return nom;
 }
 
 public void setNom(String nom) {
	this.nom = nom;
}
  
 public int getAge() {
		return age;
	} 
 
 public void setAge(int age) {
	if(age>=0 && age <=130){
	 this.age = age;
	
	}else {
	throw new NumberFormatException();
	}
 }

 
 public void afficher() {
	System.out.println(nom + "..."); 
 }
 


 @Override
	public String toString() {
		
		return nom + " " + prenom + "("+ age + ")";
	}
 
 
}
