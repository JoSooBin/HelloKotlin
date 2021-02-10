//코틀린 클래스
//클래스의 객체 생성시 new연산자는 사용하지 않음

class Person1{
    var name: String = ""
    var age: Int = 0
}//자바의 멤버변수 정의하듯 클래스를 선언

class Person2 (
    var name: String,
    var age: Int ) //기본 생성자 형태로 멤버변수를 정의하는 클래스 선언

class Person3(var name:String, var age:Int, var addr:String){
    //생성자 정의시 constructor라는 예약어를 사용
    //단, 기본생성자 정의시 생략가능

    constructor(name: String, addr: String):this(name, 0,"")
    //보조생성자에서 기본생성자 호출시 this라는 예약어 사용
}//기본생성자와 보조생성자를 정의한 클래스 선언

class SungJuk(var name: String, var kor:Int, var eng:Int, var mat:Int){
    val tot: Int get(){return kor + eng + mat}
    //코틀린에서 자동으로 제공하는 getter를 사용하지 않고 개발자가 임의로 getter를 정의해서 사용할 수도 있음

    val avg: Double get(){return tot.toDouble()/3}
    //코드가 한줄이라면 간단하게 작성할수도 있음

    val grd: Char get() {
        return when(avg.toInt()){
           in 90..100->'수'
           in 80..89->'우'
           in 70..79->'미'
           in 60..69->'양'
           else->'가'
        }
    }
}

class SungJuk2(var name: String, var kor:Int, var eng:Int, var mat:Int){
    var tot: Int = 0
    var avg: Double = 0.0
    var grd: Char = '가'

    init { computeSungJuk()}
    //초기화 블럭, 기본생성자 호출 후 추가적으로 작업해야 할 내용을 작성해 둠

    fun computeSungJuk(){
        tot = kor + eng + mat
        avg = tot.toDouble()/3
        grd = when(avg.toInt()/10){
                 9, 10->'수'
                 8->'우'
                 7->'미'
                 6->'양'
                else->'가'
            }
    }
    //클래스내에 멤버함수도 포함 할 수 있음
}


class Member(var mno:String,var name:String,var jumin:String,var userid:String,var passwd:String,
             var zipcode:String,var addr1: String,var addr2:String,var email:String,
             var phone:String,var regdate:String){ }

fun main(){
    val p = Person1()

    p.name = "혜교"
    p.age = 35

    println("이름 : ${p.name}, 나이 : ${p.age}")

    val p2 = Person2("지현", 40)
    println("이름 : ${p2.name}, 나이 : ${p2.age}")

    val p3 = Person3("수지", 0,"서울특별시")
    println("이름:${p3.name}, 나이:${p3.age}, 주소:${p3.addr}")

    val sj = SungJuk("수지",100,80,80)
    println("${sj.tot} ${sj.avg} ${sj.grd}")

    var m =Member("1","mmm","123456-789465","abc132","1234","123-456",
    "서울시 종로구","동일빌딩","pppp@gmail.com","010-1234-4567","2021-02-10")
    println("${m.name} ${m.userid} ${m.email}")

    val sj2 = SungJuk2("수지",100,80,80)
    println("${sj2.tot} ${String.format("%.1f",sj2.avg)} ${sj2.grd}")
}