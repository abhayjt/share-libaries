def call(String projectName, String version) {
    withCredentials([usernamePassword(
        credentialsId: "dockerHubCred",
        usernameVariable: "dockerHubUser",
        passwordVariable: "dockerHubPass"
    )]) {
        sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'
        sh "docker image tag nodeapp:latest ${dockerHubUser}/${projectName}:${version}"
        sh "docker push ${dockerHubUser}/${projectName}:${version}"
    }
}
