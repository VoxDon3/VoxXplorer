package ax.ua;

import j$.util.Objects;

/* renamed from: ax.ua.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3225b extends C3224a {
    private final int b;
    private final String c;

    public C3225b(String str, int i, String str2) {
        super(str);
        this.b = i;
        this.c = str2;
    }

    public String c() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    @Override // ax.ua.C3224a, ax.ua.AbstractC3226c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3225b)) {
            return false;
        }
        C3225b c3225b = (C3225b) obj;
        return super.equals(obj) && d() == c3225b.d() && Objects.equals(c(), c3225b.c());
    }

    @Override // ax.ua.C3224a, ax.ua.AbstractC3226c
    public int hashCode() {
        return (super.hashCode() * 31) + Objects.hash(Integer.valueOf(d()), c());
    }

    public String toString() {
        return String.format("NetShareInfo1{netName: %s, type: %d, remark: %s}", a(b()), Integer.valueOf(d()), a(c()));
    }
}
