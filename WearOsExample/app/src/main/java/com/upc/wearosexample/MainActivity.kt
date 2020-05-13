package com.upc.wearosexample

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.support.wearable.view.WearableListView
import androidx.wear.widget.WearableLinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wearableRecyclerView.apply {
            isEdgeItemsCenteringEnabled = true
            layoutManager = WearableLinearLayoutManager(this@MainActivity)
            adapter = ArtWorkAdapter(applicationContext, list)
        }

        val c : WearableListView
        // Enables Always-on
        setAmbientEnabled()
    }
}
