/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.E0;
import ax.Qb.n0;

final class b0
implements n0 {
    private final boolean q;

    public b0(boolean bl) {
        this.q = bl;
    }

    @Override
    public E0 a() {
        return null;
    }

    @Override
    public boolean e() {
        return this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty{");
        String string = this.e() ? "Active" : "New";
        stringBuilder.append(string);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

