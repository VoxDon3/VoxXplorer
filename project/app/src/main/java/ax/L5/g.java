/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

public final class g<L> {
    private final Object a;
    private final String b;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        return this.a == ((g)object).a && this.b.equals(((g)object).b);
    }

    public int hashCode() {
        return System.identityHashCode(this.a) * 31 + this.b.hashCode();
    }
}

