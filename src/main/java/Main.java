import com.grimfox.gec.MainUi;

import static com.grimfox.logging.LoggingKt.*;

public class Main {

    public static void main(String[] args) {
        supplantSystemOut();
        supplantSystemErr();
        MainUi.mainUi(args);
    }
}