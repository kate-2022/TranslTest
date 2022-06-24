import java.util.ArrayList;

public interface TranslInterface {
		
	  //void compareSub(ProtTest aminoAcid);
	    void compareSub(ArrayList<String> codons, String peptide);  
	    void setNextChain(TranslInterface nextInChain);
	


	
	
}

