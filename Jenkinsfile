pipeline
{
    agent any
    
        stages
        {
            stage('checkout code')
            {
                steps
                {
                    git url 'https://github.com/Raju9934/javaapp.git', branch: 'main'
                }
            }
            stage('build code using maven')
            {
                steps
                {
                   sh 'mvn clean package'
                }
            }
            stage('test the code using maven')
            {
                steps
                {
                    sh 'mvn test'
                }
            }
            stage('Package the code using maven')
            {
                steps
                {
                    sh 'mvn package'
                }
            }
            stage('Creating image of the java application')
            {
                steps
                {
                    //creating docker image
                    sh 'docker build -t java-app:1.0.0 .'

                }
            }
            stage('Taggin image')
            {
                steps
                {
                    sh 'docker tag java-app:1.0.0 2024dock/java-app:1.0.0 '
                }
            }
            stage("Pushing image on docker hub")
            {
                steps
                {
                    sh 'docker push 2024dock/java-app:1.0.0'
                }

            }
            post
            {
                always
                {
                    //clean up the workspace after the build
                    ech 'Cleaning up workspace'
                    cleanWs()
                }
                success
                {
                    echo 'Build succeeded!'
                }
                failure
                {
                    echo 'Build failed'
                }
            }
    
        }
    }