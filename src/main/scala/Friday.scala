import scala.io.Source
import scala.io.StdIn._
object Friday extends App{
  val engLang = Source.fromFile("C:/Users/Admin/Desktop/scalaWork/EnglishLang.txt").getLines().toArray
  val randomWord = {
    val r = scala.util.Random
    engLang(r.nextInt(100000))
  }
 var playzonez = scala.collection.mutable.ArrayBuffer(toString)

  def underScooreWord(getRandomWord: String){

    for (i <-1 to getRandomWord.length) {
      playzonez.append("_")
    }
  }

  def game ()={
    var lives= 10
    var victoryPoints = 0
     underScooreWord(randomWord)
    while(lives != 0 || victoryPoints ==10)
      {
        print("plese put userInput")
        var userInput = readLine()


       for(i <- 0 until randomWord.length) {
         if (randomWord.substring(i,i+1) == userInput.substring(0, 1)) playzonez(i) = randomWord}
        playzonez.foreach(x => print(x))
      }

      }
  game()
  }



/*
for(i <- 1 to initalStringInput.length)
{
  if(realEdditer.contains(initalStringInput.substring(i - 1,i)))
  {
    realEdditer = realEdditer.replace(initalStringInput.substring(i-1,i),"")
  }
*/

/*
  if(randomWord.substring(i,i+1) == userInput.substring(0,1))
            {
              playfield.substring(i*2,i*2+1) = playfield.replace(playfield.substring((i*2),(i*2+1)),userInput)
              victoryPoints+1
              println(playfield)

            }
            else
            {
              println(randomWord.substring(i,i+1) == userInput.substring(0,1))
              print(playfield)
              print(randomWord)
            }
 */
