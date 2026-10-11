package ax.b6;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class L2 extends ContentObserver {
    private final /* synthetic */ J2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L2(J2 j2, Handler handler) {
        super(null);
        this.a = j2;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
