package com.deling.test


// TODO: 2022/1/13  字符串String模板

fun main() {
    val garden="黄石公园"
    val name="小王"
    val time=6
    println("你好$name，欢迎来到$garden,可以在这里玩${time}天")
    println("你好$name，欢迎来到$garden,可以在这里玩$time 天")

    val isLogin:Boolean=true
    println("Server response result:${if (isLogin) "恭喜登录成功！" else "登录失败"}")


}