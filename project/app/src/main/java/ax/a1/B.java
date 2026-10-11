/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioDeviceInfo;
import ax.P0.G;
import ax.P0.g;
import ax.P0.v;
import ax.S0.h;
import ax.Z0.I1;
import ax.a1.l;
import java.nio.ByteBuffer;

public interface B {
    public void A(ax.P0.c var1);

    public void B(h var1);

    public void C(g var1);

    public boolean D(ByteBuffer var1, long var2, int var4) throws c, f;

    public void E(boolean var1);

    public void a();

    public boolean b(v var1);

    public boolean c();

    public void d();

    public void e(G var1);

    public void f();

    public void flush();

    public void g(AudioDeviceInfo var1);

    public G h();

    public void i() throws f;

    public void j(v var1, int var2, int[] var3) throws b;

    public boolean k();

    public void l(float var1);

    public void m();

    public int n(v var1);

    public void o(int var1);

    public long p();

    public void q(int var1, int var2);

    public void r(int var1);

    public long s(boolean var1);

    public void t();

    public void u(long var1);

    public void v();

    public void w(I1 var1);

    public void x(d var1);

    public void y();

    public l z(v var1);

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;

        public a(int n8, int n9, int n10, boolean bl, boolean bl2, int n11) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = bl;
            this.e = bl2;
            this.f = n11;
        }
    }

    public static final class b
    extends Exception {
        public final v q;

        public b(String string, v v8) {
            super(string);
            this.q = v8;
        }

        public b(Throwable throwable, v v8) {
            super(throwable);
            this.q = v8;
        }
    }

    public static final class c
    extends Exception {
        public final boolean c0;
        public final v d0;
        public final int q;

        public c(int n8, int n9, int n10, int n11, int n12, v v8, boolean bl, Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack init failed ");
            stringBuilder.append(n8);
            stringBuilder.append(" ");
            stringBuilder.append("Config(");
            stringBuilder.append(n9);
            stringBuilder.append(", ");
            stringBuilder.append(n10);
            stringBuilder.append(", ");
            stringBuilder.append(n11);
            stringBuilder.append(", ");
            stringBuilder.append(n12);
            stringBuilder.append(")");
            stringBuilder.append(" ");
            stringBuilder.append(v8);
            String string = bl ? " (recoverable)" : "";
            stringBuilder.append(string);
            this(stringBuilder.toString(), n8, v8, bl, exception);
        }

        public c(String string, int n8, v v8, boolean bl, Throwable throwable) {
            super(string, throwable);
            this.q = n8;
            this.c0 = bl;
            this.d0 = v8;
        }
    }

    public static interface d {
        public void a(long var1);

        public void b(a var1);

        public void c(int var1);

        public void d();

        public void e(boolean var1);

        public void f(Exception var1);

        public void g(a var1);

        public void h();

        public void i(int var1, long var2, long var4);

        public void j();

        public void k();

        public void l();
    }

    public static final class e
    extends Exception {
        public final long c0;
        public final long q;

        public e(long l8, long l9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected audio track timestamp discontinuity: expected ");
            stringBuilder.append(l9);
            stringBuilder.append(", got ");
            stringBuilder.append(l8);
            super(stringBuilder.toString());
            this.q = l8;
            this.c0 = l9;
        }
    }

    public static final class f
    extends Exception {
        public final boolean c0;
        public final v d0;
        public final int q;

        public f(int n8, v v8, boolean bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack write failed: ");
            stringBuilder.append(n8);
            super(stringBuilder.toString());
            this.c0 = bl;
            this.q = n8;
            this.d0 = v8;
        }
    }
}

