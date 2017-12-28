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
                        credentials('c2a3dc16-57c5-4cd0-be04-c2434cd0d052')
                    }
                }
            }
            scriptPath('build/Jenkinsfile')
        }
    }
}