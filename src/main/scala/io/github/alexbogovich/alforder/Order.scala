package io.github.alexbogovich.alforder

object Order {
  def isAlphabetic(s: String): Boolean = {
    s.foldLeft(('a', true)) { (acc, v) => (v, acc._2 && acc._1 <= v) }._2
  }
}
