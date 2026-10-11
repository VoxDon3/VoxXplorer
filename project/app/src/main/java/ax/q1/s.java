/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.k;
import java.io.IOException;

public interface s
extends k {
    public int a(int var1) throws IOException;

    @Override
    public int c(byte[] var1, int var2, int var3) throws IOException;

    public boolean e(byte[] var1, int var2, int var3, boolean var4) throws IOException;

    public boolean g(int var1, boolean var2) throws IOException;

    public long getLength();

    public long getPosition();

    public boolean h(byte[] var1, int var2, int var3, boolean var4) throws IOException;

    public long i();

    public void j(int var1) throws IOException;

    public int k(byte[] var1, int var2, int var3) throws IOException;

    public void m();

    public void n(int var1) throws IOException;

    public boolean o(int var1, boolean var2) throws IOException;

    public void p(byte[] var1, int var2, int var3) throws IOException;

    public void readFully(byte[] var1, int var2, int var3) throws IOException;
}

