fun main(){

val arr = intArrayOf(1,2,3,4,5,6,7,8)
var  target = 5;
print(twoSumSorted(arr,target))
}



fun twoSumSorted(arr:IntArray,target:Int):IntArray{
    var l = 0;
    var r = arr.size-1;

    while(l<r){
       var sum = arr[l]+arr[r]

       when{
        sum == target -> return intArrayOf(l,r)
        sum<target->l++
        else->r--
       }
    }

    return intArrayOf(-1,-1)
}