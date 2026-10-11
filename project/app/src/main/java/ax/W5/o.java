/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.Context;
import ax.W5.M;
import ax.W5.W;

final class o
extends M {
    private final Context a;
    private final W b;

    o(Context context, W w8) {
        this.a = context;
        this.b = w8;
    }

    @Override
    final Context a() {
        return this.a;
    }

    @Override
    final W b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof M && this.a.equals(((M)(object = (M)object)).a()) && this.b.equals(((M)object).b());
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        String string2 = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FlagsContext{context=");
        stringBuilder.append(string);
        stringBuilder.append(", hermeticFileOverrides=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

