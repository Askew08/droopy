package com.awekawek.droopy.util

import com.awekawek.droopy.R
import com.awekawek.droopy.models.Product
import com.awekawek.droopy.util.Constants.GRAPHIC_CARDS
import com.awekawek.droopy.util.Constants.MONITORS
import com.awekawek.droopy.util.Constants.PROCESSORS
import com.awekawek.droopy.util.Constants.STORAGE

class Seeder {

    fun fetchProducts(): MutableList<Product> {
        return mutableListOf(

            //region Steam
            Product(
                0,
                "Steam Walet",
                47500.00,
                "Test Waller",
                R.drawable.steam,
                MONITORS,
                "45k",
                true,
                "Steam45k"
            ),

            Product(
                0,
                "Steam Walet",
                47500.00,
                "Test Waller",
                R.drawable.steam,
                MONITORS,
                "45k",
                true,
                "Steam45k"
            ),

            Product(
                0,
                "Steam Walet",
                47500.00,
                "Test Waller",
                R.drawable.steam,
                MONITORS,
                "45k",
                true,
                "Steam45k"
            ),

            Product(
                0,
                "Steam Walet",
                47500.00,
                "Test Waller",
                R.drawable.steam,
                MONITORS,
                "45k",
                true,
                "Steam45k"
            ),

            Product(
                0,
                "Steam Walet",
                47500.00,
                "Test Waller",
                R.drawable.steam,
                MONITORS,
                "45k",
                true,
                "Steam45k"
            ),

            //endregion

            //region ValoProduct
            Product(
                0,
                "Valo",
                150000.00,
                "Battlepass",
                R.drawable.valo_icon,
                PROCESSORS,
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
                PROCESSORS,
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
                PROCESSORS,
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
                PROCESSORS,
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
                GRAPHIC_CARDS,
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
                GRAPHIC_CARDS,
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
                GRAPHIC_CARDS,
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
                GRAPHIC_CARDS,
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
                GRAPHIC_CARDS,
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
                STORAGE,
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
                STORAGE,
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
                STORAGE,
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
                STORAGE,
                "ntahlah dak maen HoK",
                true,
                "HoK"
            ),

            //endregion

        )
    }

}