/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class AndroidLogKt {
    public static final /* synthetic */ int access$getAndroidLevel(LogRecord logRecord) {
        return AndroidLogKt.getAndroidLevel(logRecord);
    }

    private static final int getAndroidLevel(LogRecord logRecord) {
        Level level;
        int n8 = logRecord.getLevel().intValue();
        if (n8 > (level = Level.INFO).intValue()) {
            return 5;
        }
        if (logRecord.getLevel().intValue() == level.intValue()) {
            return 4;
        }
        return 3;
    }
}

