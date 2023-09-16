package dicoding.submission.topmanga.domain.model

data class HomeManga (
    val id: Int,
    val name: String,
    val imageUrl: String,
    val desc: String? = "",
    val score: Double
)