/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.xc.A;
import ax.xc.C;
import ax.xc.e;
import ax.xc.h;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;

public interface f
extends A,
WritableByteChannel {
    public f G() throws IOException;

    public f I0(h var1) throws IOException;

    public long M(C var1) throws IOException;

    public f Q0(long var1) throws IOException;

    public f R() throws IOException;

    public f f0(String var1) throws IOException;

    @Override
    public void flush() throws IOException;

    public e k();

    public f l0(long var1) throws IOException;

    public f write(byte[] var1) throws IOException;

    public f write(byte[] var1, int var2, int var3) throws IOException;

    public f writeByte(int var1) throws IOException;

    public f writeInt(int var1) throws IOException;

    public f writeShort(int var1) throws IOException;
}

