package kr.hs.mirim.young.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kr.hs.mirim.young.myandlab.ch04widget.BasicWidgetActivity
import kr.hs.mirim.young.myandlab.ch04widget.CalActivity
import kr.hs.mirim.young.myandlab.ch04widget.LovelyPetActivity
import kr.hs.mirim.young.myandlab.ch04widget.RotateImageActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mProfile : ImageView
    lateinit var mButton1 : Button
    lateinit var mButton2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener(this)
        findViewById<Button>(R.id.button2).setOnClickListener(this)
        findViewById<Button>(R.id.button3).setOnClickListener(this)
        findViewById<Button>(R.id.button4).setOnClickListener(this)
        findViewById<Button>(R.id.button5).setOnClickListener(this)
        findViewById<Button>(R.id.button6).setOnClickListener(this)

        mProfile = findViewById(R.id.profile)

    }

    override fun onClick(v: View) {
        TODO("Not yet implemented")
        var intent : Intent? = null
        when(v.id){
            R.id.button1 -> intent = Intent(this, FourbuttonActivity::class.java)
            R.id.button2 -> intent = Intent(this, Fourbutton2Activity::class.java)
            R.id.button3 -> intent = Intent(this, CalActivity::class.java)
            R.id.button4 -> intent = Intent(this, BasicWidgetActivity::class.java)
            R.id.button5 -> intent = Intent(this, LovelyPetActivity::class.java)
            R.id.button6 -> intent = Intent(this, RotateImageActivity::class.java)
        }

        if(intent != null){
            startActivity(intent)
        }

    }
}