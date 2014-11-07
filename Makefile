setup:
	@brew install maven

clean:
	@mvn clean

run: clean
	@mvn install -Pinstall-all-wildfly8 -Dmaven.test.skip=true
	@chmod +x ./apiman-tools/apiman-tools-dev-server-all/target/wildfly-8.1.0.Final/bin/standalone.sh
	@./apiman-tools/apiman-tools-dev-server-all/target/wildfly-8.1.0.Final/bin/standalone.sh
