package ax.N1;

import ax.S0.C0968a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class j extends ax.V0.j<p, q, m> implements l {
    private final String o;

    class a extends q {
        a() {
        }

        @Override // androidx.media3.decoder.a
        public void B() {
            j.this.u(this);
        }
    }

    protected j(String str) {
        super(new p[2], new q[2]);
        this.o = str;
        x(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final q k() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final m l(Throwable th) {
        return new m("Unexpected decode error", th);
    }

    protected abstract k C(byte[] bArr, int i, boolean z) throws m;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final m m(p pVar, q qVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(pVar.e0);
            qVar.C(pVar.g0, C(byteBuffer.array(), byteBuffer.limit(), z), pVar.k0);
            qVar.e0 = false;
            return null;
        } catch (m e) {
            return e;
        }
    }

    @Override // ax.V0.g
    public final String getName() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final p j() {
        return new p();
    }

    @Override // ax.N1.l
    public void e(long j) {
    }
}
