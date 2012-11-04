package $package$

import org.postgresql.ds.PGSimpleDataSource
import org.scalaquery.session.Database.forDataSource

object DB {
  val db_name = "$db_name$"
  val db_user = "$db_user$"
  val db_password = "$db_password$"

  def database = {
    val ds = new PGSimpleDataSource
    ds.setDatabaseName(db_name)
    ds.setUser(db_user)
    ds.setPassword(db_password)
    forDataSource(ds)
  }
}