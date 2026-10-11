package ax.Y;

import android.os.OutcomeReceiver;
import ax.sb.C3082n;
import ax.sb.C3083o;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class f<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final ax.wb.e<R> q;

    /* JADX WARN: Multi-variable type inference failed */
    public f(ax.wb.e<? super R> eVar) {
        super(false);
        this.q = eVar;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e) {
        if (compareAndSet(false, true)) {
            ax.wb.e<R> eVar = this.q;
            C3082n.a aVar = C3082n.q;
            eVar.f(C3082n.a(C3083o.a(e)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.q.f(C3082n.a(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
