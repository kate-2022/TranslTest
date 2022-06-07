import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		   String source = "";
		   String peptide =">";
	        
	        
	       ArrayList<String> codonsM = new ArrayList<String>();
		   
		    // Einzelne Aminos�uren = Objekte vom Typ TranslInterface (Klassen die das Interface implementieren) 
		    // zum Vergleich des jeweiligen Substrings aus der ArrayList <String> codons mit den jeweiligen spezifischen 
	        // Codons f�r jede AA (compareSub ();)
		    
	       TranslInterface aa1 = new MethTest("M");        // codiert AUG    
	       TranslInterface aa2 = new AlaTest("A");         // codiert GCU, GCC, GCA, GCG   
		
	       TranslInterface aa20 = new GlutAcTest ("E");    //  codiert GAA, GAG 
		  
		   
		    aa1.setNextChain(aa2); 
		    aa2.setNextChain(aa20);
		    aa20.setNextChain(aa2);
		 
		             // aa20 -> aa2    es geht ja in der Codon-Liste weiter mit dem n�chsten Codon.. (Methionin ist nur Start-codon, deshalb zu aa2)
		             //  daf�r darf also auch nicht die Anweisung nextInChain.compareSub im else{}-Block zum Schluss wegfallen !!!
		    
			Scanner scan = new Scanner (System.in);
			System.out.println("Bitte geben Sie eine RNA-Sequenz ein. ");
	        System.out.println("Die Sequenz muss aus den Nucleotiden A, U, G oder C bestehen und mit dem Startcodon AUG beginnen.");	
			
			source = scan.next();
			source = source.toUpperCase();
			
			if (!source.startsWith("AUG")){
		    System.out.println("Bitte erneut eingeben, die Sequenz muss mit dem Startcodon AUG beginnen.");	
		    source = scan.next();	
		    source = source.toUpperCase();
			}
			
			scan.close();
			
		    SubTest sub = new SubTest (source);  
		    codonsM = sub.getCodons(); 
	        ProtTest prot1 = new ProtTest (codonsM, ">");		    
		  
			// codonsM = sub.getCodons(); 
			codonsM = sub.createSubString(source);

		    System.out.println("Die Substrings: " + codonsM);
		         
		    aa1.compareSub(prot1);  
		    
	             
		    
		   // System.out.print(peptide.toString());  
		                        // kein Zeilenumbruch, deshalb ohne ln !! ( die AA-Sequenz/ das Peptid soll kombiniert ausgegeben werden)

		}


	}


