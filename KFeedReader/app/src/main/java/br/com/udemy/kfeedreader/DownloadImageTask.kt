package br.com.udemy.kfeedreader

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.widget.ImageView
import java.io.InputStream
import java.lang.Exception
import java.net.URL

class DownloadImageTask(private val imageView: ImageView) : AsyncTask<String, Void, Bitmap>() {

    override fun doInBackground(vararg params: String?): Bitmap {
        val url = params[0]

        var stream: InputStream? = null
        try {
            stream = URL("https://media.gazetadopovo.com.br/2019/10/07082946/jac-iev20-carro-eletrico-2-660x372.jpg").openStream()
        } catch (e: Exception) {
            val a = ""
        }

        return BitmapFactory.decodeStream(stream)
    }

    override fun onPostExecute(result: Bitmap?) {
        imageView.setImageBitmap(result)
    }

}
