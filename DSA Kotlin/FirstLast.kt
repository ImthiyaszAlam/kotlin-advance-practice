fun main(){
    val arr:intArrayOf(1,2,3,4,5,6,7,8,9)

}

 fun firstLast(arr:IntArray,target:Int):IntArray{

    fun find (isFirst:Boolean):Int{


var l = 0;
var r = arr.size-1;

while(l<=r){
    val  mid = l+(r-l)/2
    when{
        arr[mid] == target -> result = mid
        if(isFirst){
            r = mid-1
        }else{
            l = mid+1
        }
    }
}

    }
 }