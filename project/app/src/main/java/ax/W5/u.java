/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.os.Binder;
import ax.W5.v;

public final class u {
    public static Object a(v object) {
        try {
            Object object2 = object.a();
            return object2;
        }
        catch (SecurityException securityException) {
            long l8 = Binder.clearCallingIdentity();
            try {
                object = object.a();
                return object;
            }
            finally {
                Binder.restoreCallingIdentity((long)l8);
            }
        }
    }
}

