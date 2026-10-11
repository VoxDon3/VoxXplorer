/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Binder;
import ax.b6.O2;

public final class P2 {
    public static <V> V a(O2<V> o22) {
        V v8;
        try {
            v8 = o22.a();
        }
        catch (SecurityException securityException) {
            long l8 = Binder.clearCallingIdentity();
            try {
                o22 = o22.a();
                return (V)o22;
            }
            finally {
                Binder.restoreCallingIdentity((long)l8);
            }
        }
        return v8;
    }
}

