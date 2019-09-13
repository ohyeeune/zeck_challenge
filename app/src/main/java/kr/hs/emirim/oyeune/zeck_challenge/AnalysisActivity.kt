package kr.hs.emirim.oyeune.zeck_challenge

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_view_analyze.*

class AnalysisActivity : AppCompatActivity() {


    var dialog_listener = object: DialogInterface.OnClickListener{
        override fun onClick(dialog: DialogInterface?, which: Int) {
            /*when(which){
                DialogInterface.BUTTON_POSITIVE ->
                    toast_p()
                DialogInterface.BUTTON_NEGATIVE ->
                    toast_n()
            }*/
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_analyze)
        //타이틀바 없애기
        //고려해보기...

        firstTrash.setOnClickListener {
            var dialog = AlertDialog.Builder(this)
            dialog.setTitle("첫번째 쓰레기 대체품")
            dialog.setMessage("첫번째 쓰레기 대신 대체품을 쓰는 것은 어떨까요? \n그림 첨부")
            dialog.setIcon(R.mipmap.ic_launcher)

        /*    fun toast_p() {
                Toast.makeText(this, "Positive 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()
            }
            fun toast_n(){
                Toast.makeText(this, "Negative 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()
            }*/

            dialog.setPositiveButton("예, 그럴게요.",dialog_listener)
            dialog.setNegativeButton("첫번째 쓰레기 계속 쓸래요.",dialog_listener)
            dialog.setNeutralButton("취소", null)
            dialog.show()
        }

        secondTrash.setOnClickListener {
            var dialog = AlertDialog.Builder(this)
            dialog.setTitle("두번째 쓰레기 대체품")
            dialog.setMessage("두번째 쓰레기 대신 대체품을 쓰는 것은 어떨까요? \n 그림첨부")
            dialog.setIcon(R.mipmap.ic_launcher)

            dialog.setPositiveButton("예, 그럴게요.", dialog_listener)
            dialog.setNegativeButton("두번째 쓰레기 계속 쓸래요.", dialog_listener)
            dialog.setNeutralButton("취소",null)
            dialog.show()
        }

        thirdTrash.setOnClickListener {
            var dialog = AlertDialog.Builder(this)
            dialog.setTitle("세번째 쓰레기 대체품")
            dialog.setMessage("세번째 쓰레기 대신 대체품을 쓰는 것은 어떨까요? \n 그림첨부")
            dialog.setIcon(R.mipmap.ic_launcher)

            dialog.setPositiveButton("예, 그럴게요.", dialog_listener)
            dialog.setNegativeButton("세번째 쓰레기 계속 쓸래요.", dialog_listener)
            dialog.setNeutralButton("취소",null)
            dialog.show()
        }
    }

}
