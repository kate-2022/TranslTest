import java.util.ArrayList;

public class AlaTest extends AATest implements  TranslInterface  {

            private String peptide;

         // all marked instances/variables inherited from AATest superclass !
            
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;
      
         //	protected int i;
		
			
	
	public AlaTest (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	
	
	@Override
	public void setNextChain(TranslInterface nextChain) {
		this.nextInChain = nextChain;	
	
	}
	
 	
   	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i <= codons.size()) {  
			  System.out.println(codons.get(i)+ " TestAla");  
			  
			  if (codons.get(i).equals("GCA")) {
				singleLetterCode = "A";
			     i+=1;
		
			     System.out.print(singleLetterCode+" Ala1");	
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestAla1");	
			     
			     nextInChain.compareSub(codons, peptide);
				     }
			  
			  else if (codons.get(i).equals("GCC")) {
				singleLetterCode = "A";
			     i+=1;
	
			     System.out.println(singleLetterCode+" Ala2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestAla2");	
			     nextInChain.compareSub(codons, peptide);
				     }
			  
			  else if (codons.get(i).equals("GCG")) {
				singleLetterCode = "A";
			     i+=1;
		
			     System.out.println(singleLetterCode+" Ala3");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestAla3");	
			     nextInChain.compareSub(codons, peptide);
				     } 
			  
			  else if (codons.get(i).equals("GCU")) {
				singleLetterCode = "A";
			     i+=1;
			
			     System.out.println(singleLetterCode+" Ala4"); 
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestAla4");	
			     nextInChain.compareSub(codons, peptide);
			     }
		  
			  else {        
				  System.out.println("testPrintAla");
				  nextInChain.compareSub(codons, peptide);
	
			  }
		  }
		  else {
			  System.out.println("peptide sequence: " + peptide);
			}

   	}
	
 
     public String getSingleLetterCode() {
		return singleLetterCode;
	}

 
	
}
