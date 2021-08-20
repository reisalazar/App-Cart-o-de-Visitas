package br.com.dio.bussinesscard.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository(private val dao: BusinessCardDao) {

    fun insert(businesscard: BusinessCard) = runBlocking {
        launch(Dispatchers.IO) {
            dao.insert(businesscard)
        }
    }

    fun getAll() = dao.getAll()

}