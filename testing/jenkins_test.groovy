#!/usr/bin/env groovy

pipeline {
   agent any
   
   environment{
       SURENAME = 'Petri'
       LASTNAME = 'Sadinmäki'
       SECRET = credentials('SECRET_TEXT')
   }

   stages {
      stage('Deploy') {
         steps {
            sh ''' 
                echo $SECRET_TEXT
                echo $SURENAME $LASTNAME
            ''' 
         }
      }
   }
   
   post{
       always{ echo 'Always' }
       success{ echo 'Success' }
       failure{ echo 'Failure' }
       unstable{ echo 'Unstable' }
   }
}
