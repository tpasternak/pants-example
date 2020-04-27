#!/bin/bash
for i in $(seq 1 100);
do
	x=$(cat <<EOF
jvm_binary(name = 'project$i',
      dependencies = ["java_hellos_lib"],
      sources = ['com/**/*.java'],
      main = 'com.HelloWorld',
      basename = 'hello-example',
) 
EOF
	 )
    echo "$x" >> BUILD.tmp;
done
mv BUILD.tmp BUILD
