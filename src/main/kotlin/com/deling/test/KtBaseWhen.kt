package com.deling.test


// TODO: 2022/1/12 用来替代 Java中 的 switch，只要代码中包含 else if 分支都建议换成 when 表达式，需要将判断条件的情况全部列举出来。

fun main() {

    val max=3
    when(max){
        1,3,5,7,9 -> println("max 是单数")
        !in 100..999 -> print("max 不在100-999 里面")
    }

    val maxValue=2
    val num = when(maxValue){
        1 ->1
        2 ->777
        else -> 8
    }
    println(num)

    val week=4

    val info=when(week){
        1->"今天星期一"
        2->"今天星期二"
        3->"今天星期三"
        4->"今天星期四"
        5->"今天星期五"
        6->"今天星期六"
        7->"今天星期日"
        else -> {
            println("养猪去了")
        }
    }
    println("info:"+info)




}