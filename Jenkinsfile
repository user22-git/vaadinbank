node {

    checkout scm

    docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {
        
		def customImage = docker.build("ellodssa/vaadin-bank-0.0.1")
		
		/* Push the container to the custom registry */
		customImage.push()
    }
}