package it.uniroma3.diadia.ambienti.parser.tag;

import it.uniroma3.diadia.ambienti.parser.Tag;

/**
 * Questa classe gestisce i Tag Vincenti
 * 
 * @author Matteo Filippi, Andrea Salvoni
 * @see Tag
 * @version 0.4
 *
 */
public class TagVincente extends Tag {

	@Override
	public void elabora(String argomenti) {
		super.setStanzaVincente(super.getInsiemeStanza().get(argomenti));
	}
}
