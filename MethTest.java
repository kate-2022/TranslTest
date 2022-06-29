import java.util.ArrayList;

public class MethTest extends AATest implements  TranslInterface {

	  
		    private String peptide = ">";
		   
		    // all marked instances/variables inherited from AATest superclass !
		    
		    // protected TranslInterface nextInChain;
		    // protected String singleLetterCode;
		    		
		    protected ArrayList<String> codons; 
		   // protected ProtTest aminoAcid = new ProtTest(codons, ""); 	
			// private SubTest substrings = new SubTest("") ;
			// protected int i;
		

			
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
		public void compareSub(ArrayList<String> codons, String peptide) {  	
			ArrayList<String> codons1 = new ArrayList<String>();    
			
			System.out.println(codons.get(i)+" TestMeth");	    	
				
			if( i <= codons.size()) {  
				System.out.println("TestMeth1");  
				
			  if (codons.get(i).equals("AUG")) {                                
				     singleLetterCode = "M";                       
				     i+=1;	
				     System.out.println(codons.get(i)+" testAsc");
				     
				     System.out.println(singleLetterCode + " Meth ");
				     peptide = peptide + singleLetterCode;
				     
				     codons.remove(0);
				     codons1 = codons;
				     nextInChain.compareSub(codons1, peptide);
				     }		
	    
	 		  else {     
	 			  System.out.println("testPrintMeth");
	 			  nextInChain.compareSub(codons1, peptide);
			 
	 		  }
		 }
			else {
				  System.out.println("peptide sequence: " + peptide);
			}
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
