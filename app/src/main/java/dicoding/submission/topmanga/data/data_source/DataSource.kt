package dicoding.submission.topmanga.data.data_source

import dicoding.submission.topmanga.data.model_source.Manga
import dicoding.submission.topmanga.data.model_source.Profile

object DataSource {
    fun getMangaData(): List<Manga> {

        val items = mutableListOf<Manga>()
        MangaSource.apply {
            items.addAll(
                listOf(
                    mgBerserk,
                    mgJojo,
                    mgVagabond,
                    mgOnePiece,
                    mgMonster,
                    mushishi,
                    hxh,
                    fmab,
                    oyasumiPunpun,
                    deathNote,
                    opm,
                    vindlandSaga
                )
            )
        }

        return items
    }

    fun getProfile(): Profile {
        return Profile(
            name = "Muhammad Shofwan",
            email = "mshofwan.dev@gmail.com",
            imgUrl = "https://media.licdn.com/dms/image/D5603AQHyOZPXb5UiuA/profile-displayphoto-shrink_400_400/0/1694742653536?e=1700092800&v=beta&t=myPONM2KN3QDIbExSKqhwSKg3_5qvdIJEkMUuagvI1I"
        )
    }

}