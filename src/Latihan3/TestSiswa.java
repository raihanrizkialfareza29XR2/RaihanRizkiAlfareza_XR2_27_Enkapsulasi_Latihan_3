package Latihan3;

public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");

        System.out.println("Nama : " + siswa.getName());
        System.out.println("Absen : " + siswa.getAbsen());
        System.out.println("Address : " + siswa.getAddress());

        //Outputnya adalah dapat menampilkan nama, no. absen, dan alamat siswa. Dikarenakan parameter yang ada pada
        //void setName, setAbsen, dan setAddress di kelas EncapSiswa sudah diisikan pada method main di kelas TestSiswa.
        //Lalu dipanggil dengan menggunakan method non void yang telah dibuat. Seperti getName, getAbsen, dan getAdress.
    }
}
