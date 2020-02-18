pipeline {
    agent any
    stages {
        stage('Gradle build') {
            steps {
                script {
                    echo 'Building...'
                    if (isUnix()) {
                        sh 'gradle clean build --info'
                    }
                    else {
                        bat 'gradle clean build --info'
                    }
                }
            }
        }

        stage('Gradle deploy') {
            steps {
                sh 'echo todo'
            }
        }
    }
}