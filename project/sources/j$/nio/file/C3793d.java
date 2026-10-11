package j$.nio.file;

import java.nio.file.FileStore;

/* renamed from: j$.nio.file.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3793d {
    public final /* synthetic */ FileStore a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.a;
        if (obj instanceof C3793d) {
            obj = ((C3793d) obj).a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public C3793d(FileStore fileStore) {
        this.a = fileStore;
    }
}
