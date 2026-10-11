/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import android.util.Log;
import ax.Gb.l;
import ax.Ob.h;
import ax.tb.F;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.platform.android.AndroidLogHandler;

@SuppressSignatureCheck
public final class AndroidLog {
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final int MAX_LOG_LENGTH = 4000;
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet();
    private static final Map<String, String> knownLoggers;

    static {
        LinkedHashMap<Object, String> linkedHashMap = new LinkedHashMap<Object, String>();
        Object object = OkHttpClient.class.getPackage();
        object = object != null ? ((Package)object).getName() : null;
        if (object != null) {
            linkedHashMap.put(object, "OkHttp");
        }
        object = OkHttpClient.class.getName();
        l.e(object, "OkHttpClient::class.java.name");
        linkedHashMap.put(object, "okhttp.OkHttpClient");
        object = Http2.class.getName();
        l.e(object, "Http2::class.java.name");
        linkedHashMap.put(object, "okhttp.Http2");
        object = TaskRunner.class.getName();
        l.e(object, "TaskRunner::class.java.name");
        linkedHashMap.put(object, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = F.p(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String object, String string) {
        Logger logger = Logger.getLogger((String)object);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            object = Log.isLoggable((String)string, (int)3) ? Level.FINE : (Log.isLoggable((String)string, (int)4) ? Level.INFO : Level.WARNING);
            logger.setLevel((Level)object);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String string) {
        String string2 = knownLoggers.get(string);
        if (string2 == null) {
            return h.D0(string, 23);
        }
        return string2;
    }

    public final void androidLog$okhttp(String charSequence, int n8, String string, Throwable throwable) {
        l.f(charSequence, "loggerName");
        l.f(string, "message");
        String string2 = this.loggerTag((String)charSequence);
        if (Log.isLoggable((String)string2, (int)n8)) {
            charSequence = string;
            if (throwable != null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append('\n');
                ((StringBuilder)charSequence).append(Log.getStackTraceString((Throwable)throwable));
                charSequence = ((StringBuilder)charSequence).toString();
            }
            int n9 = ((String)charSequence).length();
            int n10 = 0;
            block0: while (n10 < n9) {
                int n11 = h.U(charSequence, '\n', n10, false, 4, null);
                if (n11 == -1) {
                    n11 = n9;
                }
                while (true) {
                    int n12 = Math.min(n11, n10 + 4000);
                    string = ((String)charSequence).substring(n10, n12);
                    l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    Log.println((int)n8, (String)string2, (String)string);
                    if (n12 >= n11) {
                        n10 = n12 + 1;
                        continue block0;
                    }
                    n10 = n12;
                }
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            this.enableLogging(entry.getKey(), entry.getValue());
        }
    }
}

