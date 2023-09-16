package dicoding.submission.topmanga.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dicoding.submission.topmanga.R
import dicoding.submission.topmanga.databinding.ActivityProfileBinding
import dicoding.submission.topmanga.domain.usecase.GetProfileUseCase
import dicoding.submission.topmanga.utils.InitActivity
import dicoding.submission.topmanga.utils.extension.loadImageCircle

class ProfileActivity : AppCompatActivity(), InitActivity {

    private val binding by lazy {
        ActivityProfileBinding.inflate(layoutInflater)
    }
    private val profile = GetProfileUseCase().invoke()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        initListener()
    }

    override fun initView() {
       binding.apply {
           imgMain.loadImageCircle(profile.imgUrl)
           txtName.text = profile.name
           txtEmail.text = profile.email
       }
    }

    override fun initListener() {
        binding.imgBack.setOnClickListener { finish() }
    }
}