def call (sample){
    if (sample) {
        test {
         sh ' mkdir ./target'
         sh "echo 'docker-build-list.yml file  archieve test' > ./target/docker-build-list.yml"
         archiveArtifacts artifacts: 'target/docker-build-list.yml', fingerprint: true, allowEmptyArchive: true
      }
    }
    else {
        println("testing failed")
    }
}