jar_library(
  name='scalatest_lib',
  jars=[
    scala_jar(org='org.scalatest', name='scalatest', rev='3.1.1'),
    scala_jar(org='org.scalatestplus', name='junit-4-12', rev='3.1.1.0')
  ],
  # Is used as an annotation processor.
  scope='compile',
)

jar_library(
  name='junit_lib',
  jars=[
    jar(org='junit', name='junit', rev='4.13')
  ],
)



junit_tests(
      dependencies = [
        "scala_tests:scalatest_lib",
	"scala_tests:junit_lib",
        "scala_lib"
      ],
  sources = ['*.scala']
)
