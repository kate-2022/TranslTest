import java.util.ArrayList;

public class MethTest extends AATest implements  TranslInterface {

	  
		    private String peptide = ">";
		   
		    // all marked instances/variables inherited from AATest superclass !
		    
		    protected TranslInterface nextInChain;
		    // protected String singleLetterCode;
		    protected ProtTest aminoAcid = new ProtTest(codons, ""); 		
		    //protected ArrayList<String> codons; 
		    
			// private SubTest substrings = new SubTest("") ;
			// protected int i;
			// protected int j;

			
		// Konstruktor
		public MethTest (String singleLetterCode) {
			this.singleLetterCode = singleLetterCode;
			// setNextInChain(aa2);
		}

		@Override
		public void setNextChain(TranslInterface nextChain) {
			this.nextInChain = nextChain;	
		}
		                                                                                      // toString()-Methode anpassen!! s.u.
		
		@Override
		public void compareSub(ArrayList<String> codons, String peptide) {  	
					
			System.out.println(codons.get(i)+" TestMeth");				
	    					
			if( i < codons.size()) {  
				System.out.println("TestMeth1");  
			  if (codons.get(i).equals("AUG")) {                                
				     singleLetterCode = "M";                       
				     i+=1;	
				     System.out.println(singleLetterCode + " Meth ");
				     peptide = peptide + singleLetterCode;
				     System.out.println("TestMeth2");	
				     nextInChain.compareSub(codons, peptide);
				     }		
	    
	 		  else {     
	 			  System.out.println("testPrintMeth");
	 			  nextInChain.compareSub(codons, peptide);
			 
	 		  }
		 }
			else {
				System.out.println(peptide);
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

    
}
