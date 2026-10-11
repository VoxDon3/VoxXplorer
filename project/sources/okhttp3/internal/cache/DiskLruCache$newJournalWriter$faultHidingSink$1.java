package okhttp3.internal.cache;

import ax.Fb.l;
import ax.Gb.m;
import ax.sb.t;
import java.io.IOException;
import okhttp3.internal.Util;

/* loaded from: classes3.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends m implements l<IOException, t> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // ax.Fb.l
    public /* bridge */ /* synthetic */ t invoke(IOException iOException) {
        invoke2(iOException);
        return t.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        ax.Gb.l.f(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
    }
}
