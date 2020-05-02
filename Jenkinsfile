node {
	stage('SCM Checkout') {
		git 'https://github.com/Ellodssa/vaadinbank'
	}
	stage('Compile-Package'){
		sh 'mvn compile jib:build -DsendCredentialsOverHttp=true -Djib.httpTimeout=0 -Pproduction'
	}
}