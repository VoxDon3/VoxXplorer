package ax.Ga;

import android.util.Log;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class b extends Formatter {
    private final int a;
    private final int b;

    b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.logging.Formatter
    public String format(LogRecord logRecord) {
        String loggerName = logRecord.getLoggerName();
        int threadID = logRecord.getThreadID();
        String formatMessage = formatMessage(logRecord);
        String stackTraceString = Log.getStackTraceString(logRecord.getThrown());
        if (stackTraceString != null && stackTraceString.length() > 0) {
            stackTraceString = "\n" + stackTraceString;
        }
        String str = "[%5$6s:%4$2s][%6$-" + this.a + "s][%1$-" + this.b + "s] %2$s%3$s%n";
        if (!(logRecord instanceof d)) {
            return String.format(str, loggerName, formatMessage, stackTraceString, Integer.valueOf(threadID), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        d dVar = (d) logRecord;
        return String.format(str, loggerName, formatMessage, stackTraceString, Integer.valueOf(threadID), Long.valueOf(dVar.a()), dVar.b());
    }
}
