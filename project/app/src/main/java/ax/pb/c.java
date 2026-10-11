/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.P;
import ax.pb.Q;

public class c {
    private static final int a;
    static Object[] b;
    private static int c;

    static {
        int n8;
        a = n8 = ax.jb.a.d("jcifs.smb.maxBuffers", 16);
        b = new Object[n8];
        c = 0;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] a() {
        Object[] objectArray = b;
        synchronized (objectArray) {
            try {
                if (c <= 0) return new byte[65535];
                int n8 = 0;
                while (n8 < a) {
                    Object[] objectArray2 = b;
                    Object object = objectArray2[n8];
                    if (object != null) {
                        object = (byte[])object;
                        objectArray2[n8] = (byte)null;
                        --c;
                        return object;
                    }
                    ++n8;
                }
                return new byte[65535];
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void b(P p8, Q q8) {
        Object[] objectArray = b;
        synchronized (objectArray) {
            p8.b1 = ax.pb.c.a();
            q8.U0 = ax.pb.c.a();
            return;
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(byte[] byArray) {
        Object[] objectArray = b;
        synchronized (objectArray) {
            try {
                if (c < a) {
                    for (int i8 = 0; i8 < a; ++i8) {
                        Object[] objectArray2 = b;
                        if (objectArray2[i8] != null) continue;
                        objectArray2[i8] = byArray;
                        ++c;
                        return;
                    }
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

