#!/usr/bin/env groovy

pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh 'make check'
            }
        }
    }
    post {
        always {
            junit '**/target/*.xml'
        }
        failure {
            mail to: petri.sadinmaki@qubilea.fi, subject: 'The Pipeline failed :('
        }
    }
}