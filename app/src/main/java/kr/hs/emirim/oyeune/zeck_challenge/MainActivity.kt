package kr.hs.emirim.oyeune.zeck_challenge

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*
import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.support.v4.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.Menu
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date


class MainActivity : AppCompatActivity() {
    internal var now = System.currentTimeMillis()
    internal var date = Date(now)
    internal var sdfNow = SimpleDateFormat("yyyy/MM/dd ")
    internal var formatDate = sdfNow.format(date)

    internal lateinit var dateNow: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dateNow = findViewById(R.id.dateText) as TextView
        dateNow.setText(formatDate)

        button1.setOnClickListener {
            startActivity(Intent(this@MainActivity, AnalysisActivity::class.java))
        }

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        toolbar.setTitle(R.string.app_name)
        setSupportActionBar(toolbar)

        val actionBar = supportActionBar
        actionBar!!.setDisplayShowCustomEnabled(true)
        //actionBar.setDisplayShowTitleEnabled(false)
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setHomeAsUpIndicator(R.drawable.menu);

        /*@Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.menu, menu);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            ind id = item.getItemId();

            switch(id) {
                case android.R.id.home;

                drawer.openDrawer(navigationView);
                break;
            }
            return super.onOptionsItemSelected(item);
        }*/
    }
}
