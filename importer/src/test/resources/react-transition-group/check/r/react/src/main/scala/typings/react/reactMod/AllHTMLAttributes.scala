package typings.react.reactMod

import org.scalablytyped.runtime.UndefOr
import typings.react.Anon_Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllHTMLAttributes[T] extends HTMLAttributes[T] {
  var accept: UndefOr[String] = js.undefined
  var acceptCharset: UndefOr[String] = js.undefined
}

object AllHTMLAttributes {
  @scala.inline
  def apply[T](
    accept: String = null,
    acceptCharset: String = null,
    children: ReactNode = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    defaultChecked: `<undefined>` | Boolean = js.undefined
  ): AllHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset)
    if (children != null) __obj.updateDynamic("children")(children)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    __obj.asInstanceOf[AllHTMLAttributes[T]]
  }
}

