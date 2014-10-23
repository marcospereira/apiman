setup:
	@brew install maven

clean:
	@mvn clean

run: clean
	@mvn install -Prun-all-wildfly8 -Dmaven.test.skip=true
