package com.deling.test

// TODO: 2022/1/13   Kotlin 具名参数
fun main() {

    loginAction(phonenumber = "15227764125",userpwd = "88888888",username = "小汪",age = 18)
}


private fun loginAction(username:String,userpwd:String,phonenumber:String,age:Int){
    println("username:$username age:$age phonenumber:$phonenumber userpwd:$userpwd")
}