fun main(){

}



fun longestSubstring(str:String):Int{


val set = HashSet<Char>()
val left = 0
val maxLen = 0

for(right in str.indices){
    while(set.contains(str[right])){
        set.remove(str[left])
        left++
    }
    set.add(set[right])
    maxLen = maxOf(maxLen,right-left+1)
}
return maxLen;

}