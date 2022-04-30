package com.example.firstappwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var isim=""
    private var yas : Int?=null
    private var meslek=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Olustur(view : View)
    {
         isim = txtİsim.text.toString()
         yas=txtYas.text.toString().toIntOrNull()
         meslek=txtMeslek.text.toString()

        if(yas==null)
        {
            textView.text="Doğru veri giriniz"
        }
    else{

            val superKahraman=SuperKahraman(isim,yas!!,meslek)
            textView.text="İsim:${superKahraman.isim} Yaş:${superKahraman.yas} Meslek:${superKahraman.meslek}"
        }

    }
}