package io.github.alexbogovich.rainfall

//http://www.codewars.com/kata/rainfall/discuss/scala

object Rain {
  def mean(town: String, string: String): Double = {
    val v = getSeq(town, string)
    if (v.isEmpty) return -1
    v.sum / v.length
  }

  def variance(town: String, string: String): Double = {
    val v = getSeq(town, string)
    if (v.isEmpty) return -1
    val mean = v.sum / v.length
    v.map(d => mean - d).map(d => d * d).sum / v.length
  }

  def getSeq(town: String, string: String): Seq[Double] = {
    string.split("\n")
      .map(s => s.split(":"))
      .map(s => (s(0), s(1)))
      .filter { case (city, _) => city == town }
      .flatMap { case (_, data) => data.split(",") }
      .map(_.split(" ")(1))
      .map(_.toDouble)
  }
}