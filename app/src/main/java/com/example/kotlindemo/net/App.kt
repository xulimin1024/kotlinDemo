package com.example.kotlindemo.net

data class App(
    val adstar: Int,
    val boxresult: Any,
    val ceg: Boolean,
    val cn: Int,
    val cuben: Int,
    val end: Boolean,
    val gn: Int,
    val kn: Int,
    val lastindex: Int,
    val list: List<subAPP>,
    val pc: Int,
    val prevsn: Int,
    val ps: Int,
    val ran: Int,
    val ras: Int,
    val sid: String,
    val total: Int,
    val wordguess: Any
)

data class subAPP(
    val _thumb: String,
    val _thumb_bak: String,
    val color: Int,
    val comm_purl: String,
    val downurl: Boolean,
    val downurl_true: String,
    val dsptime: String,
    val dspurl: String,
    val fixedSize: Boolean,
    val fnum: String,
    val grpcnt: Any,
    val grpmd5: Boolean,
    val height: String,
    val id: String,
    val img: String,
    val imgkey: String,
    val imgsize: String,
    val imgtype: String,
    val index: Int,
    val key: String,
    val link: String,
    val litetitle: String,
    val qqface_down_url: Boolean,
    val source: Int,
    val src: String,
    val thumb: String,
    val thumbHeight: Int,
    val thumbWidth: Int,
    val thumb_bak: String,
    val title: String,
    val type: Int,
    val width: String
)