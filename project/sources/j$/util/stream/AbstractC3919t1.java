package j$.util.stream;

import j$.util.C3809e;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import okhttp3.internal.http2.Http2;

/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3919t1 implements B3 {
    public static final W0 a = new W0();
    public static final U0 b = new U0();
    public static final V0 c = new V0();
    public static final T0 d = new T0();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract O1 Z();

    @Override // j$.util.stream.B3
    public /* synthetic */ int d() {
        return 0;
    }

    public static j$.desugar.sun.nio.fs.g O(Function function) {
        j$.desugar.sun.nio.fs.g gVar = new j$.desugar.sun.nio.fs.g(9);
        gVar.b = function;
        return gVar;
    }

    public static Set N(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC3858h) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC3858h enumC3858h = (EnumC3858h) it.next();
                    hashSet.add(enumC3858h == null ? null : enumC3858h == EnumC3858h.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC3858h == EnumC3858h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e2) {
                    C3809e.a("java.util.stream.Collector.Characteristics", e2);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                C3809e.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it2.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? EnumC3858h.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? EnumC3858h.UNORDERED : EnumC3858h.IDENTITY_FINISH);
                } catch (ClassCastException e3) {
                    C3809e.a("java.util.stream.Collector.Characteristics", e3);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static long x(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static long A(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static Y1 a0(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new Y1(spliterator, V2.p(spliterator), z);
    }

    public static Spliterator y(W2 w2, Spliterator spliterator, long j, long j2) {
        long A = A(j, j2);
        int i = AbstractC3910r2.a[w2.ordinal()];
        if (i == 1) {
            return new C3902p3(spliterator, j, A);
        }
        if (i == 2) {
            return new C3887m3((j$.util.V) spliterator, j, A);
        }
        if (i == 3) {
            return new C3892n3((j$.util.Y) spliterator, j, A);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + w2);
        }
        return new C3882l3((j$.util.S) spliterator, j, A);
    }

    public static j$.nio.file.w X(EnumC3908r0 enumC3908r0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC3908r0);
        return new j$.nio.file.w(W2.REFERENCE, enumC3908r0, new j$.nio.file.w(6, enumC3908r0, predicate));
    }

    public static X0 H(W2 w2) {
        int i = F0.a[w2.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + w2);
    }

    public static j$.nio.file.w T(EnumC3908r0 enumC3908r0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3908r0);
        return new j$.nio.file.w(W2.INT_VALUE, enumC3908r0, new C3879l0(enumC3908r0, 1));
    }

    public static C3876k2 Y(AbstractC3826a2 abstractC3826a2, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C3876k2(abstractC3826a2, I(j2), j, j2);
    }

    public static E0 w(E0 e0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        Spliterator spliterator = e0.spliterator();
        long j3 = j2 - j;
        InterfaceC3933w0 z = z(j3, intFunction);
        z.m(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new T(12)); i++) {
        }
        if (j2 == e0.count()) {
            spliterator.forEachRemaining(z);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(z); i2++) {
            }
        }
        z.l();
        return z.a();
    }

    public static G0 F(W2 w2, E0 e0, E0 e02) {
        int i = F0.a[w2.ordinal()];
        if (i == 1) {
            return new P0(e0, e02);
        }
        if (i == 2) {
            return new M0((A0) e0, (A0) e02);
        }
        if (i == 3) {
            return new N0((C0) e0, (C0) e02);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + w2);
        }
        return new L0((InterfaceC3943y0) e0, (InterfaceC3943y0) e02);
    }

    public static j$.nio.file.w V(EnumC3908r0 enumC3908r0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3908r0);
        return new j$.nio.file.w(W2.LONG_VALUE, enumC3908r0, new C3879l0(enumC3908r0, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.nio.file.w R(EnumC3908r0 enumC3908r0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3908r0);
        return new j$.nio.file.w(W2.DOUBLE_VALUE, enumC3908r0, new C3879l0(enumC3908r0, 2));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC3933w0 z(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new Y0(j, intFunction);
        }
        return new C3905q1();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(InterfaceC3856g2 interfaceC3856g2, Integer num) {
        if (D3.a) {
            D3.a(interfaceC3856g2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC3856g2.accept(num.intValue());
    }

    public static void i(InterfaceC3861h2 interfaceC3861h2, Long l) {
        if (D3.a) {
            D3.a(interfaceC3861h2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC3861h2.accept(l.longValue());
    }

    public static InterfaceC3923u0 P(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C3830b1();
        }
        return new C3825a1(j);
    }

    public static void e(InterfaceC3851f2 interfaceC3851f2, Double d2) {
        if (D3.a) {
            D3.a(interfaceC3851f2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC3851f2.accept(d2.doubleValue());
    }

    public static C3886m2 U(AbstractC3824a0 abstractC3824a0, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C3886m2(abstractC3824a0, I(j2), j, j2);
    }

    public static InterfaceC3928v0 Q(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C3875k1();
        }
        return new C3870j1(j);
    }

    public static Object[] m(D0 d0, IntFunction intFunction) {
        if (D3.a) {
            D3.a(d0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (d0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) d0.count());
        d0.i(objArr, 0);
        return objArr;
    }

    public static InterfaceC3918t0 G(long j) {
        if (j < 0 || j >= 2147483639) {
            return new S0();
        }
        return new R0(j);
    }

    public static E0 B(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long C = abstractC3823a.C(spliterator);
        if (C < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            K k = new K();
            k.a = intFunction;
            E0 e0 = (E0) new J0(abstractC3823a, spliterator, k, new T(20), 3).invoke();
            return z ? J(e0, intFunction) : e0;
        }
        if (C >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) C);
        new C3895o1(spliterator, abstractC3823a, objArr).invoke();
        return new H0(objArr);
    }

    public static void r(A0 a0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            a0.e((IntConsumer) consumer);
        } else {
            if (D3.a) {
                D3.a(a0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.V) a0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static C3896o2 W(AbstractC3859h0 abstractC3859h0, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C3896o2(abstractC3859h0, I(j2), j, j2);
    }

    public static void o(A0 a0, Integer[] numArr, int i) {
        if (D3.a) {
            D3.a(a0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) a0.d();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static A0 u(A0 a0, long j, long j2) {
        if (j == 0 && j2 == a0.count()) {
            return a0;
        }
        long j3 = j2 - j;
        j$.util.V v = (j$.util.V) a0.spliterator();
        InterfaceC3923u0 P = P(j3);
        P.m(j3);
        for (int i = 0; i < j && v.tryAdvance((IntConsumer) new C3948z0(0)); i++) {
        }
        if (j2 == a0.count()) {
            v.forEachRemaining((IntConsumer) P);
        } else {
            for (int i2 = 0; i2 < j3 && v.tryAdvance((IntConsumer) P); i2++) {
            }
        }
        P.l();
        return P.a();
    }

    public static A0 D(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z) {
        long C = abstractC3823a.C(spliterator);
        if (C < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            A0 a0 = (A0) new J0(abstractC3823a, spliterator, new T(16), new T(17), 1).invoke();
            return z ? L(a0) : a0;
        }
        if (C >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) C];
        new C3885m1(spliterator, abstractC3823a, iArr).invoke();
        return new Z0(iArr);
    }

    public static C0 E(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z) {
        long C = abstractC3823a.C(spliterator);
        if (C < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            C0 c0 = (C0) new J0(abstractC3823a, spliterator, new T(18), new T(19), 2).invoke();
            return z ? M(c0) : c0;
        }
        if (C >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) C];
        new C3890n1(spliterator, abstractC3823a, jArr).invoke();
        return new C3865i1(jArr);
    }

    public static void s(C0 c0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c0.e((LongConsumer) consumer);
        } else {
            if (D3.a) {
                D3.a(c0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Y) c0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(C0 c0, Long[] lArr, int i) {
        if (D3.a) {
            D3.a(c0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) c0.d();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static C0 v(C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        j$.util.Y y = (j$.util.Y) c0.spliterator();
        InterfaceC3928v0 Q = Q(j3);
        Q.m(j3);
        for (int i = 0; i < j && y.tryAdvance((LongConsumer) new B0(0)); i++) {
        }
        if (j2 == c0.count()) {
            y.forEachRemaining((LongConsumer) Q);
        } else {
            for (int i2 = 0; i2 < j3 && y.tryAdvance((LongConsumer) Q); i2++) {
            }
        }
        Q.l();
        return Q.a();
    }

    public static InterfaceC3943y0 C(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z) {
        long C = abstractC3823a.C(spliterator);
        if (C < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            InterfaceC3943y0 interfaceC3943y0 = (InterfaceC3943y0) new J0(abstractC3823a, spliterator, new T(14), new T(15), 0).invoke();
            return z ? K(interfaceC3943y0) : interfaceC3943y0;
        }
        if (C >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) C];
        new C3880l1(spliterator, abstractC3823a, dArr).invoke();
        return new Q0(dArr);
    }

    public static C3906q2 S(AbstractC3947z abstractC3947z, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C3906q2(abstractC3947z, I(j2), j, j2);
    }

    public static E0 J(E0 e0, IntFunction intFunction) {
        if (e0.u() <= 0) {
            return e0;
        }
        long count = e0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new C3914s1(e0, objArr, 1).invoke();
        return new H0(objArr);
    }

    public static void q(InterfaceC3943y0 interfaceC3943y0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC3943y0.e((DoubleConsumer) consumer);
        } else {
            if (D3.a) {
                D3.a(interfaceC3943y0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.S) interfaceC3943y0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static A0 L(A0 a0) {
        if (a0.u() <= 0) {
            return a0;
        }
        long count = a0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new C3909r1(a0, iArr, 0).invoke();
        return new Z0(iArr);
    }

    public static void n(InterfaceC3943y0 interfaceC3943y0, Double[] dArr, int i) {
        if (D3.a) {
            D3.a(interfaceC3943y0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC3943y0.d();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static InterfaceC3943y0 t(InterfaceC3943y0 interfaceC3943y0, long j, long j2) {
        if (j == 0 && j2 == interfaceC3943y0.count()) {
            return interfaceC3943y0;
        }
        long j3 = j2 - j;
        j$.util.S s = (j$.util.S) interfaceC3943y0.spliterator();
        InterfaceC3918t0 G = G(j3);
        G.m(j3);
        for (int i = 0; i < j && s.tryAdvance((DoubleConsumer) new C3938x0(0)); i++) {
        }
        if (j2 == interfaceC3943y0.count()) {
            s.forEachRemaining((DoubleConsumer) G);
        } else {
            for (int i2 = 0; i2 < j3 && s.tryAdvance((DoubleConsumer) G); i2++) {
            }
        }
        G.l();
        return G.a();
    }

    public static C0 M(C0 c0) {
        if (c0.u() <= 0) {
            return c0;
        }
        long count = c0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new C3909r1(c0, jArr, 0).invoke();
        return new C3865i1(jArr);
    }

    public static int I(long j) {
        return (j != -1 ? V2.u : 0) | V2.t;
    }

    public static InterfaceC3943y0 K(InterfaceC3943y0 interfaceC3943y0) {
        if (interfaceC3943y0.u() <= 0) {
            return interfaceC3943y0;
        }
        long count = interfaceC3943y0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new C3909r1(interfaceC3943y0, dArr, 0).invoke();
        return new Q0(dArr);
    }

    @Override // j$.util.stream.B3
    public Object b(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        O1 Z = Z();
        abstractC3823a.Q(spliterator, Z);
        return Z.get();
    }

    @Override // j$.util.stream.B3
    public Object c(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        return ((O1) new V1(this, abstractC3823a, spliterator).invoke()).get();
    }
}
