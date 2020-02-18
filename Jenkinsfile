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
                        sh 'mvn clean install'
                    }
                    else {
                        bat 'mvn clean install'
                    }
                }
            }
        }

        stage('Maven deploy') {
            steps {
                sh 'echo todo'
            }
        }
    }
}