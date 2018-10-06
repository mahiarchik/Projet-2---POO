package PooCompany;

import java.util.Scanner;

//import javax.swing.JOptionPane;
public class Test1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("nom : ");
		String n = read.nextLine();
		System.out.println("prénom: ");
		String t = read.nextLine();
		System.out.println("Avez-vous déja une adresse mail alternative ? (oui/non)");
		String on = read.next();
		String Alt_Email;
		if (on.matches("oui")) {
			System.out.println("give the adress");
			Scanner r = new Scanner(System.in);

			Alt_Email = r.nextLine();
			// JOptionPane.showInputDialog("Medli l'adresse");

		} else {
			Alt_Email = "nothing";
		}
		Email first = new Email(n, t, Alt_Email);

		System.out.println("you're adrees is :" + (first.getMail()));
		System.out.println("youre password is : " + (first.getPassword()));
		System.out.println("votre adress " + (first.getAlt_Email()));
		System.out.println("voulez-vous changer de password?");
		Scanner a = new Scanner(System.in);
		String MP = a.nextLine();

		if (MP.matches("oui")) {
			System.out.println("give youre password");
			Scanner p = new Scanner(System.in);
			first.setPassword(p.nextLine()) ; // first.Password = read.nextLine();
			System.out.println("nouveau motpass:" + first.getPassword());

		} else {
			System.out.println("D'accord merci .");

		}
	}
}
