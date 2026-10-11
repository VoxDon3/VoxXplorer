package ax.ra;

import ax.oa.C2738a;
import java.io.IOException;

/* renamed from: ax.ra.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3018b extends C2738a {
    private int i;
    private int j;

    /* renamed from: ax.ra.b$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.oa.d.values().length];
            a = iArr;
            try {
                iArr[ax.oa.d.BIND_ACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.oa.d.BIND_NAK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // ax.oa.C2738a
    public void r(ax.pa.c cVar) throws IOException {
        super.r(cVar);
        int i = a.a[h().ordinal()];
        if (i == 1) {
            this.i = cVar.i();
            this.j = cVar.i();
            cVar.b(d() - 20);
        } else {
            if (i == 2) {
                cVar.b(d() - 16);
                return;
            }
            throw new IOException("Invalid PDU type: " + h());
        }
    }

    public int s() {
        return this.j;
    }

    public int t() {
        return this.i;
    }

    public boolean u() {
        return ax.oa.d.BIND_ACK.equals(h());
    }
}
