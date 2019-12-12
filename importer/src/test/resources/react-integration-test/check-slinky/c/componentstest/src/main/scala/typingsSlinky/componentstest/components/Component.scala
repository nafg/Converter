package typingsSlinky.componentstest.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Component {
  object raw
    extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.componentstest.componentstestMod.Component] {
    @JSImport("componentstest", "Component")
    @js.native
    object componentImport extends js.Object
    
    override val component: String | js.Object = this.componentImport
    type Props = typingsSlinky.componentstest.componentstestMod.Props
  }
  
  def A(aCallback: () => Double, aMember: Double, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.componentstest.componentstestMod.Component] = {
    val __obj = js.Dynamic.literal(aCallback = js.Any.fromFunction0(aCallback), aMember = aMember.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    this.raw.apply(__obj.asInstanceOf[this.raw.Props])
  }
  def B(bMember: String, bCallback: () => String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.componentstest.componentstestMod.Component] = {
    val __obj = js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any])
    if (bCallback != null) __obj.updateDynamic("bCallback")(js.Any.fromFunction0(bCallback))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    this.raw.apply(__obj.asInstanceOf[this.raw.Props])
  }
}

