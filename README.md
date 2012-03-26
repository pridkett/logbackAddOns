logbackAddOns
=============

This is a collection of addons for [logback](http://logback.qos.ch/).
Well, actually, it's just one. A syntax highlighter plugin.

Usage
-----

There are two steps to using this plugin, first you need to tell logback
that the plugin exists. To do that drop this chunk of text at the top of
your `<configuration>` block:

    <conversionRule conversionWord="colorlvl"·
                    converterClass="net.wagstrom.logging.logbackAddOns.AnsiColorConverter" />

Now, the colorlvl tag will render the level in a different color. This
makes it much easier to pick out errors. However, to take care of that
you'll need to put this tag inside one of the appenders, usually the
console appender. For your benefit, here's the complete logback.xml
that can accomplish this:

```
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <conversionRule conversionWord="colorlvl" 
                  converterClass="net.wagstrom.logging.logbackAddOns.AnsiColorConverter" /> 

  <!-- default console appender, with coloring -->
  <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
    <encoder class="ch.qos.logback.core.encoder.LayoutWrappingEncoder">
      <layout class="ch.qos.logback.classic.PatternLayout">
        <pattern>%d{HH:mm:ss} [%thread] %-5colorlvl %logger{36} %file:%line - %msg%n</pattern>
      </layout>
    </encoder>
  </appender>
   
  <root level="INFO">
    <appender-ref ref="STDOUT" />
  </root>
</configuration>
```
