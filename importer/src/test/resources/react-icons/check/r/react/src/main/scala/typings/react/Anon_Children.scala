package typings.react

import org.scalablytyped.runtime.UndefOr
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: UndefOr[ReactNode] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: ReactNode = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_Children]
  }
}

