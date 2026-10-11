package ax.J5;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class M extends O {
    private final Callable f;

    /* synthetic */ M(Callable callable, L l) {
        super();
        this.f = callable;
    }

    @Override // ax.J5.O
    final String a() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
