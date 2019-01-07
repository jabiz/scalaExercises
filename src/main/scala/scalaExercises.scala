import scala.math
object scalaExercises {
  def checker() {
    for (i <- 100000000 to 300000000 if primechecker(i) == true) {
      println(i)
    }
  }
def primechecker(i:Int):Boolean=
  {
   if(i%2 !=0) {
     if (i % 3 != 0)
     {
        if(i % 5 !=0)
          {
            if(i % 7 !=0)
              {
               if(i % 11 !=0)
                 {
                   if(i % 13 !=0)
                     {
                       if(math.round((math.sqrt(i))) % i !=0 )
                         {
                           true
                         }
                       else
                         {
                           false
                         }
                     }
                   else
                     {
                       false
                     }
                 }
                else
                 {
                   false
                 }
              }
            else
            {
              false
            }
          }
        else
          {
            false
          }
     }
     else {
        false
     }
   }
    else{
        false
    }
  }



  def main(args: Array[String]): Unit =
  {
  checker()
  }
}
