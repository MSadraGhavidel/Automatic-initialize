/**
 *  3/14/2023
 *
 *  Automatically determines the type of the numbers variables
 *
 *  By : Sadra Ghavidel
 *
 * ver : 1.0
 */
fun getInputNumber():Number?{
    var inputNumberS = readln()
    var inputNumberN :Number
    if (inputNumberS == null) println("your input is wrong")
    try {
        inputNumberN = inputNumberS.toByte()
        return inputNumberN
    }catch (e:Throwable){}
    try{
        inputNumberN = inputNumberS.toShort()
        return inputNumberN
    }catch (e:Throwable){}
    try{
        inputNumberN = inputNumberS.toInt()
        return inputNumberN
    }catch (e:Throwable){}
    try{
        inputNumberN = inputNumberS.toLong()
        return inputNumberN
    }catch (e:Throwable){}
    try{
        inputNumberN = inputNumberS.toFloat()
        return inputNumberN
    }catch (e:Throwable){}
    try{
        inputNumberN = inputNumberS.toDouble()
        return inputNumberN
    }catch (e:Throwable){"Something is wrong"}
    finally {
        return null
    }
}