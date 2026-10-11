/*
 * Decompiled with CFR 0.152.
 */
package ax.ua;

import ax.ua.a;

public class b
extends a {
    private final int b;
    private final String c;

    public b(String string, int n8, String string2) {
        super(string);
        this.b = n8;
        this.c = string2;
    }

    public String c() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b8 = (b)object;
        return super.equals(object) && this.d() == b8.d() && j.Objects.equals((Object)this.c(), (Object)b8.c());
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31 + j.Objects.hash((Object[])new Object[]{this.d(), this.c()});
    }

    public String toString() {
        return String.format("NetShareInfo1{netName: %s, type: %d, remark: %s}", this.a(this.b()), this.d(), this.a(this.c()));
    }
}

