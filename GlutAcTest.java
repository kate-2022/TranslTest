public class GlutAcTest extends AATest implements  TranslInterface {
   
	   private String peptide;

       // all marked instances/variables inherited from AATest superclass !
          
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;
       // protected ArrayList<String> codons;
			private SubTest substrings;
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
	public void compareSub(ProtTest aminoAcid) {     
		  codons = substrings.getCodonsSub();
		
		  while( i < codons.size()) {  
			  if (codons.equals("GAA")) {
				singleLetterCode = "E";
			     this.proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     System.out.print(singleLetterCode+"_GlutAc1");
			     peptide = peptide + singleLetterCode;
			     aminoAcid.setPeptide(peptide);
			     aminoAcid.setCodonsRNA(codons);
				     }
		  
		  else if (codons.equals("GAG")) {
				singleLetterCode = "E";
			     this.proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     System.out.print(singleLetterCode+"_GlutAc2");
			     peptide = peptide + singleLetterCode;
			     aminoAcid.setPeptide(peptide);
			     aminoAcid.setCodonsRNA(codons);	 
				     }
		  
		  else {   
			   System.out.println("Dieses Codon war ungültig");                                     
 			   i+=1;
			   nextInChain.compareSub(aminoAcid);
			  
		 		  }
	 }
		
	  }
	
	
	
	
     
     public String getSingleLetterCode() {
 		return singleLetterCode;
 	}

	
}