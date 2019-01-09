import scala.io.Source
import scala.io.StdIn._
object Wednesday extends App{
  val engLang = Source.fromFile("C:/Users/Admin/Desktop/scalaWork/EnglishLang.txt").getLines().toList
  print("please enter the amount of inputs wanted ")
  val amountWanted = readInt
  var amountEntered = scala.collection.mutable.ArrayBuffer[String]()
  println("please enter the keys you can use")
  for(iterator <- 0 until amountWanted)
    {
      amountEntered.append(readLine)
    }

  var longestWord = ""
  def wordChecker(realWord:String,initalStringInput:String):Unit= {
    //var counter = engword.length
    var realEdditer = realWord
    for(i <- 1 to initalStringInput.length)
    {
      if(realEdditer.contains(initalStringInput.substring(i - 1,i)))
      {
        realEdditer = realEdditer.replace(initalStringInput.substring(i-1,i),"")
      }
      if(initalStringInput.length == i)
      {
        if(realEdditer.length == 0)
          {
            if(realWord.length > longestWord.length)
              {
                longestWord = realWord
              }
          }
      }
    }

  }
  amountEntered.foreach(inputName => {
    engLang.foreach(realWord => {
      wordChecker(realWord,inputName)
    })
    println(s"the longest word for $inputName is $longestWord ")
    longestWord=""
  })
//  {
//
//  }


  //print(longestWord)
}