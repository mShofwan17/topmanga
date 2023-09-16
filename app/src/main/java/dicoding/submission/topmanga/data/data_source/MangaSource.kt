package dicoding.submission.topmanga.data.data_source

import dicoding.submission.topmanga.data.model_source.Manga

object MangaSource {

    val vindlandSaga: Manga = Manga(
        id = 12,
        name = "Vinland Saga",
        imageUrl = "https://cdn.myanimelist.net/images/manga/2/188925l.jpg",
        score = 9.05,
        synopsys = "Thorfinn, son of one of the Vikings' greatest warriors, is among the finest fighters in the merry band of mercenaries run by the cunning Askeladd, an impressive feat for a person his age. However, Thorfinn is not part of the group for the plunder it entails—instead, for having caused his family great tragedy, the boy has vowed to kill Askeladd in a fair duel. Not yet skilled enough to defeat him, but unable to abandon his vengeance, Thorfinn spends his boyhood with the mercenary crew, honing his skills on the battlefield among the war-loving Danes, where killing is just another pleasure of life.\n" +
                "\n" +
                "One day, when Askeladd receives word that Danish prince Canute has been taken hostage, he hatches an ambitious plot—one that will decide the next King of England and drastically alter the lives of Thorfinn, Canute, and himself. Set in 11th-century Europe, Vinland Saga tells a bloody epic in an era where violence, madness, and injustice are inescapable, providing a paradise for the battle-crazed and utter hell for the rest who live in it.",
        author = "Yukimura, Makoto",
        genres = listOf(
            "Action", "Drama", "Adventure", "Award Winning"
        ),
        published = 2005,
        characters = CharacterSource.vindlandsaga
    )
    val mgBerserk: Manga = Manga(
        id = 1,
        name = "Berserk",
        imageUrl = "https://cdn.myanimelist.net/images/manga/1/157897l.jpg?_gl=1*wbf873*_ga*MTc1MDU4MTcwMy4xNjU1Mzc0MDA1*_ga_26FEP9527K*MTY5NDg5NDI5NS4xMS4xLjE2OTQ4OTQzNjAuNjAuMC4w",
        score = 9.74,
        synopsys = "Guts, a former mercenary now known as the \"Black Swordsman,\" is out for revenge. After a tumultuous childhood, he finally finds someone he respects and believes he can trust, only to have everything fall apart when this person takes away everything important to Guts for the purpose of fulfilling his own desires. Now marked for death, Guts becomes condemned to a fate in which he is relentlessly pursued by demonic beings.\n" +
                "\n" +
                "Setting out on a dreadful quest riddled with misfortune, Guts, armed with a massive sword and monstrous strength, will let nothing stop him, not even death itself, until he is finally able to take the head of the one who stripped him—and his loved one—of their humanity.",
        author = "Miura, Kentarou",
        published = 1989,
        genres = listOf(
            "Action", "Adventure", "Drama", "Fantasy", "Horor"
        ),
        characters = CharacterSource.berserk
    )

    val mgJojo: Manga = Manga(
        id = 2,
        name = "JoJo no Kimyou na Bouken Part 7: Steel Ball Run",
        imageUrl = "https://cdn.myanimelist.net/images/manga/3/179882l.jpg",
        score = 9.30,
        synopsys = "In the American Old West, the world's greatest race is about to begin. Thousands line up in San Diego to travel over six thousand kilometers for a chance to win the grand prize of fifty million dollars. With the era of the horse reaching its end, contestants are allowed to use any kind of vehicle they wish. Competitors will have to endure grueling conditions, traveling up to a hundred kilometers a day through uncharted wastelands. The Steel Ball Run is truly a one-of-a-kind event.\n" +
                "\n" +
                "The youthful Johnny Joestar, a crippled former horse racer, has come to San Diego to watch the start of the race. There he encounters Gyro Zeppeli, a racer with two steel balls at his waist instead of a gun. Johnny witnesses Gyro using one of his steel balls to unleash a fantastical power, compelling a man to fire his gun at himself during a duel. In the midst of the action, Johnny happens to touch the steel ball and feels a power surging through his legs, allowing him to stand up for the first time in two years. Vowing to find the secret of the steel balls, Johnny decides to compete in the race, and so begins his bizarre adventure across America on the Steel Ball Run.",
        author = "Araki, Hirohiko",
        published = 2004,
        genres = listOf(
            "Action", "Adventure", "Mystery", "Supernatural"
        ),
        characters = CharacterSource.jojo
    )

    val mgVagabond: Manga = Manga(
        id = 3,
        name = "Vagabond",
        imageUrl = "https://cdn.myanimelist.net/images/manga/1/259070l.jpg",
        score = 9.24,
        synopsys = "In 16th-century Japan, Shinmen Takezou is a wild, rough young man, in both his appearance and his actions. His aggressive nature has won him the collective reproach and fear of his village, leading him and his best friend, Matahachi Honiden, to run away in search of something grander than provincial life. The pair enlist in the Toyotomi army, yearning for glory—but when the Toyotomi suffer a crushing defeat at the hands of the Tokugawa Clan at the Battle of Sekigahara, the friends barely make it out alive.\n" +
                "\n" +
                "After the two are separated, Shinmen returns home on a self-appointed mission to notify the Hon'iden family of Matahachi's survival. He instead finds himself a wanted criminal, framed for his friend's supposed murder based on his history of violence. Upon being captured, he is strung up on a tree and left to die. An itinerant monk, the distinguished Takuan Soho, takes pity on the \"devil child,\" secretly freeing Shinmen and christening him with a new name to avoid pursuit by the authorities: Musashi Miyamoto.\n" +
                "\n" +
                "Vagabond is the fictitious retelling of the life of one of Japan's most renowned swordsmen, the \"Sword Saint\" Musashi Miyamoto—his rise from a swordsman with no desire other than to become \"Invincible Under the Heavens\" to an enlightened warrior who slowly learns of the importance of close friends, self-reflection, and life itself.",
        author = "Inoue, Takehiko",
        genres = listOf(
            "Action", "Adventure", "Award Winning"
        ),
        published = 1998 ,
        characters = CharacterSource.vagabound
    )

    val mgOnePiece: Manga = Manga(
        id = 4,
        name = "One Piece",
        imageUrl = "https://cdn.myanimelist.net/images/manga/2/253146l.jpg",
        score = 9.22,
        synopsys = "Gol D. Roger, a man referred to as the \"King of the Pirates,\" is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the King of the Pirates is executed and the Great Age of Pirates begins.\n" +
                "\n" +
                "Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new King of the Pirates. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas.\n",
        author = "Oda, Eiichiro",
        genres = listOf(
            "Action", "Adventure", "Fantasy"
        ),
        published = 1997 ,
        characters = CharacterSource.onePiece
    )

    val mgMonster: Manga = Manga(
        id = 5,
        name = "Monster",
        imageUrl = "https://cdn.myanimelist.net/images/manga/3/258224l.jpg",
        score = 9.15,
        synopsys = "Kenzou Tenma, a renowned Japanese neurosurgeon working in post-war Germany, faces a difficult choice: to operate on Johan Liebert, an orphan boy on the verge of death, or on the mayor of Düsseldorf. In the end, Tenma decides to gamble his reputation by saving Johan, effectively leaving the mayor for dead.\n" +
                "\n" +
                "As a consequence of his actions, hospital director Heinemann strips Tenma of his position, and Heinemann's daughter Eva breaks off their engagement. Disgraced and shunned by his colleagues, Tenma loses all hope of a successful career—that is, until the mysterious killing of Heinemann gives him another chance.\n" +
                "\n" +
                "Nine years later, Tenma is the head of the surgical department and close to becoming the director himself. Although all seems well for him at first, he soon becomes entangled in a chain of gruesome murders that have taken place throughout Germany. The culprit is a monster—the same one that Tenma saved on that fateful day nine years ago.",
        author = "Urasawa, Naoki",
        genres = listOf(
            "Drama", "Mystery", "Award Winning"
        ),
        published = 1994 ,
        characters = CharacterSource.monster
    )

    val fmab: Manga = Manga(
        id = 6,
        name = "Fullmetal Alchemist",
        imageUrl = "https://cdn.myanimelist.net/images/manga/3/243675l.jpg",
        score = 9.03,
        synopsys = "Alchemists are knowledgeable and naturally talented individuals who can manipulate and modify matter due to their art. Yet despite the wide range of possibilities, alchemy is not as all-powerful as most would believe. Human transmutation is strictly forbidden, and whoever attempts it risks severe consequences. Even so, siblings Edward and Alphonse Elric decide to ignore this great taboo and bring their mother back to life. Unfortunately, not only do they fail in resurrecting her, they also pay an extremely high price for their arrogance: Edward loses his left leg and Alphonse his entire body. Furthermore, Edward also gives up his right arm in order to seal his brother's soul into a suit of armor.\n" +
                "\n" +
                "Years later, the young alchemists travel across the country looking for the Philosopher's Stone, in the hopes of recovering their old bodies with its power. However, their quest for the fated stone also leads them to unravel far darker secrets than they could ever imagine.",
        author = "Arakawa, Hiromu",
        genres = listOf(
            "Action", " Adventure", "Drama", "Fantasy"
        ),
        published = 2001,
        characters = CharacterSource.fmab
    )

    val oyasumiPunpun: Manga = Manga(
        id = 7,
        name = "Oyasumi Punpun",
        imageUrl = "https://cdn.myanimelist.net/images/manga/3/164420l.jpg",
        score = 9.02,
        synopsys = "Punpun Onodera is a normal 11-year-old boy living in Japan. Hopelessly idealistic and romantic, Punpun begins to see his life take a subtle—though nonetheless startling—turn to the adult when he meets the new girl in his class, Aiko Tanaka. It is then that the quiet boy learns just how fickle maintaining a relationship can be, and the surmounting difficulties of transitioning from a naïve boyhood to a convoluted adulthood. When his father assaults his mother one night, Punpun realizes another thing: those whom he looked up to were not as impressive as he once thought.\n" +
                "\n" +
                "As his problems increase, Punpun's once shy demeanor turns into voluntary reclusiveness. Rather than curing him of his problems and conflicting emotions, this merely intensifies them, sending him down the dark path of maturity in this grim coming-of-age saga.\n",
        author = "Asano, Inio",
        genres = listOf(
            "Drama", "Slice of Life"
        ),
        published = 2007,
        characters = CharacterSource.oyasumiPunpun
    )

    val opm: Manga = Manga(
        id = 8,
        name = "One Punch-Man",
        imageUrl = "https://cdn.myanimelist.net/images/manga/3/80661l.jpg",
        score = 8.75,
        synopsys = "After rigorously training for three years, the ordinary Saitama has gained immense strength which allows him to take out anyone and anything with just one punch. He decides to put his new skill to good use by becoming a hero. However, he quickly becomes bored with easily defeating monsters, and wants someone to give him a challenge to bring back the spark of being a hero.\n" +
                "\n" +
                "Upon bearing witness to Saitama's amazing power, Genos, a cyborg, is determined to become Saitama's apprentice. During this time, Saitama realizes he is neither getting the recognition that he deserves nor known by the people due to him not being a part of the Hero Association. Wanting to boost his reputation, Saitama decides to have Genos register with him, in exchange for taking him in as a pupil. Together, the two begin working their way up toward becoming true heroes, hoping to find strong enemies and earn respect in the process.",
        author = "ONE",
        genres = listOf(
            "Action", "Comedy"
        ),
        published = 2012,
        characters = CharacterSource.opm
    )

    val hxh: Manga = Manga(
        id = 9,
        name = "Hunter x Hunter",
        imageUrl = "https://cdn.myanimelist.net/images/manga/2/253119l.jpg",
        score = 8.73,
        synopsys = "\"Secret treasure hoards, undiscovered wealth... mystical places, unexplored frontiers... 'The mysterious unknown.' There's magic in such words for those captivated by its spell. They are called 'Hunters'!\"\n" +
                "\n" +
                "Gon Freecss wants to become a Hunter so he can find his father, a man who abandoned him to pursue a life of adventure. But it's not that simple: only one in one hundred thousand can pass the Hunter Exam, and that is just the first obstacle on his journey. During the Hunter Exam, Gon befriends many other potential Hunters, such as the mysterious Killua; the revenge-driven Kurapika; and Leorio, who aims to become a doctor. There's a world of adventure and peril awaiting, and those who embrace it with open arms can become the greatest Hunters of them all!",
        author = "Togashi, Yoshihiro",
        genres = listOf(
            "Action", "Adventure", "Fantasy"
        ),
        published = 1998,
        characters = CharacterSource.hxh
    )

    val mushishi: Manga = Manga(
        id = 10,
        name = "Mushishi",
        imageUrl = "https://cdn.myanimelist.net/images/manga/2/159514l.jpg",
        score = 8.72,
        synopsys = "\"Mushi\": the most basic forms of life in the world. They exist without any goals or purposes aside from simply \"being.\" They are beyond the shackles of the words \"good\" and \"evil.\" Mushi can exist in countless forms and are capable of mimicking things from the natural world such as plants, diseases, and even phenomena like rainbows.\n" +
                "\n" +
                "This is, however, just a vague definition of these entities that inhabit the vibrant world of Mushishi, as to even call them a form of life would be an oversimplification. Detailed information on mushi is scarce because the majority of humans are unaware of their existence.\n" +
                "\n" +
                "So what are mushi and why do they exist? This is the question that a \"Mushishi,\" Ginko, ponders constantly. Mushishi are those who research mushi in hopes of understanding their place in the world's hierarchy of life.\n" +
                "\n" +
                "Ginko relentlessly chases rumors of occurrences that could be tied to mushi, all for the sake of finding an answer.\n" +
                "\n" +
                "It could, after all, lead to the meaning of life itself.",
        author = "Urushibara, Yuki",
        genres = listOf(
            "Fantasy", "Mystery", "Supernatural"
        ),
        published = 1999,
        characters = CharacterSource.mushishi
    )

    val deathNote: Manga = Manga(
        id = 11,
        name = "Death Note",
        imageUrl = "https://cdn.myanimelist.net/images/manga/1/258245l.jpg",
        score = 8.70,
        synopsys = "Ryuk, a god of death, drops his Death Note into the human world for personal pleasure. In Japan, prodigious high school student Light Yagami stumbles upon it. Inside the notebook, he finds a chilling message: those whose names are written in it shall die. Its nonsensical nature amuses Light; but when he tests its power by writing the name of a criminal in it, they suddenly meet their demise.\n" +
                "\n" +
                "Realizing the Death Note's vast potential, Light commences a series of nefarious murders under the pseudonym \"Kira,\" vowing to cleanse the world of corrupt individuals and create a perfect society where crime ceases to exist. However, the police quickly catch on, and they enlist the help of L—a mastermind detective—to uncover the culprit.\n" +
                "\n" +
                "Death Note tells the thrilling tale of Light and L as they clash in a great battle-of-minds, one that will determine the future of the world.",
        author = "Ohba, Tsugumi",
        genres = listOf(
            "Supernatural", "Suspense"
        ),
        published = 2003,
        characters = CharacterSource.deathNote
    )
}