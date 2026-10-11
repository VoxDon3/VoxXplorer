/*
 * Decompiled with CFR 0.152.
 */
package ax.h5;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface e
extends Closeable {
    public e[] B0() throws IOException;

    public e H0(String var1) throws IOException;

    public String K();

    public void R0(long var1);

    public String W0();

    public void X0(e var1) throws IOException;

    public String[] c0() throws IOException;

    @Override
    public void close() throws IOException;

    public void delete() throws IOException;

    public long getLength();

    public String getName();

    public e getParent();

    public long h();

    public void i(long var1, ByteBuffer var3) throws IOException;

    public boolean isDirectory();

    public void l(long var1, ByteBuffer var3) throws IOException;

    public e n(String var1) throws IOException;

    public e p0(String var1) throws IOException;

    public boolean q0();

    public void w0(String var1) throws IOException;

    public String z();
}

