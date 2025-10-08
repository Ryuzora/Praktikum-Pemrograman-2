public class Buah {
  String nama;
  double berat;
  double harga;
  double jumlah;
  double diskon;
  double hargaTotal;

	public Buah(String nama, double berat, double harga, double jumlah) {
    this.nama = nama;
    this.berat = berat;
    this.harga = harga;
    this.jumlah = jumlah;
    this.diskon = diskon;
    this.diskon = (int)(jumlah/4) * 0.02 * 4 * harga;
    this.hargaTotal = jumlah / berat * harga;
	}
  void print(){
    System.out.println("Nama Buah: " + nama);
    System.out.println("Berat: " + berat);
    System.out.println("Harga: " + harga);
    System.out.println("Jumlah Beli: " + jumlah + "kg");
    System.out.printf("Harga Sebelum Diskon: %.2f\n", hargaTotal);
    System.out.printf("Total Diskon: %.2f\n", diskon);
    System.out.printf("Harga Setelah Diskon: %.2f\n", (hargaTotal - diskon));
    System.out.println();
  }
}