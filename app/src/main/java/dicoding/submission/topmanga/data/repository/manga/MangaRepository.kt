package dicoding.submission.topmanga.data.repository.manga

import dicoding.submission.topmanga.data.model_source.MangaSource

interface MangaRepository {
    fun getListManga() : List<MangaSource>
    fun getDetailManga(id: Int) : MangaSource?
}