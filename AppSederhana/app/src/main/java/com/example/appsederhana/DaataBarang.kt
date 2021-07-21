package com.example.appsederhana

import java.util.ArrayList

object DaataBarang {
    private val names = arrayOf(
        "Flasdisk",
        "Mouse Putih",
        "Headset",
        "Mouse Hiitam",
        "Laptop Keren",
        "Earphone",
        "Laptop Keren2",
        "Hp Kamera Banyak",
        "Hp Iphone",
        "Hp Nokia"
    )

    private val pricess = arrayOf(
        "Rp. 50.000",
        "Rp. 150.000",
        "Rp. 75.000",
        "Rp. 150.000",
        "Rp. 5.000.000",
        "Rp. 50.000",
        "Rp. 9.000.000",
        "Rp. 5.000.000",
        "Rp. 8.000.000",
        "Rp. 5.000.000"
    )

    private val images = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j
    )

    private val deskripsis = arrayOf(
            "Nikmati Kapasitas Yang Cukup Dan Portabilitas Maksimal\n" +
                    "Dengan desainnya yang stylish, ringkas dan kapasitas yang besar, Cruzer Blade USB Flash Drive memudahkan untuk mencadangkan, mentransfer, dan berbagi file Anda. Tersedia dalam kapasitas hingga 128GB, drive USB ini memungkinkan Anda membawa foto, film, musik, dan data pribadi ke mana pun Anda pergi.\n" +
                    "\n" +
                    "Desain yang ringkas untuk portabilitas maksimum\n" +
                    "Cruzer Blade USB Flash Drive memiliki desain yang ringkas yang pas dengan mudah ke dalam saku atau tas komputer. Drive USB ini memiliki desain warna kombinasi hitam dan merah ramping yang berkoordinasi dengan banyak perangkat elektronik.",
            "Alcatroz Asic Pro 8 mouse yang memiliki 4 tombol dengan high speed blue ray optikal yang responsif saat digunakan menjadikan pilihan yang tepat dan bisa diandalkan untuk produktivitas tinggi pada layar yang besar\n" +
                    "\n" +
                    "Garansi : 2 Tahun",
            "Fitur-fitur headphone ini :\n" +
                    "- Sangat nyaman digunakan karena over the ear dan sangat ringan\n" +
                    "- Sistem headband yang diperbaharui sehingga bobot headset yang ringan terdistribusi dengan sempurna\n" +
                    "- Karakter suara yang disesuaikan dengan keperluan gaming",
            "Alcatroz Asic Pro 8 mouse yang memiliki 4 tombol dengan high speed blue ray optikal yang responsif saat digunakan menjadikan pilihan yang tepat dan bisa diandalkan untuk produktivitas tinggi pada layar yang besar\\n\" +\n" +
                    "\n" +
                    "Garansi : 2 Tahun",
            "OS : Windows 10 Home + OFFICE HOME STUDENT 2019\n" +
                    "Processor : Intel® Core™ i5-1135G7 Processor 2.4 GHz (8M Cache, up to 4.2 GHz, 4 cores)\n" +
                    "RAM : 8GB LPDDR4X on board\n" +
                    "Storage : 512GB M.2 NVMe™ PCIe® 3.0 SSD\n" +
                    "Display : 13.3\" FHD (1920 x 1080) 16:9 IPS-level Panel\n" +
                    "Graphic Card : Intel® IrisXe 80EU\n" +
                    "Onboard Wireless : 802.11ax+Bluetooth 5.0 (Dual band) 2*2\n" +
                    "I/O Ports : 1x HDMI 1.4//1x USB 3.2 Gen 1 Type-A\n" +
                    "AC Adapter : TYPE-C, 65W AC Adapter, Output: 19V DC, 3.42A, 65W, Input: 100~240V AC 50/60Hz universal\n" +
                    "Battery : 67WHrs, 4S1P, 4-cell Li-ion\n" +
                    "Keyboard : Backlit Chiclet Keyboard\n" +
                    "Touchscreen : YES\n" +
                    "Support NumberPad : YES",
            "Suara stereo 360 derajat，suara lebih original. Kualitas suara berbagai jenis musik luar biasa\n" +
                    "Warna: Yellow，White，Blue，Pink，Red，Light blue，Black，Miet green\n" +
                    "Earphone tanpa kebisingan, suara lebih jernih\n" +
                    "\n" +
                    "Suara stereo 360 derajat，suara lebih original. Kualitas suara berbagai jenis musik luar biasa\n" +
                    "Earbud ergonomis agar nyaman dipakai\n" +
                    "Steker standar, kompatibel dengan beberapa perangkat\n" +
                    "Kabel headphone kokoh dan tahan lama.",
            "Tersedia dalam warna perak, abu-abu, dan emas, MacBook Air terbaru memiliki layar Retina yang menakjubkan dengan teknologi True Tone, Touch ID, Magic Keyboard dengan lampu latar, dan trackpad Force Touch — semuanya dikemas dalam desain tipis dan ringan yang memiliki lekukan ikonik dan terbuat dari 100 persen aluminium hasil daur ulang.(2) Dan dengan kekuatan baterai 11 jam, laptop serbaguna ini siap menemani Anda sepanjang hari (1).\n" +
                    "\n" +
                    "• Layar Retina 13,3 inci yang menakjubkan dengan teknologi True Tone (3)\n" +
                    "• Magic Keyboard dengan lampu latar dan Touch ID\n" +
                    "• Prosesor Intel Core i3 atau i5 generasi kesepuluh\n" +
                    "• Intel Iris Plus Graphics\n" +
                    "• Penyimpanan SSD cepat\n" +
                    "• Memori 8 GB\n" +
                    "• Speaker stereo dengan suara stereo yang lebih luas\n" +
                    "• Dua port Thunderbolt 3 (USB-C)\n" +
                    "• Kekuatan baterai hingga 11 jam(1)\n" +
                    "• Trackpad Force Touch\n" +
                    "• Wi-Fi 802.11ac\n" +
                    "• Tersedia dalam warna emas, abu-abu, dan perak\n" +
                    "• MacOS versi terbaru\n",
            "Processor Qualcomm® Snapdragon™ 720G\n" +
                    "CPU：8nm, Octa-core, Up to 2.3GHz\n" +
                    "GPU：Adreno 618\n" +
                    "AIE：5th Generation Qualcomm AI Engine\n" +
                    "\n" +
                    "Storage &amp; RAM 8GB + 128GB",
            "iPhone 12. Layar Super Retina XDR 6,1 inci yang begitu cerah.(1) Ceramic Shield dengan ketahanan jatuh empat kali lebih baik.(2)Fotografi pencahayaan rendah yang menakjubkan dengan mode Malam di semua kamera. Mampu merekam, mengedit, dan memutar video sekelas sinema dengan Dolby Vision. Chip A14 Bionic yang andal. Dan aksesori MagSafe baru untuk kemudahan pemasangan dan pengisian daya nirkabel yang lebih cepat.(3)Saatnya bersenang-senang.\n" +
                    "\n" +
                    "Isi Kotak :\n" +
                    "• iPhone dengan iOS 14.\n" +
                    "• Kabel USB-C ke Lightning.\n" +
                    "• Buku Manual dan Dokumentasi lain.",
            "Nokia 5.4\n" +
                    "Ciptakan momen yang tak terlupakan dengan Nokia 5.4. Quad camera 48MP memberikan keleluasaan untuk berkreasi sepenuhnya – dengan perekaman video canggih dan efek sinematik, Anda dapat mengabadikan dunia Anda dalam detail yang menakjubkan. Lakukan lebih banyak hal yang Anda suka berkat daya tahan baterai 2 hari 1 dan Qualcomm® Snapdragon™ 662 yang efisien – kinerja yang dapat Anda andalkan. Selalu terdepan dengan ponsel yang siap untuk Android 11 dan selanjutnya, sehingga Anda dapat bekerja dan bermain, sesuka Anda."

    )


    val listData: ArrayList<Barang>
        get() {
            val list = arrayListOf<Barang>()
            for (position in names.indices) {
                val data = Barang()
                data.nama = names[position]
                data.harga = pricess[position]
                data.poto = images[position]
                data.desk = deskripsis[position]
                list.add(data)
            }
            return list
        }

}