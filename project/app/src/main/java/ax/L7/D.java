/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.G;

final class D
extends G.b {
    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    D(int n8, String string, int n9, long l8, long l9, boolean bl, int n10, String string2, String string3) {
        this.a = n8;
        if (string != null) {
            this.b = string;
            this.c = n9;
            this.d = l8;
            this.e = l9;
            this.f = bl;
            this.g = n10;
            if (string2 != null) {
                this.h = string2;
                if (string3 != null) {
                    this.i = string3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public long d() {
        return this.e;
    }

    @Override
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof G.b && this.a == ((G.b)(object = (G.b)object)).a() && this.b.equals(((G.b)object).g()) && this.c == ((G.b)object).b() && this.d == ((G.b)object).j() && this.e == ((G.b)object).d() && this.f == ((G.b)object).e() && this.g == ((G.b)object).i() && this.h.equals(((G.b)object).f()) && this.i.equals(((G.b)object).h());
    }

    @Override
    public String f() {
        return this.h;
    }

    @Override
    public String g() {
        return this.b;
    }

    @Override
    public String h() {
        return this.i;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b.hashCode();
        int n10 = this.c;
        long l8 = this.d;
        int n11 = (int)(l8 ^ l8 >>> 32);
        l8 = this.e;
        int n12 = (int)(l8 ^ l8 >>> 32);
        int n13 = this.f ? 1231 : 1237;
        return ((((((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override
    public int i() {
        return this.g;
    }

    @Override
    public long j() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeviceData{arch=");
        stringBuilder.append(this.a);
        stringBuilder.append(", model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", availableProcessors=");
        stringBuilder.append(this.c);
        stringBuilder.append(", totalRam=");
        stringBuilder.append(this.d);
        stringBuilder.append(", diskSpace=");
        stringBuilder.append(this.e);
        stringBuilder.append(", isEmulator=");
        stringBuilder.append(this.f);
        stringBuilder.append(", state=");
        stringBuilder.append(this.g);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.h);
        stringBuilder.append(", modelClass=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

