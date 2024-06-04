package ir.shariaty.x_o1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ir.shariaty.x_o1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.playOfflineBtn.setOnClickListener{
        createOffLineGame();

        }
    }

    fun createOffLineGame() {
        GameData.saveGameModel(
            GameModel(gameStatus = GameStatus.JOINED)
        )
      startGame()
    }
    fun startGame(){
      startActivity(Intent(this,GameActivity::class.java))
    }
}