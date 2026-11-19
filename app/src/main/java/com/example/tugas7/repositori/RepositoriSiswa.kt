package com.example.tugas7.repositori

import com.example.tugas7.room.Siswa
import com.example.tugas7.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>

    fun getSiswaStream(id: Int): Flow<Siswa?>

    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
) : RepositoriSiswa {

    override fun getAllSiswaStream(): Flow<List<Siswa>> =
        siswaDao.getAllSiswa()

    override fun getSiswaStream(id: Int): Flow<Siswa?> =
        siswaDao.getSiswa(id)

    override suspend fun insertSiswa(siswa: Siswa) =
        siswaDao.insert(siswa)
}