#!/usr/bin/env groovy

node {
    checkout scm
    stage('Build') {
        echo 'Building....'
    }
    stage('Test') {
        echo 'Testing....'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
    stage('New Stage') {
        echo 'New Stage....'
    }
}