package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import org.scalablytyped.runtime.UndefOr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterOptions extends js.Object {
  /**
    * An optional flag indicating that the document client should cast
    * empty strings, buffers, and sets to NULL shapes
    */
  var convertEmptyValues: UndefOr[Boolean] = js.undefined
  /**
    * Whether to return numbers as a NumberValue object instead of
    * converting them to native JavaScript numbers. This allows for the
    * safe round-trip transport of numbers of arbitrary size.
    */
  var wrapNumbers: UndefOr[Boolean] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    convertEmptyValues: `<undefined>` | Boolean = js.undefined,
    wrapNumbers: `<undefined>` | Boolean = js.undefined
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertEmptyValues)) __obj.updateDynamic("convertEmptyValues")(convertEmptyValues)
    if (!js.isUndefined(wrapNumbers)) __obj.updateDynamic("wrapNumbers")(wrapNumbers)
    __obj.asInstanceOf[ConverterOptions]
  }
}

