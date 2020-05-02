node {
	stage('SCM Checkout') {
		git 'https://github.com/Ellodssa/vaadinbank'
	}
	stage('Compile-Package'){
		def mvnHome = tool name: 'Jenkins-maven', type: 'maven'
		sh "${mvnHome}/bin/mvn compile jib:build -DsendCredentialsOverHttp=true -Djib.httpTimeout=0 -Pproduction"
	}
}