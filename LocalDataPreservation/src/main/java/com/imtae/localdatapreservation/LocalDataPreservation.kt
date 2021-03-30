package com.imtae.localdatapreservation

import java.lang.Exception

class LocalDataPreservation {

    companion object {

        private var instance: LocalDataPreservation? = null

        val setData: MutableMap<String, Any> =
            if (instance == null) {
                instance = LocalDataPreservation()
                instance!!.data
            } else instance!!.data

        fun getData(key: String) : Any {

            for (i in setData)
                if (i.key == key)
                    return i.value

            // throw Exception("LocalDataPreservation | 존재하지 않는 Key 입니다.")
            return ""
        }
    }

    private val data : MutableMap<String, Any> = mutableMapOf()
}