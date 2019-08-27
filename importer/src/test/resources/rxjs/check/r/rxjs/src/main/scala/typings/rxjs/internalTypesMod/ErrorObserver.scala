package typings.rxjs.internalTypesMod

import org.scalablytyped.runtime.UndefOr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorObserver[T] extends PartialObserver[T] {
  var closed: UndefOr[Boolean] = js.undefined
  var complete: UndefOr[js.Function0[Unit]] = js.undefined
  var next: UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  def error(err: js.Any): Unit
}

object ErrorObserver {
  @scala.inline
  def apply[T](
    error: js.Any => Unit,
    closed: `<undefined>` | Boolean = js.undefined,
    complete: () => Unit = null,
    next: /* value */ T => Unit = null
  ): ErrorObserver[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[ErrorObserver[T]]
  }
}

