echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist MainEXE.class del MainEXE.class
if exist com\telelogic\dishwasher\DishwasherBuilder.class del com\telelogic\dishwasher\DishwasherBuilder.class
if exist com\telelogic\dishwasher\KeyReader.class del com\telelogic\dishwasher\KeyReader.class
if exist com\telelogic\dishwasher\evStart.class del com\telelogic\dishwasher\evStart.class
if exist com\telelogic\dishwasher\evClose.class del com\telelogic\dishwasher\evClose.class
if exist com\telelogic\dishwasher\Display.class del com\telelogic\dishwasher\Display.class
if exist com\telelogic\dishwasher\Dishwasher.class del com\telelogic\dishwasher\Dishwasher.class
if exist com\telelogic\dishwasher\Jet.class del com\telelogic\dishwasher\Jet.class
if exist com\telelogic\dishwasher\Heater.class del com\telelogic\dishwasher\Heater.class
if exist com\telelogic\dishwasher\User.class del com\telelogic\dishwasher\User.class
if exist com\telelogic\dishwasher\ServicePerson.class del com\telelogic\dishwasher\ServicePerson.class
if exist com\telelogic\dishwasher\evKeyPress.class del com\telelogic\dishwasher\evKeyPress.class
if exist com\telelogic\dishwasher\dishwasher_pkgClass.class del com\telelogic\dishwasher\dishwasher_pkgClass.class
if exist com\telelogic\dishwasher\evOpen.class del com\telelogic\dishwasher\evOpen.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


