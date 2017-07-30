package org.haosu.sandbox.grpcservices

object Main extends App {
  val yo = Yo.newBuilder().setYo(5).build()

  println(yo.getYo)
}
