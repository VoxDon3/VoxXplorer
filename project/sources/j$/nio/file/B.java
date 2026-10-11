package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class B {
    public final /* synthetic */ WatchEvent.Modifier a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
