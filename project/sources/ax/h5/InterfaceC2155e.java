package ax.h5;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.h5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2155e extends Closeable {
    InterfaceC2155e[] B0() throws IOException;

    InterfaceC2155e H0(String str) throws IOException;

    String K();

    void R0(long j);

    String W0();

    void X0(InterfaceC2155e interfaceC2155e) throws IOException;

    String[] c0() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void delete() throws IOException;

    long getLength();

    String getName();

    InterfaceC2155e getParent();

    long h();

    void i(long j, ByteBuffer byteBuffer) throws IOException;

    boolean isDirectory();

    void l(long j, ByteBuffer byteBuffer) throws IOException;

    InterfaceC2155e n(String str) throws IOException;

    InterfaceC2155e p0(String str) throws IOException;

    boolean q0();

    void w0(String str) throws IOException;

    String z();
}
