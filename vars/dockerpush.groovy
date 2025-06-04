def call(String projectName, String version) {
    withCredentials([usernamePassword(
        credentialsId: "dockerHubCred",
        usernameVariable: "dockerHubUser",
        passwordVariable: "dockerHubPass"
    )]) {
        echo "Logging into Docker Hub..."
        sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'

        echo "Tagging the image for Docker Hub..."
        sh "docker tag nodeapp:latest ${dockerHubUser}/${projectName}:${version}"

        echo "Pushing the image to Docker Hub..."
        sh "docker push ${dockerHubUser}/${projectName}:${version}"

        echo "Successfully pushed: ${dockerHubUser}/${projectName}:${version}"
    }
}

 
