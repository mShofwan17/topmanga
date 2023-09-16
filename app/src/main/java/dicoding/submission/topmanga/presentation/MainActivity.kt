package dicoding.submission.topmanga.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dicoding.submission.topmanga.databinding.ActivityMainBinding
import dicoding.submission.topmanga.domain.usecase.GetListMangaUseCase
import dicoding.submission.topmanga.presentation.adapters.ListMangaAdapter
import dicoding.submission.topmanga.utils.Constant
import dicoding.submission.topmanga.utils.InitActivity
import dicoding.submission.topmanga.utils.extension.linearLayoutManager

class MainActivity : AppCompatActivity(), InitActivity {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        initListener()
    }

    override fun initView(){
        val listData = GetListMangaUseCase().invoke()
        val adapter = ListMangaAdapter(listData){ item, rank ->
            val intent = Intent(applicationContext,DetailMangaActivity::class.java)
            intent.putExtra(Constant.ExtrasConst.EXTRA_ID,item.id)
            intent.putExtra(Constant.ExtrasConst.EXTRA_RANK,rank)
            startActivity(intent)
        }

        //setup recycler
        binding.rvManga.apply {
            linearLayoutManager()
            setHasFixedSize(true)
            setAdapter(adapter)
        }
    }

    override fun initListener(){
        binding.apply {
            imgProfile.setOnClickListener{
                val intent = Intent(applicationContext, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}