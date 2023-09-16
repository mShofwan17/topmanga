package dicoding.submission.topmanga.domain.usecase

import dicoding.submission.topmanga.data.model_source.Manga
import dicoding.submission.topmanga.data.model_source.Profile
import dicoding.submission.topmanga.data.repository.manga.MangaRepository
import dicoding.submission.topmanga.data.repository.manga.MangaRepositoryImpl
import dicoding.submission.topmanga.data.repository.profile.ProfileRepository
import dicoding.submission.topmanga.data.repository.profile.ProfileRepositoryImpl

class GetProfileUseCase  {
    private val repository : ProfileRepository = ProfileRepositoryImpl()
    operator fun invoke() : Profile {
        return repository.getProfile()
    }
}