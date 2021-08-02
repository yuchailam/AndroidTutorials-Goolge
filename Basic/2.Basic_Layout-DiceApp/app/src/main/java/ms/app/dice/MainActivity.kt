package ms.app.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity

const val numOfDiceSides = 6
const val luckyNumber = 4
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        UI
        val rollBtn: Button = findViewById(R.id.rollBtn)
        val rollResult: TextView = findViewById(R.id.rollResult)
        val diceView: ImageView = findViewById(R.id.diceView)

        rollBtn.setOnClickListener {
//          // Create new Dice object with 6 sides and roll it
            val diceResult = rollDice()
            // Update the screen with the dice roll
            diceView.setImageResource(diceResult.imageSrc)
            rollResult.text = diceResult.result
            diceView.contentDescription = diceResult.result
//            Toast.makeText(this, rollResult.result, Toast.LENGTH_SHORT).show()
        }
    }
}

private fun rollDice(): DiceResult {
    val diceResult = Dice(numOfDiceSides).roll()
    var toastText: String = ""
    var imageResource: Int = 0

    when(diceResult){
        luckyNumber -> {
            toastText = "The lucky number is 4 , You Win"
            imageResource = R.drawable.dice_4
        }
        1 -> {
            toastText = "So sorry! You rolled a 1. Try again!"
            imageResource = R.drawable.dice_1
        }
        2 -> {
            toastText = "Sadly, you rolled a 2. Try again!"
            imageResource = R.drawable.dice_2
        }
        3 -> {
            toastText = "Unfortunately, you rolled a 3. Try again!"
            imageResource = R.drawable.dice_3
        }
        5 -> {
            toastText = "Don't cry! You rolled a 5. Try again!"
            imageResource = R.drawable.dice_5
        }
        else -> {
            toastText = "Apologies! you rolled a 6. Try again!"
            imageResource = R.drawable.dice_6
        }
    }
    return DiceResult(
        number = diceResult,
        result = toastText,
        imageSrc = imageResource
    )
}
data class DiceResult(
    val number: Int,
    @DrawableRes val imageSrc: Int,
    val result: String
)