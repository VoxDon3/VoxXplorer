/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

public final class O {
    public static final O c = new O(0L, 0L);
    public final long a;
    public final long b;

    public O(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && O.class == object.getClass()) {
            object = (O)object;
            if (this.a == ((O)object).a && this.b == ((O)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[timeUs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", position=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

