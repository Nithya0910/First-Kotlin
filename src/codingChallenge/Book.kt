package codingChallenge

class Book ( val title :String,
             val author : String,
             val publication : Int,
             val isBorrowed :Boolean){

    fun details(){
        if(isBorrowed){
            println("Title is $title written by $author in $publication")
        }else{
            println("Not Returned")
        }
    }

    fun print(){
        println("Title is $title written by $author in $publication")
    }


}

fun main(args: Array<String>) {
    var book = Book("Two states","Unknown",1996,true)
   book.print()

}