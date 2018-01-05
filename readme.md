Just a simple hello world program.

Build the project with

gradlew build

The following properties should be added to the gradle.properties file in the user home directory

bintray.user=YOUR_BINTRAY_USERNAME
bintray.apikey=YOUR_BINTRAY_API_KEY
bintray.gpg.password=YOUR_GPG_PASSWORD

gradlew bintrayUpload uploads the artifacts to bintray

gradlew jacocoTestReport runs the test coverage report

gradle asciidoctor to run the documentation