# logger-test

This application created to test the logger functionality with the Spring Boot application with the normal log4j app.

Add the below dependencies and properties to get the loggers with archived log files.

<dependency>
			<groupId>log4j</groupId>
			<artifactId>apache-log4j-extras</artifactId>
			<version>1.2.17</version>
		</dependency>
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>
    
    log4j.properties :
    
    log4j.rootLogger=info, file, console

# Direct log messages to a log file
log4j.appender.file=org.apache.log4j.rolling.RollingFileAppender
log4j.appender.file.File=logs/msg.log
log4j.appender.file.RollingPolicy=org.apache.log4j.rolling.TimeBasedRollingPolicy
log4j.appender.file.RollingPolicy.ActiveFileName =logs/msg.log
log4j.appender.file.MaxFileSize=1MB
log4j.appender.file.MaxBackupIndex=5
log4j.appender.file.RollingPolicy.FileNamePattern=logs/msg.%d{yyyyMMdd.HHmmss}.gz
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=%d{ABSOLUTE} %5p %c{1}:%L - %m%n


# Direct log messages to console
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.Target=System.out
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
