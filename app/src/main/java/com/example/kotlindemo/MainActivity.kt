package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.kotlindemo.adapter.MyAdapter
import com.example.kotlindemo.bean.Food
import com.example.kotlindemo.net.App
import com.example.kotlindemo.net.AppService
import com.example.kotlindemo.net.ServiceCreater
import com.example.kotlindemo.net.subAPP
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.newFixedThreadPoolContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Food>()
    var list1 :List<subAPP> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFood()
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation  = LinearLayoutManager.HORIZONTAL
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = MyAdapter(this,list)
    }
    fun initFood(){
        val appService = ServiceCreater.create(AppService::class.java)
        appService.getAppData("鸡腿").enqueue(object: Callback<App> {
            override fun onFailure(call: Call<App>, t: Throwable) {
               t.printStackTrace()
            }

            override fun onResponse(call: Call<App>, response: Response<App>) {
                 val app = response.body()
              //  Log.d("MainActivity",app.toString())
                if (app!=null){
                    list1 = app.list
                }
                for (bean in list1){
                    var thumb = bean._thumb
                    var title = bean.title
                    list.add(Food(title,thumb))
                }

            }
        })


    }


}