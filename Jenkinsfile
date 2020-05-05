node {
	stage('SCM Checkout') {
		git 'https://github.com/user22-git/vaadinbank'
	}
	stage('Compile-Package'){
		def mvnHome = tool name: 'D:\\maven', type: 'maven'
		bat "${mvnHome}/bin/mvn compile jib:build -DsendCredentialsOverHttp=true -Djib.httpTimeout=0 -Pproduction"
	}
}
