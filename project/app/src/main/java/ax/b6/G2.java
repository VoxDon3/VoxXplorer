/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import ax.b6.S2;
import ax.b6.g3;
import ax.q7.k;
import ax.q7.u;

final class G2
extends g3 {
    private final Context a;
    private final u<k<S2>> b;

    G2(Context context, u<k<S2>> u8) {
        if (context != null) {
            this.a = context;
            this.b = u8;
            return;
        }
        throw new NullPointerException("Null context");
    }

    @Override
    final Context a() {
        return this.a;
    }

    @Override
    final u<k<S2>> b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        u<k<S2>> u8;
        if (object == this) {
            return true;
        }
        return object instanceof g3 && this.a.equals(((g3)(object = (g3)object)).a()) && ((u8 = this.b) == null ? ((g3)object).b() == null : u8.equals(((g3)object).b()));
    }

    public final int hashCode() {
        int n8 = this.a.hashCode();
        u<k<S2>> u8 = this.b;
        int n9 = u8 == null ? 0 : u8.hashCode();
        return (n8 ^ 0xF4243) * 1000003 ^ n9;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        String string2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("FlagsContext{context=");
        stringBuilder.append(string);
        stringBuilder.append(", hermeticFileOverrides=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

