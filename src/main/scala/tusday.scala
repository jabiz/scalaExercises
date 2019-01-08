object tusday extends App{

  val x = 99 to 0 by -1

  def song(counter: Int):String = {
    val counter2 = counter-1
    s"""         |   $counter bottles of beer on the wall
                 |   $counter bottles of beer
                 |  take one down and pass it around, $counter2 bottles of beer on the wall """
  }

  x.foreach(bigint => if(bigint >= 1)(println(song(bigint)))else(print("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall")))



  def recursionSong(counter:Int):Unit={
    if(counter> 1)
      {
        println(s"""|   $counter bottles of beer on the wall
                   |   $counter bottles of beer
                   |  take one down and pass it around, ${counter-1} bottles of beer on the wall """)
        recursionSong(counter-1)
      }
    else if(counter ==1)
    {
      println(s"""|   $counter bottles of beer on the wall
                  |   $counter bottles of beer
                  |  take one down and pass it around, no more bottles of beer on the wall """)
      recursionSong(counter-1)
    }
    else if(counter ==0)
    {
      println(s"""|   no more bottles of beer on the wall
                  |   no more bottles of beer
                  |  Go to the store and buy some more, 99 bottles of beer on the wall """)
      recursionSong(counter-1)
    }

  }

  recursionSong(99)


  var ArrayTest = Array.range(1, 1000000)
  ArrayTest(345324)=23445

  def arrayCheck(place:Int)={
    for(i<- place until ArrayTest.length if i!= place){
      if(ArrayTest(i)==ArrayTest(place))
        println(s"$place")
    }
  }

  ArrayTest.foreach(arrayNumber => arrayCheck(arrayNumber))


}

