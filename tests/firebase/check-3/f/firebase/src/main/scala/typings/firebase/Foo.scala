package typings.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Foo extends StObject {
  
  def name(p: js.Any): Unit
}
object Foo {
  
  inline def apply(name: js.Any => Unit): Foo = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[Foo]
  }
  
  extension [Self <: Foo](x: Self) {
    
    inline def setName(value: js.Any => Unit): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
  }
}
