#!/usr/bin/env groovy

node {
    checkout scm
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
    stage('Build') {
        echo 'Building....'
        echo "${params.Greeting} World!"
    }
    }
    stage('Test') {
        echo 'Testing....'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}