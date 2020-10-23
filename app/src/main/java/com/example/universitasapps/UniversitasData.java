package com.example.universitasapps;

import java.util.ArrayList;

public class UniversitasData {
    private static String[] univNames = {
            "Universitas Islam Indonesia",
            "Universitas Atma Jaya Yogyakarta",
            "Universitas Islam Negeri Sunan Kalijaga",
            "Universitas Ahmad Dahlan",
            "Universitas Teknologi Yogyakarta",
            "Universitas Negri Yogyakarta",
            "Universitas Muhamaddiyah Yogyakrat",
            "Universitas Sana Darma",
            "Universitas Kristen Duta Wacana",
            "Universitas Amikom Yogyakarta"
    };

    private static String[] univDetails = {
            "Universitas Islam Indonesia disingkat UII adalah perguruan tinggi swasta nasional tertua di Indonesia yang terletak di Yogyakarta. UII semula bernama Sekolah Tinggi Islam yang didirikan di Jakarta pada hari Ahad tanggal 27 Rajab 1364 H bertepatan dengan tanggal 8 Juli 1945 M.",
            "Universitas Atma Jaya Yogyakarta, didirikan 27 September 1965 oleh Yayasan Slamet Rijadi Yogyakarta. Lima orang pendiri Universitas Atma Jaya Yogyakarta adalah: Prof. R.A. Soehardi, S.H. Drs. A.J. Liem Sioe Siet A., Sutijoso, S.H. Prof. Drs. Oey Liang Lee Dr. Leo Sukoto, S.J.",
            "Universitas Islam Negeri Sunan Kalijaga, sering disingkat UIN Suka, adalah Perguruan Tinggi Agama Islam Negeri pertama di Indonesia. Nama UIN Sunan Kalijaga diambil dari salah satu kelompok penyebar agama Islam di Jawa, Walisongo yaitu Sunan Kalijaga.",
            "Universitas Ahmad Dahlan adalah sebuah perguruan tinggi swasta di Yogyakarta, Indonesia.Di dirikan pada tanggal 18 November 1960. Universitas Ahmad Dahlan mengembangkan bidang keahlian atau program studi-program studi dalam bidang teknologi maupun bidang sosial dan humaniora.",
            "Universitas Teknologi Yogyakarta atau biasa disingkat UTY adalah salah satu perguruan tinggi swasta terbaik yang berbentuk universitas di Provinsi Daerah Istimewa Yogyakarta (DIY), Universitas ini diselenggarakan oleh Yayasan Dharma Bhakti IPTEK, Bediri pada 23 Oktober 2002 dengan penggabungan tiga perguruan tinggi melalui Surat Keterangan Menteri Pendidikan Nasional RI No 237/D/0/2002 tertanggal 23 Oktober 2002.",
            "Universitas Negeri Yogyakarta disingkat UNY, merupakan salah satu Perguruan Tinggi Negeri yang terletak di Yogyakarta, Indonesia. Sebelumnya Universitas Negeri Yogyakarta bernama Institut Keguruan dan Ilmu Pendidikan Yogyakarta.",
            "Universitas Muhammadiyah Yogyakarta adalah salah satu perguruan tinggi di Yogyakarta yang beralamat di Kampus Terpadu Universitas Muhammadiyah Yogyakarta, Jalan Brawijaya, Kasihan, Bantul, DI Yogyakarta. Universitas Muhammadiyah Yogyakarta terakreditasi A berdasarkan Keputusan BAN-PT No.",
            "Universitas Sanata Dharma adalah universitas Katolik yang berlokasi di Yogyakarta. Dikenal juga dengan sebutan USD dan Sadhar. Sanata Dharma dibaca Sanyata Dharma, yang berarti \"kebaktian yang sebenarnya\" atau \"pelayanan yang nyata\". Kebaktian dan pelayanan itu ditujukan kepada tanah air dan gereja.",
            "Universitas Kristen Duta Wacana didirikan pada tahun 1985 sebagai pengembangan dari Sekolah Tinggi Theologia Duta Wacana. Sekolah Tinggi Theologia Duta Wacana didirikan pada tahun 1962 sebagai penggabungan dari Akademi Theologia Jogjakarta dan Sekolah Theologia Bale Wiyata, Malang.",
            "Universitas AMIKOM Yogyakarta adalah perguruan tinggi IT swasta di Yogyakarta, Indonesia. Perguruan tinggi ini didirikan pada 29 Desember 1992, di bawah naungan Yayasan AMIKOM Yogyakarta. Memiliki 2 program diploma, 13 program sarjana, dan 1 program pascasarjana."
    };

    private static int[] universImages = {
            R.drawable.uii,
            R.drawable.uajy,
            R.drawable.uin,
            R.drawable.uad,
            R.drawable.uty,
            R.drawable.uny,
            R.drawable.umy,
            R.drawable.usd,
            R.drawable.ukdw,
            R.drawable.amikom
    };

    static ArrayList<Universitas> getListData() {
        ArrayList<Universitas> list = new ArrayList<>();
        for (int position = 0; position < univNames.length; position++) {
            Universitas universitas = new Universitas();
            universitas.setName(univNames[position]);
            universitas.setDetail(univDetails[position]);
            universitas.setPhoto(universImages[position]);
            list.add(universitas);
        }
        return list;
    }
}
