package webbioskop.model;

public class Karta {
	
	private String id;
	private String projekcijaZaKojuSeKupujeKarta;
	private String sedisteZaKojeSeKupujeKarta;
	private String datumIVremeProdaje;
	private String korisnik;
	
	public Karta(String id, String projekcijaZaKOjuSeKupujeKarta, String sedisteZaKojeSeKupujeKarta, String datumIVremeProdaje, String korisnik) {
		this.id = id;
		this.projekcijaZaKojuSeKupujeKarta = projekcijaZaKOjuSeKupujeKarta;
		this.sedisteZaKojeSeKupujeKarta = sedisteZaKojeSeKupujeKarta;
		this.datumIVremeProdaje = datumIVremeProdaje;
		this.datumIVremeProdaje = datumIVremeProdaje;
		this.korisnik = korisnik;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjekcijaZaKojuSeKupujeKarta() {
		return projekcijaZaKojuSeKupujeKarta;
	}

	public void setProjekcijaZaKojuSeKupujeKarta(String projekcijaZaKojuSeKupujeKarta) {
		this.projekcijaZaKojuSeKupujeKarta = projekcijaZaKojuSeKupujeKarta;
	}

	public String getSedisteZaKojeSeKupujeKarta() {
		return sedisteZaKojeSeKupujeKarta;
	}

	public void setSedisteZaKojeSeKupujeKarta(String sedisteZaKojeSeKupujeKarta) {
		this.sedisteZaKojeSeKupujeKarta = sedisteZaKojeSeKupujeKarta;
	}

	public String getDatumIVremeProdaje() {
		return datumIVremeProdaje;
	}

	public void setDatumIVremeProdaje(String datumIVremeProdaje) {
		this.datumIVremeProdaje = datumIVremeProdaje;
	}

	public String getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(String korisnik) {
		this.korisnik = korisnik;
	}
}