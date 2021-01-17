pipeline {
    agent any
 stages{
     stage("Check GitHub"){
         steps{
         git credentialsId: 'git_credentials', url: 'https://github.com/safaa-09/Triang07.git'
         }
     }
     
     stage("Build Code"){
         steps{
             bat ' mvn compile'
             
         }
     }
     
      stage("Test Unitaire"){
         steps{
             bat 'mvn test'
             
         }
     }
     
          stage("Packaging de l'application "){
         steps{
             bat 'mvn package'
             
         }
          }
 }


}
