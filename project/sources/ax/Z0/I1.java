package ax.Z0;

import android.media.metrics.LogSessionId;
import android.os.Build;
import ax.S0.C0968a;
import j$.util.Objects;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class I1 {
    public static final I1 d = new I1(HttpUrl.FRAGMENT_ENCODE_SET);
    public final String a;
    private final a b;
    private final Object c;

    private static final class a {
        public LogSessionId a;

        public a() {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            this.a = logSessionId;
        }

        public void a(LogSessionId logSessionId) {
            LogSessionId logSessionId2;
            boolean equals;
            LogSessionId logSessionId3 = this.a;
            logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId3.equals(logSessionId2);
            C0968a.g(equals);
            this.a = logSessionId;
        }
    }

    public I1(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.c = new Object();
    }

    public synchronized LogSessionId a() {
        return ((a) C0968a.e(this.b)).a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) C0968a.e(this.b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1)) {
            return false;
        }
        I1 i1 = (I1) obj;
        return Objects.equals(this.a, i1.a) && Objects.equals(this.b, i1.b) && Objects.equals(this.c, i1.c);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
