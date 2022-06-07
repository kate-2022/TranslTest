import java.util.ArrayList;

public class MethTest extends AATest implements  TranslInterface {

	  
		    private String peptide = ">";
		 
		 	protected TranslInterface nextInChain;
			protected String singleLetterCode;
		   // protected ArrayList<String> codons; 
		   // protected ProtTest aminoAcid = new ProtTest(codons, ""); 		
			protected String source;
			private SubTest substrings = new SubTest(source);
			protected int i=0;
			protected int j;

			
		// Konstruktor
		public MethTest (String singleLetterCode) {
			this.singleLetterCode = singleLetterCode;
		}

		public void setNextChain(TranslInterface nextChain) {
			this.nextInChain = nextChain;	
		}
		                                                                                      // toString()-Methode anpassen!! s.u.
		
		public void compareSub(ProtTest aminoAcid) {                 
			
		  while( i < codons.size()) {  
			  if (codons.get(i).equals("AUG")) {                                
				     singleLetterCode = "M";                       
				     i+=1;	
				     System.out.print(singleLetterCode + " Meth");
				     }		
	    
	 		  else {                                        
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

	
}
