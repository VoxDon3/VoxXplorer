package ax.x4;

import ax.s4.AbstractC3046a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ax.x4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3432c<R> {
    private Long a = null;
    private Long b = null;

    protected AbstractC3432c() {
    }

    protected List<AbstractC3046a.C0448a> a() {
        if (this.a == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Long l = this.a;
        l.longValue();
        String format = String.format("bytes=%d-", l);
        if (this.b != null) {
            format = format + Long.toString((this.a.longValue() + this.b.longValue()) - 1);
        }
        arrayList.add(new AbstractC3046a.C0448a("Range", format));
        return arrayList;
    }

    public AbstractC3432c<R> b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("start must be non-negative");
        }
        this.a = Long.valueOf(j);
        this.b = null;
        return this;
    }
}
