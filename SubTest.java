import java.util.ArrayList;

public class SubTest {
	
	private String substring;
    private String RNASequence;
    private ArrayList<String> codonsSub = new ArrayList<String>();
    
    TranslInterface aa1 = new MethTest("M");        
    TranslInterface aa2 = new AlaTest("A");         
    TranslInterface aa20 = new GlutAcTest ("E"); 
   

	public SubTest (String RNASequence) {
    	this.RNASequence = RNASequence;
    	 aa1.setNextChain(aa2); 
		 aa2.setNextChain(aa20);
		 aa20.setNextChain(aa2);  
   
    }
	
    
	public ArrayList<String> createSubString(String RNAsequence) {     //es werden jeweils 3-Basen-Substrings gebildet :)
		for (int i=0; i<RNASequence.length(); i++) {
	    substring = RNASequence.substring(i,i+3);
		i = i+2;
		codonsSub.add(substring);
		System.out.println(codonsSub + "SubTest");
		}
	//	ProtTest aminoAcid = new ProtTest(codonsSub, ">"); 
		aa1.compareSub(codonsSub, ">");
		return codonsSub;
		}
	
	
    public ArrayList<String> getCodonsSub() {
		return codonsSub;
	}


	public void setCodonsSub(ArrayList<String> codonsSub) {
		this.codonsSub = codonsSub;
	}



	public String getRNASequence() {
		return RNASequence;
	}

	public void setRNASequence(String rNASequence) {
		RNASequence = rNASequence;
	}


}
