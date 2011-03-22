package org.bowlerframework.view.squery

import org.bowlerframework.{Request, RequestScope, Response}

/**
 * Created by IntelliJ IDEA.
 * User: wfaler
 * Date: 14/03/2011
 * Time: 00:10
 * To change this template use File | Settings | File Templates.
 */

object SqueryRenderer{
  def render(component: Component): Unit = render(component, RequestScope.request, RequestScope.response)

  def render(component: Component, request: Request, response: Response): Unit = {
    response.getWriter.write(component.render.toString)
    request.getSession.resetValidations
  }
}