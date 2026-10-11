/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.f;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.ColumnLink;
import java.util.List;

public class BaseColumnLinkCollectionResponse
implements d {
    @a
    @c(value="value")
    public List<ColumnLink> a;
    @a(serialize=false)
    @c(value="@odata.nextLink")
    public String b;
    private transient com.microsoft.graph.serializer.a c = new com.microsoft.graph.serializer.a(this);
    private transient l d;
    private transient e e;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.c;
    }

    @Override
    public void d(e object, l l8) {
        this.e = object;
        this.d = l8;
        if (l8.x("value")) {
            object = l8.u("value");
            for (int i8 = 0; i8 < ((f)object).size(); ++i8) {
                this.a.get(i8).d(this.e, (l)((f)object).s(i8));
            }
        }
    }
}

