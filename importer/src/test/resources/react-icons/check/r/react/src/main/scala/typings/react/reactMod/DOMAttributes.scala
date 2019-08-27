package typings.react.reactMod

import org.scalablytyped.runtime.UndefOr
import typings.react.Anon_Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[T] extends js.Object {
  var children: UndefOr[ReactNode] = js.undefined
  var dangerouslySetInnerHTML: UndefOr[Anon_Html] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply[T](children: ReactNode = null, dangerouslySetInnerHTML: Anon_Html = null): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    __obj.asInstanceOf[DOMAttributes[T]]
  }
}

