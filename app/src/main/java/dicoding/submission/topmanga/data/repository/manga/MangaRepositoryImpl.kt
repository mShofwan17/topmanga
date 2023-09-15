package dicoding.submission.topmanga.data.repository.manga

import dicoding.submission.topmanga.data.data_source.DataSource
import dicoding.submission.topmanga.data.model_source.MangaSource

class MangaRepositoryImpl() : MangaRepository {
    private val dataSource = DataSource
    override fun getListManga(): List<MangaSource> {
        return dataSource.getMangaData()
    }

    override fun getDetailManga(id: Int): MangaSource? {
        return dataSource.getMangaData().find { it.id == id }
    }

}