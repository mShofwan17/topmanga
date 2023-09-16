package dicoding.submission.topmanga.data.repository.manga

import dicoding.submission.topmanga.data.data_source.DataSource
import dicoding.submission.topmanga.data.model_source.Manga

class MangaRepositoryImpl() : MangaRepository {
    private val dataSource = DataSource
    override fun getListManga(): List<Manga> {
        return dataSource.getMangaData()
    }

    override fun getDetailManga(id: Int): Manga? {
        return dataSource.getMangaData().find { it.id == id }
    }

}