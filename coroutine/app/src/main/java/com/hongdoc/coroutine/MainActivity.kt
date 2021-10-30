package com.hongdoc.coroutine

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hongdoc.coroutine.databinding.ActivityMainBinding
import java.net.URL

suspend fun loadImage(imageUrl: String): Bitmap {
    val url = URL(imageUrl)
    val stream = url.openStream()
    return BitmapFactory.decodeStream(stream)
}

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.run {
            binding.buttonDownload.setOnClickListener {
                CoroutineScope(Dispatchers.Main).launch {
                    binding.progress.visibility = View.VISIBLE
                    val url = binding.editUrl.text.toString()
                    val bitmap = withContext(dispatchers.IO) {
                        loadImage(url)
                    }
                    binding.imagePreview.setImageBitmap(bitmap)
                    binding.progress.visibility = View.GONE
                }
            }
        }
    }
}