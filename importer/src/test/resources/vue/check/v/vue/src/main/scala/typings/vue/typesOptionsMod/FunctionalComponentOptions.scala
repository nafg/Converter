package typings.vue.typesOptionsMod

import org.scalablytyped.runtime.UndefOr
import typings.vue.typesVnodeMod.VNode
import typings.vue.typesVueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionalComponentOptions[Props, PropDefs] extends js.Object {
  var functional: Boolean
  var inject: UndefOr[InjectOptions] = js.undefined
  var name: UndefOr[String] = js.undefined
  var props: UndefOr[PropDefs] = js.undefined
  def render(`this`: UndefOr[scala.Nothing], createElement: CreateElement, context: RenderContext[Props]): VNode
}

object FunctionalComponentOptions {
  @scala.inline
  def apply[Props, PropDefs](
    functional: Boolean,
    render: (UndefOr[scala.Nothing], CreateElement, RenderContext[Props]) => VNode,
    inject: InjectOptions = null,
    name: String = null,
    props: PropDefs = null
  ): FunctionalComponentOptions[Props, PropDefs] = {
    val __obj = js.Dynamic.literal(functional = functional, render = js.Any.fromFunction3(render))
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
  }
}

