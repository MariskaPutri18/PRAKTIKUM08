class Belanja18 {
    String nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHargaBayar;

    public Belanja18 (String nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHargaBayar) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHargaBayar = totalHargaBayar;
    }

    public String toString() {
        return "Nomor Transaksi: " + nomorTransaksi +
               ", Tanggal Pembelian: " + tanggalPembelian +
               ", Jumlah Barang: " + jumlahBarang +
               ", Total Harga Bayar: " + totalHargaBayar;
    }
}