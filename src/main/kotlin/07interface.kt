//추상클래스
//abstract라는 키워드로 선언한 클래스
//추상 메서드 선언시 abstract라는 키워드 필요
//추상메서드는 반드시 자식클래스에서 재정의를 해야 함
//추상클래스 구현시  ':추상클래스명()'형태로 사용

//인터페이스
//interface라는 키워드로 추상메서드도 구성된 클래스 정의
//추상메서드는 abstract라는 키워드르 사용해야하고
//추상메서드는 반드시

abstract class Terran {
    var hp = 10;
    var mp = 20;
    abstract fun attack()
}

class Marine : Terran() {
    override fun attack() = println("가우스건으로 공격 중...")
}

class FireBat : Terran() {
    override fun attack() = println("화염방사기로 공격 중...")
}

interface Service {
    abstract fun newOne()
    abstract fun read()
    abstract fun readOne()
    abstract fun modify()
    abstract fun remove()
}

object ServiceImpl : Service { //단일객체로 생성
    override fun newOne() = println("새로운 객체 생성")
    override fun read() = println("객체 목록을 불러옵니다")
    override fun readOne() = println("특정 객체 하나 불러옵니다")
    override fun modify() = println("특정 객체 하나 수정합니다")
    override fun remove() = println("특정 객체 하나 삭제합니다")
}

fun main(){
    var m1 = Marine()
    println("${m1.hp} ${m1.mp} ${m1.attack()}")

    var f1 = FireBat()
    println("${f1.hp} ${f1.mp} ${f1.attack()}")

    //object 객체는 객체 생성과정 없이 바로 사용가능
    ServiceImpl.newOne()
    ServiceImpl.read()
    ServiceImpl.readOne()
    ServiceImpl.modify()
    ServiceImpl.remove()
}