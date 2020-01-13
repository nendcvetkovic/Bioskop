package webbioskop.model;

public class Korisnik {
	private String korisnickoIme;
	private String lozinka;
	private String datum;
	private Uloga uloga;
	
	public Korisnik(String korisnickoIme, String lozinka, String datum, Uloga uloga) {
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.datum = datum;
		this.uloga = uloga;
		
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public Uloga getUloga() {
		return uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}
}