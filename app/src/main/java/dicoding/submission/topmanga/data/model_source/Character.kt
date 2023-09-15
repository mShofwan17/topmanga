package dicoding.submission.topmanga.data.model_source

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val name: String,
    val imageUrl: String
) : Parcelable