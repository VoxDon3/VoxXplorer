/*
 * Decompiled with CFR 0.152.
 */
package ax.Z7;

import ax.Z7.l;
import java.util.List;

final class a
extends l {
    private final String a;
    private final List<String> b;

    a(String string, List<String> list) {
        if (string != null) {
            this.a = string;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override
    public List<String> b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof l && this.a.equals(((l)(object = (l)object)).c()) && this.b.equals(((l)object).b());
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HeartBeatResult{userAgent=");
        stringBuilder.append(this.a);
        stringBuilder.append(", usedDates=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

