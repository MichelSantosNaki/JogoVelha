package micheldev.com.br

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.io.BufferedReader

class MainActivity : AppCompatActivity() {
    val playerOne = arrayListOf<Int>()
    val playertwo = arrayListOf<Int>()
    var currentplayer = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun play(position: Int, btnSelected: Button){
        if (currentplayer == 1){
            btnSelected.text = "X"
            btnSelected.setBackgroundColor(R.color.colorPrimaryDark)
            playerOne.add(position)
            currentplayer = 2

        }else {
            if (currentplayer == 2) {
                btnSelected.text = "O"
                btnSelected.setBackgroundColor(R.color.colorPrimaryDark)
                playerOne.add(position)
                currentplayer = 1
            }
        }
        btnSelected.isClickable = false

    }

   fun btnPostition(view: View) = when(view.id) {
       R.id.btn1 -> play(1,view as Button)
       R.id.btn2 -> play(2,view as Button)
       R.id.btn3 -> play(3,view as Button)
       R.id.btn4 -> play(4,view as Button)
       R.id.btn5 -> play(5,view as Button)
       R.id.btn6 -> play(6,view as Button)
       R.id.btn7 -> play(7,view as Button)
       R.id.btn8 -> play(8,view as Button)
       R.id.btn9 -> play(9,view as Button)
       else -> play(0,view as Button)
   }

   fun checkResult(){
       val row1 = listOf(1,2.3)
       val row2 = listOf(4,5,6)
       val row3 = listOf(7,8,9)

       val col1 = listOf(1,4,7)
       val col2 = listOf(2,5,8)
       val col3 = listOf(3,6,9)

       val diagonal1 = listOf(1,5,9)
       val diagonal2 = listOf(7,5,3)

       var winer = -1

       if (playerOne.containsAll(row1) || playerOne.containsAll(row2) || playerOne.containsAll(row3) || playerOne.containsAll(col1) ||
                       playerOne.containsAll(col2) || playerOne.containsAll(col3) || playerOne.containsAll(diagonal1) || playerOne.containsAll(diagonal2)){
           winer=1
       }
       if (playertwo.containsAll(row1) || playertwo.containsAll(row2) || playertwo.containsAll(row3) || playertwo.containsAll(col1) ||
           playertwo.containsAll(col2) || playertwo.containsAll(col3) || playertwo.containsAll(diagonal1) || playertwo.containsAll(diagonal2)){
           winer=2
       }



   }
}
