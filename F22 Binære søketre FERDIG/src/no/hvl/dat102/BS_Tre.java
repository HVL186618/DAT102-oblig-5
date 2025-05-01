package no.hvl.dat102;

public class BS_Tre<T extends Comparable<? super T>> extends BinaerTre<T> implements SoeketreADT<T> {
	BS_Tre() {
		super();
	}

	BS_Tre(T rotElement) {
		super(rotElement, null, null);
	}
	
	public boolean erBalansert() {
	    return erBalansertRek(getRot());
	}

	private boolean erBalansertRek(BinaerTreNode<T> node) {
	    if (node == null) return true;

	    int venstreHoyde = (node.getVenstre() != null) ? node.getVenstre().getHogdeU() : 0;
	    int hogreHoyde   = (node.getHogre() != null) ? node.getHogre().getHogdeU() : 0;

	    if (Math.abs(venstreHoyde - hogreHoyde) > 1)
	        return false;

	    return erBalansertRek(node.getVenstre()) && erBalansertRek(node.getHogre());
	}


	@Override
	public void setTre(T rotData) {
		// Vi ønskjer ikkje at denne metoden skal være tilgjengeleg
		// Ville i så fall være mulig å øydelegge det binære søketreet
		throw new UnsupportedOperationException();
	}

	@Override
	public void setTre(T rotData, BinaerTre<T> venstre, BinaerTre<T> hogre) {
		// Vi ønskjer ikkje at denne metoden skal være tilgjengeleg
		// Ville i så fall være mulig å øydelegge det binære søketreet
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean inneholder(T element) {
		return finn(element) != null;
	}

	@Override
	public T finn(T element) {
		return finn(element, getRot());
	}

	private T finn(T element, BinaerTreNode<T> p) {

		T svar = null;

		// basis: p == null -> tomt tre, element finst ikkje

		if (p != null) {
			int sml = element.compareTo(p.getElement());
			
			if (sml == 0) { // basis, funne elementet
				svar = p.getElement();
			} else if (sml < 0) {
				svar = finn(element, p.getVenstre());
			} else {
				svar = finn(element, p.getHogre());
			}
		}

		return svar;
	}

	@Override
	public T leggTil(T nyttElement) {
		if (getRot() == null){
			setRot(new BinaerTreNode<T>(nyttElement));
			return null;
		} else {
		return leggTil(nyttElement, getRot());
		}
	}

	private T leggTil(T nyttElement, BinaerTreNode<T> p) {
		// Veit at p != null
		
		T resultat = null;
		int sml = nyttElement.compareTo(p.getElement());
		
		if (sml == 0) {
			resultat = p.getElement();
			p.setElement(nyttElement);
		} else if (sml < 0) {
			if (p.getVenstre() == null) { // har funne rett plass
				BinaerTreNode<T> ny = new BinaerTreNode<>(nyttElement);
				p.setVenstre(ny);
			} else {
				resultat = leggTil(nyttElement, p.getVenstre());
			}
		} else {
			if (p.getHogre() == null) { // har funne rett plass
				BinaerTreNode<T> ny = new BinaerTreNode<>(nyttElement);
				p.setHogre(ny);
			} else {
				resultat = leggTil(nyttElement, p.getHogre());
			}
		}
		return resultat;
	}
	@Override
	public T fjern(T element) {
		/*
		 * Det er ikkje pensum å kunne skrive kode for denne.
		 */

		throw new UnsupportedOperationException();
	}
}
