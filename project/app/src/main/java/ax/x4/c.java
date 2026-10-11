/*
 * Decompiled with CFR 0.152.
 */
package ax.x4;

import ax.s4.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class c<R> {
    private Long a = null;
    private Long b = null;

    protected c() {
    }

    protected List<a.a> a() {
        if (this.a == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<a.a> arrayList = new ArrayList<a.a>();
        Object object = this.a;
        ((Long)object).longValue();
        String string = String.format("bytes=%d-", object);
        object = string;
        if (this.b != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(Long.toString(this.a + this.b - 1L));
            object = ((StringBuilder)object).toString();
        }
        arrayList.add(new a.a("Range", (String)object));
        return arrayList;
    }

    public c<R> b(long l8) {
        if (l8 >= 0L) {
            this.a = l8;
            this.b = null;
            return this;
        }
        throw new IllegalArgumentException("start must be non-negative");
    }
}

