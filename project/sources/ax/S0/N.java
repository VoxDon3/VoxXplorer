package ax.S0;

import android.os.Trace;

/* loaded from: classes.dex */
public final class N {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
