package PooCompany;
import java.util.Random;
public class Email {
	 private String nom;
	private  String prénom;
	private String mail;
	private String Password ;
private	 String Alt_Email="" ;
Email (String nom , String prénom, String Alt_Email){
		this.nom=nom;
		this.prénom=prénom;
		this.Alt_Email=Alt_Email;
		mail = nom+"."+prénom+"@PooCompany.com" ;
		char tab[]= {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
		String password =""; 
		for(int i = 0 ; i < 8 ; i++ ) {
		password += tab[(int)(Math.random()*62)];
	}
	Password=password;
	}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrénom() {
	return prénom;
}
public void setPrénom(String prénom) {
	this.prénom = prénom;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getAlt_Email() {
	return Alt_Email;
}
public void setAlt_Email(String alt_Email) {
	Alt_Email = alt_Email;
}
}

		
