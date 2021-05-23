package syllRep;


import java.util.Arrays;

import SyllableRepr.ISyllableEncoder;
import SyllableRepr.SyllableAsVec;
import SyllableRepr.SyllableAsVec.stemType;
import syllableRep.SimpleVectorEncoder;

public class SimpleSillableTester {
	public static void main(String[] args){
		String input = "bzhin";
		ISyllableEncoder enc = new SimpleVectorEncoder(); 
		SyllableAsVec v = new SyllableAsVec(input);
		System.out.println(v.getStem(stemType.main_stem));
		System.out.println(Arrays.toString(v.getEncodedStemVector(stemType.main_stem, enc)));
		System.out.println("----");
		System.out.println(v.getStem(stemType.main_stem_norm));
		System.out.println(Arrays.toString(v.getEncodedStemVector(stemType.main_stem_norm, enc)));
	}
}
