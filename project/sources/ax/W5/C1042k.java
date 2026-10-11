package ax.W5;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.W5.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1042k extends ContentObserver {
    C1042k(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C1045l.e;
        atomicBoolean.set(true);
    }
}
