import java.util.ArrayList;

public class SubTest {
	
	private String substring;
    private String RNASequence;
   
    private ArrayList<String> codonsSub = new ArrayList<String>();
  

	public SubTest (String RNASequence) {
    	this.RNASequence = RNASequence;
   
    }
	
    
	public ArrayList<String> createSubString(String RNAsequence) {     //es werden jeweils 3-Basen-Substrings gebildet :)
		for (int i=0; i<RNASequence.length(); i++) {
	    substring = RNASequence.substring(i,i+3);
		i = i+2;
		codonsSub.add(substring);
		// System.out.println(codonsSub);
		}
		
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
