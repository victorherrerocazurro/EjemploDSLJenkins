pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Contruyendo el proyecto'
        bat 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        bat 'mvn test'
      }
    }
    stage('Publish') {
      steps {
        junit 'target\\surefire-reports\\*.xml'
      }
    }
  }
}