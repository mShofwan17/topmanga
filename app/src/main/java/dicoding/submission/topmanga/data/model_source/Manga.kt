package dicoding.submission.topmanga.data.model_source

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Manga(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val score: Double,
    val synopsys: String? = "",
    val author: String,
    val published: Int,
    val genres: List<String> = emptyList(),
    val characters: List<Character> = emptyList()
) : Parcelable
