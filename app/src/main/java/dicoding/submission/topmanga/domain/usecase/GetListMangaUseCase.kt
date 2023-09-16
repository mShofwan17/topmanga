package dicoding.submission.topmanga.domain.usecase

import dicoding.submission.topmanga.data.repository.manga.MangaRepository
import dicoding.submission.topmanga.data.repository.manga.MangaRepositoryImpl
import dicoding.submission.topmanga.domain.model.HomeManga

class GetListMangaUseCase {
    private val repository : MangaRepository = MangaRepositoryImpl()

    operator fun invoke() : List<HomeManga> {
        val result = repository.getListManga().map {
            HomeManga(
                id = it.id,
                name = it.name,
                imageUrl = it.imageUrl,
                desc = it.synopsys,
                score = it.score
            )
        }

        return result.sortedByDescending { it.score }
    }
}