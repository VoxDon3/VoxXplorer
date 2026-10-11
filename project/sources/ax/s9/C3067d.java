package ax.s9;

import ax.N8.y;
import ax.R8.s;
import ax.i9.InterfaceC2290b;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Future;

/* renamed from: ax.s9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3067d extends AbstractC3065b {
    private static final n i0 = new a();
    private final l h0;

    /* renamed from: ax.s9.d$a */
    class a implements n {
        a() {
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_SUCCESS.getValue() || j == ax.K8.a.STATUS_INVALID_PARAMETER.getValue();
        }
    }

    C3067d(ax.Q8.i iVar, C3066c c3066c, ax.k9.e eVar) {
        super(iVar, c3066c, eVar);
        this.h0 = new l(c3066c, iVar, eVar.h());
    }

    public OutputStream F0(boolean z) {
        return this.h0.a(z ? ((y) u(y.class)).a() : 0L);
    }

    public int L0(byte[] bArr, long j, int i, int i2) {
        s A = ((C3066c) this.c0).A(this.d0, j, i2);
        if (A.c().m() == ax.K8.a.STATUS_END_OF_FILE.getValue()) {
            return -1;
        }
        byte[] n = A.n();
        int min = Math.min(i2, n.length);
        System.arraycopy(n, 0, bArr, i, min);
        return min;
    }

    Future<s> M0(long j, int i) {
        return ((C3066c) this.c0).F(this.d0, j, i);
    }

    public long T0(byte[] bArr, long j, int i, int i2) {
        return this.h0.c(bArr, j, i, i2);
    }

    public String toString() {
        return "File{fileId=" + this.d0 + ", fileName='" + this.e0.h() + "'}";
    }

    public InputStream u0(long j, InterfaceC2290b interfaceC2290b, long j2) {
        return new e(this, ((C3066c) this.c0).d(), ((C3066c) this.c0).e(), j, interfaceC2290b, j2);
    }
}
