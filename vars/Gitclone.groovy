def call(String url, String branch){
  echo 'Hi, this is code, cloning from Git repo main branch'
  git url: "${url}", branch: "${branch}"
  echo "Code cloning successfully"
}
