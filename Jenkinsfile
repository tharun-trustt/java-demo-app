pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/YOUR-USERNAME/java-demo-app.git'
            }
        }

        stage('Build App') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy App') {
            steps {
                sh '''
                    pkill -f myapp.jar || true
                    cp target/*.jar /home/ec2-user/myapp.jar
                    nohup java -jar /home/ec2-user/myapp.jar > app.log 2>&1 &
                '''
            }
        }
    }
}
