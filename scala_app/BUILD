jvm_binary(name = 'main-scala-bin',
  dependencies = ['scala_lib'],
  sources = globs('com/**/*.scala'),
  main = 'com.Hello',
  basename = 'hello-scala-example',
)

junit_tests(
  name = 'hello-tests-scala',
  sources = ['tests/*.scala']

)