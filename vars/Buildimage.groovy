 def call(dockeruser ,projectname ,tages)
{
    echo 'This area builds the code'
    sh "docker build --no-cache -t ${dockeruser}/${projectname}:${tages} ."
    echo "Successfully built the image"
}
