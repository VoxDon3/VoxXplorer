package ax.Ga;

import java.util.logging.LogRecord;

/* loaded from: classes3.dex */
class d extends LogRecord {
    private String c0;
    private long q;

    d(LogRecord logRecord, long j, String str) {
        super(logRecord.getLevel(), logRecord.getMessage());
        setSequenceNumber(logRecord.getSequenceNumber());
        setSourceClassName(logRecord.getSourceClassName());
        setSourceMethodName(logRecord.getSourceMethodName());
        setThreadID(logRecord.getThreadID());
        setMillis(logRecord.getMillis());
        setThrown(logRecord.getThrown());
        setLoggerName(logRecord.getLoggerName());
        setResourceBundleName(logRecord.getResourceBundleName());
        setResourceBundle(logRecord.getResourceBundle());
        setParameters(logRecord.getParameters());
        this.q = j;
        this.c0 = str;
    }

    long a() {
        return this.q;
    }

    String b() {
        return this.c0;
    }
}
