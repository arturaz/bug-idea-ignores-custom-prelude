package example

@main def main(args: String*): Unit = {
  doStuff(5.seconds)
}

def doStuff(fd: FiniteDuration): Unit = {
  println(s"Hi, $fd")
}
