package j$.nio.file;

import java.io.Closeable;
import java.nio.file.WatchService;

/* loaded from: classes2.dex */
public final /* synthetic */ class D implements AutoCloseable, Closeable {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ D(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ D j(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new D(watchService);
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
