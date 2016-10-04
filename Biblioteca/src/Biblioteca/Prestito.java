package Biblioteca;

import java.util.Date;

public class Prestito {

	private Date dataPrestito;
	private Utente u;
	private Libro l;
	private Date dataRestituzione;
	
//costruttore
	
	
	

	public Prestito(Date dataPrestito, Utente u, Libro l) {
	super();
	this.dataPrestito = dataPrestito;
	this.u = u;
	this.l = l;
}
	
	
	
	public Prestito() {
	super();
}
	
	
	
	
	//metodi
	public Utente getU() {
		return u;
	}
	public void setU(Utente u) {
		this.u = u;
	}

	public Libro getL() {
		return l;
	}

	public void setL(Libro l) {
		this.l = l;
	}

	public Date getDataPrestito() {
		return dataPrestito;
	}

	public void setDataPrestito(Date data) {
		this.dataPrestito = dataPrestito;
	}



	public Date getDataRestituzione() {
		return dataRestituzione;
	}



	public void setDataRestituzione(Date dataRestituzione) {
		this.dataRestituzione = dataRestituzione;
	}




	
}
