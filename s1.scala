object NumberCheck {
  def main(args: Array[String]): Unit = {
    val num = 5
    if (num > 0) {
      println(s"$num is positive")
    } else if (num < 0) {
      println(s"$num is negative")
    } else {
      println(s"$num is Zero")
    }
  }
}

##

object SecondMaximum {
  def main(args: Array[String]): Unit = {
    val a = 5
    val b = 8
    val c = 8
    val d = 8

    var max1 = Int.MinValue
    var max2 = Int.MinValue

    def updateMax(num: Int): Unit = {
      if (num > max1) {
        max2 = max1
        max1 = num
      } else if (num > max2 && num < max1) {
        max2 = num
      }
    }

    updateMax(a)
    updateMax(b)
    updateMax(c)
    updateMax(d)

    println(s"The second maximum number is: $max2")
  }
}

##

object FactorialCalculator {
  def main(args: Array[String]): Unit = {
    val num = 5
    var fact = 1
    var i = num

    while (i > 0) {
      fact = fact * i
      i -= 1
    }

    println(s"Factorial of $num is $fact.")
  }
}

##

object AverageCalculator {
  def main(args: Array[String]): Unit = {
    var sum = 0
    val n1 = 100
    val n2 = 300

    for (i <- n1 to n2) {
      sum += i
    }

    val count = n2 - n1 + 1
    val avg = sum.toDouble / count

    println(s"The sum of numbers between $n1 and $n2 is: $sum")
    println(s"The average is: $avg")
  }
}

##2

import scala.util.Random

object PerfectNumberChecker {
  val numbers = List.fill(5)(Random.nextInt(10000) + 1)

  def isPerfectNumber(n: Int): Boolean = {
    if (n < 2) false
    else (1 until n).filter(n % _ == 0).sum == n
  }

  def main(args: Array[String]): Unit = {
    numbers.foreach { num =>
      if (isPerfectNumber(num)) println(s"$num is a perfect number.")
      else println(s"$num is not a perfect number.")
    }
  }
}


##

object PrimeNumberSum {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else if (n % 2 == 0) false
    else {
      val upperLimit = math.sqrt(n).toInt
      !(3 to upperLimit by 2).exists(d => n % d == 0)
    }
  }

  def main(args: Array[String]): Unit = {
    val sumOfPrimes = (1 to 100).filter(isPrime).sum
    println(s"The sum of prime numbers between 1 and 100 is $sumOfPrimes")
  }
}

##

import scala.io.StdIn

object NumberConversion {
  def toBinary(n: Int): String = n.toBinaryString

  def toOctal(n: Int): String = n.toOctalString

  def main(args: Array[String]): Unit = {
    println("Enter an integer: ")
    val n = StdIn.readInt()
    if (n < 0) {
      println("Please enter a non-negative integer.")
    } else {
      val binaryStr = toBinary(n)
      val octalStr = toOctal(n)
      println(s"Binary representation: $binaryStr")
      println(s"Octal representation: $octalStr")
    }
  }
}

##

import scala.io.StdIn

object FibonacciSeries {
  def printFibonacciSeries(limit: Int): Unit = {
    if (limit < 0) {
      println("Please enter a non-negative number.")
      return
    }
    var a = 0
    var b = 1
    while (a <= limit) {
      println(a)
      val next = a + b
      a = b
      b = next
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the maximum number for the Fibonacci series:")
    val limit = StdIn.readInt()
    printFibonacciSeries(limit)
  }
}

