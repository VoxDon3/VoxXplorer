package ax.r0;

import ax.r0.AbstractC2937y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.r0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2929p {
    private static boolean b = true;
    private static volatile C2929p d;
    private final Map<a, AbstractC2937y.e<?, ?>> a;
    private static final Class<?> c = c();
    static final C2929p e = new C2929p(true);

    /* renamed from: ax.r0.p$a */
    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
        }
    }

    C2929p() {
        this.a = new HashMap();
    }

    public static C2929p b() {
        C2929p c2929p;
        C2929p c2929p2 = d;
        if (c2929p2 != null) {
            return c2929p2;
        }
        synchronized (C2929p.class) {
            try {
                c2929p = d;
                if (c2929p == null) {
                    c2929p = b ? C2928o.a() : e;
                    d = c2929p;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2929p;
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends S> AbstractC2937y.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (AbstractC2937y.e) this.a.get(new a(containingtype, i));
    }

    C2929p(boolean z) {
        this.a = Collections.EMPTY_MAP;
    }
}
