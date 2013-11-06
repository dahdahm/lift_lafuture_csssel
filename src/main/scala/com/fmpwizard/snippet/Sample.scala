package com.fmpwizard
package snippet

import net.liftweb.util.Helpers._
import net.liftweb.actor._
import net.liftweb.common.Loggable
import xml.NodeSeq
import lib.LiftHelper._
import lib.MyAppLogic._
import net.liftweb.util.CssSel

class Sample extends Loggable {

  val f1: LAFuture[CssSel] = new LAFuture()
  val f2: LAFuture[CssSel] = new LAFuture()

  LAScheduler.execute(() => querySlowService1(f1))
  LAScheduler.execute(() => querySlowService2(f2))

  def render = {

    "#future1" #> f1 &
      ".diego" #> f2 &
      "data-name=another-future" #> f2 &
      "#render-thread *" #> Thread.currentThread().getName

  }

}
