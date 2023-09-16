package dicoding.submission.topmanga.data.repository.manga

import dicoding.submission.topmanga.data.model_source.Manga

interface MangaRepository {
    fun getListManga() : List<Manga>
    fun getDetailManga(id: Int) : Manga?
}