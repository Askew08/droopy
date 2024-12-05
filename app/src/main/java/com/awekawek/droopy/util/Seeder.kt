package com.awekawek.droopy.util

import com.awekawek.droopy.R
import com.awekawek.droopy.models.Product
import com.awekawek.droopy.util.Constants.MOBILE_LEGENDS
import com.awekawek.droopy.util.Constants.STEAM
import com.awekawek.droopy.util.Constants.VALORANT
import com.awekawek.droopy.util.Constants.HOK

class Seeder {

    fun fetchProducts(): MutableList<Product> {
        return mutableListOf(

            //region Steam
            Product(
                0,
                "Steam Wallet IDR",
                47500.00,
                "Steam Wallet Rp 45.000",
                R.drawable.steam,
                STEAM,
                "IDR 45K",
                true,
                "SWIDR1"
            ),

            Product(
                0,
                "Steam Wallet IDR",
                62500.00,
                "Steam Wallet Rp 60.000",
                R.drawable.steam,
                STEAM,
                "IDR 60K",
                true,
                "SWIDR2"
            ),

            Product(
                0,
                "Steam Walet",
                91000.00,
                "Steam Wallet Rp 90.000",
                R.drawable.steam,
                STEAM,
                "IDR 90K",
                true,
                "SWIDR3"
            ),

            Product(
                0,
                "Steam Walet",
                1001000.00,
                "Steam Wallet Rp 100.000",
                R.drawable.steam,
                STEAM,
                "IDR 100k",
                true,
                "SWID4"
            ),

            Product(
                0,
                "Steam Walet",
                1001000.00,
                "Steam Wallet Rp 150.000",
                R.drawable.steam,
                STEAM,
                "IDR 150k",
                true,
                "SWID5"
            ),

            //endregion

            //region ValoProduct
            Product(
                0,
                "Valo",
                150000.00,
                "Battlepass",
                R.drawable.valo_icon,
                VALORANT,
                "BP 1 Bulan",
                false,
                "VALO 1M"
            ),

            Product(
                0,
                "Valo",
                150000.00,
                "Battlepass",
                R.drawable.valo_icon,
                VALORANT,
                "BP 1 Bulan",
                false,
                "VALO 1M"
            ),

            Product(
                0,
                "Valo",
                150000.00,
                "Battlepass",
                R.drawable.valo_icon,
                VALORANT,
                "BP 1 Bulan",
                false,
                "VALO 1M"
            ),

            Product(
                0,
                "Valo",
                150000.00,
                "Battlepass",
                R.drawable.valo_icon,
                VALORANT,
                "BP 1 Bulan",
                false,
                "VALO 1M"
            ),

            //endregion

            //region MLProduct
            Product(
                0,
                "Mobel Lejen",
                90000.0,
                "Test Diamond",
                R.drawable.mlbb_icon,
                MOBILE_LEGENDS,
                "100 dmd",
                true,
                "Diamond 100"
            ),

            Product(
                0,
                "Mobel Lejen",
                90000.0,
                "Test Diamond",
                R.drawable.mlbb_icon,
                MOBILE_LEGENDS,
                "100 dmd",
                true,
                "Diamond 100"
            ),


            Product(
                0,
                "Mobel Lejen",
                90000.0,
                "Test Diamond",
                R.drawable.mlbb_icon,
                MOBILE_LEGENDS,
                "100 dmd",
                true,
                "Diamond 100"
            ),


            Product(
                0,
                "Mobel Lejen",
                90000.0,
                "Test Diamond",
                R.drawable.mlbb_icon,
                MOBILE_LEGENDS,
                "100 dmd",
                true,
                "Diamond 100"
            ),


            Product(
                0,
                "Mobel Lejen",
                90000.0,
                "Test Diamond",
                R.drawable.mlbb_icon,
                MOBILE_LEGENDS,
                "100 dmd",
                true,
                "Diamond 100"
            ),

            //endregion

            //region HoKProduct

            Product(
                0,
                "Honor Of Kingdom",
                100000.00,
                "Top-Up Item HoK",
                R.drawable.hok_icon,
                HOK,
                "ntahlah dak maen HoK",
                true,
                "HoK"
            ),

            Product(
                0,
                "Honor Of Kingdom",
                100000.00,
                "Top-Up Item HoK",
                R.drawable.hok_icon,
                HOK,
                "ntahlah dak maen HoK",
                true,
                "HoK"
            ),

            Product(
                0,
                "Honor Of Kingdom",
                100000.00,
                "Top-Up Item HoK",
                R.drawable.hok_icon,
                HOK,
                "ntahlah dak maen HoK",
                true,
                "HoK"
            ),

            Product(
                0,
                "Honor Of Kingdom",
                100000.00,
                "Top-Up Item HoK",
                R.drawable.hok_icon,
                HOK,
                "ntahlah dak maen HoK",
                true,
                "HoK"
            ),

            //endregion

        )
    }

}