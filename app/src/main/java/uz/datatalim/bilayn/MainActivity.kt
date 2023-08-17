package uz.datatalim.bilayn

import Ada.PaketAdapter
import Ada.XizmatAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.Paket
import model.Xizmat

class MainActivity : AppCompatActivity() {
    lateinit var feeds:ArrayList<Paket>
    lateinit var xizmat:ArrayList<Xizmat>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initView2()


    }

    private fun initView2() {
        laodList2()


        val rvUslugi2 = findViewById<RecyclerView>(R.id.rv_xizmatlar)
        rvUslugi2.adapter=XizmatAdapter(xizmat)
        rvUslugi2.layoutManager=LinearLayoutManager(this)
        rvUslugi2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvUslugi2.adapter = XizmatAdapter(xizmat)

    }

    private fun laodList2() {
        xizmat=ArrayList()
        xizmat.add(Xizmat("Xizmatlar"))
        xizmat.add(Xizmat("Xizmatlar"))
        xizmat.add(Xizmat("Xizmatlar"))
        xizmat.add(Xizmat("Xizmatlar"))
        xizmat.add(Xizmat("Xizmatlar"))
        xizmat.add(Xizmat("Xizmatlar"))
        xizmat.add(Xizmat("Xizmatlar"))
        xizmat.add(Xizmat("Xizmatlar"))
        xizmat.add(Xizmat("Xizmatlar"))
    }

    private fun initView() {
        laodList()
        val rvUslugi = findViewById<RecyclerView>(R.id.rv_uslugi)
        rvUslugi.adapter=PaketAdapter(this,feeds)
        rvUslugi.layoutManager=LinearLayoutManager(this)
    }

    private fun laodList() {
        feeds= ArrayList()
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(Paket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))

    }
}


//lateinit var feeds:ArrayList<Feed>
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_mai)
//    initView()
//}
//
//
//private fun initView() {
//    loadFakeData()
//    val rvFeed=findViewById<RecyclerView>(R.id.rv_instagram)
//    rvFeed.adapter=FeedAdapter(this,feeds)
//    rvFeed.layoutManager= LinearLayoutManager(this)
//}
//
//private fun loadFakeData() {