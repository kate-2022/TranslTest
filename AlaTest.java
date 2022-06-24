import java.util.ArrayList;

public class AlaTest extends AATest implements  TranslInterface  {

            private String peptide;

         // all marked instances/variables inherited from AATest superclass !
            
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;
       	         //     protected ArrayList<String> codons;
                 //	protected int i;
		 //	protected int j;
			
	
	public AlaTest (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	
	
	@Override
	public void setNextChain(TranslInterface nextChain) {
		this.nextInChain = nextChain;	
	
	}
	
 	
   	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
   		  	codons.get(i);
   		    System.out.println("TestAla");  
   		    
		  if( i < codons.size()) {  
			  if (codons.get(i).equals("GCA")) {
				singleLetterCode = "A";
			     i+=1;
			     System.out.print(singleLetterCode+"_Ala1");	
			     peptide = peptide + singleLetterCode;
			     System.out.println("TestAla2");	
			     nextInChain.compareSub(codons, peptide);
				     }
			  
			  else if (codons.get(i).equals("GCC")) {
				singleLetterCode = "A";
			     i+=1;
			     System.out.print(singleLetterCode+"_Ala2");
			     peptide = peptide + singleLetterCode;
			     System.out.println("TestAla3");	
			     nextInChain.compareSub(codons, peptide);
				     }
			  
			  else if (codons.get(i).equals("GCG")) {
				singleLetterCode = "A";
			     i+=1;
			     System.out.print(singleLetterCode+"_Ala3");
			     peptide = peptide + singleLetterCode;
			     System.out.println("TestAla4");	
			     nextInChain.compareSub(codons, peptide);
				     } 
			  
			  else if (codons.get(i).equals("GCU")) {
				singleLetterCode = "A";
			     i+=1;
			     System.out.print(singleLetterCode+"_Ala4"); 
			     peptide = peptide + singleLetterCode;
			     System.out.println("TestAla5");	
			     nextInChain.compareSub(codons, peptide);
			     }
		  
			  else {        
				  System.out.println("testPrintAla");
				  nextInChain.compareSub(codons, peptide);
	
			  }
		  }
		  else {
			  System.out.println(peptide);
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
