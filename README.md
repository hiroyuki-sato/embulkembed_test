## EmbulkEmbedTest

This is an example of the EmbulkEmbed program.
The EmbulkEmbeded is an Embedded program for [Embulk](http://embulk.org).

## Usage

```
cd /tmp
embulk example foo
embulk guess foo/seed.yml -o config.yml
```


```
git clone https://github.com/hiroyuki-sato/embulkembed_test
cd embulkembed_test
./gradlew build
```

```
embulk mkbundle /tmp/embulk_bundle
```

```
export GEM_HOME=/tmp/embulk_bundle/jruby/2.3.0/
java -cp build/classes/main:/path/to/embulk.jar EmbulkEmbedTest /tmp/config.yml
```

You can download embulk.jar from this [site](https://dl.bintray.com/embulk/maven/).

The embulk command is the synonym of embulk-x.y.z.jar.
So you can also add the embulk command path instead of the jar file.

```
java -cp build/classes/main:/path/to/home/.embulk/bin/embulk EmbulkEmbedTest /tmp/config.yml
```
