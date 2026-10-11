/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.K0;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.s;
import ax.P0.N;
import ax.P0.v;
import ax.S0.h;
import ax.Y0.S;
import ax.Y0.W;
import ax.Z0.I1;
import ax.i1.F;
import ax.i1.e0;
import java.io.IOException;

public interface M0
extends K0.b {
    public void C() throws IOException;

    public long D();

    public void F(long var1) throws s;

    public boolean G();

    public S H();

    public void a();

    public boolean c();

    public void d();

    public void f();

    public String getName();

    public int getState();

    public void i(long var1, long var3) throws s;

    public boolean isReady();

    public e0 j();

    public int k();

    public void m(int var1, I1 var2, h var3);

    public boolean n();

    public long o(long var1, long var3);

    public void p();

    public void q();

    public void r(N var1);

    public void s(W var1, v[] var2, e0 var3, long var4, boolean var6, boolean var7, long var8, long var10, F.b var12) throws s;

    public void start() throws s;

    public void stop();

    public void t(v[] var1, e0 var2, long var3, long var5, F.b var7) throws s;

    public N0 u();

    public void x(float var1, float var2) throws s;

    public static interface a {
        public void a();

        public void b();
    }
}

