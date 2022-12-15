package com.example.recyclerview.models

import com.example.recyclerview.R

class DataSource {
    companion object{
        fun createDataSet() : ArrayList<Profile> {
            val list = ArrayList<Profile>()

            list.add(
                Profile(
                    " ",
                    " ",
                    R.drawable.img,
                    " ",
                    ""
                )
            )
            return list
        }
    }
}