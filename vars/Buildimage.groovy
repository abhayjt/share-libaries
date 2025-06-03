 def call(sting projectname,string tages,string dockeruser)
{
    echo 'This area builds the code'
    sh "docker build -t ${dockeruser}/${projectname}:${tages} ."
    echo "Successfully built the image"
}
