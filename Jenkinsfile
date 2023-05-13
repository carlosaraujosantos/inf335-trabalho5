pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main',url:'https://github.com/carlosaraujosantos/inf335-trabalho5-1'

                // Run Maven on a Unix agent.
                sh "cd trabalho4/beans; mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/trabalho4/beans/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'trabalho4/beans/target/*.jar'
                }
            }
        }
    }
}
