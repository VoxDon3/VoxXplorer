package ax.b6;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class T2 extends ContentObserver {
    T2(R2 r2, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Y2.m();
    }
}
