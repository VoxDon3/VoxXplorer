package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class E implements n {
    public static final E BEFORE_ROC;
    public static final E ROC;
    public static final /* synthetic */ E[] a;

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.m mVar) {
        return j$.com.android.tools.r8.a.s(this, mVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.o(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int l(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.j(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ long w(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.l(this, qVar);
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) a.clone();
    }

    static {
        E e = new E("BEFORE_ROC", 0);
        BEFORE_ROC = e;
        E e2 = new E("ROC", 1);
        ROC = e2;
        a = new E[]{e, e2};
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }
}
