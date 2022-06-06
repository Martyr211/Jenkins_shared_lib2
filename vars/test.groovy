
def call(){
   def set_test = "tesing point of time"
   sh "echo test 2 shared lib"
   println "${set_test}"
   cond_loop_test()
}

// def call(){
//    if ('True'){
//       test {
//          sh ' mkdir ./target'
//          sh "echo 'docker-build-list.yml file  archieve test' > ./target/docker-build-list.yml"
//          archiveArtifacts artifacts: 'target/docker-build-list.yml', fingerprint: true, allowEmptyArchive: true
//       }
//    }
// }
