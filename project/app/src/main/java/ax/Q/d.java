/*
 * Decompiled with CFR 0.152.
 */
package ax.Q;

import android.content.LocusId;
import android.os.Build;
import ax.b0.g;

public final class d {
    private final String a;
    private final LocusId b;

    public d(String string) {
        this.a = g.k(string, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = ax.Q.d$a.a(string);
            return;
        }
        this.b = null;
    }

    private String b() {
        int n8 = this.a.length();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8);
        stringBuilder.append("_chars");
        return stringBuilder.toString();
    }

    public String a() {
        return this.a;
    }

    public LocusId c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (d.class != object.getClass()) {
            return false;
        }
        object = (d)object;
        String string = this.a;
        if (string == null) {
            return ((d)object).a == null;
        }
        return string.equals(((d)object).a);
    }

    public int hashCode() {
        String string = this.a;
        int n8 = string == null ? 0 : string.hashCode();
        return 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocusIdCompat[");
        stringBuilder.append(this.b());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static class a {
        static LocusId a(String string) {
            return new LocusId(string);
        }
    }
}

