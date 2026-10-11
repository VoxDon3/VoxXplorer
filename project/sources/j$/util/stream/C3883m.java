package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3883m extends AbstractC3846e2 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3883m(AbstractC3823a abstractC3823a, InterfaceC3866i2 interfaceC3866i2, int i) {
        super(interfaceC3866i2);
        this.b = i;
        this.c = abstractC3823a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3883m(InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.b = 0;
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public void l() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.l();
                break;
            default:
                super.l();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public void m(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.m(-1L);
                break;
            case 1:
            default:
                super.m(j);
                break;
            case 2:
                this.a.m(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    this.a.accept((InterfaceC3866i2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((r) this.c).n).accept(obj);
                this.a.accept((InterfaceC3866i2) obj);
                break;
            case 2:
                if (((Predicate) ((r) this.c).n).test(obj)) {
                    this.a.accept((InterfaceC3866i2) obj);
                    break;
                }
                break;
            case 3:
                this.a.accept((InterfaceC3866i2) ((Function) ((r) this.c).n).apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((V) this.c).n).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((C3844e0) this.c).n).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((C3932w) this.c).n).applyAsDouble(obj));
                break;
        }
    }
}
