package dicoding.submission.topmanga.domain.usecase

import dicoding.submission.topmanga.data.model_source.Manga
import dicoding.submission.topmanga.data.repository.manga.MangaRepository
import dicoding.submission.topmanga.data.repository.manga.MangaRepositoryImpl

class GetDetailMangaUseCase  {
    private val repository : MangaRepository = MangaRepositoryImpl()
    operator fun invoke(id : Int) : Manga? {
        return repository.getDetailManga(id)
    }
}