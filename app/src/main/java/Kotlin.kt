

fun main(){
   var s = arrayOf(10, 20, 30, 40, 50)
    s = addElement(s, 10)
    for(ch in s) {
        println(ch)

    }

   }
fun addElement(arr: Array<Int>, element:Int): Array<Int>{
    val mutableArray = arr.toMutableList()
    mutableArray.add(element)
    return mutableArray.toTypedArray()
}