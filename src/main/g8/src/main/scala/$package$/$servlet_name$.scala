package $package$

import org.scalatra._
import scalate.ScalateSupport

class $servlet_name$ extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType="text/html"

    jade("/index")
  }

  notFound {
    // remove content type in case it was set through an action
    contentType = null
    // Try to render a ScalateTemplate if no route matched
    findTemplate(requestPath) map { path =>
      contentType = "text/html"
      layoutTemplate(path)
    } orElse serveStaticResource() getOrElse resourceNotFound()
  }
}
