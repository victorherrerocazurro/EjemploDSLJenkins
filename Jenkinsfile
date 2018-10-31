pipeline {
  agent any
  stages {
    stage('Init'){
      steps {
        mvnHome = tool 'M3'
      }
    }
    stage('Build') {
      steps {
        echo 'Contruyendo el proyecto'
        bat(/"${mvnHome}\bin\mvn" compile/)
      }
    }
    stage('Test') {
      steps {
        bat(/"${mvnHome}\bin\mvn" test/)
      }
    }
    stage('Publish') {
      steps {
        junit 'target\\surefire-reports\\*.xml'
      }
    }
  }
}
