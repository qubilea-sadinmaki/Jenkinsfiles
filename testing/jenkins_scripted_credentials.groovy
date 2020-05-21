#!/usr/bin/env groovy

node {
    checkout scm
    stage('Build') {
        echo 'Building....'
withCredentials([sshUserPrivateKey(credentialsId: 'my-ssh-key', keyFileVariable: 'MY_SSH_KEY', passphraseVariable: '', usernameVariable: ''), string(credentialsId: 'SOME_SECRET', variable: 'MY_SECRET')]) {
    echo "MY_SSH_KEY: $MY_SSH_KEY"
    echo "MY_SECRET: $MY_SECRET"
}
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