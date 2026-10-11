/*
 * Decompiled with CFR 0.152.
 */
package ax.C3;

import android.os.Trace;

public abstract class d {
    public static void a(String string) {
        Trace.beginSection((String)string);
    }

    public static void b() {
        Trace.endSection();
    }
}

