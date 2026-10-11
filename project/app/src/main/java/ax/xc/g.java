/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.xc.A;
import ax.xc.C;
import ax.xc.e;
import ax.xc.h;
import ax.xc.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface g
extends C,
ReadableByteChannel {
    public h B(long var1) throws IOException;

    public long J0(A var1) throws IOException;

    public byte[] O() throws IOException;

    public int O0(s var1) throws IOException;

    public boolean P() throws IOException;

    public void P0(long var1) throws IOException;

    public long S() throws IOException;

    public void T(e var1, long var2) throws IOException;

    public String U(long var1) throws IOException;

    public long U0() throws IOException;

    public InputStream V0();

    public String i0(Charset var1) throws IOException;

    public e k();

    public h m0() throws IOException;

    public g peek();

    public boolean r0(long var1) throws IOException;

    public byte readByte() throws IOException;

    public void readFully(byte[] var1) throws IOException;

    public int readInt() throws IOException;

    public long readLong() throws IOException;

    public short readShort() throws IOException;

    public void skip(long var1) throws IOException;

    public String v0() throws IOException;

    public boolean x0(long var1, h var3) throws IOException;

    public byte[] y0(long var1) throws IOException;
}

