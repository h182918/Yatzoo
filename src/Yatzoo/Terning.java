package Yatzoo;

import java.util.Random;

/**
 * 
 * klasse for å få verdi på terninger
 * 
 * @author torkel
 *
 */

public class Terning {
	private static final Random RAND = new Random();
	private Integer verdi;
	
	public Terning () {
		verdi = RAND.nextInt(6) + 1;
	}
	
	public String getDyr() {
		String dyret;
		if(verdi == 1) {
			dyret = "løve";
		}else if(verdi == 2){
			dyret = "slange";
		}else if(verdi == 3) {
			dyret = "panda";
		}else if(verdi == 4){
			dyret = "gris";
		}else if(verdi == 5) {
			dyret = "elefant";
		}else{
			dyret = "hval";
		}
		return dyret;
	}

}
