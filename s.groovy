pipeline{
    agent any
    properties([
	    buildDiscarder(logRotator(numToKeepStr: '15', artifactNumToKeepStr: '15')),

        parameters([
            string (defaultValue:"niranjan",name:'name'),
            string(college:'college')
        ]
        )

    stages{
        stage("init"){
            echo "init running"
            echo "Hii ${params.name}"
        }
        stage("build"){
            echo "build complete"
        }
    }
}