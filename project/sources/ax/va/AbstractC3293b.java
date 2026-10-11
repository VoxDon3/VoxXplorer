package ax.va;

import ax.pa.d;
import ax.ra.AbstractC3020d;
import ax.va.AbstractC3294c;
import ax.wa.AbstractC3378b;
import ax.wa.EnumC3377a;
import java.io.IOException;

/* renamed from: ax.va.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3293b<T extends AbstractC3378b> extends AbstractC3020d<AbstractC3294c<T>> {
    private final long b;
    private final Long c;

    /* renamed from: ax.va.b$a */
    public static class a extends AbstractC3293b<AbstractC3378b.a> {
        public a(long j, Long l) {
            super(j, l);
        }

        @Override // ax.va.AbstractC3293b
        public EnumC3377a e() {
            return EnumC3377a.SHARE_INFO_1_CONTAINER;
        }

        @Override // ax.ra.AbstractC3020d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC3294c<AbstractC3378b.a> c() {
            return new AbstractC3294c.a();
        }
    }

    public AbstractC3293b(long j, Long l) {
        super(EnumC3292a.NetrShareEnum.h());
        this.b = j;
        this.c = l;
    }

    @Override // ax.pa.b
    public void a(d dVar) throws IOException {
        dVar.f();
        dVar.c(e().h());
        dVar.c(e().h());
        dVar.g();
        dVar.c(0);
        dVar.f();
        dVar.d(this.b);
        if (dVar.h(this.c)) {
            dVar.d(this.c.longValue());
        }
    }

    public abstract EnumC3377a e();
}
