/*
 * Decompiled with CFR 0.152.
 */
package ax.Ga;

import android.util.Log;
import ax.Ga.d;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class c
extends Handler {
    private final String a;

    public c(String string) {
        this.a = string;
    }

    private static int a(Level level) {
        int n8 = level.intValue();
        if (n8 >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (n8 >= Level.WARNING.intValue()) {
            return 5;
        }
        if (n8 >= Level.INFO.intValue()) {
            return 4;
        }
        return 3;
    }

    @Override
    public void close() throws SecurityException {
    }

    @Override
    public void flush() {
    }

    @Override
    public void publish(LogRecord object) {
        if (super.isLoggable((LogRecord)object)) {
            Object object2 = Thread.currentThread();
            long l8 = ((Thread)object2).getId();
            if ((object2 = ((Thread)object2).getName()) == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("thread-");
                ((StringBuilder)object2).append(l8);
                object2 = ((StringBuilder)object2).toString();
            }
            object = new d((LogRecord)object, l8, (String)object2);
            int n8 = c.a(((LogRecord)object).getLevel());
            object2 = this.getFormatter();
            if (object2 != null) {
                object = ((Formatter)object2).format((LogRecord)object);
                Log.println((int)n8, (String)this.a, (String)object);
            }
        }
    }
}

