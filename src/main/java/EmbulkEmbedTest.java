import java.io.File;
import java.io.IOException;

import org.embulk.EmbulkEmbed;
import org.embulk.EmbulkEmbed.Bootstrap;
import org.embulk.config.ConfigLoader;
import org.embulk.config.ConfigSource;


public class EmbulkEmbedTest {

    public static void main(String args[]) {

        Bootstrap bootstrap = new EmbulkEmbed.Bootstrap();
        EmbulkEmbed embulk = bootstrap.initializeCloseable();
        String path = "path/to/config/embulk.yml";
        try {
            ConfigLoader loader = embulk.newConfigLoader();
            try {
                ConfigSource source = loader.fromYamlFile(new File(path));
                embulk.run(source);
            } catch(IOException e) {
                System.out.println("error" + e);
                System.exit(1);
            }
        } finally {
            embulk.destroy();
        }
    }
}
