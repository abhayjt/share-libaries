def call() {
    withCredentials([usernamePassword(
        credentialsId: "dockerHubCred",
        usernameVariable: "dockerHubUser",
        passwordVariable: "dockerHubPass"
    )]) {
        sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'
        sh "docker image tag nodeapp:latest ${dockerHubUser}/nodeapp:latest"
        sh "docker push ${dockerHubUser}/nodeapp:latest"
    }
}
