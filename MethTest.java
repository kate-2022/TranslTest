public class MethTest extends AATest implements  TranslInterface {

	  
		    private String peptide = ">";
		   
		    // all marked instances/variables inherited from AATest superclass !
		    
		    // protected TranslInterface nextInChain;
		    // protected String singleLetterCode;
		    protected ProtTest aminoAcid = new ProtTest(codons, ""); 		
		    // protected ArrayList<String> codons; 
		    
			private SubTest substrings = new SubTest("");
		    
			protected int i=0;
			// protected int j;

			
		// Konstruktor
		public MethTest (String singleLetterCode) {
			this.singleLetterCode = singleLetterCode;
		}

		@Override
		public void setNextChain(TranslInterface nextChain) {
			this.nextInChain = nextChain;	
		}
		                                                                                      // toString()-Methode anpassen!! s.u.
		
		@Override
		public void compareSub(ProtTest aminoAcid) {  	
				codons = substrings.getCodonsSub();
			  
				System.out.println("TestMeth");
				
			while( i < codons.size()) {  // ab hier stimmt etwas nicht.. der Index wird nicht erkannt!
				System.out.println("TestMeth2");  
			  if (codons.get(i).equals("AUG")) {                                
				     singleLetterCode = "M";                       
				     i+=1;	
				     System.out.print(singleLetterCode + " Meth");
				     peptide = peptide + singleLetterCode;
				     aminoAcid.setPeptide(peptide);
				     aminoAcid.setCodonsRNA(codons);
				     }		
	    
	 		  else {     
	 			  System.out.println("testPrintMeth");
	 			  nextInChain.compareSub(aminoAcid);
			
	 		  }
		 }
	 }    

		
		
		@Override
	    public String toString() {                        // das hier noch überprüfen und bei allen AS Klassen anpassen!!
			peptide = peptide + singleLetterCode;
			return peptide;
	    }
	     
	     public String getSingleLetterCode() {
	 		return singleLetterCode;
	 	}

	     
	    @ Override
		public String proteinSequence(String peptide, String singleLetterCode) {
			peptide = peptide + singleLetterCode;
			return peptide;
		
		}

		public String getPeptide() {
			return peptide;
		}

		public void setPeptide(String peptide) {
			this.peptide = peptide;
		}

		public ProtTest getAminoAcid() {
			return aminoAcid;
		}

		public void setAminoAcid(ProtTest aminoAcid) {
			this.aminoAcid = aminoAcid;
		}


		public SubTest getSubstrings() {
			return substrings;
		}

		public void setSubstrings(SubTest substrings) {
			this.substrings = substrings;
		}

	
	    
	    
}
