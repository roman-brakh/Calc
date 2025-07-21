import scala.io.StdIn
import scala.math._

class Calculator {
  def sumNums(x: Int, y: Int = 0): Unit = {
    println(x + y)
  }

  def diffNums(x: Int, y: Int = 0): Unit = {
    println(x - y)
  }

  def multNums(x: Int, y: Int = 1): Unit = {
    println(x * y)
  }

  def divNums(x: Int, y: Int = 1): Unit = {
    val z: Float = x.toFloat / y.toFloat
    println(z)
  }

  def powNum(x: Int, y: Double): Unit = {
    println(pow(x, y).toInt)
  }

  def run(): Unit = {
    val calc = new Calculator
    var running = true

    while (running) {
      println("\n===КАЛЬКУЛЯТОР===")
      println("1. Сложить числа")
      println("2. Вычесть разницу")
      println("3. Умножить числа")
      println("4. Поделить числа")
      println("5. Вычислить степень числа")
      println("0. Выход")

      StdIn.readLine("Выберите действие: ") match {
        case "1" =>
          val Array(x, y) = StdIn.readLine("Введите два числа через пробел: ").split(" ").map(_.toInt)
          calc.sumNums(x, y)
        case "2" =>
          val Array(x, y) = StdIn.readLine("Введите два числа через пробел: ").split(" ").map(_.toInt)
          calc.diffNums(x, y)
        case "3" =>
          val Array(x, y) = StdIn.readLine("Введите два числа через пробел: ").split(" ").map(_.toInt)
          calc.multNums(x, y)
        case "4" =>
          val Array(x, y) = StdIn.readLine("Введите два числа через пробел: ").split(" ").map(_.toInt)
          calc.divNums(x, y)
        case "5" =>
          val x = StdIn.readLine("Введите основание степени: ").toInt
          val y = StdIn.readLine("Введите показатель степени: ").toDouble
          calc.powNum(x, y)
        case "0" => running = false
        case _ => println("Неверный ввод")
      }
    }
  }
}

object Calculator extends App {
  new Calculator().run()
}