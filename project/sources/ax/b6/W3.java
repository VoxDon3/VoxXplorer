package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class W3 {
    private static volatile W3 b;
    static final W3 c = new W3(true);
    private final Map<a, AbstractC1599k4.f<?, ?>> a;

    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
        }
    }

    W3() {
        this.a = new HashMap();
    }

    public static W3 a() {
        W3 w3 = b;
        if (w3 != null) {
            return w3;
        }
        synchronized (W3.class) {
            try {
                W3 w32 = b;
                if (w32 != null) {
                    return w32;
                }
                W3 b2 = AbstractC1581i4.b(W3.class);
                b = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <ContainingType extends U4> AbstractC1599k4.f<ContainingType, ?> b(ContainingType containingtype, int i) {
        return (AbstractC1599k4.f) this.a.get(new a(containingtype, i));
    }

    private W3(boolean z) {
        this.a = Collections.EMPTY_MAP;
    }
}
