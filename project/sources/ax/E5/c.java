package ax.E5;

import android.os.Bundle;
import ax.K5.a;
import ax.M5.C0819n;

/* loaded from: classes3.dex */
public final class c implements a.d {
    public static final c c0 = new c(new Bundle(), null);
    private final Bundle q;

    /* synthetic */ c(Bundle bundle, i iVar) {
        this.q = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.q);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return C0819n.a(this.q, ((c) obj).q);
        }
        return false;
    }

    public final int hashCode() {
        return C0819n.c(this.q);
    }
}
