package com.fmpwizard.lib

import net.liftweb.common.Loggable
import net.liftweb.actor.LAFuture
import xml.NodeSeq
import net.liftweb.util.CssSel
import net.liftweb.util.Helpers._
import net.liftweb.actor._
import net.liftweb.common.Loggable
import xml.NodeSeq

object MyAppLogic extends Loggable {

  /**
   * On page render, call services to fulfill the LAFuture
   */
  def querySlowService1(la: LAFuture[CssSel]) {
    println("querySlowService1")
    Thread.sleep(9000L)
    val ns = "*" #> (<span class="alert alert-success">ONE</span>)
    la.satisfy(ns)

  }
  /**
   * On page render, call services to fulfill the LAFuture
   */
  def querySlowService2(la: LAFuture[CssSel]) {
    logger.info("querySlowService2 was called")
    Thread.sleep(2000L)
    val ns = "*" #> <span class="alert alert-success">TWO</span>
    la.satisfy(ns)
  }

}
