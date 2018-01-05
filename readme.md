Just a simple hello world program.

Build the project with

gradlew build

A file local.properties with the following content must be provided to upload the artifacts to the bintray repository

bintray.user=YOUR_BINTRAY_USERNAME
bintray.apikey=YOUR_BINTRAY_API_KEY
bintray.gpg.password=YOUR_GPG_PASSWORD

gradlew bintrayUpload uploads the artifacts to bintray

gradlew jacocoTestReport runs the test coverage report