package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.raw.Empty
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ButtonContentProps1680783343 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
