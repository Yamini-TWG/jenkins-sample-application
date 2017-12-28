pipelineJob('jenkins-sample-application-build') {
    description('Build Jenkins Sample Application')
    triggers {
        scm('*/5 * * * *')
    }
    definition {
        cpsScm {
            scm {
                git('git@github.com:darthShana/jenkins-sample-application.git') {
                    node -> node / extensions()
                    credentials('GitHub-repo')
                }
            }
            scriptPath('build/Jenkinsfile')
        }
    }
}