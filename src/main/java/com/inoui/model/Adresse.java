package com.inoui.model;

import javax.persistence.*;

@Embeddable
public class Adresse {
	
    String adresse;
    public void setAdresse(String v) {adresse = v;}
    public String getAdresse() {return adresse;}

    @Column(name="code_postal")
    Integer codePostal;
    public void setCodePostal(Integer v) {codePostal = v;}
    public Integer getCodePostal() {return codePostal;}

    String ville;
    public void setVille(String v) {ville = v;}
    public String getVille() {return ville;}
    
    String pays;
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
    
	
	

}
