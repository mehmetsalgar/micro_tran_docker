FROM jboss/base-jdk:8

RUN mkdir -p /opt/jboss/modules/system/layers/base/org/salgar
COPY assembler/target/assembler-1.0-SNAPSHOT-package/modules/system/layers/base/org/salgar/* /opt/jboss/modules/system/layers/base/org/salgar

RUN mkdir -p /opt/jboss/standalone/deployments
COPY assembler/target/assembler-1.0-SNAPSHOT-package/standalone/deployments/* /opt/jboss/deployments

CMD ["-b", "0.0.0.0"]