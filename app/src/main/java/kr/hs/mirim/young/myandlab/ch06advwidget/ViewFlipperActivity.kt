package kr.hs.mirim.young.myandlab.ch06advwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ViewFlipper
import androidx.constraintlayout.widget.ConstraintLayout
import kr.hs.mirim.young.myandlab.R

class ViewFlipperActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_flipper)

        val vFlipper = findViewById<ViewFlipper>(R.id.viewFilpper)
        findViewById<Button>(R.id.btnLeft).setOnClickListener {
            vFlipper.showPrevious()
        }
        findViewById<Button>(R.id.btnRight).setOnClickListener {
            vFlipper.showNext()
        }

        findViewById<ConstraintLayout>(R.id.bg).setOnClickListener {
            if(vFlipper.isAutoStart){
                vFlipper.stopFlipping()
            }else{
                vFlipper.startFlipping()
            }
        }
    }

}