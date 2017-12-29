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
                        credentials('cad4d603-d641-4132-8b2c-7da2280c8931')
                    }
                }
            }
            scriptPath('build/Jenkinsfile')
        }
    }
}