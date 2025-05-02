package no.hvl.dat102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BS_TreTest {
	
	@Test
	void testErBalansert() {
	    BS_Tre<Integer> tre = new BS_Tre<>();

	    // balansert: 10
	    //           /  \
	    //          5    15
	    tre.leggTil(10);
	    tre.getRot().setHogdeU(2);
	    tre.leggTil(5);
	    tre.getRot().getVenstre().setHogdeU(1);
	    tre.leggTil(15);
	    tre.getRot().getHogre().setHogdeU(1);

	    assertTrue(tre.erBalansert());

	    // ubalansert:  10
	    //             /
	    //            5
	    //           /
	    //          2
	    BS_Tre<Integer> ubalansertTre = new BS_Tre<>();
	    ubalansertTre.leggTil(10);
	    ubalansertTre.getRot().setHogdeU(3);
	    ubalansertTre.leggTil(5);
	    ubalansertTre.getRot().getVenstre().setHogdeU(2);
	    ubalansertTre.leggTil(2);
	    ubalansertTre.getRot().getVenstre().getVenstre().setHogdeU(1);

	    assertFalse(ubalansertTre.erBalansert());
	}


}
