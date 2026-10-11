/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import android.util.Base64;
import ax.n5.e;
import ax.p5.d;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class p {
    public static a a() {
        return new d.b().d(e.q);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract e d();

    public boolean e() {
        return this.c() != null;
    }

    public p f(e e8) {
        return p.a().b(this.b()).d(e8).c(this.c()).a();
    }

    public final String toString() {
        String string = this.b();
        e e8 = this.d();
        String string2 = this.c() == null ? "" : Base64.encodeToString((byte[])this.c(), (int)2);
        return String.format("TransportContext(%s, %s, %s)", new Object[]{string, e8, string2});
    }

    @AutoValue.Builder
    public static abstract class a {
        public abstract p a();

        public abstract a b(String var1);

        public abstract a c(byte[] var1);

        public abstract a d(e var1);
    }
}

