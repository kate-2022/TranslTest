import java.util.ArrayList;

public class AATest implements TranslInterface {
	
	protected TranslInterface nextInChain;  /* just implements TranslInterface for beeing able
	                                           to instantiate TranslInterface nextInChain !*/
	protected String singleLetterCode;
    protected ProtTest aminoAcid;
	protected ArrayList<String> codons;
	protected int i;
	protected int j;
    
    
	public String proteinSequence(String peptide, String singleLetterCode) {
		peptide = peptide + singleLetterCode;
		return peptide;
	
	}


	@Override
	public void setNextChain(TranslInterface nextInChain) {
		// TODO Auto-generated method stub
	}


	@Override
	public void compareSub(ProtTest aminoAcid) {
		// TODO Auto-generated method stub
		
	}
    
    
    



	
}