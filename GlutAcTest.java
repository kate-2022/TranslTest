import java.util.ArrayList;

public class GlutAcTest extends AATest implements  TranslInterface {

         // all marked instances/variables inherited from AATest superclass !
          
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;
	  
         //	protected int i;
		
	   
	public GlutAcTest (String singleLetterCode ) {
		this.singleLetterCode = singleLetterCode;
	}

	
	@Override
	public void setNextChain(TranslInterface nextChain) {
		this.nextInChain = nextChain;	
	}

	
	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {     
	
			
		  if( i <= codons.size()) {  
			  System.out.println(codons.get(i)+ " TestGlucAc");  
			  
			  if (codons.get(i).equals("GAA")) {
				singleLetterCode = "E";
			     i+=1;
		
			     System.out.println(singleLetterCode+"_GlutAc1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestGlucAc1");	
			     nextInChain.compareSub(codons, peptide);
				     }
		  
		  else if (codons.get(i).equals("GAG")) {
				singleLetterCode = "E";
			     i+=1;
	
			     System.out.println(singleLetterCode+"_GlutAc2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestGlucAc2");	
			     nextInChain.compareSub(codons, peptide);
				     }
		  
	/*	  else {   
			  System.out.println("Dieses Codon war ungültig! Bitte überprüfen Sie Ihre Eingabe.");      
			  System.exit(0) ;    
			 
			  //System.out.println("Dieses Codon war ungültig");                                     
 			   //i+=1;
			   //nextInChain.compareSub(codons, peptide);
			  
		  	} */
		  }	 
		  else {
			  System.out.println("peptide sequence: " + peptide);
			}
	}
	
  
     public String getSingleLetterCode() {
 		return singleLetterCode;
 	}	
}
