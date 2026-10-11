package ax.Ga;

import android.util.Log;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes3.dex */
public class c extends Handler {
    private final String a;

    public c(String str) {
        this.a = str;
    }

    private static int a(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        return intValue >= Level.INFO.intValue() ? 4 : 3;
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        if (super.isLoggable(logRecord)) {
            Thread currentThread = Thread.currentThread();
            long id = currentThread.getId();
            String name = currentThread.getName();
            if (name == null) {
                name = "thread-" + id;
            }
            d dVar = new d(logRecord, id, name);
            int a = a(dVar.getLevel());
            Formatter formatter = getFormatter();
            if (formatter != null) {
                Log.println(a, this.a, formatter.format(dVar));
            }
        }
    }

    @Override // java.util.logging.Handler
    public void close() throws SecurityException {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
