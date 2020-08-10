package com.example.movie

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBoxOffice.setOnClickListener { //'상영 중인 영화' 버튼을 클릭했을 때
            val intent = Intent(  this, MovieListActivity::class.java) //MovieListActivity로 넘어가는 Intent 선언
            startActivity(intent)
        }

        btnNaverMovie.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://movie.naver.com"))
            startActivity(intent)
        }
    }
}