/*
 * Decompiled with CFR 0.152.
 */
package ax.Ga;

import java.util.logging.LogRecord;

class d
extends LogRecord {
    private String c0;
    private long q;

    d(LogRecord logRecord, long l8, String string) {
        super(logRecord.getLevel(), logRecord.getMessage());
        this.setSequenceNumber(logRecord.getSequenceNumber());
        this.setSourceClassName(logRecord.getSourceClassName());
        this.setSourceMethodName(logRecord.getSourceMethodName());
        this.setThreadID(logRecord.getThreadID());
        this.setMillis(logRecord.getMillis());
        this.setThrown(logRecord.getThrown());
        this.setLoggerName(logRecord.getLoggerName());
        this.setResourceBundleName(logRecord.getResourceBundleName());
        this.setResourceBundle(logRecord.getResourceBundle());
        this.setParameters(logRecord.getParameters());
        this.q = l8;
        this.c0 = string;
    }

    long a() {
        return this.q;
    }

    String b() {
        return this.c0;
    }
}

