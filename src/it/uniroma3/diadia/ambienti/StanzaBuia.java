package it.uniroma3.diadia.ambienti;

/**
 * Questa stanza gestisce la stanza buia. La
 * stanza buia � un tipo di stanza dove al posto della
 * descrizione della stanza appare "Qui c'� un buio
 * pesto" se nella stanza non c'� un determinato
 * oggetto
 * 
 * @author Matteo Filippi, Andrea Salvoni
 * @version 0.2
 * @see Stanza
 *
 */
public class StanzaBuia extends Stanza{
	private static final String DEFAULT_LUCE = "lanterna";
	private String nomeAttrezzoVedere;
	
	public StanzaBuia(String nome){
		this(nome, DEFAULT_LUCE);
	}
	
	public StanzaBuia(String nome, String nomeAttrezzo){
		super(nome);
		this.nomeAttrezzoVedere = nomeAttrezzo;
	}
	
	/**
     * Restituisce la descrizione della stanza.
     * @return la descrizione della stanza
     */
	@Override
	public String getDescrizione(){
		if (super.hasAttrezzo(this.nomeAttrezzoVedere)){
			return super.getDescrizione();
		}
		return "Qui c'� un buio pesto";
	}
}
