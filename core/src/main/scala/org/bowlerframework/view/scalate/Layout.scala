package org.bowlerframework.view.scalate

/**
 * Created by IntelliJ IDEA.
 * User: wfaler
 * Date: 21/04/2011
 * Time: 01:16
 * To change this template use File | Settings | File Templates.
 */

case class Layout(name: String, parentLayout: Option[Layout] = None, layoutModel: LayoutModel = new NoopLayoutModel)