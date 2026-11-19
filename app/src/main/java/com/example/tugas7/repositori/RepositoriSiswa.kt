package com.example.tugas7.repositori

import com.example.tugas7.room.Siswa
import com.example.tugas7.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
}