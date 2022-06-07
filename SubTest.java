import java.util.ArrayList;

public class SubTest {
	
	private String createSubstring;
	private String substring;
    private String RNASequence;
   
    private ArrayList<String> codonsSub = new ArrayList<String>();
  

	public SubTest (String RNASequence) {
    	this.RNASequence = RNASequence;
    	getCreateSubstring();
   
    }
	
    
	public ArrayList<String> createSubString(String RNAsequence) {     //es werden jeweils 3-Basen-Substrings gebildet :)
		for (int i=0; i<RNASequence.length(); i++) {
	    substring = RNASequence.substring(i,i+3);
		i = i+2;
		codonsSub.add(substring);
		// System.out.println(codons);
		}
		
		return codonsSub;
		}
	
	
    public ArrayList<String> getCodons() {
		return codonsSub;
	}

	public void setCodons(ArrayList<String> codons) {
		this.codonsSub = codons;
	}

	
	public String getCreateSubstring() {
		return createSubstring;
	}

	public void setCreateSubstring(String createSubstring) {
		this.createSubstring = createSubstring;
	}

	public String getSubstring() {
		return substring;
	}

	public void setSubstring(String substring) {
		this.substring = substring;
	}

	public String getRNASequence() {
		return RNASequence;
	}

	public void setRNASequence(String rNASequence) {
		RNASequence = rNASequence;
	}


}
