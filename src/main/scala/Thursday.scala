import scala.io.StdIn._
import scala.util.Random
object Thursday extends App{
  //println('5'.toInt)
 // println("please enter you credit card number so that we can steal it")

  var cNumNonDub = scala.collection.mutable.ArrayBuffer[Int]()
  var cNumDub = scala.collection.mutable.ArrayBuffer[Int]()
  var cNumAfterMath =scala.collection.mutable.ArrayBuffer[Int]()
  var validCounter = 0

  println("do you want to see a random valid card or put in your card and test the validity \n press 1 for your own card and 2 for a random one")
  var initialQuestion = readInt
  initialQuestion match {
    case 1 => {
      val cCardNum = readLong.toString()
      splitTheString(cCardNum)
      mathApllicableNum
      addingTheLists
      if (validCounter%10 == 0) print("valid card number omega good job")
      else print("not valid card number, rip")
    }
    case 2 => {
      println("please put in a random number and we will test its authenticity")
      val cCardNum = readLong.toString()
      val cCardNoneChangable = cCardNum
      splitTheString(cCardNum)
      mathApllicableNum
      addingTheLists
      if (validCounter%10 == 0) {
        print(s"$cCardNoneChangable is a valid card number omega good job")
      }
      else {
        var validTesterTypeChange:String = ""
        var counter = 0

        while(validCounter%10 != 0)
          {
            validCounter = 0
            cNumNonDub = scala.collection.mutable.ArrayBuffer[Int]()
            cNumDub = scala.collection.mutable.ArrayBuffer[Int]()
            cNumAfterMath =scala.collection.mutable.ArrayBuffer[Int]()
            counter += +1
            val validTester = cCardNoneChangable.toLong + counter
             validTesterTypeChange = validTester.toString
            splitTheString(validTesterTypeChange)
            mathApllicableNum
            addingTheLists
            //validCounter = 10
          }
        println(s"we have made the rubish card number you put in a legit sucsses \n your new card number is $validTesterTypeChange")
      }
    }
    case _=>print("try reading the instructions")

  }

  def splitTheString(cCardNum:String) {
    var i = 0
    while (i <= cCardNum.length() - 2) {
      cNumDub.append(cCardNum.substring(i, i + 1).toInt)
      cNumNonDub.append(cCardNum.substring(i + 1, i + 2).toInt)
      i += 2
    }
  }
 def mathApllicableNum()={
   cNumDub.foreach(num1 => {
     var mathNum1 = num1 *2
     if(mathNum1>9){mathNum1=mathNum1-9}
     cNumAfterMath.append(mathNum1)
   })
 }
  def addingTheLists()={
    cNumAfterMath.foreach(x => validCounter += x)
    cNumNonDub.foreach(x => validCounter += x)
  }


// if (validCounter%10 == 0) print("valid card number omega good job")
 //else print("not valid card number, rip")
//println("while condition " + (validCounter%10 != 0))


}

