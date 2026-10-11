package ax.b4;

import android.graphics.Bitmap;
import ax.L3.a;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0118a {
    private final ax.Q3.d a;
    private final ax.Q3.b b;

    public b(ax.Q3.d dVar, ax.Q3.b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    @Override // ax.L3.a.InterfaceC0118a
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.a.e(i, i2, config);
    }

    @Override // ax.L3.a.InterfaceC0118a
    public int[] b(int i) {
        ax.Q3.b bVar = this.b;
        return bVar == null ? new int[i] : (int[]) bVar.d(i, int[].class);
    }

    @Override // ax.L3.a.InterfaceC0118a
    public void c(Bitmap bitmap) {
        this.a.c(bitmap);
    }

    @Override // ax.L3.a.InterfaceC0118a
    public void d(byte[] bArr) {
        ax.Q3.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.c(bArr, byte[].class);
    }

    @Override // ax.L3.a.InterfaceC0118a
    public byte[] e(int i) {
        ax.Q3.b bVar = this.b;
        return bVar == null ? new byte[i] : (byte[]) bVar.d(i, byte[].class);
    }

    @Override // ax.L3.a.InterfaceC0118a
    public void f(int[] iArr) {
        ax.Q3.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.c(iArr, int[].class);
    }
}
