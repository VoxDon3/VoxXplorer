/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.OutcomeReceiver;
import ax.sb.n;
import ax.sb.o;
import ax.wb.e;
import java.util.concurrent.atomic.AtomicBoolean;

final class f<R, E extends Throwable>
extends AtomicBoolean
implements OutcomeReceiver<R, E> {
    private final e<R> q;

    public f(e<? super R> e8) {
        super(false);
        this.q = e8;
    }

    public void onError(E e8) {
        if (this.compareAndSet(false, true)) {
            e<R> e9 = this.q;
            n.a a8 = n.q;
            e9.f(n.a(o.a(e8)));
        }
    }

    public void onResult(R r8) {
        if (this.compareAndSet(false, true)) {
            this.q.f(n.a(r8));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ContinuationOutcomeReceiver(outcomeReceived = ");
        stringBuilder.append(this.get());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

