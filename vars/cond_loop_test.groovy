def call (sample){
    if (sample) {
        sh "echo testing import"
    }
    else {
        println("testing failed")
    }
}