package io.udash.demos.files.views

import io.udash._
import io.udash.demos.files.IndexState

object ErrorViewPresenter extends DefaultViewPresenterFactory[IndexState.type](() => new ErrorView)

class ErrorView extends View {
  import scalatags.JsDom.all._

  private val content = h3(
    "URL not found!"
  ).render

  override def getTemplate: Modifier = content

  override def renderChild(view: View): Unit = {}
}