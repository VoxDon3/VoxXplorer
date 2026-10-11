package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3914s1 extends CountedCompleter {
    public final E0 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public C3914s1(E0 e0, Object obj, int i) {
        this.c = i;
        this.a = e0;
        this.b = 0;
        this.d = obj;
    }

    public C3914s1(C3914s1 c3914s1, E0 e0, int i, byte b) {
        super(c3914s1);
        this.a = e0;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C3914s1 c3914s1 = this;
        while (c3914s1.a.u() != 0) {
            c3914s1.setPendingCount(c3914s1.a.u() - 1);
            int i = 0;
            int i2 = 0;
            while (i < c3914s1.a.u() - 1) {
                C3914s1 a = c3914s1.a(i, c3914s1.b + i2);
                i2 = (int) (a.a.count() + i2);
                a.fork();
                i++;
            }
            c3914s1 = c3914s1.a(i, c3914s1.b + i2);
        }
        switch (c3914s1.c) {
            case 0:
                ((D0) c3914s1.a).v(c3914s1.b, c3914s1.d);
                break;
            default:
                c3914s1.a.i((Object[]) c3914s1.d, c3914s1.b);
                break;
        }
        c3914s1.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3914s1(C3914s1 c3914s1, E0 e0, int i) {
        this(c3914s1, e0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) c3914s1.d;
    }

    public final C3914s1 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new C3914s1(this, ((D0) this.a).b(i), i2);
            default:
                return new C3914s1(this, this.a.b(i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3914s1(C3914s1 c3914s1, D0 d0, int i) {
        this(c3914s1, d0, i, (byte) 0);
        this.c = 0;
        this.d = c3914s1.d;
    }
}
