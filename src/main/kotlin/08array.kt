//배열
//같은 자료형 데이터들을 하나의 변수에 저장
//arrayOf, arrayOfNull이라는 함수를 이용해서 생성 가능
//kotlin에서 배열은 Array클래스로 표현
//따라서, set/get메서드와 size 속성을 기본적으로 포함

//boxing 오버헤드가 없는 기본 유형 값을 저장하기 위한 전문 배열 클래스를 지원함
//기본타입Array 형식으로 선언해서 사용함

fun main() {
    val data1 = arrayOf("혜교","지현","수지") //기본적인 배열 선언
    val data2 = arrayOfNulls<Int>(3) //3개의 정수타입을 저장하는 배열 객체
    data2.set(0,10)
    data2.set(1,50)
    data2.set(2,90)

    val data3 = intArrayOf(10,20,30) //생성과 동시에 값 초기화
    val data4 = IntArray(3)     //3개의 정수를 저장하는 배열 선언
    val data5 = IntArray(3){1}  //3개의 정수를 저장하는 배열 중 하나만 저장

    var data6 = emptyArray<Int>()   //3개의 정수타입을 저장하는 빈 배열 객체. 다른 배열 객체를 저장하기 위한 그릇으로 선언

    println("${data1[0]} ${data1[1]} ${data1[2]}")
    println("${data1.get(0)} ${data1.get(1)} ${data1.get(2)}")

    println("${data2[0]} ${data2[1]} ${data2[2]}")
    println("${data2.get(0)} ${data2.get(1)} ${data2.get(2)}")

    println(data6.size)
}