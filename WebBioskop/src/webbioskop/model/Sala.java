package webbioskop.model;

public class Sala {
	
	private String id;
	private String naziv;
	private String tipoviProjekcija;
	
	public Sala(String id, String naziv, String tipoviProjekcija) {
		this.id = id;
		this.naziv = naziv;
		this.tipoviProjekcija = tipoviProjekcija;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTipoviProjekcija() {
		return tipoviProjekcija;
	}

	public void setTipoviProjekcija(String tipoviProjekcija) {
		this.tipoviProjekcija = tipoviProjekcija;
	}
	
}