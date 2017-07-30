package org.haosu.sandbox.grpclibs

import com.haosu.sandbox.grpclibs.YoOuterClass.{Yo, YoOrBuilder}

object Main extends App {
  val yo = Yo.newBuilder().setYo(5).build()

  println(yo.getYo)
}
