package dicoding.submission.topmanga.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dicoding.submission.topmanga.R
import dicoding.submission.topmanga.databinding.ActivityMainBinding
import dicoding.submission.topmanga.domain.usecase.GetListMangaUseCase

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }

    private fun initView(){
        val listData = GetListMangaUseCase().invoke()

    }
}