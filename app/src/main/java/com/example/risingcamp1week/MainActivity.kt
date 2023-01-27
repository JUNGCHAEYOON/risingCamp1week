package com.example.risingcamp1week

import android.os.Bundle
import android.text.Html
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn
        var baemin1Btn = findViewById<Button>(R.id.baemin1_button)
        var baedalBtn = findViewById<Button>(R.id.baedal_button)
        var pojangBtn = findViewById<Button>(R.id.pojang_button)
        var baeminStoreBtn = findViewById<Button>(R.id.baeminstore_button)

        //text
        val baemin1BtnText = Html.fromHtml("<b>배민1</b>" + "<br/>" +
                "<small><small><small>한 번에 한 집만</small></small></small>" + "<br/>" +
                "<small><small><small>빠르게 배달해요!</small></small></small>")
        val baedalBtnText = Html.fromHtml("<b>배달</b>" + "<br/>" +
                "<small><small><small>세상은 넓고</small></small></small>" + "<br/>" +
                "<small><small><small>맛집은 많다</small></small></small>")
        val pojangBtnText = Html.fromHtml("<b>포장</b>" + "<br/>" +
            "<small><small><small><small>가까운 가게는 직접 가지러 가지요</small></small></small></small>" + "<br/>")
        val baeminStoreBtnText = Html.fromHtml("<b>배민스토어</b>" + "<br/>" +
                "<small><small><small><small>이마트24의 간식을 바로 배달!</small></small></small></small>" + "<br/>")

        //setText
        baemin1Btn.setText(baemin1BtnText)
        baedalBtn.setText(baedalBtnText)
        pojangBtn.setText(pojangBtnText)
        baeminStoreBtn.setText(baeminStoreBtnText)
    }
}