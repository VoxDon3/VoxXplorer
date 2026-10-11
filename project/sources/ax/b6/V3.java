package ax.b6;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class V3 implements InterfaceC1529c6 {
    private final S3 a;

    private V3(S3 s3) {
        S3 s32 = (S3) C1616m4.f(s3, "output");
        this.a = s32;
        s32.a = this;
    }

    public static V3 P(S3 s3) {
        V3 v3 = s3.a;
        return v3 != null ? v3 : new V3(s3);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void A(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof C1624n4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.f0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.z0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.Y(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        if (!z) {
            while (i2 < c1624n4.size()) {
                this.a.f0(i, c1624n4.g(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1624n4.size(); i6++) {
            i5 += S3.z0(c1624n4.g(i6));
        }
        this.a.Y(i5);
        while (i2 < c1624n4.size()) {
            this.a.Y(c1624n4.g(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void B(int i, Object obj, InterfaceC1609l5 interfaceC1609l5) throws IOException {
        S3 s3 = this.a;
        s3.Z(i, 3);
        interfaceC1609l5.c((U4) obj, s3.a);
        s3.Z(i, 4);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof C1624n4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.O(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.k0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        if (!z) {
            while (i2 < c1624n4.size()) {
                this.a.O(i, c1624n4.g(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1624n4.size(); i6++) {
            i5 += S3.k0(c1624n4.g(i6));
        }
        this.a.Y(i5);
        while (i2 < c1624n4.size()) {
            this.a.L(c1624n4.g(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void D(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof B4)) {
            while (i2 < list.size()) {
                this.a.s(i, list.get(i2));
                i2++;
            }
            return;
        }
        B4 b4 = (B4) list;
        while (i2 < list.size()) {
            Object d = b4.d(i2);
            if (d instanceof String) {
                this.a.s(i, (String) d);
            } else {
                this.a.p(i, (B3) d);
            }
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void E(int i, int i2) throws IOException {
        this.a.n(i, i2);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void F(int i, List<?> list, InterfaceC1609l5 interfaceC1609l5) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            I(i, list.get(i2), interfaceC1609l5);
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void G(int i, long j) throws IOException {
        this.a.u0(i, j);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void H(int i, List<?> list, InterfaceC1609l5 interfaceC1609l5) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            B(i, list.get(i2), interfaceC1609l5);
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void I(int i, Object obj, InterfaceC1609l5 interfaceC1609l5) throws IOException {
        this.a.r(i, (U4) obj, interfaceC1609l5);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void J(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof C1590j4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.N(i, list.get(i2).floatValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.d(list.get(i4).floatValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.K(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        C1590j4 c1590j4 = (C1590j4) list;
        if (!z) {
            while (i2 < c1590j4.size()) {
                this.a.N(i, c1590j4.h(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1590j4.size(); i6++) {
            i5 += S3.d(c1590j4.h(i6));
        }
        this.a.Y(i5);
        while (i2 < c1590j4.size()) {
            this.a.K(c1590j4.h(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final <K, V> void K(int i, L4<K, V> l4, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.Z(i, 2);
            this.a.Y(M4.a(l4, entry.getKey(), entry.getValue()));
            M4.b(this.a, l4, entry.getKey(), entry.getValue());
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void L(int i, int i2) throws IOException {
        this.a.C0(i, i2);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void M(int i, B3 b3) throws IOException {
        this.a.p(i, b3);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void N(int i, long j) throws IOException {
        this.a.P(i, j);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void O(int i, List<B3> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.p(i, list.get(i2));
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final int a() {
        return 1;
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void b(int i, boolean z) throws IOException {
        this.a.t(i, z);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof C1624n4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.n(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.o0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        if (!z) {
            while (i2 < c1624n4.size()) {
                this.a.n(i, c1624n4.g(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1624n4.size(); i6++) {
            i5 += S3.o0(c1624n4.g(i6));
        }
        this.a.Y(i5);
        while (i2 < c1624n4.size()) {
            this.a.m(c1624n4.g(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    @Deprecated
    public final void d(int i) throws IOException {
        this.a.Z(i, 4);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void e(int i, long j) throws IOException {
        this.a.P(i, j);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void f(int i, int i2) throws IOException {
        this.a.n(i, i2);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void g(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof C1710y3)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.t(i, list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.j(list.get(i4).booleanValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.S(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        C1710y3 c1710y3 = (C1710y3) list;
        if (!z) {
            while (i2 < c1710y3.size()) {
                this.a.t(i, c1710y3.h(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1710y3.size(); i6++) {
            i5 += S3.j(c1710y3.h(i6));
        }
        this.a.Y(i5);
        while (i2 < c1710y3.size()) {
            this.a.S(c1710y3.h(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void h(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof F4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.P(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.e0(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        F4 f4 = (F4) list;
        if (!z) {
            while (i2 < f4.size()) {
                this.a.P(i, f4.m(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f4.size(); i6++) {
            i5 += S3.e0(f4.m(i6));
        }
        this.a.Y(i5);
        while (i2 < f4.size()) {
            this.a.R(f4.m(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void i(int i, int i2) throws IOException {
        this.a.O(i, i2);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void j(int i, long j) throws IOException {
        this.a.o(i, j);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void k(int i, Object obj) throws IOException {
        if (obj instanceof B3) {
            this.a.Q(i, (B3) obj);
        } else {
            this.a.q(i, (U4) obj);
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof C1624n4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.O(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.b0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        if (!z) {
            while (i2 < c1624n4.size()) {
                this.a.O(i, c1624n4.g(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1624n4.size(); i6++) {
            i5 += S3.b0(c1624n4.g(i6));
        }
        this.a.Y(i5);
        while (i2 < c1624n4.size()) {
            this.a.L(c1624n4.g(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    @Deprecated
    public final void m(int i) throws IOException {
        this.a.Z(i, 3);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof F4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.u0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.n0(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.v0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        F4 f4 = (F4) list;
        if (!z) {
            while (i2 < f4.size()) {
                this.a.u0(i, f4.m(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f4.size(); i6++) {
            i5 += S3.n0(f4.m(i6));
        }
        this.a.Y(i5);
        while (i2 < f4.size()) {
            this.a.v0(f4.m(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void o(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof U3)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.M(i, list.get(i2).doubleValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.c(list.get(i4).doubleValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.J(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        U3 u3 = (U3) list;
        if (!z) {
            while (i2 < u3.size()) {
                this.a.M(i, u3.h(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u3.size(); i6++) {
            i5 += S3.c(u3.h(i6));
        }
        this.a.Y(i5);
        while (i2 < u3.size()) {
            this.a.J(u3.h(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void p(int i, String str) throws IOException {
        this.a.s(i, str);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof F4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.o(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.j0(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        F4 f4 = (F4) list;
        if (!z) {
            while (i2 < f4.size()) {
                this.a.o(i, f4.m(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f4.size(); i6++) {
            i5 += S3.j0(f4.m(i6));
        }
        this.a.Y(i5);
        while (i2 < f4.size()) {
            this.a.u(f4.m(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void r(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof C1624n4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.C0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.s0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.B0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        if (!z) {
            while (i2 < c1624n4.size()) {
                this.a.C0(i, c1624n4.g(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1624n4.size(); i6++) {
            i5 += S3.s0(c1624n4.g(i6));
        }
        this.a.Y(i5);
        while (i2 < c1624n4.size()) {
            this.a.B0(c1624n4.g(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void s(int i, int i2) throws IOException {
        this.a.O(i, i2);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void t(int i, long j) throws IOException {
        this.a.o(i, j);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void u(int i, double d) throws IOException {
        this.a.M(i, d);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void v(int i, float f) throws IOException {
        this.a.N(i, f);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void w(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof F4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.o(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.W(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        F4 f4 = (F4) list;
        if (!z) {
            while (i2 < f4.size()) {
                this.a.o(i, f4.m(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f4.size(); i6++) {
            i5 += S3.W(f4.m(i6));
        }
        this.a.Y(i5);
        while (i2 < f4.size()) {
            this.a.u(f4.m(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void x(int i, int i2) throws IOException {
        this.a.f0(i, i2);
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof F4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.P(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.r0(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        F4 f4 = (F4) list;
        if (!z) {
            while (i2 < f4.size()) {
                this.a.P(i, f4.m(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f4.size(); i6++) {
            i5 += S3.r0(f4.m(i6));
        }
        this.a.Y(i5);
        while (i2 < f4.size()) {
            this.a.R(f4.m(i2));
            i2++;
        }
    }

    @Override // ax.b6.InterfaceC1529c6
    public final void z(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof C1624n4)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.n(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += S3.g0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        if (!z) {
            while (i2 < c1624n4.size()) {
                this.a.n(i, c1624n4.g(i2));
                i2++;
            }
            return;
        }
        this.a.Z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1624n4.size(); i6++) {
            i5 += S3.g0(c1624n4.g(i6));
        }
        this.a.Y(i5);
        while (i2 < c1624n4.size()) {
            this.a.m(c1624n4.g(i2));
            i2++;
        }
    }
}
