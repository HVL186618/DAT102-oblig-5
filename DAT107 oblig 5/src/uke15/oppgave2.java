package uke15;

public class oppgave2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public <T> void skrivVerdier(T nedre, T ovre) {
		skrivVerdierRek(rot, nedre, ovre);
	}
	private <T> void skrivVerdierRek(BinaerTreNode<T> t, T nedre, T ovre) {
		// TODO Auto-generated method stub
		if (t != null) {
		}
		skrivVerdierRek (t.getVenstre(), min, maks); 
		if ((t.getElement().compareTo(min) >= 0) && (t.getElement().compareTo(maks) <= 0)) { 
			System.out.print(t.getElement() + " ");
		}
		skrivVerdierRek(t.getHogre(), min, maks);
		
	}

}
