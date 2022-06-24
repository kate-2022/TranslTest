import java.util.ArrayList;

public class GlutAcTest extends AATest implements  TranslInterface {
   
	   private String peptide;

       // all marked instances/variables inherited from AATest superclass !
          
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;
	   	 //     protected ArrayList<String> codons;
        	 //	protected int i;
		 //	protected int j;
	
	public GlutAcTest (String singleLetterCode ) {
		this.singleLetterCode = singleLetterCode;
	}

	
	@Override
	public void setNextChain(TranslInterface nextChain) {
		this.nextInChain = nextChain;	
	}

	
	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {     
			codons.get(i);
			System.out.println("TestGlucAc");  
			
		  if( i < codons.size()) {  
			  if (codons.get(i).equals("GAA")) {
				singleLetterCode = "E";
			     this.proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     System.out.print(singleLetterCode+"_GlutAc1");
			     peptide = peptide + singleLetterCode;
			     aminoAcid.setPeptide(peptide);
			     aminoAcid.setCodonsRNA(codons);
			     System.out.println("TestGlucAc2");	
			     nextInChain.compareSub(codons, peptide);
				     }
		  
		  else if (codons.get(i).equals("GAG")) {
				singleLetterCode = "E";
			     this.proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     System.out.print(singleLetterCode+"_GlutAc2");
			     peptide = peptide + singleLetterCode;
			     aminoAcid.setPeptide(peptide);
			     aminoAcid.setCodonsRNA(codons);	
			     System.out.println("TestGlucAc3");	
			     nextInChain.compareSub(codons, peptide);
				     }
		  
		  else {   
			   System.out.println("Dieses Codon war ungültig");                                     
 			   i+=1;
			   nextInChain.compareSub(codons, peptide);
			  
		  	}
		  }	 
		  else {
				System.out.println("we´re done! :)");
			}
	}
	
	
	
	
     
     public String getSingleLetterCode() {
 		return singleLetterCode;
 	}

	
}
