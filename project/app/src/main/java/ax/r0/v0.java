/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.K;
import ax.r0.h;
import ax.r0.h0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

interface v0 {
    public void A(int var1, List<Boolean> var2, boolean var3) throws IOException;

    public void B(int var1, List<Integer> var2, boolean var3) throws IOException;

    public void C(int var1, List<Long> var2, boolean var3) throws IOException;

    public void D(int var1, long var2) throws IOException;

    public void E(int var1, float var2) throws IOException;

    @Deprecated
    public void F(int var1) throws IOException;

    public void G(int var1, List<?> var2, h0 var3) throws IOException;

    public void H(int var1, List<Integer> var2, boolean var3) throws IOException;

    public void I(int var1, Object var2, h0 var3) throws IOException;

    public void J(int var1, int var2) throws IOException;

    public void K(int var1, List<Long> var2, boolean var3) throws IOException;

    public void L(int var1, List<Integer> var2, boolean var3) throws IOException;

    public void M(int var1, List<Double> var2, boolean var3) throws IOException;

    public void N(int var1, int var2) throws IOException;

    public void O(int var1, List<h> var2) throws IOException;

    public void a(int var1, List<Float> var2, boolean var3) throws IOException;

    public void b(int var1, int var2) throws IOException;

    public void c(int var1, Object var2) throws IOException;

    public void d(int var1, int var2) throws IOException;

    public void e(int var1, double var2) throws IOException;

    public void f(int var1, List<Long> var2, boolean var3) throws IOException;

    public void g(int var1, List<Long> var2, boolean var3) throws IOException;

    @Deprecated
    public void h(int var1, List<?> var2, h0 var3) throws IOException;

    public void i(int var1, long var2) throws IOException;

    public a j();

    public void k(int var1, List<String> var2) throws IOException;

    public void l(int var1, String var2) throws IOException;

    public void m(int var1, long var2) throws IOException;

    public void n(int var1, List<Integer> var2, boolean var3) throws IOException;

    public void o(int var1, long var2) throws IOException;

    public void p(int var1, boolean var2) throws IOException;

    public void q(int var1, int var2) throws IOException;

    public void r(int var1, h var2) throws IOException;

    @Deprecated
    public void s(int var1, Object var2, h0 var3) throws IOException;

    @Deprecated
    public void t(int var1) throws IOException;

    public void u(int var1, int var2) throws IOException;

    public void v(int var1, List<Long> var2, boolean var3) throws IOException;

    public void w(int var1, List<Integer> var2, boolean var3) throws IOException;

    public <K, V> void x(int var1, K.a<K, V> var2, Map<K, V> var3) throws IOException;

    public void y(int var1, long var2) throws IOException;

    public void z(int var1, List<Integer> var2, boolean var3) throws IOException;

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        private static final a[] d0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            q = a9 = new a();
            c0 = a8 = new a();
            d0 = new a[]{a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])d0.clone();
        }
    }
}

