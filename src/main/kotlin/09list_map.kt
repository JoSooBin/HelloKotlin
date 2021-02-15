//list
//자바와는 다르게 list에는 읽기전용과 수정가능한 객체 등 2가지가 각각 지원
//리스트 객체를 만들때는 listOf라는 함수를 사용함
//쓰기가능 리스트 객체를 만들때는 mutableListOf라는 함수를 사용함

//filterNotNull이라는 함수를 사용하면 null을 제외한 나머지 요소만 다룰 수 있음
//+, - 연사자를 이용해서 특정 요소를 추가하거나 제거 할 수 있음

//map
//자바와는 다르게 map에는 읽기전용과 수정가능한 객체 등 2가지가 각각 지원
//읽기 전용 리스트 객체를 만들때는 mapOf라는 함수를 사용함
//쓰기가능 리스트 객체를 만들때는 mutableMapOf라는 함수를 사용함
//+, - 연산자를 이용해서 특정 요소를 추가하거나 제거 할 수 있는데, 제거시 만드시 키를 지정해야 함

fun main(){
    val names = listOf("혜교","지현","수지")

    for(i in 0..names.size-1) println(names[i])

    //names.add("") //읽기전용이라 추가 불가

    val names2 = mutableListOf("혜교","지현","수지")
    for(i in 0..names2.size-1) println(names2.get(i))
    names2.add("길동") //쓰기가능이라 추가 가능

    var names2b = names2 + null //null을 추가함
    for (i in 0..names2b.size-1) println(names2b.get(i)+"|")

    names2b = names2b - "지현" //지현을 제거함
    for ( i in 0..names2b.size-1) print(names2b.get(i)+"/")

    for(str in names2b.filterNotNull()) println(str)
    //null인 요소를 제외하고 foreach문 형식으로 출력


    var names3 = mutableMapOf(1 to "혜교", 2 to "지현", Pair(3, "수지"))
    names3[4] = "길동" //새로운 데이터 추가
    names3.put(5, "영희")
    names3[1] = "철수" //기존 데이터 추정

    for(name in names3) print("${name.key} ${name.value} /")

    var names3b = names3 - 3    // 3번째 항목 제거
    for (i in names3b.keys) print("${names3b.get(i)} /") //key값을 이용해서 모든 요소 출력

    var names3c = names3b + (6 to "지은") //3번째 항목 제거
    for (i in names3c.keys) print("${names3c.get(i)} |") //key값을 이용해서 모든 요소 출력
}