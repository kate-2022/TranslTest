import java.util.ArrayList;

public class AlaTest extends AATest implements  TranslInterface  {

            private String peptide;
	 
		 	protected TranslInterface nextInChain;
			protected String singleLetterCode;
			protected ArrayList<String> codons;
		//	protected ProtTest aminoAcid = new ProtTest(codons, "");
			protected String source;
			private SubTest substrings = new SubTest(source);
			protected int i;
			protected int j;
			
	
	public AlaTest (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	
	
	public void setNextChain(TranslInterface nextChain) {
		this.nextInChain = nextChain;	
	
	}
	
 	
   	public void compareSub(ProtTest aminoAcid) {    
	
		  while( i < codons.size()) {  
			  if (codons.get(i).equals("GCA")) {
				singleLetterCode = "A";
			     i+=1;
			     System.out.print(singleLetterCode+"_Ala1");		 
				     }
			  
			  else if (codons.get(i).equals("GCC")) {
				singleLetterCode = "A";
			     i+=1;
			     System.out.print(singleLetterCode+"_Ala2");
		 
				     }
			  
			  else if (codons.get(i).equals("GCG")) {
				singleLetterCode = "A";
			     i+=1;
			     System.out.print(singleLetterCode+"_Ala3");	 
				     } 
			  
			  else if (codons.get(i).equals("GCU")) {
				singleLetterCode = "A";
			     i+=1;
			     System.out.print(singleLetterCode+"_Ala4"); 
				     }
		  
			  else {                                        
 			  nextInChain.compareSub(aminoAcid);
	
 		  }
	 }

	  }
	
	
	
     
     public String getSingleLetterCode() {
		return singleLetterCode;
	}

     
/*	@Override
    public String toString() {
		peptide = peptide + singleLetterCode;
		return peptide;
    }
     */


	
}
