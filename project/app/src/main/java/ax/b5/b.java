/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import ax.b5.a;
import ax.b5.m;
import java.lang.ref.SoftReference;

public class b {
    private static final m a;
    protected static final ThreadLocal<SoftReference<a>> b;

    static {
        boolean bl;
        try {
            bl = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        }
        catch (SecurityException securityException) {
            bl = false;
        }
        m m8 = bl ? m.a() : null;
        a = m8;
        b = new ThreadLocal();
    }

    public static a a() {
        ThreadLocal<SoftReference<a>> threadLocal = b;
        Object object = threadLocal.get();
        object = object == null ? null : ((SoftReference)object).get();
        Object object2 = object;
        if (object == null) {
            object2 = new a();
            object = a;
            object = object != null ? ((m)object).c((a)object2) : new SoftReference<Object>(object2);
            threadLocal.set((SoftReference<a>)object);
        }
        return object2;
    }
}

