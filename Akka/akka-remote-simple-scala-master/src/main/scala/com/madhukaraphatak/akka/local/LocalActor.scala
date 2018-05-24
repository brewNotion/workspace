package com.madhukaraphatak.akka.local

import java.io.File

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
 * Local actor which listens on any free port
 */
class LocalActor extends Actor{

  var remoteActor:ActorSelection = _
  @throws[Exception](classOf[Exception])
  override def preStart(): Unit = {
    /*
      Connect to remote actor. The following are the different parts of actor path

      akka.tcp : enabled-transports  of remote_application.conf

      RemoteSystem : name of the actor system used to create remote actor

      127.0.0.1:5150 : host and port

      user : The actor is user defined

      remote : name of the actor, passed as parameter to system.actorOf call

     */
    remoteActor = context.actorSelection("akka.tcp://RemoteSystem@127.0.0.1:5150/user/remote")
    println("That 's remote:" + remoteActor)
    remoteActor ! "hi"
  }
  override def receive: Receive = {

    case msg:String => {
      println("got message from remote" + msg)
    }
  }
}



object LocalActor {

  var localActor:ActorRef = _
  def main(args: Array[String]) {

    val configFile = getClass.getClassLoader.getResource("local_application.conf").getFile
    val config = ConfigFactory.parseFile(new File(configFile))
    val system = ActorSystem("ClientSystem",config)
    val rm2 = system.actorSelection("akka.tcp://RemoteSystem@127.0.0.1:5150/user/remote")
    println("rm2 is "+rm2)
    rm2 ! "Rohit"
    localActor = system.actorOf(Props[LocalActor], name="local")
  }


}
