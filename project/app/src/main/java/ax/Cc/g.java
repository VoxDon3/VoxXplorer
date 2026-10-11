/*
 * Decompiled with CFR 0.152.
 */
package ax.Cc;

public final class g {
    private final long a;
    private final long b;

    public g(long l8, long l9) {
        if (l8 >= 0L) {
            if (l9 >= 0L) {
                this.a = l8;
                this.b = l9;
                return;
            }
            throw new IllegalArgumentException("numbytes must not be negative");
        }
        throw new IllegalArgumentException("offset must not be negative");
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && g.class == object.getClass()) {
            object = (g)object;
            if (this.a == ((g)object).a && this.b == ((g)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a, this.b});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TarArchiveStructSparse{offset=");
        stringBuilder.append(this.a);
        stringBuilder.append(", numbytes=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

