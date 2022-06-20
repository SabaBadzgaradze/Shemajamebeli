fun main(){

    /*1*/

    print("Enter first number: ")
    var x: Int = readLine()!!.toInt()

    print("Enter second number: ")
    var y: Int = readLine()!!.toInt()

    while (x != y) {
        if (x > y)
            x -= y
        else
            y -= x
    }

    println("U.S.G = $x")

    /*2*/

    print("Enter first number: ")
    var n1: Int = readLine()!!.toInt()

    print("Enter second number: ")
    var n2: Int = readLine()!!.toInt()

    var lcm: Int


    lcm = if (n1 > n2) n1 else n2


    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("L.C.M:$lcm")
            break
        }
        ++lcm
    }

    /*3*/

    print("Enter String: ")
    var s: String = readLine().toString()

    if (s.contains("$")){

        println("this data contains $")

    }else{
        println("this data doesn't contains $")
    }

    /*4*/

    val num = 100
    var sum = 0

    for (i in 0..num step 2) {
        // sum = sum+i;
        sum += i
    }

    println("Sum = $sum")

    /*5*/

    print("Enter Num:")
    var number: Int = readln()!!.toInt()
    var reversed = 0

    while (number != 0) {
        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }

    println("Reversed Number: $reversed")

    /*6*/

    print("Enter String: ")
    var originalString: String = readLine().toString()

    var reverseString = ""
    var length = originalString.length

    for (i in (length - 1) downTo 0) {
        reverseString = reverseString + originalString[i]
    }


    if (originalString.equals(reverseString, ignoreCase = true)) {
        println("The given string is Palindrome")
    } else {
        println("The given string is NOT a Palindrome")
    }

}