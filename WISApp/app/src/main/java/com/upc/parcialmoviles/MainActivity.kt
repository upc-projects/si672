package com.upc.parcialmoviles

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.google.gson.Gson
import com.upc.parcialmoviles.data.mockData
import com.upc.parcialmoviles.model.Award
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), WisItemCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        RecyclerViewWisApp.apply {
            adapter = WisAdapter(
                applicationContext,
                mockData,
                this@MainActivity
            )
            layoutManager = GridLayoutManager(applicationContext, 2)
        }
    }

    override fun goToAwardDetailPage(award: Award) {
        val intent = Intent(this, AwardDetailActivity::class.java)
        val data = Gson().toJson(award)
        intent.putExtra("data", data)
        startActivity(intent)
    }

    override fun goToScientificDetailPage() {

    }


}
