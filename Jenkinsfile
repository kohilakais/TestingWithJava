pipeline {
    agent any

    stages {
        stage('Compile stage') {
            steps{
                withMaven(maven : 'maven_3.8.4') {
                    sh 'mvn clean compile'
                }
            }

        }

        stage ('Testing Stage') {
            steps {
                withMaven(maven : 'maven_3.8.4') {
                    sh 'mvn clean test'
                }
            }
        }
        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3.8.4') {
                    sh 'mvn deploy'
                }
            }
        }

    }
}