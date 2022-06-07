import java.util.ArrayList;

public class ProtTest  {

	
	private String proteinSequence;
	private String peptide;
	private ArrayList<String> codonsRNA;
	private SubTest subString = new SubTest ("");

	public ProtTest (ArrayList<String> codons, String peptide) {
		this.codonsRNA = codons;
		this.peptide = peptide;
	}


}
