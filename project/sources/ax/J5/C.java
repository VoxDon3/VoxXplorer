package ax.J5;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
abstract class C extends A {
    private static final WeakReference g = new WeakReference(null);
    private WeakReference f;

    C(byte[] bArr) {
        super(bArr);
        this.f = g;
    }

    @Override // ax.J5.A
    final byte[] a2() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f.get();
                if (bArr == null) {
                    bArr = b2();
                    this.f = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    protected abstract byte[] b2();
}
