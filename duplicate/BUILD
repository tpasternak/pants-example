scala_library(
  name = 'lib',
  sources = ['Lib.scala'],
)
jar_library(
	name = 'junit',
	jars = [
		jar(org='junit', name='junit', rev='4.12')
	]
)

junit_tests(
    name = 'test',
    sources = ["LibTest.scala"],
    dependencies= [
      'duplicate:junit',
      'duplicate:lib'
    ]
) 
