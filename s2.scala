object StringOperations {
  def main(args: Array[String]): Unit = {
    val str = "Hello"
    val l = str.length
    var c = 0
    for (i <- 0 until l) {
      if (str.charAt(i).isUpper) c += 1
    }
    println(s"Total number of uppercase letters: $c")

    val lowerCaseStr = str.toLowerCase
    println(s"Lowercase version of the string: $lowerCaseStr")
  }
}

##

import scala.io.StdIn.readChar

object CharacterSearch {
  def main(args: Array[String]): Unit = {
    var cnt = 0
    val str = "Hello Everyone! This is scala terminal."
    val l = str.length

    println("Enter a character to search in the string:")
    val c = readChar()

    for (i <- 0 until l) {
      if (str.charAt(i) == c) {
        cnt += 1
      }
    }

    if (cnt > 0) {
      println(s"Occurrences of '$c' in the string: $cnt")
    } else {
      println(s"'$c' is not present in the string.")
    }
  }
}

##

import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object StringManipulator {
  def removeCharAtPosition(str: String, position: Int): String = {
    if (position >= 0 && position < str.length) {
      str.take(position) + str.drop(position + 1)
    } else {
      "Position is out of the valid range."
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the string:")
    val inputString = readLine()

    println("Enter the position to remove the character from (0-based index):")
    val inputPosition = readInt()

    val result = removeCharAtPosition(inputString, inputPosition)
    println(s"Resulting string: $result")
  }
}

##

import scala.io.StdIn.readLine

object PalindromeChecker {
  def main(args: Array[String]): Unit = {
    println("Enter a string to check if it is a palindrome:")
    val input = readLine().trim

    input match {
      case "" =>
        println("The string is empty. It is considered a palindrome.")
      case _ =>
        if (input == input.reverse) {
          println(s"The string '$input' is a palindrome.")
        } else {
          println(s"The string '$input' is not a palindrome.")
        }
    }
  }
}


##2

import scala.io.StdIn._

object StringRotationChecker {
  def areRotations(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) {
      false
    } else {
      (s1 + s1).contains(s2)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the first string:")
    val str1 = readLine().trim

    println("Enter the second string:")
    val str2 = readLine().trim

    if (areRotations(str1, str2)) {
      println(s"'$str2' is a rotation of '$str1'.")
    } else {
      println(s"'$str2' is not a rotation of '$str1'.")
    }
  }
}

##

import scala.io.StdIn._

object StringSearchInArray {
  def main(args: Array[String]): Unit = {
    println("Enter the number of elements in the array:")
    val numberOfElements = readInt()

    println(s"Enter $numberOfElements elements, one per line:")
    val array = Array.fill(numberOfElements)(readLine().trim)

    println("Enter a string to search for:")
    val searchString = readLine().trim

    val matchingElements = array.filter(element => element.contains(searchString))

    if (matchingElements.isEmpty) {
      println(s"No elements contain the string '$searchString'.")
    } else {
      println(s"Elements containing '$searchString':")
      matchingElements.foreach(println)
    }
  }
}

##

import scala.io.StdIn._

object ReverseWords {
  def main(args: Array[String]): Unit = {
    println("Enter a string:")
    val inputString = readLine().trim

    val reversedWords = inputString.split("\\s+").map(_.reverse).mkString(" ")

    println("Reversed words:")
    println(reversedWords)
  }
}

##

import scala.io.StdIn.readLine

object StringAppender {
  def appendStrings(str1: String, str2: String): String = {
    val length1 = str1.length
    val length2 = str2.length

    val (shorter, longer) = if (length1 < length2) (str1, str2.drop(length2 - length1)) 
                            else (str1.drop(length1 - length2), str2)

    shorter + longer
  }

  def main(args: Array[String]): Unit = {
    println("Enter the first string:")
    val firstString = readLine().trim

    println("Enter the second string:")
    val secondString = readLine().trim

    val result = appendStrings(firstString, secondString)

    println("Resulting string:")
    println(result)
  }
}


