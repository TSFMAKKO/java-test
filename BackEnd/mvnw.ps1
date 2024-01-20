$MAVEN_VERSION = "3.8.4"

if (-not (Test-Path -Path ".\.mvn\wrapper\maven-wrapper.jar")) {
    Write-Output "Downloading Maven Wrapper $MAVEN_VERSION..."
    New-Item -Path ".\.mvn\wrapper" -ItemType Directory | Out-Null
    Set-Location ".\.mvn\wrapper"
    Invoke-WebRequest -Uri "https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/$MAVEN_VERSION/apache-maven-$MAVEN_VERSION-bin.zip" -OutFile "apache-maven-$MAVEN_VERSION-bin.zip"
    Expand-Archive -Path "apache-maven-$MAVEN_VERSION-bin.zip" -DestinationPath "."
    Move-Item -Path "apache-maven-$MAVEN_VERSION\*" -Destination .
    Remove-Item -Path "apache-maven-$MAVEN_VERSION" -Recurse -Force
    Remove-Item -Path "apache-maven-$MAVEN_VERSION-bin.zip"
    Set-Location ..
}

Invoke-Expression -Command ".\.mvn\wrapper\maven-wrapper.jar $args"
