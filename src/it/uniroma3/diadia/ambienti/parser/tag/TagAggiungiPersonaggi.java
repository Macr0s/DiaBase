package it.uniroma3.diadia.ambienti.parser.tag;

import it.uniroma3.diadia.ambienti.parser.FormatoFileNonValidoException;
import it.uniroma3.diadia.ambienti.parser.Tag;

/**
 * CLasse che implementa il tag AggiuntiPersonaggi
 * 
 * @author MatteoFilippi, Andrea Salvoni
 * @see Tag
 * @see FormatoFileNonValidoException 
 *
 */
public class TagAggiungiPersonaggi extends Tag {

	@Override
	public void elabora(String argomenti) throws FormatoFileNonValidoException {
		for(String collegamento: argomenti.split(", ")){
			String[] caratteristiche = collegamento.split(" ");
			super.getInsiemeStanza().get(caratteristiche[1]).setPersionaggio(super.getInsiemePersonaggio().get(caratteristiche[0]));
		}
	}

}
