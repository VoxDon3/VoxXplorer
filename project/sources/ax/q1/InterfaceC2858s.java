package ax.q1;

import ax.P0.InterfaceC0902k;
import java.io.IOException;

/* renamed from: ax.q1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2858s extends InterfaceC0902k {
    int a(int i) throws IOException;

    @Override // ax.P0.InterfaceC0902k
    int c(byte[] bArr, int i, int i2) throws IOException;

    boolean e(byte[] bArr, int i, int i2, boolean z) throws IOException;

    boolean g(int i, boolean z) throws IOException;

    long getLength();

    long getPosition();

    boolean h(byte[] bArr, int i, int i2, boolean z) throws IOException;

    long i();

    void j(int i) throws IOException;

    int k(byte[] bArr, int i, int i2) throws IOException;

    void m();

    void n(int i) throws IOException;

    boolean o(int i, boolean z) throws IOException;

    void p(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
