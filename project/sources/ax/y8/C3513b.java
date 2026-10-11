package ax.y8;

import ax.z8.InterfaceC3558b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.y8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3513b extends FilterOutputStream {
    private final InterfaceC3558b q;

    public C3513b(InterfaceC3558b interfaceC3558b, OutputStream outputStream) {
        super(outputStream);
        this.q = interfaceC3558b;
    }

    private int a(int i) {
        int i2 = 1;
        while (i > 255) {
            i2++;
            i >>= 8;
        }
        return i2;
    }

    private void b(int i) throws IOException {
        if (i < 127) {
            write(i);
            return;
        }
        int a = a(i);
        write(a | 128);
        while (a > 0) {
            write(i >> ((a - 1) * 8));
            a--;
        }
    }

    private void d(ax.C8.c cVar) throws IOException {
        write((byte) (cVar.h() | cVar.g().d() | cVar.f().d()));
    }

    public void c(ax.C8.b bVar) throws IOException {
        d(bVar.e());
        AbstractC3516e k = bVar.e().k(this.q);
        b(k.b(bVar));
        k.a(bVar, this);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
