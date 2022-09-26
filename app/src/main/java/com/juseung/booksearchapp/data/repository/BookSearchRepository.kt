package com.juseung.booksearchapp.data.repository

import androidx.lifecycle.LiveData
import com.juseung.booksearchapp.data.model.Book
import com.juseung.booksearchapp.data.model.SearchResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface BookSearchRepository {

    suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int,
    ): Response<SearchResponse>


    //Room
    suspend fun insertBooks(book: Book)

    suspend fun deleteBooks(book: Book)

    fun getFavoriteBooks(): LiveData<List<Book>>

    suspend fun saveSortMode(mode: String)

    suspend fun getSortMode(): Flow<String>
}