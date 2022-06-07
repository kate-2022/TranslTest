import java.util.ArrayList;

public class GlutAcTest extends AATest implements  TranslInterface {
    // protected Translatable nextInChain;
		// protected String singleLetterCode;
		// protected ProteinSequence aminoAcid;
		// protected String peptide;
		// protected int i;
		// protected int j;
	
	public GlutAcTest (String singleLetterCode ) {
		this.singleLetterCode = singleLetterCode;
	}

	
	public TranslInterface setNextChain(TranslInterface nextChain) {
		this.nextInChain = nextChain;	
		return nextInChain;
	}

	
	public String compareSub(ArrayList<String>codons, String peptide) {     
		  codons.get(i);
		  while( i < codons.size()) {  
		  if (codons.equals("GAA")) {
				singleLetterCode = "E";
			     this.proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     System.out.print(singleLetterCode+"_GlutAc1");
				    // compareSub(codons); 			 
				     }
		  
		  else if (codons.equals("GAG")) {
				singleLetterCode = "E";
			     this.proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     System.out.print(singleLetterCode+"_GlutAc2");
				    // compareSub(codons); 			 
				     }
		  
		  else {   
			   System.out.println("Dieses Codon war ungültig");                                     
 			   i+=1;
			   nextInChain.compareSub(codons, peptide);
			  
		 		  }
	 }
		  return peptide;
	  }
	
	
	
	
     
     public String getSingleLetterCode() {
 		return singleLetterCode;
 	}

	
}
