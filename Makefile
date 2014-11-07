setup:
	@brew install maven

config:
	@mvn install -Pinstall-all-wildfly8 -Dmaven.test.skip=true

clean:
	@mvn clean

start:
	@chmod +x ./apiman-tools/apiman-tools-dev-server-all/target/wildfly-8.1.0.Final/bin/standalone.sh
	@./apiman-tools/apiman-tools-dev-server-all/target/wildfly-8.1.0.Final/bin/standalone.sh

run: clean config start
