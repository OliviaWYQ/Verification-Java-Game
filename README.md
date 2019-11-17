# Verification-Java-Game

## How to run
Use Eclipse or IDEA to run the game.

Or Use Command Line to run:
```
$ cd ArcadeGameProject/src/
$ java Main
```

Compiler version: 
JDK 1.8
JRE 1.8


## Install JBMC

### 1.https://github.com/diffblue/cbmc/blob/master/COMPILING

   COMPILATION ON MACOS Follow these instructions:

   0) You need a C/C++ compiler, Flex and Bison, and GNU make. To this
      end, first install the XCode from the App-store and then type

      xcode-select --install

      in a terminal window.

   1) Then get the CBMC source via

      git clone https://github.com/diffblue/cbmc cbmc-git

   2) Then type

      cd cbmc-git/src
      make minisat2-download
      make


### 2.https://github.com/diffblue/cbmc/tree/develop/jbmc

   cd cbmc-git

   Before compilation, run the commands:

   make -C src DOWNLOADER=wget minisat2-download
   make -C jbmc/src setup-submodules

   Then compile using:
   make -C jbmc/src


### 3.http://www.cprover.org/jbmc/

   jbmc is inside cbmc-git/jbmc/src/jbmc/

   <some-directory>$ javac my/petty/examples/Simple.java

   <some-directory>$ <path-to-jbmc>/jbmc my/petty/examples/Simple.class --unwind 5 --classpath <path-to-jbmc>/core-models.jar:.



