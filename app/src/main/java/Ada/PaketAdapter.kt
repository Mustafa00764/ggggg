package Ada

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.Paket
import uz.datatalim.bilayn.R
import uz.datatalim.bilayn.TwoActivity

class PaketAdapter(val context: Context, val list: ArrayList<Paket>) :
    RecyclerView.Adapter<PaketAdapter.PaketViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaketViewHolder {
        val view:View
                view= LayoutInflater.from(parent.context).inflate(R.layout.item_paket,parent,false)
              return  PaketViewHolder(view)


    }

    override fun getItemCount()=list.size



    override fun onBindViewHolder(holder:PaketViewHolder, position: Int) {
        val paket=list[position]

        holder.apply {
            tvInet.text= paket.tvinetPaket1
            tvinetGB.text=paket.tvmon
            tv_stoimost.text=paket.tvSum
            tv_GB.text=paket.tvGB


      holder.  llInet.setOnClickListener {
          val   intent = Intent(context, TwoActivity::class.java)
           context.startActivity(intent)
        }
        }

    }




    class PaketViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvInet = view.findViewById<TextView>(R.id.tv_inet)
        val rv_xizmatlar = view.findViewById<RecyclerView>(R.id.rv_xizmatlar)
        val llInet = view.findViewById<LinearLayout>(R.id.ll_dad)
        val tvinetGB = view.findViewById<TextView>(R.id.tv_inet_GB)
        val tv_stoimost = view.findViewById<TextView>(R.id.tv_stoimost)
        val tv_GB = view.findViewById<TextView>(R.id.tv_GB)

    }

}







//val ITEM_STORY = 0;
//val ITEM_POST = 1;
//
//override fun getItemViewType(position: Int): Int {
//    return if (!list[position].stories.isNullOrEmpty()) ITEM_STORY
//    else ITEM_POST
//}
//
//override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//    val view: View
//    return if (viewType == ITEM_STORY) {
//        view =
//            LayoutInflater.from(parent.context).inflate(R.layout.item_story_main, parent, false)
//        StoryViewHolder(view)
//    } else {
//        view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed, parent, false)
//        PostViewHolder(view)
//    }
//
//}
//
//override fun getItemCount() = list.size
//
//override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//    val feed = list[position]
//    if (holder is PostViewHolder) {
//        //postlarni ulimiz
//    }
//    if (holder is StoryViewHolder) {
//        //story rv ulimiz
//        holder.apply {
//            rvStories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//            rvStories.adapter = StoryAdapter(feed.stories!!)
//        }
//    }
//
//}
//
//
//class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//    val tvUserName = view.findViewById<TextView>(R.id.tv_user_name)
//
//}
//
//class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//    val rvStories = view.findViewById<RecyclerView>(R.id.rvStory)
//}
