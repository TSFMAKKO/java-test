@echo off

set MAVEN_VERSION=3.8.4

if not exist .\.mvn\wrapper\maven-wrapper.jar (
    echo Downloading Maven Wrapper %MAVEN_VERSION%...
    mkdir .\.mvn\wrapper
    pushd .\.mvn\wrapper
    curl -O https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/%MAVEN_VERSION%/apache-maven-%MAVEN_VERSION%-bin.zip
    unzip apache-maven-%MAVEN_VERSION%-bin.zip
    move apache-maven-%MAVEN_VERSION%\* .
    rmdir /s /q apache-maven-%MAVEN_VERSION% && del apache-maven-%MAVEN_VERSION%-bin.zip
    popd
)

call .\.mvn\wrapper\maven-wrapper.jar %*
