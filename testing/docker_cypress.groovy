#!/usr/bin/env groovy

node {
    /* Requires the Docker Pipeline plugin to be installed */
    docker.image('cypress/included:3.2.0').inside {
        stage('Test') {
            sh 'cypress run'
        }
    }
}