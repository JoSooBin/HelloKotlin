//kotlin반복문
//for : 지정된 구간에서 조건에서 맞춰 반복
//for(반복조건) {반복할 구문}

// kotlin 조건식
// if : 조건식이 참인 경우 지정된 연산을 수행
// if (조건식1) 문장1
// if else (조건식2) 문장2
// else 문장3

// when : java의 switch버전
//정수 이외의 다양한 타입을 대입해서 구분 할 수 있음
//when(조건식){
//    조건값1 -> 문장1
//    조건값2 -> 문장2
//    else -> 문장3
//}


fun main() {
    for (i in 1..5) print("${i} ") //1~10

    println("")
    for (i in 1 until 10) print("${i} ") //1~9

    println("")
    for (i in 1..10 step 2) print("${i} ") //1~10 사이 홀수

    println("")
    for (i in 10 downTo 1) print("${i} ") //10~1

    println("")
    var i = 10
    while (i>10){
        print("${i--}")
    }

    var a = 10
    var b = 15

    println("")
    if (a > b) print("a가 큽니다")
    else print("b가 큽니다")

    var max = if(a > b) {
        a
    }
    else {
        b
    }
    println("")
    println("큰 값은 ${max} 입니다다")

    println("")
    when{
        a > b -> print("a가 큽니다")
        a < b -> print("b가 큽니다")
    }
    println("")

    var num = 1
    when(num) {
        1 -> print("one")
        2 -> print("two")
        3 -> print("three")
        in 1..3 -> print("many")
        !is Int -> print("정수아님")
        else -> ("etc")
    }

    var result = when(num) {
        1 -> print("one")
        2 -> print("two")
        3 -> print("three")
        in 1..3 -> print("many")
        !is Int -> print("정수아님")
        else -> ("etc")
    }
    println("\n${result}")
}