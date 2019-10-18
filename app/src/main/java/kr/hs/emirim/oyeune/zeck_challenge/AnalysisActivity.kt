package kr.hs.emirim.oyeune.zeck_challenge

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_view_analyze.*

class AnalysisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_analyze)

        analyazeButton1.setOnClickListener {
            fun onClick(v: View?){
                val intent=Intent(this,AnalysisActivity::class.java)
                intent.setData(Uri.parse("https://namu.wiki/w/%EC%86%90%EC%88%98%EA%B1%B4"));

                startActivity(intent);

            }
        }

    }
}
