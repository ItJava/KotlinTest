package com.deling.test

// TODO: 2022/1/13   Kotlin 默认参数
fun main() {
    methon01(18, "汪方晨")
    methon02(28)
    methon02(28,"小王")
    methon03(10,"彩霞");
    methon03();
}

private fun methon01(age: Int, name: String): Int {

    println("您的姓名是:$name,年纪是$age")
    return 200
}

private fun methon02(age: Int, name: String="方晨"): Int {

    println("您的姓名是:$name,年纪是$age")
    return 200
}

private fun methon03(age: Int=36, name: String="晨"): Int {

    println("您的姓名是:$name,年纪是$age")
    return 200
}
