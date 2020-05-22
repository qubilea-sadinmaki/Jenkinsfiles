#!/usr/bin/env groovy

properties([parameters([string(defaultValue: 'Hello', description: 'How should I greet the world?', name: 'Greeting')])])

node {
    checkout scm
    stage('Build') {
        echo 'Building....'
        echo "${params.Greeting} World!"
    }
    stage('Test') {
        echo 'Testing....'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}