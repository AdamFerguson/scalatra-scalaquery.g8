# Scalatra/ScalaQuery project #

A derivative of [Scalatra sbt project](https://github.com/scalatra/scalatra-sbt.g8) this repo is intended to get a scalatra/scalaquery based web app setup quickly.

## Use this template ##

- [Install giter8 (g8)](https://github.com/n8han/giter8)

```sh
$ brew install giter8
```

- Get the g8 template and run it:

```sh
$ g8 AdamFerguson/scalatra-scalaquery
$ cd <name-of-app>
$ ./sbt
> container:start
```

- Open the [default website](http://localhost:8080/) in your browser.

### JRebel ###

Note: I recommend checking out [JRebel](http://zeroturnaround.com/software/jrebel/buy/) for auto code redploys.
is an IDE plugin that eases auto-deploy on code changes. They offer free one year licenses for Scala developers.
It's definitely worth a look.

### Database ###

This template is setup to work with postgres. The template will prompt you for the database name. This database
will still need to be created locally. Make sure to run:

```sh
createdb DATABASE_NAME
```

From there, ScalaQuery can be used for creating the DB schema using ScalaQuery's [DDL API](https://github.com/szeiger/scala-query/wiki/Getting-Started)

## Modify this template ##

- [Install sbt](https://github.com/harrah/xsbt/wiki/Getting-Started-Setup), version 0.12.0 or higher.
- Fork [scalatra/scalatra-sbt.g8](https://github.com/AdamFerguson/scalatra-slick.g8) on GitHub to your account.
Let's assume your account is "foo".
- Clone it.

```sh
$ git clone git@github.com:foo/scalatra-slick.g8.git
```

- Now make your desired changes.
- Do a local deploy of your modified template and try it out.

```sh
$ sbt
> g8-test # must result in SUCCESS
> exit
$ cd target/sbt-test/default-*/scripted
$ sbt
$ container:start
```

- If you like your new template, push it to GitHub.

```sh
$ cd /path/to/scalatra-slick.g8.git
$ git push
```

- You can now access your modified template using g8.

```sh
$ cd
$ g8 foo/scalatra-slick.g8
```

- If you'd like to share your changes, send a pull request.
