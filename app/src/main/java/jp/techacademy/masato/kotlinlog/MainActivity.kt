package jp.techacademy.masato.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val man = Human("太郎", 17, "野球")

        man.say()
        man.think()

        val man2 = Human("二郎", 16, "サッカー")

        man2.say()
        man2.think()

    }
}