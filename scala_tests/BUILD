jar_library(
  name='scalatest_lib',
  jars=[
    scala_jar(org='org.scalatest', name='scalatest', rev='3.1.1')
  ],
  # Is used as an annotation processor.
  scope='compile',
)
junit_tests(name = 'scala_tests',
      dependencies = [
        "scala_tests:scalatest_lib",
        "scala_lib"
      ],
  sources = globs('test/**/*.scala')
)
