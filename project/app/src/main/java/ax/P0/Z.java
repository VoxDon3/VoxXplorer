/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.content.Context;
import android.view.Surface;
import ax.P0.M;
import ax.P0.W;
import ax.P0.X;
import ax.P0.j;
import ax.P0.m;
import ax.P0.v;
import java.util.List;
import java.util.concurrent.Executor;

public interface Z {
    public void a() throws X;

    public void d();

    public void flush();

    public void h();

    public boolean i(int var1);

    public int j(int var1);

    public void k(List<Object> var1);

    public void l(int var1) throws X;

    public Surface m(int var1);

    public void n(long var1);

    public void o(M var1);

    public void p(int var1, int var2, v var3, List<Object> var4, long var5);

    public void q(W var1);

    public static interface a {
        public Z a(Context var1, j var2, m var3, b var4, Executor var5, long var6, boolean var8);
    }

    public static interface b {
    }
}

