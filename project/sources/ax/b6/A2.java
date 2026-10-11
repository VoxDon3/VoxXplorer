package ax.b6;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class A2 extends ContentObserver {
    private final /* synthetic */ C1701x2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A2(C1701x2 c1701x2, Handler handler) {
        super(null);
        this.a = c1701x2;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.a;
        atomicBoolean.set(true);
    }
}
