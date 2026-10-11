package ax.d1;

import ax.h1.InterfaceC2142a;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j implements InterfaceC2142a<j> {
    public final String a;
    public final List<String> b;
    public final boolean c;

    protected j(String str, List<String> list, boolean z) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z;
    }
}
