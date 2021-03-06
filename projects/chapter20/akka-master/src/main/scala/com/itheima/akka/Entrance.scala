package com.itheima.akka

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

object Entrance {

  def main(args: Array[String]): Unit = {

    val actorSystem = ActorSystem("actorSystem", ConfigFactory.load())

    val masterActor = actorSystem.actorOf(Props(MasterActor), "masterActor")

  }

}
