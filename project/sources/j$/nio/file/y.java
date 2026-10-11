package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements A {
    public final /* synthetic */ WatchEvent.Kind a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
