package webbioskop.model;

public class TipProjekcije {
	private String id;
	private String naziv;
	
	public TipProjekcije(String id, String naziv) {
		this.id = id;
		this.naziv = naziv;
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
	
}