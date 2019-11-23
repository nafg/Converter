package typingsJapgolly.react.reactMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPortal extends ReactElement {
  var children: Node
}

object ReactPortal {
  @scala.inline
  def apply(children: VdomNode, props: js.Any, `type`: js.Any, key: Key = null): ReactPortal = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPortal]
  }
}

