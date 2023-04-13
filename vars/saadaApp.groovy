def call(String repoUrl){
	pipeline{
  agent any  
  stages{
    stage('1-clone'){
      steps{
        sh 'lscpu'
      }
    }
    stage('2-parallel-job'){
      parallel{
        stage('1-parallel-sub-Saada-job1'){
          steps{
            sh 'lscpu'
          }
        }
        stage('2-parallel-job Francis-job2'){
          steps{
            sh 'df -h'
          }
        }
        stage('3-parallel-job Nelson-job3'){
          steps{
            sh 'df -h'
          }
        }
      }
    }
  }
}
}
