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
> update
> eclipse
> container:start
```

- Open the [default website](http://localhost:8080/) in your browser.

### JRebel ###

Note: auto-redeploys in scalatra are somewhat hacky. [JRebel](http://zeroturnaround.com/software/jrebel/buy/)
is an IDE plugin that eases auto-deploy on code changes. They offer free one year licenses for Scala developers.
It's definitely worth a look.

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
