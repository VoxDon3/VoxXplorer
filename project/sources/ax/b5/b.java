package ax.b5;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class b {
    private static final m a;
    protected static final ThreadLocal<SoftReference<C1500a>> b;

    static {
        boolean z;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z ? m.a() : null;
        b = new ThreadLocal<>();
    }

    public static C1500a a() {
        ThreadLocal<SoftReference<C1500a>> threadLocal = b;
        SoftReference<C1500a> softReference = threadLocal.get();
        C1500a c1500a = softReference == null ? null : softReference.get();
        if (c1500a == null) {
            c1500a = new C1500a();
            m mVar = a;
            threadLocal.set(mVar != null ? mVar.c(c1500a) : new SoftReference<>(c1500a));
        }
        return c1500a;
    }
}
