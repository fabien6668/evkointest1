package biz.ei6.evkointest1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListeAdapter(val datas: List<String>) : RecyclerView.Adapter<ListeAdapter.VerbViewHolder>() {

    class VerbViewHolder(
      //  private val onClickListener: OnClickListener,
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val nameField: TextView by lazy { itemView.findViewById(R.id.item_texte) }

        fun bind(verb: String) {
            itemView.setOnClickListener {
                //onClickListener.onDishClick(dish.id)
            }
            nameField.text = verb
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        LayoutInflater.from(parent.context).inflate(R.layout.item_liste, parent, false)
            .let { view -> VerbViewHolder( view) }

    override fun getItemCount(): Int  = datas.size

    override fun onBindViewHolder(holder: VerbViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}