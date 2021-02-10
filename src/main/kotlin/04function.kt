//코틀린함수
//함수의 리턴타입이 없는 경우 자바에서는 void였지만 코틀린에서는 Unit로 지정해야 함
// fun 함수명(매개변수: 타입): 리턴타입{
//      함수의 몸체
// }

//코틀린은 함수지향 프로그래밍 언어이기 때문에
// 자바와는 달리 클래스의 객체화 없이 바로 호출해서 사용할 수 있음

//지명인자 호출을 사용하면 매개변수의 값을 전달할때
// 매개변수 이름도 같이 지정할 수 있음
//또한, 매개변수의 순서도 자유롭게 지정가능

//매개변수의 기본값을 지정할 수 있어서 인자값을 생략한체로 함수를 호출할 수도 있음

fun main() {
    var x = 3
    var y = 5

    println(add1(x,y))
    println(add2(x,y))
    println(add3(x,y))
    add4(x,y)
    println(add5())

    println(add5(10, 20))
    println(add5(a=10, b=20))  //지명인자 호출방식으로 함수 사용
    println(add5(a=20, b=10))
    println(add5(b=20))
    println(add5(a=10))
}
//public int add(int a, int b){
//      return a + b;
// }

fun add1(a:Int, b:Int): Int {
    return a + b
}

fun add2(a:Int, b:Int): Int = a + b
//return과 {}를 생략함

fun add3(a:Int, b:Int) = a + b
//함수의 리턴타입을 생략 -> 컴파일러에게 이것을 추론하게 함

fun add4(a:Int, b:Int) = print(a + b)
//return문 없이 함수내에서 바로 결과 출력

fun add5(a:Int=3, b:Int=5) = a + b
//변수의 기본값 지정