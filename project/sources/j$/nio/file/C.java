package j$.nio.file;

import java.nio.file.WatchKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class C {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ C(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ C a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new C(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
