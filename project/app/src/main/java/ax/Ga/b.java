/*
 * Decompiled with CFR 0.152.
 */
package ax.Ga;

import android.util.Log;
import ax.Ga.d;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

class b
extends Formatter {
    private final int a;
    private final int b;

    b(int n8, int n9) {
        this.a = n8;
        this.b = n9;
    }

    @Override
    public String format(LogRecord logRecord) {
        CharSequence charSequence;
        String string = logRecord.getLoggerName();
        int n8 = logRecord.getThreadID();
        String string2 = this.formatMessage(logRecord);
        CharSequence charSequence2 = charSequence = Log.getStackTraceString((Throwable)logRecord.getThrown());
        if (charSequence != null) {
            charSequence2 = charSequence;
            if (((String)charSequence).length() > 0) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append("\n");
                ((StringBuilder)charSequence2).append((String)charSequence);
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("[%5$6s:%4$2s][%6$-");
        ((StringBuilder)charSequence).append(this.a);
        ((StringBuilder)charSequence).append("s][%1$-");
        ((StringBuilder)charSequence).append(this.b);
        ((StringBuilder)charSequence).append("s] %2$s%3$s%n");
        charSequence = ((StringBuilder)charSequence).toString();
        if (logRecord instanceof d) {
            logRecord = (d)logRecord;
            return String.format((String)charSequence, string, string2, charSequence2, n8, ((d)logRecord).a(), ((d)logRecord).b());
        }
        return String.format((String)charSequence, string, string2, charSequence2, n8, "", "");
    }
}

