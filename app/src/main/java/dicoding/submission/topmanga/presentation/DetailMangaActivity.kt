package dicoding.submission.topmanga.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dicoding.submission.topmanga.data.model_source.Manga
import dicoding.submission.topmanga.databinding.ActivityDetailMangaBinding
import dicoding.submission.topmanga.domain.usecase.GetDetailMangaUseCase
import dicoding.submission.topmanga.presentation.adapters.ListCharacterAdapter
import dicoding.submission.topmanga.utils.Constant
import dicoding.submission.topmanga.utils.Constant.INT_DEFAULT_VALUE
import dicoding.submission.topmanga.utils.InitActivity
import dicoding.submission.topmanga.utils.extension.linearLayoutManager
import dicoding.submission.topmanga.utils.extension.loadImage
import dicoding.submission.topmanga.utils.extension.loadImageBlur

class DetailMangaActivity : AppCompatActivity(), InitActivity {
    private val binding by lazy {
        ActivityDetailMangaBinding.inflate(layoutInflater)
    }

    private var detailManga: Manga? = null
    private var rank: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        bundle()
        initView()
        initListener()
    }

    private fun bundle(){
        intent.extras?.let {
            val id = it.getInt(Constant.ExtrasConst.EXTRA_ID, INT_DEFAULT_VALUE)
            rank = it.getString(Constant.ExtrasConst.EXTRA_RANK)
            detailManga = GetDetailMangaUseCase().invoke(id)
        }
    }

    override fun initView(){
        binding.apply {
            detailManga?.imageUrl?.let {  imgUrl ->
                imgBackground.loadImageBlur(imgUrl)
                imgMain.loadImage(imgUrl)
            }

            txtTitle.text = detailManga?.name
            txtRank.text = "Rank $rank"
            txtRating.text = detailManga?.score.toString()
            txtAuthor.text = detailManga?.published.toString()
            txtGenre.text = detailManga?.genres?.joinToString()
            txtPublished.text = detailManga?.published.toString()
            txtAuthor.text = detailManga?.author
            txtSynopsys.text = detailManga?.synopsys

            detailManga?.characters?.let { characters ->
                val adapter = ListCharacterAdapter(characters)
                rvCharacter.linearLayoutManager(true)
                rvCharacter.adapter = adapter
            }


        }
    }

    override fun initListener() {
        binding.apply {
            imgClose.setOnClickListener {
                finish()
            }
        }
    }
}