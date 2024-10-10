val max_age = 100//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // начало работы и знакомство с переменными
//    var age : Int
//    age = 23
//    println(age)
//
//    var ageik: Int = 25
//    println(ageik)
//
//    println(max_age)
//
//    // Типы данных
//    val a: Byte = -10
//    val b: Short = 45
//    val c: Int = -250
//    val d: Long = 30000
//    val height: Double = 1.78
//    val pi : Float = 3.14F
//    val dg: Double = 23e3
//    val dh: Double = 23e-3
//    val usl:Boolean = true
//    val sym: Char = 'A'
//    val name: String = "Alex"
//    val text: String = """
//        Кому чё , Кому ничё
//        Кому хуй через плечо
//    """.trimIndent()
//
//    var any:Any = "Sanyok"
//    println(any)
//    any = 576
//    println(any)
//
//    println(a)
//    println(b)
//    println(c)
//    println(d)
//    println(height)
//    println(pi)
//    println(dg)
//    println(dh)
//    println(usl)
//    println(sym)
//    println(name)
//    println(text)
//
//    val g: Long = 22
//    val f: Long = 22L
//    println(g)
//    println(f)
//
//    val ua : UByte = 10U
//    val us : UShort = 45U
//    val ui : UInt = 250U
//    val ul: ULong = 30000U
//
//    println(a)
//    println(b)
//    println(c)
//    println(d)
//
//    val bin: Int = 0b0101
//    val hex: Int = 0x0A1
//    println(bin)
//    println(hex)
//
//    var longN: Long = 2
//    var intN: Int = 4
//    longN = intN.toLong()
//    println(longN)
//
//    //Шаблоны строк
//    val firstName:String = "Alex"
//    val secondName:String = "Buraev"
//    val welcome : String = "Hello, $firstName $secondName"

    // Консольный ввод и вывод
//    print("Введите имя: ")
//    val name_pers = readLine()
//    print("Ваше имя : $name_pers")
//    println()
//
//    print("Введите имя: ")
//    val name_person = readLine()
//    print("Введите email: ")
//    val email = readLine()
//    print("Введите адрес: ")
//    val address = readLine()
//
//    println("Ваше имя: $name")
//    println("Ваш email: $email")
//    println("Ваш адрес: $address")

    //условия if else
    val ab = 10
    if(ab == 10) {
        println("ab = 10")
    }
    else{
        println("ab != 10")
    }

    val bg = 2.6
    if(bg == 2.6){
        println(true)
    }
    else if(bg == 2.5)
        println("default")
    else{
        println(false)
    }

    //конструкция when
    val isEnabled = true
    when(isEnabled){
        false -> println("isEnabledOFF")
        true -> println("isEnabledON")
    }

    val but = 30
    when(but){
        10 -> println("but = 10")
        20 -> println("but = 20")
        else -> println("неопределённое значение")
    }

    when(but){
        in 10..19 -> println("Значение в диапазоне от 10 до 19")
        in 20 .. 29 -> println("Значение в диапазоне от 20 до 29")
        !in 10..20 -> println("Значение вне диапазона 10..19")
        else -> println("Неопределённое значение")
    }

    when(but){
        10,20 -> println("Значение или 10 или 20")
        else -> println("Неопределённое значение")
    }

    var ag = 10
    when(ag){
        10 -> {
            println("ag = 10")
            ag *= 2
        }
        20 -> {
            println("ag = 20")
            ag *= 5
        }
        else -> { println("неопределенное значение")}
    }
    println(ag)


    val a = 10
    val b = 5
    val c = 3
    when(a){
        b - c -> println("a = b - c")
        b + 5 -> println("a = b + 5")
        else -> println("неопределенное значение")
    }

    val cb = 14
    val cc = 6
    when{
        (cb > 13) -> println("cb больше 13")
        (cc > 13) -> println("cc больше 13")
        else -> println("cb и cc меньше или равны 13")
    }

    val day = 2
    var dayOfWeek = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        else -> ("Unknown")
    }
    println(dayOfWeek)

    }