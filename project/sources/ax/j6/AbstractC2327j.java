package ax.j6;

import java.util.concurrent.Executor;

/* renamed from: ax.j6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2327j<TResult> {
    public AbstractC2327j<TResult> a(Executor executor, InterfaceC2321d interfaceC2321d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public AbstractC2327j<TResult> b(InterfaceC2322e<TResult> interfaceC2322e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public AbstractC2327j<TResult> c(Executor executor, InterfaceC2322e<TResult> interfaceC2322e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract AbstractC2327j<TResult> d(Executor executor, InterfaceC2323f interfaceC2323f);

    public abstract AbstractC2327j<TResult> e(Executor executor, InterfaceC2324g<? super TResult> interfaceC2324g);

    public <TContinuationResult> AbstractC2327j<TContinuationResult> f(InterfaceC2319b<TResult, TContinuationResult> interfaceC2319b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC2327j<TContinuationResult> g(Executor executor, InterfaceC2319b<TResult, TContinuationResult> interfaceC2319b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC2327j<TContinuationResult> h(Executor executor, InterfaceC2319b<TResult, AbstractC2327j<TContinuationResult>> interfaceC2319b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception i();

    public abstract TResult j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public <TContinuationResult> AbstractC2327j<TContinuationResult> n(InterfaceC2326i<TResult, TContinuationResult> interfaceC2326i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> AbstractC2327j<TContinuationResult> o(Executor executor, InterfaceC2326i<TResult, TContinuationResult> interfaceC2326i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
