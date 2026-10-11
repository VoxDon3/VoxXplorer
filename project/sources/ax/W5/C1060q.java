package ax.W5;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: ax.W5.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1060q extends ContentObserver {
    final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1060q(r rVar, Handler handler) {
        super(null);
        this.a = rVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
