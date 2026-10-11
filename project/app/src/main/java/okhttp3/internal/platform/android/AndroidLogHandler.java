/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import ax.Gb.l;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidLogKt;

public final class AndroidLogHandler
extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void publish(LogRecord logRecord) {
        l.f(logRecord, "record");
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String string = logRecord.getLoggerName();
        l.e(string, "record.loggerName");
        int n8 = AndroidLogKt.access$getAndroidLevel(logRecord);
        String string2 = logRecord.getMessage();
        l.e(string2, "record.message");
        androidLog.androidLog$okhttp(string, n8, string2, logRecord.getThrown());
    }
}

