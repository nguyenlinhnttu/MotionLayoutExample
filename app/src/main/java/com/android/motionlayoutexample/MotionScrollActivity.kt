package com.android.motionlayoutexample

import android.app.Activity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
import androidx.constraintlayout.widget.ConstraintSet.Motion
import androidx.core.view.updatePadding
import com.android.motionlayoutexample.databinding.MotionScrollBinding

class MotionScrollActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = MotionScrollBinding.inflate(layoutInflater)
        setContentView(binding.root )

        val repoName: MutableList<String> = mutableListOf()
        for (i in 0..100) {
            repoName.add("Test Data $i")
        }
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            repoName
        )
        binding.listview.adapter = adapter
        binding.motionLayout.setTransitionListener(object :TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {

            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {

            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {

            }

        })
    }
}
