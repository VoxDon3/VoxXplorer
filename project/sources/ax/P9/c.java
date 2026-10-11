package ax.P9;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class c implements p {
    private final ax.M9.f a;
    private final String b;
    private final List<ax.S9.c> c;
    private final ax.T9.d d;

    public c(String str, ax.M9.f fVar, List<ax.S9.c> list) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.b = str;
        this.a = fVar;
        this.d = null;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    @Override // ax.P9.p
    public String d() {
        return this.b;
    }

    @Override // ax.P9.p
    public ax.M9.f i() {
        return this.a;
    }

    public List<ax.S9.c> o() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    public String p(String str) {
        return this.b + "/" + str;
    }
}
