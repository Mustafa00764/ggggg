package Ada

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.Paket
import model.Xizmat
import uz.datatalim.bilayn.R

class XizmatAdapter(val list: ArrayList<Xizmat>):RecyclerView.Adapter<XizmatAdapter.XizmatViewHolder>() {
    class XizmatViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvXizmat = view.findViewById<TextView>(R.id.tv_xizmat)
        val vvv = view.findViewById<View>(R.id.vvv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): XizmatViewHolder {
        val view:View
        view= LayoutInflater.from(parent.context).inflate(R.layout.item_xizmat,parent,false)
        return XizmatViewHolder(view)
    }

    override fun getItemCount()=list.size



    override fun onBindViewHolder(holder: XizmatViewHolder, position: Int) {
        val feeds = list[position]
        holder.apply {

            tvXizmat.setOnClickListener {
                vvv.visibility=View.VISIBLE
            }
        }

    }


}