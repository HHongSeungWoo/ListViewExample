package com.sw.hong.listviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 리스트뷰에 들어갈 내용
        val item = arrayOf("리스트뷰","ListView","Adapter","어뎁터","ArrayAdapter")
        //ArrayAdapter 객체를 만들고 리스트뷰에 연결
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)
    }
}
