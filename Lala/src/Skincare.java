
public class Skincare {
	//Parameter
	String namapembeli;
	String tanggal;
	String jumlah;
	String Merk;
	String produk;
	String Bonus;
	String harga;
	@Override
	public String toString() {
		return "Skincare [namapembeli=" + namapembeli + ", tanggal=" + tanggal + ", jumlah=" + jumlah + ", Merk=" + Merk
				+ ", produk=" + produk + ", Bonus=" + Bonus + ", harga=" + harga + "]";	
	}
	public Skincare(String namapembeli, String tanggal, String jumlah, String merk, String produk, String bonus,
			String harga) {
		//Constructor
		super();
		this.namapembeli = namapembeli;
		this.tanggal = tanggal;
		this.jumlah = jumlah;
		Merk = merk;
		this.produk = produk;
		Bonus = bonus;
		this.harga = harga;
		
		//Getter and Setters
	}
	public String getNamapembeli() {
		return namapembeli;
	}
	public void setNamapembeli(String namapembeli) {
		this.namapembeli = namapembeli;
	}
	public String getTanggal() {
		return tanggal;
	}
	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}
	public String getJumlah() {
		return jumlah;
	}
	public void setJumlah(String jumlah) {
		this.jumlah = jumlah;
	}
	public String getMerk() {
		return Merk;
	}
	public void setMerk(String merk) {
		Merk = merk;
	}
	public String getProduk() {
		return produk;
	}
	public void setProduk(String produk) {
		this.produk = produk;
	}
	public String getBonus() {
		return Bonus;
	}
	public void setBonus(String bonus) {
		Bonus = bonus;
	}
	public String getHarga() {
		return harga;
	}
	public void setHarga(String harga) {
		this.harga = harga;
	}
	
}
