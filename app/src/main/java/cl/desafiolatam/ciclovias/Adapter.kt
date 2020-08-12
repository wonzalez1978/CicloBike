package cl.desafiolatam.ciclovias

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia

internal class CicloViaAdapter(val lista :MutableList<Ciclovia>) : RecyclerView.Adapter<CicloViaAdapter.CicloViaViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CicloViaViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_ciclovias, parent, false)
        return CicloViaViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: CicloViaViewHolder, position: Int) {
        holder.textCicloVia.text = lista[position].nombre
        holder.textComuna.text = lista[position].comuna
    }

    class CicloViaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textCicloVia: TextView
        val textComuna: TextView

        init {
            textCicloVia = itemView.findViewById(R.id.nombre_ciclovia)
            textComuna = itemView.findViewById(R.id.comuna)
        }

    }




}