package typings.react.reactMod

import org.scalablytyped.runtime.UndefOr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[T] extends js.Object {
  var key: UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply[T](key: String = null): Props[T] = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Props[T]]
  }
}

