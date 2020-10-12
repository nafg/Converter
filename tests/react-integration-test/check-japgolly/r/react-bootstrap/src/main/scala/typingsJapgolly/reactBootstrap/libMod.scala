package typingsJapgolly.reactBootstrap

import typingsJapgolly.reactBootstrap.bootstrapUtilsMod.BSProps
import typingsJapgolly.reactBootstrap.buttonGroupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("react-bootstrap/lib", "ButtonGroup")
  @js.native
  class ButtonGroup () extends ^
  
  @JSImport("react-bootstrap/lib", "ToggleButtonGroup")
  @js.native
  class ToggleButtonGroup ()
    extends typingsJapgolly.reactBootstrap.toggleButtonGroupMod.^
  
  object utils {
    
    @JSImport("react-bootstrap/lib", "utils.createChainedFunction")
    @js.native
    def createChainedFunction(funcs: js.Function*): js.Function = js.native
    
    object bootstrapUtils {
      
      @JSImport("react-bootstrap/lib", "utils.bootstrapUtils.getBsProps")
      @js.native
      def getBsProps(props: js.Any): BSProps = js.native
    }
  }
}
