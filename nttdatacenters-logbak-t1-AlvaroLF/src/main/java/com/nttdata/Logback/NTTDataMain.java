package com.nttdata.Logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Taller Práctico SLF4J - Logback
 *
 * Clase principal
 *
 * @author Alvaro Limón Flor
 *
 */
public class NTTDataMain {

	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(NTTDataMain.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		LOG.info("Inicio del método");
		
		// Creación de un bucle que pide como condición para detenerse un número
		int number=0;
		int numberTry=1;
		while(number !=666) {	
		number = (int)(Math.random()*1000+1);
		LOG.debug("Estamos buscando el número 666 y hemos encontrado el {} en el intento {}",number,numberTry);
		numberTry++;	
		}

		LOG.info("Fin del método");
	}
}
