<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
<log4j:configuration debug="true"
                     xmlns:log4j='http://jakarta.apache.org/log4j/'>

    <appender name="console" class="org.apache.log4j.ConsoleAppender">
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern"
                   value="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n something else" />
        </layout>
    </appender>

    <root>
        <level value="DEBUG" />
        <appender-ref ref="console" />
    </root>

</log4j:configuration>