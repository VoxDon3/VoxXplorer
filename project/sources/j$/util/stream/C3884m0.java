package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3884m0 extends AbstractC3904q0 {
    public final /* synthetic */ EnumC3908r0 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3884m0(EnumC3908r0 enumC3908r0, Predicate predicate) {
        super(enumC3908r0);
        this.c = enumC3908r0;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        EnumC3908r0 enumC3908r0 = this.c;
        if (test == enumC3908r0.a) {
            this.a = true;
            this.b = enumC3908r0.b;
        }
    }
}
