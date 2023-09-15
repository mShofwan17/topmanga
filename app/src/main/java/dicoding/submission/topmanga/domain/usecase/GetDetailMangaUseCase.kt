package dicoding.submission.topmanga.domain.usecase

import dicoding.submission.topmanga.data.model_source.MangaSource
import dicoding.submission.topmanga.data.repository.manga.MangaRepository
import dicoding.submission.topmanga.data.repository.manga.MangaRepositoryImpl

class GetDetailMangaUseCase {
    private val repository : MangaRepository = MangaRepositoryImpl()
    operator fun invoke(id : Int) : MangaSource? {
        return repository.getDetailManga(id)
    }
}