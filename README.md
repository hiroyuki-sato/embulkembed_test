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
java -cp build/classes/main:/Users/hsato/.embulk/bin/embulk EmbulkEmbedTest /tmp/config.yml
```
