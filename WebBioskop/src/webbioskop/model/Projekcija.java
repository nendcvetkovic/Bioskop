package webbioskop.model;

public class Projekcija {
	
	private String id;
	private String filmKojiSePrikazuje;
	private String tipProjekcije;
	private String sala;
	private String datumIVremePrikazivanja;
	private double cenaKarte;
	private String administratorKojiJeDodaoProjekciju;
	
	public Projekcija(String id, String filmKojiSePrikazuje, String tipProjekcije, String sala, String datumIVremePrikazivanja, double cenaKarte, String administratorKojiJeDodaoProjekciju) {
		this.id = id;
		this.filmKojiSePrikazuje = filmKojiSePrikazuje;
		this.tipProjekcije = tipProjekcije;
		this.sala = sala;
		this.datumIVremePrikazivanja = datumIVremePrikazivanja;
		this.cenaKarte = cenaKarte;
		this.administratorKojiJeDodaoProjekciju = administratorKojiJeDodaoProjekciju;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilmKojiSePrikazuje() {
		return filmKojiSePrikazuje;
	}

	public void setFilmKojiSePrikazuje(String filmKojiSePrikazuje) {
		this.filmKojiSePrikazuje = filmKojiSePrikazuje;
	}

	public String getTipProjekcije() {
		return tipProjekcije;
	}

	public void setTipProjekcije(String tipProjekcije) {
		this.tipProjekcije = tipProjekcije;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getDatumIVremePrikazivanja() {
		return datumIVremePrikazivanja;
	}

	public void setDatumIVremePrikazivanja(String datumIVremePrikazivanja) {
		this.datumIVremePrikazivanja = datumIVremePrikazivanja;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}

	public String getAdministratorKojiJeDodaoProjekciju() {
		return administratorKojiJeDodaoProjekciju;
	}

	public void setAdministratorKojiJeDodaoProjekciju(String administratorKojiJeDodaoProjekciju) {
		this.administratorKojiJeDodaoProjekciju = administratorKojiJeDodaoProjekciju;
	}
}