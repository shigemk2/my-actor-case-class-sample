package com.example

import akka.actor.Actor
import akka.event.Logging

case class MyCaseClass(prop1: Int, prop2: String)

class MyActor extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case MyCaseClass(prop1, prop2) => {
      log.info("prop1: %d, prop2: %s" format (prop1, prop2))
    }
    case _ => {
    }
  }
}
