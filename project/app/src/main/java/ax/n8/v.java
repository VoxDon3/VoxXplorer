/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.Gb.l;

public final class v {
    private final String a;
    private final int b;
    private final int c;
    private final boolean d;

    public v(String string, int n8, int n9, boolean bl) {
        l.f(string, "processName");
        this.a = string;
        this.b = n8;
        this.c = n9;
        this.d = bl;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof v)) {
            return false;
        }
        object = (v)object;
        if (!l.a(this.a, ((v)object).a)) {
            return false;
        }
        if (this.b != ((v)object).b) {
            return false;
        }
        if (this.c != ((v)object).c) {
            return false;
        }
        return this.d == ((v)object).d;
    }

    public int hashCode() {
        int n8;
        int n9 = this.a.hashCode();
        int n10 = this.b;
        int n11 = this.c;
        int n12 = n8 = this.d;
        if (n8 != 0) {
            n12 = 1;
        }
        return ((n9 * 31 + n10) * 31 + n11) * 31 + n12;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProcessDetails(processName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", pid=");
        stringBuilder.append(this.b);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isDefaultProcess=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

