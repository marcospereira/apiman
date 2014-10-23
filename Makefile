setup:
	@brew install maven

run:
	@mvn clean install -Prun-all-wildfly8 -Dmaven.test.skip=true
