package okhttp3.internal.cache;

import ax.Fb.l;
import ax.Gb.m;
import ax.sb.t;
import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: classes3.dex */
final class DiskLruCache$Editor$newSink$1$1 extends m implements l<IOException, t> {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
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
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
            t tVar = t.a;
        }
    }
}
