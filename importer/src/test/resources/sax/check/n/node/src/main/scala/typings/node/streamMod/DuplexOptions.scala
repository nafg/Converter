package typings.node.streamMod

import org.scalablytyped.runtime.UndefOr
import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplexOptions
  extends ReadableOptions
     with WritableOptions {
  var allowHalfOpen: UndefOr[Boolean] = js.undefined
}

object DuplexOptions {
  @scala.inline
  def apply(
    allowHalfOpen: `<undefined>` | Boolean = js.undefined,
    destroy: UndefOr[Error] => _ = null,
    encoding: String = null,
    `final`: /* callback */ js.Function1[UndefOr[Error], Unit] => Unit = null,
    highWaterMark: Int | Double = null,
    objectMode: `<undefined>` | Boolean = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, UndefOr[Double], _] = null
  ): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (`final` != null) __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[DuplexOptions]
  }
}

