# Verification-Java-Game

## How to run the program
Use Eclipse or IDEA to run the game.

Or Use Command Line to run:
```
$ cd ArcadeGameProject/src/
$ java Main
```

Compiler version: 
JDK 1.8
JRE 1.8

## Install Findbugs

Simply install the plugins in IDEA:

https://plugins.jetbrains.com/plugin/3847-findbugs-idea

## Install JBMC

### 1.Get the environment

   https://github.com/diffblue/cbmc/blob/master/COMPILING

   #### MACOS:

   0) You need a C/C++ compiler, Flex and Bison, and GNU make. To this
      end, first install the XCode from the App-store and then type
      ```
      $ xcode-select --install
      ```
      in a terminal window.

   1) Then get the CBMC source via
      ```
      $ git clone https://github.com/diffblue/cbmc cbmc-git
      ```
   2) Then type
      ```
      $ cd cbmc-git/src
      $ make minisat2-download
      $ make
      ```

### 2.Compile JBMC

   https://github.com/diffblue/cbmc/tree/develop/jbmc
   ```
   $ cd cbmc-git
   ```
   Before compilation, run the commands:
   ```
   $ make -C src DOWNLOADER=wget minisat2-download
   $ make -C jbmc/src setup-submodules
   ```
   Then compile using:
   ```
   $ make -C jbmc/src
   ```

### 3.Test the program
   
   http://www.cprover.org/jbmc/

   jbmc is inside cbmc-git/jbmc/src/jbmc/
   ```
   <some-directory>$ javac my/petty/examples/Simple.java

   <some-directory>$ <path-to-jbmc>/jbmc my/petty/examples/Simple.class --unwind 5 --classpath <path-to-jbmc>/core-models.jar:.
   ```

## Install Java Path Finder

https://github.com/javapathfinder/jpf-core/wiki/Build,-Test,-Run

### 1.Install Gradle

#### MACOS
```
$ brew install gradle
```

### 2.Build JPF by Gradle

First, use git to download jpf-core:
```
$ git clone git@github.com:<your_username>/jpf-core.git
```
Then, build JPF with command line:
```
$ cd jpf-core
$ ./gradlew buildJars
$ ./gradlew tasks --all
```
Make sure <jpf-core-dir>/bin/jpf and <jpf-core-dir>/build/RunJPF.jar exist after building.

### 3.Run JPF to test the program
```
<some-directory>$ <jpf-core-dir>/bin/jpf +classpath=. <application-main-class>
```
Notice: There is a space between ` +classpath=. `and `<application-main-class>` !
