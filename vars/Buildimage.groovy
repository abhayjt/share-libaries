def call( dockeruser,  projectname,  tags) {
  echo 'This area builds the code'
  sh "docker build --no-cache -t ${dockeruser}/${projectname}:${tags} ."
  echo "Successfully built the image"
}
