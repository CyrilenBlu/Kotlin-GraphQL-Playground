pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('Maven build') {
            steps {
                script {
                    echo 'Building...'
                    if (isUnix()) {
                        sh 'mvn clean install --info'
                    }
                    else {
                        bat 'mvn clean install --info'
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