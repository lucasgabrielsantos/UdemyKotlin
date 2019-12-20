package br.com.udemy.kfeedreader

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*

class ItemAdapter(val list: ArrayList<MainActivity.Item>, val context: Context): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val titulo = view.findViewById(R.id.titulotext) as TextView
        val autor = view.findViewById(R.id.autortext) as TextView
        val data = view.findViewById(R.id.datatext) as TextView
        val imagem = view.findViewById(R.id.imagecard) as ImageView
        val btnVerMais = view.findViewById(R.id.btnvermais) as Button
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.cardviewmodel_layout, parent, false)
        val ivh = ItemViewHolder(v)

        return ivh
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder?.titulo?.text = list[position].titulo
        holder?.autor?.text = list[position].autor
        holder?.data?.text = SimpleDateFormat("dd/MM/yyyy", Locale("pt", "BR")).format(Date(list[position].data))
        holder?.btnVerMais?.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, list[position].link)
            context.startActivity(intent)
        }

        DownloadImageTask(holder?.imagem!!).execute(list[position].imagem)
    }

    override fun getItemCount(): Int = list.size
}