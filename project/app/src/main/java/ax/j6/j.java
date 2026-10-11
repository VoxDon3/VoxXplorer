/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.b;
import ax.j6.d;
import ax.j6.e;
import ax.j6.f;
import ax.j6.g;
import ax.j6.i;
import java.util.concurrent.Executor;

public abstract class j<TResult> {
    public j<TResult> a(Executor executor, d d8) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public j<TResult> b(e<TResult> e8) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public j<TResult> c(Executor executor, e<TResult> e8) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract j<TResult> d(Executor var1, f var2);

    public abstract j<TResult> e(Executor var1, g<? super TResult> var2);

    public <TContinuationResult> j<TContinuationResult> f(b<TResult, TContinuationResult> b8) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> g(Executor executor, b<TResult, TContinuationResult> b8) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> h(Executor executor, b<TResult, j<TContinuationResult>> b8) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception i();

    public abstract TResult j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public <TContinuationResult> j<TContinuationResult> n(i<TResult, TContinuationResult> i8) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> o(Executor executor, i<TResult, TContinuationResult> i8) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}

