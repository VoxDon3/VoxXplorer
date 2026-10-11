/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.G;

final class B
extends G {
    private final G.a a;
    private final G.c b;
    private final G.b c;

    B(G.a a8, G.c c8, G.b b8) {
        if (a8 != null) {
            this.a = a8;
            if (c8 != null) {
                this.b = c8;
                if (b8 != null) {
                    this.c = b8;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override
    public G.a a() {
        return this.a;
    }

    @Override
    public G.b c() {
        return this.c;
    }

    @Override
    public G.c d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof G && this.a.equals(((G)(object = (G)object)).a()) && this.b.equals(((G)object).d()) && this.c.equals(((G)object).c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StaticSessionData{appData=");
        stringBuilder.append(this.a);
        stringBuilder.append(", osData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", deviceData=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

