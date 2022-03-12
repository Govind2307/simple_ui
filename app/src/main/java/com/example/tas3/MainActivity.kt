package com.example.tas3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image1 = findViewById<ImageView>(R.id.image1)
        var image2 = findViewById<ImageView>(R.id.image2)
        var image3 = findViewById<ImageView>(R.id.image3)
        Glide.with(this).load("https://img.search.brave.com/sT1qLhdfM0MdH8dFSYI75GZ_iapbgECs5S5KQQuZt9A/rs:fit:711:225:1/g:ce/aHR0cHM6Ly90c2Uz/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5m/NEVNd2RIVmgybElE/OVVKY19EZ0J3SGFF/OCZwaWQ9QXBp").into(image1);
        Glide.with(this).load("https://img.search.brave.com/M2oxgCocTd7RSfHy6ygjyACnGtoBrAeZHL5n_vu4PgY/rs:fit:400:250:1/g:ce/aHR0cHM6Ly9wcm8u/cmFjaGlvLmNvbS9z/dGF0aWMvOGI0Y2E3/MmVmOGFlMGQ3M2Ux/NTg5YTMwYTEwZTg4/YzAvNmQxMzMvcjMt/ZnJvbnQucG5n").into(image2);
        Glide.with(this).load("https://img.search.brave.com/-WH1zMkJCYhSQll4_GIDYQyQ7vuc6iRHQscRokBNp8w/rs:fit:638:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5x/V2ZuaFZvVjJhVHB2/SmxMcE5zdF9RSGFG/ZyZwaWQ9QXBp").into(image3);

    }
}