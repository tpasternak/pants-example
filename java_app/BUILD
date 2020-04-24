jvm_binary(name = 'main-bins4',
  dependencies = ["java_hellos_lib"],
  sources = ['com/**/*.java'],
  main = 'com.HelloWorld',
  basename = 'hello-example',
)

junit_tests(
  name = 'hello-tests',
  sources = ['tests/**/*.java']
)