package dicoding.submission.topmanga.data.repository.profile

import dicoding.submission.topmanga.data.data_source.DataSource
import dicoding.submission.topmanga.data.model_source.Profile

class ProfileRepositoryImpl : ProfileRepository {
    val dataSource = DataSource

    override fun getProfile(): Profile {
        return dataSource.getProfile()
    }
}