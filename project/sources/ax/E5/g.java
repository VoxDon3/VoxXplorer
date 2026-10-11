package ax.E5;

import android.os.Bundle;
import ax.K5.a;
import ax.M5.C0819n;

@Deprecated
/* loaded from: classes3.dex */
public final class g implements a.d {
    public static final g e0 = new g(new f());
    private final boolean c0;
    private final String d0;
    private final String q = null;

    public g(f fVar) {
        this.c0 = fVar.a.booleanValue();
        this.d0 = fVar.b;
    }

    static /* bridge */ /* synthetic */ String b(g gVar) {
        String str = gVar.q;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.c0);
        bundle.putString("log_session_id", this.d0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.q;
        return C0819n.b(null, null) && this.c0 == gVar.c0 && C0819n.b(this.d0, gVar.d0);
    }

    public final int hashCode() {
        return C0819n.c(null, Boolean.valueOf(this.c0), this.d0);
    }
}
