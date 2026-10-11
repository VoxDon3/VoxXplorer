/*
 * Decompiled with CFR 0.152.
 */
package ax.p8;

import ax.Gb.l;

public final class e {
    private final Boolean a;
    private final Double b;
    private final Integer c;
    private final Integer d;
    private final Long e;

    public e(Boolean bl, Double d8, Integer n8, Integer n9, Long l8) {
        this.a = bl;
        this.b = d8;
        this.c = n8;
        this.d = n9;
        this.e = l8;
    }

    public final Integer a() {
        return this.d;
    }

    public final Long b() {
        return this.e;
    }

    public final Boolean c() {
        return this.a;
    }

    public final Integer d() {
        return this.c;
    }

    public final Double e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (!l.a(this.a, ((e)object).a)) {
            return false;
        }
        if (!l.a(this.b, ((e)object).b)) {
            return false;
        }
        if (!l.a(this.c, ((e)object).c)) {
            return false;
        }
        if (!l.a(this.d, ((e)object).d)) {
            return false;
        }
        return l.a(this.e, ((e)object).e);
    }

    public int hashCode() {
        Comparable<Boolean> comparable = this.a;
        int n8 = 0;
        int n9 = comparable == null ? 0 : comparable.hashCode();
        comparable = this.b;
        int n10 = comparable == null ? 0 : comparable.hashCode();
        comparable = this.c;
        int n11 = comparable == null ? 0 : comparable.hashCode();
        comparable = this.d;
        int n12 = comparable == null ? 0 : comparable.hashCode();
        comparable = this.e;
        if (comparable != null) {
            n8 = comparable.hashCode();
        }
        return (((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionConfigs(sessionEnabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sessionSamplingRate=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionRestartTimeout=");
        stringBuilder.append(this.c);
        stringBuilder.append(", cacheDuration=");
        stringBuilder.append(this.d);
        stringBuilder.append(", cacheUpdatedTime=");
        stringBuilder.append(this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

