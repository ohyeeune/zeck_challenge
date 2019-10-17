package kr.hs.emirim.oyeune.zeck_challenge

import android.app.Activity
import android.content.Intent
import android.os.Bundle


class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.)
        try {
            Thread.sleep(4000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
