package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3879l0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnumC3908r0 b;

    public /* synthetic */ C3879l0(EnumC3908r0 enumC3908r0, int i) {
        this.a = i;
        this.b = enumC3908r0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3894o0(this.b);
            case 1:
                return new C3889n0(this.b);
            default:
                return new C3899p0(this.b);
        }
    }
}
