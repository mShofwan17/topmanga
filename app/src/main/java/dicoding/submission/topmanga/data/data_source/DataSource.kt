package dicoding.submission.topmanga.data.data_source

import dicoding.submission.topmanga.data.model_source.Character
import dicoding.submission.topmanga.data.model_source.MangaSource
import dicoding.submission.topmanga.data.model_source.Profile

object DataSource {
    fun getMangaData(): List<MangaSource> {
        val items = mutableListOf<MangaSource>()
        items.add(mgBerserk)
        items.add(mgJojo)
        items.add(mgVagabond)
        items.add(mgOnePiece)
        items.add(mgMonster)
        return items
    }

    fun getProfile(): Profile {
        return Profile(
            name = "Muhammad Shofwan",
            email = "mshofwan.dev@gmail.com",
            imgUrl = "https://media.licdn.com/dms/image/D5603AQHyOZPXb5UiuA/profile-displayphoto-shrink_400_400/0/1694742653536?e=1700092800&v=beta&t=myPONM2KN3QDIbExSKqhwSKg3_5qvdIJEkMUuagvI1I"
        )
    }

    private val temp: MangaSource = MangaSource(
        id = 1,
        name = "",
        imageUrl = "",
        score = 0.0,
        synopsys = "",
        author = "",
        genres = listOf(
            "" , "", "", "", "", ""
        ),
        characters = listOf(
            Character(
                name = "",
                imageUrl = ""
            ),
            Character(
                name = "",
                imageUrl = ""
            ),
            Character(
                name = "",
                imageUrl = ""
            ),
        )
    )
    private val mgBerserk: MangaSource = MangaSource(
        id = 1,
        name = "Berserk",
        imageUrl = "https://cdn.myanimelist.net/images/manga/1/157897.jpg",
        score = 9.74,
        synopsys = "Guts, a former mercenary now known as the \"Black Swordsman,\" is out for revenge. After a tumultuous childhood, he finally finds someone he respects and believes he can trust, only to have everything fall apart when this person takes away everything important to Guts for the purpose of fulfilling his own desires. Now marked for death, Guts becomes condemned to a fate in which he is relentlessly pursued by demonic beings.\n" +
                "\n" +
                "Setting out on a dreadful quest riddled with misfortune, Guts, armed with a massive sword and monstrous strength, will let nothing stop him, not even death itself, until he is finally able to take the head of the one who stripped him—and his loved one—of their humanity.",
        author = "Miura, Kentarou",
        genres = listOf(
            "Action" , "Adventure", "Drama", "Fantasy", "Horor"
        ),
        characters = listOf(
            Character(
                name = "Guts",
                imageUrl = ""
            ),
            Character(
                name = "Griffith",
                imageUrl = ""
            ),
            Character(
                name = "Casca",
                imageUrl = ""
            ),
        )
    )

    private val mgJojo: MangaSource = MangaSource(
        id = 2,
        name = "JoJo no Kimyou na Bouken Part 7: Steel Ball Run",
        imageUrl = "https://cdn.myanimelist.net/images/manga/3/179882.jpg",
        score = 9.30,
        synopsys = "In the American Old West, the world's greatest race is about to begin. Thousands line up in San Diego to travel over six thousand kilometers for a chance to win the grand prize of fifty million dollars. With the era of the horse reaching its end, contestants are allowed to use any kind of vehicle they wish. Competitors will have to endure grueling conditions, traveling up to a hundred kilometers a day through uncharted wastelands. The Steel Ball Run is truly a one-of-a-kind event.\n" +
                "\n" +
                "The youthful Johnny Joestar, a crippled former horse racer, has come to San Diego to watch the start of the race. There he encounters Gyro Zeppeli, a racer with two steel balls at his waist instead of a gun. Johnny witnesses Gyro using one of his steel balls to unleash a fantastical power, compelling a man to fire his gun at himself during a duel. In the midst of the action, Johnny happens to touch the steel ball and feels a power surging through his legs, allowing him to stand up for the first time in two years. Vowing to find the secret of the steel balls, Johnny decides to compete in the race, and so begins his bizarre adventure across America on the Steel Ball Run.",
        author = "Araki, Hirohiko",
        genres = listOf(
            "Action" , "Adventure", "Mystery", "Supernatural"
        ),
        characters = listOf(
            Character(
                name = "Zeppeli, Gyro",
                imageUrl = "https://cdn.myanimelist.net/images/characters/13/311885.jpg"
            ),
            Character(
                name = "Joestar, Johnny",
                imageUrl = "https://cdn.myanimelist.net/images/characters/16/337509.jpg"
            ),
            Character(
                name = "Valentine, Funny",
                imageUrl = "https://cdn.myanimelist.net/images/characters/16/286913.jpg"
            ),
        )
    )

    private val mgVagabond: MangaSource = MangaSource(
        id = 3,
        name = "Vagabond",
        imageUrl = "https://myanimelist.net/manga/656/Vagabond/pics",
        score = 9.24,
        synopsys = "In 16th-century Japan, Shinmen Takezou is a wild, rough young man, in both his appearance and his actions. His aggressive nature has won him the collective reproach and fear of his village, leading him and his best friend, Matahachi Honiden, to run away in search of something grander than provincial life. The pair enlist in the Toyotomi army, yearning for glory—but when the Toyotomi suffer a crushing defeat at the hands of the Tokugawa Clan at the Battle of Sekigahara, the friends barely make it out alive.\n" +
                "\n" +
                "After the two are separated, Shinmen returns home on a self-appointed mission to notify the Hon'iden family of Matahachi's survival. He instead finds himself a wanted criminal, framed for his friend's supposed murder based on his history of violence. Upon being captured, he is strung up on a tree and left to die. An itinerant monk, the distinguished Takuan Soho, takes pity on the \"devil child,\" secretly freeing Shinmen and christening him with a new name to avoid pursuit by the authorities: Musashi Miyamoto.\n" +
                "\n" +
                "Vagabond is the fictitious retelling of the life of one of Japan's most renowned swordsmen, the \"Sword Saint\" Musashi Miyamoto—his rise from a swordsman with no desire other than to become \"Invincible Under the Heavens\" to an enlightened warrior who slowly learns of the importance of close friends, self-reflection, and life itself.",
        author = "Inoue, Takehiko",
        genres = listOf(
            "Action" , "Adventure", "Award Winning"
        ),
        characters = listOf(
            Character(
                name = "Miyamoto, Musashi",
                imageUrl = "https://cdn.myanimelist.net/images/characters/11/348750.jpg"
            ),
            Character(
                name = "Sasaki, Kojirou",
                imageUrl = "https://cdn.myanimelist.net/images/characters/14/76211.jpg"
            ),
            Character(
                name = "Honiden, Matahachi",
                imageUrl = "https://cdn.myanimelist.net/images/characters/3/63969.jpg"
            ),
        )
    )

    private val mgOnePiece: MangaSource = MangaSource(
        id = 4,
        name = "One Piece",
        imageUrl = "https://cdn.myanimelist.net/images/manga/2/253146.jpg",
        score = 9.22,
        synopsys = "Gol D. Roger, a man referred to as the \"King of the Pirates,\" is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the King of the Pirates is executed and the Great Age of Pirates begins.\n" +
                "\n" +
                "Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new King of the Pirates. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas.\n",
        author = "Oda, Eiichiro",
        genres = listOf(
            "Action" , "Adventure", "Fantasy"
        ),
        characters = listOf(
            Character(
                name = "Monkey D., Luffy",
                imageUrl = "https://cdn.myanimelist.net/images/characters/9/310307.jpg"
            ),
            Character(
                name = "Roronoa, Zoro",
                imageUrl = "https://cdn.myanimelist.net/images/characters/3/100534.jpg"
            ),
            Character(
                name = "Sanji",
                imageUrl = "https://cdn.myanimelist.net/images/characters/5/136769.jpg"
            ),
        )
    )

    private val mgMonster: MangaSource = MangaSource(
        id = 5,
        name = "Monster",
        imageUrl = "https://cdn.myanimelist.net/images/manga/3/258224.jpg",
        score = 9.15,
        synopsys = "Kenzou Tenma, a renowned Japanese neurosurgeon working in post-war Germany, faces a difficult choice: to operate on Johan Liebert, an orphan boy on the verge of death, or on the mayor of Düsseldorf. In the end, Tenma decides to gamble his reputation by saving Johan, effectively leaving the mayor for dead.\n" +
                "\n" +
                "As a consequence of his actions, hospital director Heinemann strips Tenma of his position, and Heinemann's daughter Eva breaks off their engagement. Disgraced and shunned by his colleagues, Tenma loses all hope of a successful career—that is, until the mysterious killing of Heinemann gives him another chance.\n" +
                "\n" +
                "Nine years later, Tenma is the head of the surgical department and close to becoming the director himself. Although all seems well for him at first, he soon becomes entangled in a chain of gruesome murders that have taken place throughout Germany. The culprit is a monster—the same one that Tenma saved on that fateful day nine years ago.",
        author = "Urasawa, Naoki",
        genres = listOf(
            "Drama" , "Mystery", "Award Winning"
        ),
        characters = listOf(
            Character(
                name = "Liebert, Johan",
                imageUrl = "https://cdn.myanimelist.net/images/characters/4/316522.jpg"
            ),
            Character(
                name = "Tenma, Kenzou",
                imageUrl = "https://cdn.myanimelist.net/images/characters/15/347641.jpg"
            ),
            Character(
                name = "Liebert, Anna",
                imageUrl = "https://cdn.myanimelist.net/images/characters/11/286916.jpg"
            ),
        )
    )
}