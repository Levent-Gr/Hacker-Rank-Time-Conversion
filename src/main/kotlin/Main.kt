fun main(args: Array<String>) {

    val result = timeConversion("07:05:45PM")
    println(result)
}

fun timeConversion(s: String): String {
    val timeFront = s.substring(0,2)
    val durum = s.substring(8,10)
    if(durum=="AM"){

        if(timeFront=="12"){
            return "00"+s.substring(2,8)
        }else{
            return s.substring(0,8)
        }

    }else if(durum=="PM"){

        if(timeFront=="12"){
            return s.substring(0,8)
        }else{
            var timeFrontInt = (timeFront.toInt())+12
            return timeFrontInt.toString()+s.substring(2,8)
        }
    }
    return s
}
