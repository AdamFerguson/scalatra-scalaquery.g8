package $package$

import org.scalatra.test.scalatest._

class $servlet_name$Tests extends ScalatraSuite with FunSuite {

  addServlet(classOf[$servlet_name$], "/*")

  test("simple get") {
    get("/") {
      status should equal (200)
    }
  }
}
