package com.example

import akka.actor.{ActorSystem, Props}

object Hello {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("mySystem")

    val props = Props[MyActor]
    val actor = system.actorOf(props, name = "myActor")

    val msg1 = new MyCaseClass(123, "abc")
    val msg2 = "test"

    for(i <- 1 to 5) {
      Thread.sleep(1000)
      actor ! msg1
      actor ! msg2
    }
    system.terminate()
  }
}
