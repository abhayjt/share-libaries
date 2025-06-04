def call() {
  echo 'Deploying code'
  sh "docker compose pull"
  sh "docker compose up -d"
  echo "App is running on port 3000"
}
