package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C2997f;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.ActivityHistoryItem;
import java.util.List;
import okhttp3.internal.Util;

/* loaded from: classes3.dex */
public class BaseActivityHistoryItemCollectionResponse implements d {

    @InterfaceC3059a
    @InterfaceC3061c("value")
    public List<ActivityHistoryItem> a;

    @InterfaceC3059a(serialize = Util.assertionsEnabled)
    @InterfaceC3061c("@odata.nextLink")
    public String b;
    private transient com.microsoft.graph.serializer.a c = new com.microsoft.graph.serializer.a(this);
    private transient C3003l d;
    private transient e e;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.c;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.e = eVar;
        this.d = c3003l;
        if (c3003l.x("value")) {
            C2997f u = c3003l.u("value");
            for (int i = 0; i < u.size(); i++) {
                this.a.get(i).d(this.e, (C3003l) u.s(i));
            }
        }
    }
}
