# Distributed Systems - Lab 4 (Middleware)
[Java / Python | gRPC] University project

## How to build the project:

### For Java:

1. Download core from [here](https://github.com/grpc/grpc-java/releases).

2. Put project files into extracted ```grpc-java-*/examples/src/main```:
   - in ```/proto``` paste ```Hospital.proto``` file,
   - in ```/java/someJavaPackage``` paste Java files.

3. ```cd ../../..``` - go upper to _examples_ directory.

4. Add dependencies to ```build.gradle``` (in _grpc-java-*/examples_):
   ```
   ...
   task mainServer(type: CreateStartScripts) {
       mainClassName = 'someJavaPackage.MainServer'
       applicationName = 'main-server'
       outputDir = new File(project.buildDir, 'tmp')
       classpath = jar.outputs.files + project.configurations.runtime
   }
   applicationDistribution.into('bin') {
     ...
     from(mainServer)
   }
   ```

5. Generate grpc classes from ```Hospital.proto```:
   
   ```./gradlew installDist``` and ```./gradlew dependencies``` (still in _grpc-java-*/examples_).

6. Run our app via bash (in _grpc-java-*/examples_.):
   
   ```./build/install/examples/bin/main-server```.

7. Upper commands can be further re-run via ```gen_java.sh```.
  
### For Python:

1. Ensure ```Hospital.proto``` is located in home project directory (or uncomment lines in ```gen_python.sh``` if ```Hospital.proto``` is moved to ```grpc-java-*/examples/src/main/proto```).

2. Run ```./gen_python.sh```.

3. Ensure generated grpc python files (```Hospital_pb2.py``` and ```Hospital_pb2_grpc.py```) are located in ```/python``` directory.

### Extras

Directories: ```/gen```, ```/java``` and ```/python``` should be marked as a source directories.