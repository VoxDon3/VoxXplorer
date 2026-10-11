package ax.m7;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.m7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2528c extends OutputStream {
    long q;

    C2528c() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.q += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.q++;
    }
}
