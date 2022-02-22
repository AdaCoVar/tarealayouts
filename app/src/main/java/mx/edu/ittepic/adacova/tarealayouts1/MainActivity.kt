package mx.edu.ittepic.adacova.tarealayouts1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.adacova.tarealayouts1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val botontlacuache = binding.botontlacuache
    botontlacuache.setOnClickListener{
    verTlacuache()
      }
        val botonmanati = binding.botonmanati
        botonmanati.setOnClickListener{
            verManati()
        }
    }

    private fun verManati() {
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    private fun verTlacuache(){
        val intent = Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }
    
}