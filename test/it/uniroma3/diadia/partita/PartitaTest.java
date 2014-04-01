package it.uniroma3.diadia.partita;

import static org.junit.Assert.*;
import it.uniroma3.diadia.Partita;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Test della classe Partita
 * 
 * @author Matteo Filippi, Andrea Salvoni
 * @see Partita
 *
 */
public class PartitaTest {
	private Partita partita;
	
	@Before
	public void setUp() throws Exception {
		this.partita = new Partita();
	}
	
	/**
	 *  Controlla se la partita non � finita quando la partita � inizializzata;
	 */
	@Test
	public void testIsFinita_Iniziata() {
		assertFalse(this.partita.getStanzaCorrente().toString(),this.partita.isFinita());
	}

	/**
	 *  Controlla se la partita � finita attraverso l'invocazione di setFinita();
	 */
	@Test
	public void testIsFinita_Forzata() {
		this.partita.setFinita();
		assertTrue(this.partita.getStanzaCorrente().toString(),this.partita.isFinita());
	}
	
	/**
	 *  Controlla se la partita � finita attraverso lo spostamento nell astanza vincente
	 */
	@Test
	public void testIsFinita_SpostamentoVincente() {
		this.partita.setStanzaCorrente(this.partita.getStanzaCorrente().getStanzaAdiacente("nord"));
		assertTrue(this.partita.getStanzaCorrente().toString(),this.partita.isFinita());
	}
	
	/**
	 *  Controlla se la partita � finita attraverso il raggiungimento dei CFU a 0
	 */
	@Test
	public void testIsFinita_CFU() {
		this.partita.getGiocatore().setCFU(0);
		assertTrue(this.partita.getStanzaCorrente().toString(),this.partita.isFinita());
	}

	/**
	 *  Controlla se i CFU sono impostati correttamente
	 */
	@Test
	public void testGetCFU() {
		assertEquals(this.partita.toString(), 20, this.partita.getCFU());
	}

	/**
	 *  Controlla se i cfu vengono scalati correttamente
	 */
	@Test
	public void testDecrementaCFU() {
		this.partita.decrementaCFU();
		assertEquals(this.partita.toString(), 19, this.partita.getCFU());
	}
	
	/**
	 *  Controlla se la stringa restituita dal metodo toString viene generata correttamente
	 */
	@Test
	public void testToString(){
		assertEquals("Io sono Mario Biondi\nCFU: 20\nEquipaggiato: Niente\nBorsa vuota\n\nAtrio\nUscite:  nord est sud ovest\nAttrezzi nella stanza: osso (1kg) \n", this.partita.toString());
	}

}
