/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public abstract class c
extends InputStream
implements j.InputStreamRetargetInterface {
    private ByteBuffer c0;
    private long d0;
    private final long q;

    public c(long l8, long l9) {
        long l10;
        this.q = l10 = l8 + l9;
        if (l10 >= l8) {
            this.d0 = l8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid length of stream at offset=");
        stringBuilder.append(l8);
        stringBuilder.append(", length=");
        stringBuilder.append(l9);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected abstract int a(long var1, ByteBuffer var3) throws IOException;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read() throws IOException {
        synchronized (this) {
            int n8;
            Throwable throwable2;
            block8: {
                block7: {
                    try {
                        long l8 = this.d0;
                        long l9 = this.q;
                        if (l8 < l9) break block7;
                    }
                    catch (Throwable throwable2) {}
                    return -1;
                }
                ByteBuffer byteBuffer = this.c0;
                if (byteBuffer == null) {
                    this.c0 = ByteBuffer.allocate(1);
                } else {
                    byteBuffer.rewind();
                }
                n8 = this.a(this.d0, this.c0);
                if (n8 >= 1) break block8;
                return -1;
            }
            ++this.d0;
            n8 = this.c0.get();
            return n8 & 0xFF;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                long l8;
                block8: {
                    long l9;
                    long l10;
                    block7: {
                        try {
                            l10 = this.d0;
                            l9 = this.q;
                            if (l10 < l9) break block7;
                        }
                        catch (Throwable throwable2) {}
                        return -1;
                    }
                    l8 = n9;
                    l8 = Math.min(l8, l9 - l10);
                    if (l8 > 0L) break block8;
                    return 0;
                }
                if (n8 >= 0) {
                    block10: {
                        if (n8 > ((byte[])object).length || l8 > (long)(((byte[])object).length - n8)) break block9;
                        if ((n8 = this.a(this.d0, (ByteBuffer)(object = (Object)ByteBuffer.wrap(object, n8, (int)l8)))) <= 0) break block10;
                        this.d0 += (long)n8;
                    }
                    return n8;
                }
            }
            object = new IndexOutOfBoundsException;
            object("offset or len are out of bounds");
            throw object;
            throw throwable2;
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

