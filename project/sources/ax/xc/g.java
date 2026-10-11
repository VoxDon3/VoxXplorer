package ax.xc;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface g extends C, ReadableByteChannel {
    h B(long j) throws IOException;

    long J0(InterfaceC3482A interfaceC3482A) throws IOException;

    byte[] O() throws IOException;

    int O0(s sVar) throws IOException;

    boolean P() throws IOException;

    void P0(long j) throws IOException;

    long S() throws IOException;

    void T(C3487e c3487e, long j) throws IOException;

    String U(long j) throws IOException;

    long U0() throws IOException;

    InputStream V0();

    String i0(Charset charset) throws IOException;

    C3487e k();

    h m0() throws IOException;

    g peek();

    boolean r0(long j) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;

    String v0() throws IOException;

    boolean x0(long j, h hVar) throws IOException;

    byte[] y0(long j) throws IOException;
}
