pipelineJob('jenkins-sample-application-build') {
    description('Build Jenkins Sample Application')
    triggers {
        scm('*/5 * * * *')
    }
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url("git@github.com:darthShana/jenkins-sample-application.git")
                        credentials('GitHub-repo')
                    }
                }
            }
            scriptPath('build/Jenkinsfile')
        }
    }
}