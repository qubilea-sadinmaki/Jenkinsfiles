#!/usr/bin/env groovy

pipeline {
   agent any
   
   environment{
       SURENAME = 'Petri'
       LASTNAME = 'Sadinmäki'
   }

   stages {
      stage('Deploy') {
         steps {
            sh ''' 
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
