/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.n5.b;
import java.util.Arrays;

public final class h {
    private final b a;
    private final byte[] b;

    public h(b b8, byte[] byArray) {
        if (b8 != null) {
            if (byArray != null) {
                this.a = b8;
                this.b = byArray;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.b;
    }

    public b b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        if (!this.a.equals(((h)object).a)) {
            return false;
        }
        return Arrays.equals(this.b, ((h)object).b);
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EncodedPayload{encoding=");
        stringBuilder.append(this.a);
        stringBuilder.append(", bytes=[...]}");
        return stringBuilder.toString();
    }
}

