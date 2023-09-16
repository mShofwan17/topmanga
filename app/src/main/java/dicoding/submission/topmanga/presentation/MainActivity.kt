package dicoding.submission.topmanga.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import dicoding.submission.topmanga.R
import dicoding.submission.topmanga.databinding.ActivityMainBinding
import dicoding.submission.topmanga.domain.usecase.GetListMangaUseCase
import dicoding.submission.topmanga.presentation.adapters.ListMangaAdapter
import dicoding.submission.topmanga.utils.Constant
import dicoding.submission.topmanga.utils.extension.linearLayoutManager

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        initListener()
    }

    private fun initView(){
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

    private fun initListener(){
        binding.apply {
            imgProfile.setOnClickListener{
                val intent = Intent(applicationContext, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}