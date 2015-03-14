package id.ac.ump.ppp.datacentre.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
public class Gedung {

	@Id
	@GeneratedValue
	private Integer id;

	private String kodeGedung;

	private String namaGedung;

	private String namaLain;

	private String kegunaan;

	@Temporal(TemporalType.DATE)
	private Date tahunBerdiri;

	@Temporal(TemporalType.DATE)
	private Date tahunSurvey;

	private Double luasGedung;
	
	@Lob
	@Column(length = Integer.MAX_VALUE)
	@Type(type = "org.hibernate.type.StringClobType")
	private String lokasiGedung;

	private JenisGedung jenisGedung;

	public enum JenisGedung {
		BERTINGKAT, TIDAK_BERTINGKAT
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKodeGedung() {
		return kodeGedung;
	}

	public void setKodeGedung(String kodeGedung) {
		this.kodeGedung = kodeGedung;
	}

	public String getNamaGedung() {
		return namaGedung;
	}

	public void setNamaGedung(String namaGedung) {
		this.namaGedung = namaGedung;
	}

	public String getNamaLain() {
		return namaLain;
	}

	public void setNamaLain(String namaLain) {
		this.namaLain = namaLain;
	}

	public String getKegunaan() {
		return kegunaan;
	}

	public void setKegunaan(String kegunaan) {
		this.kegunaan = kegunaan;
	}

	public Date getTahunBerdiri() {
		return tahunBerdiri;
	}

	public void setTahunBerdiri(Date tahunBerdiri) {
		this.tahunBerdiri = tahunBerdiri;
	}

	public Date getTahunSurvey() {
		return tahunSurvey;
	}

	public void setTahunSurvey(Date tahunSurvey) {
		this.tahunSurvey = tahunSurvey;
	}

	public Double getLuasGedung() {
		return luasGedung;
	}

	public void setLuasGedung(Double luasGedung) {
		this.luasGedung = luasGedung;
	}

	public JenisGedung getJenisGedung() {
		return jenisGedung;
	}

	public void setJenisGedung(JenisGedung jenisGedung) {
		this.jenisGedung = jenisGedung;
	}

	public String getLokasiGedung() {
		return lokasiGedung;
	}

	public void setLokasiGedung(String lokasiGedung) {
		this.lokasiGedung = lokasiGedung;
	}

}