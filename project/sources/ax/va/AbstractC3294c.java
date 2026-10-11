package ax.va;

import ax.qa.EnumC2891a;
import ax.ra.AbstractC3021e;
import ax.wa.AbstractC3378b;
import java.io.IOException;

/* renamed from: ax.va.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3294c<T extends AbstractC3378b> extends AbstractC3021e {
    private T b;
    private long c;
    private Long d;

    /* renamed from: ax.va.c$a */
    public static class a extends AbstractC3294c<AbstractC3378b.a> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.va.AbstractC3294c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC3378b.a e() {
            return new AbstractC3378b.a();
        }
    }

    @Override // ax.ra.AbstractC3021e
    public void d(ax.pa.c cVar) throws IOException {
        T e = e();
        this.b = e;
        cVar.k(e);
        cVar.a(EnumC2891a.FOUR);
        this.c = cVar.h();
        if (cVar.j() != 0) {
            this.d = Long.valueOf(cVar.h());
        } else {
            this.d = null;
        }
    }

    abstract T e();

    public Long f() {
        return this.d;
    }

    public T g() {
        return this.b;
    }
}
