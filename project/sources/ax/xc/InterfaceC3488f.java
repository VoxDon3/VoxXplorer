package ax.xc;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: ax.xc.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3488f extends InterfaceC3482A, WritableByteChannel {
    InterfaceC3488f G() throws IOException;

    InterfaceC3488f I0(h hVar) throws IOException;

    long M(C c) throws IOException;

    InterfaceC3488f Q0(long j) throws IOException;

    InterfaceC3488f R() throws IOException;

    InterfaceC3488f f0(String str) throws IOException;

    @Override // ax.xc.InterfaceC3482A, java.io.Flushable
    void flush() throws IOException;

    C3487e k();

    InterfaceC3488f l0(long j) throws IOException;

    InterfaceC3488f write(byte[] bArr) throws IOException;

    InterfaceC3488f write(byte[] bArr, int i, int i2) throws IOException;

    InterfaceC3488f writeByte(int i) throws IOException;

    InterfaceC3488f writeInt(int i) throws IOException;

    InterfaceC3488f writeShort(int i) throws IOException;
}
