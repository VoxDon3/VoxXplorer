package ax.M5;

import android.os.Bundle;
import ax.K5.a;

/* renamed from: ax.M5.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0827w implements a.d {
    public static final C0827w c0 = a().a();
    private final String q;

    /* renamed from: ax.M5.w$a */
    public static class a {
        private String a;

        /* synthetic */ a(C0829y c0829y) {
        }

        public C0827w a() {
            return new C0827w(this.a, null);
        }
    }

    /* synthetic */ C0827w(String str, C0830z c0830z) {
        this.q = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.q;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0827w) {
            return C0819n.b(this.q, ((C0827w) obj).q);
        }
        return false;
    }

    public final int hashCode() {
        return C0819n.c(this.q);
    }
}
