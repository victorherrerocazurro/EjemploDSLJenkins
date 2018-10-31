pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Contruyendo el proyecto'
        withMaven(maven : 'M3') {
          sh 'mvn compile'
        }
      }
    }
    stage('Test') {
      steps {
        withMaven(maven : 'M3') {
          sh 'mvn test'
        }
      }
    }
    stage('Publish') {
      steps {
        junit 'target\\surefire-reports\\*.xml'
      }
    }
  }
}
