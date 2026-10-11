/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.K7.i;

final class b
extends i {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;

    b(String string, String string2, String string3, String string4, long l8) {
        if (string != null) {
            this.b = string;
            if (string2 != null) {
                this.c = string2;
                if (string3 != null) {
                    this.d = string3;
                    if (string4 != null) {
                        this.e = string4;
                        this.f = l8;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public String d() {
        return this.d;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof i && this.b.equals(((i)(object = (i)object)).e()) && this.c.equals(((i)object).c()) && this.d.equals(((i)object).d()) && this.e.equals(((i)object).g()) && this.f == ((i)object).f();
    }

    @Override
    public long f() {
        return this.f;
    }

    @Override
    public String g() {
        return this.e;
    }

    public int hashCode() {
        int n8 = this.b.hashCode();
        int n9 = this.c.hashCode();
        int n10 = this.d.hashCode();
        int n11 = this.e.hashCode();
        long l8 = this.f;
        return ((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RolloutAssignment{rolloutId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", parameterKey=");
        stringBuilder.append(this.c);
        stringBuilder.append(", parameterValue=");
        stringBuilder.append(this.d);
        stringBuilder.append(", variantId=");
        stringBuilder.append(this.e);
        stringBuilder.append(", templateVersion=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

