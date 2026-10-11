package ax.Q;

import android.content.LocusId;
import android.os.Build;
import ax.b0.C1446g;

/* loaded from: classes.dex */
public final class d {
    private final String a;
    private final LocusId b;

    private static class a {
        static LocusId a(String str) {
            return new LocusId(str);
        }
    }

    public d(String str) {
        this.a = (String) C1446g.k(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = a.a(str);
        } else {
            this.b = null;
        }
    }

    private String b() {
        return this.a.length() + "_chars";
    }

    public String a() {
        return this.a;
    }

    public LocusId c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        return str == null ? dVar.a == null : str.equals(dVar.a);
    }

    public int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
