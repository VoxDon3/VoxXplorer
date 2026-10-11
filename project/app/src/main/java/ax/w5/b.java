/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import ax.n5.e;
import ax.w5.f;
import ax.z5.a;
import java.util.Map;

final class b
extends f {
    private final a a;
    private final Map<e, f.b> b;

    b(a a8, Map<e, f.b> map) {
        if (a8 != null) {
            this.a = a8;
            if (map != null) {
                this.b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override
    a e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof f && this.a.equals(((f)(object = (f)object)).e()) && this.b.equals(((f)object).h());
    }

    @Override
    Map<e, f.b> h() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SchedulerConfig{clock=");
        stringBuilder.append(this.a);
        stringBuilder.append(", values=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

