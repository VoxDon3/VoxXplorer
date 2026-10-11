package ax.h8;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ax.h8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2169d {
    private static volatile C2169d b;
    private final Set<f> a = new HashSet();

    C2169d() {
    }

    public static C2169d a() {
        C2169d c2169d;
        C2169d c2169d2 = b;
        if (c2169d2 != null) {
            return c2169d2;
        }
        synchronized (C2169d.class) {
            try {
                c2169d = b;
                if (c2169d == null) {
                    c2169d = new C2169d();
                    b = c2169d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2169d;
    }

    Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
