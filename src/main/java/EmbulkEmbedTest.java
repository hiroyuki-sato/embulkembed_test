import java.io.File;
import org.embulk.EmbulkEmbed;
import org.embulk.EmbulkEmbed.Bootstrap;
import org.embulk.config.ConfigLoader;
import org.embulk.config.ConfigSource;

public class EmbulkEmbedTest {
    public static void main(String[] args) throws Exception {
        Bootstrap bootstrap = new EmbulkEmbed.Bootstrap();
        EmbulkEmbed embulk = bootstrap.initializeCloseable();
        System.out.println("*** start EmbulkEmbedTest ***");
        try {
            ConfigLoader loader = embulk.newConfigLoader();
            ConfigSource source = loader.fromYamlFile(new File(args[0]));
            embulk.run(source);
        } finally {
            embulk.destroy();
        }
    }
}

