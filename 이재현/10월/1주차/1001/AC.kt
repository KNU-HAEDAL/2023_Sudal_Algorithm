package a231001

import java.util.*
import kotlin.collections.ArrayDeque

//백준 5430
//https://www.acmicpc.net/problem/5430

//forEach 문법의 파괴성
//deque -> ArrayDeque를 활용
// repeat
// joinToString
// count
fun main()=with(System.`in`.bufferedReader()){
    //T받기
    val T = readLine().toInt()
    val deque :ArrayDeque<String> = ArrayDeque<String>()
    //repeat T
    repeat(T){

        //deque초기화
        deque.clear()

        //  command 받기
        val command = readLine()
        //  N받기
        val N = readLine().toInt()
        //  readLine()하고, replace하기
        var number = readLine().replace("[","").replace("]","")

        // split해서 deque에 넣기
        if (N>1){
            number.split(",").forEach{
                deque.add(it) //매개변수 선언 안하면 그냥 it으로 가능
            }
        }else deque.addLast(number)

        if (command.count({it =='D'})>N)  {
            println("error")
            return@repeat
        }

        var front = true
        command.forEach{
            if (it=='D'){
                if (front) deque.removeFirst()
                else deque.removeLast()
            }
            else front=!front
        }

        if (!front) deque.reverse()
        println(deque.joinToString(",","[","]"))

    }

}
