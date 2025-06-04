 def call(dockeruser ,projectname ,tages)
{
    echo 'This area builds the code'
    sh "docker build -t ${dockeruser}/${projectname}:${tages} ."
    echo "Successfully built the image"
}
