/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.G7.f;
import ax.L7.G;

final class C
extends G.a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final f f;

    C(String string, String string2, String string3, String string4, int n8, f f8) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                if (string3 != null) {
                    this.c = string3;
                    if (string4 != null) {
                        this.d = string4;
                        this.e = n8;
                        if (f8 != null) {
                            this.f = f8;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public f d() {
        return this.f;
    }

    @Override
    public String e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof G.a && this.a.equals(((G.a)(object = (G.a)object)).a()) && this.b.equals(((G.a)object).f()) && this.c.equals(((G.a)object).g()) && this.d.equals(((G.a)object).e()) && this.e == ((G.a)object).c() && this.f.equals(((G.a)object).d());
    }

    @Override
    public String f() {
        return this.b;
    }

    @Override
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AppData{appIdentifier=");
        stringBuilder.append(this.a);
        stringBuilder.append(", versionCode=");
        stringBuilder.append(this.b);
        stringBuilder.append(", versionName=");
        stringBuilder.append(this.c);
        stringBuilder.append(", installUuid=");
        stringBuilder.append(this.d);
        stringBuilder.append(", deliveryMechanism=");
        stringBuilder.append(this.e);
        stringBuilder.append(", developmentPlatformProvider=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

