jvm_binary(name = 'main-bin',
  dependencies = ["java_hellos_lib"],
  sources = globs('com/**/*.java'),
  main = 'com.HelloWorld',
  basename = 'hello-example',
)

junit_tests(
  name = 'hello-tests',
  sources = ['tests/**/*.java']
)