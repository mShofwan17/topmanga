package dicoding.submission.topmanga.data.repository.profile

import dicoding.submission.topmanga.data.model_source.Profile

interface ProfileRepository {
    fun getProfile() : Profile
}