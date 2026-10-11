package ax.P0;

import android.os.Bundle;
import ax.S0.C0968a;
import ax.S0.d0;
import j$.util.Objects;

/* renamed from: ax.P0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0914x {
    private static final String c = d0.G0(0);
    private static final String d = d0.G0(1);
    public final String a;
    public final String b;

    public C0914x(String str, String str2) {
        this.a = d0.d1(str);
        this.b = str2;
    }

    public static C0914x a(Bundle bundle) {
        return new C0914x(bundle.getString(c), (String) C0968a.e(bundle.getString(d)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.a;
        if (str != null) {
            bundle.putString(c, str);
        }
        bundle.putString(d, this.b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0914x c0914x = (C0914x) obj;
            if (Objects.equals(this.a, c0914x.a) && Objects.equals(this.b, c0914x.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
