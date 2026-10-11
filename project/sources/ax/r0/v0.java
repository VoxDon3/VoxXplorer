package ax.r0;

import ax.r0.K;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
interface v0 {

    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i, List<Boolean> list, boolean z) throws IOException;

    void B(int i, List<Integer> list, boolean z) throws IOException;

    void C(int i, List<Long> list, boolean z) throws IOException;

    void D(int i, long j) throws IOException;

    void E(int i, float f) throws IOException;

    @Deprecated
    void F(int i) throws IOException;

    void G(int i, List<?> list, h0 h0Var) throws IOException;

    void H(int i, List<Integer> list, boolean z) throws IOException;

    void I(int i, Object obj, h0 h0Var) throws IOException;

    void J(int i, int i2) throws IOException;

    void K(int i, List<Long> list, boolean z) throws IOException;

    void L(int i, List<Integer> list, boolean z) throws IOException;

    void M(int i, List<Double> list, boolean z) throws IOException;

    void N(int i, int i2) throws IOException;

    void O(int i, List<AbstractC2921h> list) throws IOException;

    void a(int i, List<Float> list, boolean z) throws IOException;

    void b(int i, int i2) throws IOException;

    void c(int i, Object obj) throws IOException;

    void d(int i, int i2) throws IOException;

    void e(int i, double d) throws IOException;

    void f(int i, List<Long> list, boolean z) throws IOException;

    void g(int i, List<Long> list, boolean z) throws IOException;

    @Deprecated
    void h(int i, List<?> list, h0 h0Var) throws IOException;

    void i(int i, long j) throws IOException;

    a j();

    void k(int i, List<String> list) throws IOException;

    void l(int i, String str) throws IOException;

    void m(int i, long j) throws IOException;

    void n(int i, List<Integer> list, boolean z) throws IOException;

    void o(int i, long j) throws IOException;

    void p(int i, boolean z) throws IOException;

    void q(int i, int i2) throws IOException;

    void r(int i, AbstractC2921h abstractC2921h) throws IOException;

    @Deprecated
    void s(int i, Object obj, h0 h0Var) throws IOException;

    @Deprecated
    void t(int i) throws IOException;

    void u(int i, int i2) throws IOException;

    void v(int i, List<Long> list, boolean z) throws IOException;

    void w(int i, List<Integer> list, boolean z) throws IOException;

    <K, V> void x(int i, K.a<K, V> aVar, Map<K, V> map) throws IOException;

    void y(int i, long j) throws IOException;

    void z(int i, List<Integer> list, boolean z) throws IOException;
}
