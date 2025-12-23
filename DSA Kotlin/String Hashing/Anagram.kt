fun main(){

}


fun isAnagram(s1:String,s2:String):boolean{

    val map = HashMap<Char,Int>()

    for (c in s1) {
        map[c] = map.getOrDefault(c,0)+1
    }
}