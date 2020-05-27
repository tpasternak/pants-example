jvm_binary(name = 'main-bins4',
  dependencies = ["java_hellos_lib"],
  sources = ['com/**/*.java'],
  main = 'com.HelloWorld',
  basename = 'hello-example',
)

jar_library(
  name='junit_lib',
  jars=[
    jar(org='junit', name='junit', rev='4.13')
  ],
)

jar_library(
  name='guava_lib',
  jars=[
    jar(org='com.google.guava', name='guava', rev='25.1-jre')
  ],
)

junit_tests(
  name = 'hello-tests',
  sources = ['tests/**/*.java'],
  dependencies = ["java_hellos_lib", "java_app:junit_lib", "java_app:guava_lib"],
)