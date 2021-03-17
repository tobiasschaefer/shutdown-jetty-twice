## Bug: ShutdownEvent triggered twice

```
./gradlew build
java -jar build/libs/shutdown-jetty-twice-0.1-all.jar
Ctrl-C
```

will output "Shutdown" twice.
