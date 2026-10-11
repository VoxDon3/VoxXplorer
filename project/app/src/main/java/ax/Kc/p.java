/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.util.Iterator;
import java.util.List;

public class p
implements SeekableByteChannel,
AutoCloseable {
    private long c0;
    private int d0;
    private final List<SeekableByteChannel> q;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SeekableByteChannel a(long l8, long l9) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.isOpen()) {
                        int n8 = 0;
                        while ((long)n8 < l8) {
                            l9 += this.q.get(n8).size();
                            ++n8;
                        }
                        return this.position(l9);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    ClosedChannelException closedChannelException = new ClosedChannelException();
                    throw closedChannelException;
                }
            }
            throw throwable2;
        }
    }

    @Override
    public void close() throws IOException {
        Iterator<SeekableByteChannel> iterator = this.q.iterator();
        IOException iOException = null;
        while (iterator.hasNext()) {
            SeekableByteChannel seekableByteChannel = iterator.next();
            try {
                seekableByteChannel.close();
            }
            catch (IOException iOException2) {
                if (iOException != null) continue;
                iOException = iOException2;
            }
        }
        if (iOException == null) {
            return;
        }
        throw new IOException("failed to close wrapped channel", iOException);
    }

    @Override
    public boolean isOpen() {
        Iterator<SeekableByteChannel> iterator = this.q.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isOpen()) continue;
            return false;
        }
        return true;
    }

    @Override
    public long position() {
        return this.c0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SeekableByteChannel position(long var1_1) throws IOException {
        synchronized (this) {
            block7: {
                if (var1_1 < 0L) ** GOTO lbl33
                try {
                    if (this.isOpen()) {
                        this.c0 = var1_1;
                        var4_3 = var1_1;
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var8_6) {
                    break block7;
                }
                for (var3_2 = 0; var3_2 < this.q.size(); ++var3_2) {
                    block9: {
                        block8: {
                            var8_5 = this.q.get(var3_2);
                            var6_4 = var8_5.size();
                            var1_1 = -1L;
                            if (var4_3 != -1L) break block8;
                            var1_1 = var4_3;
                            var4_3 = 0L;
                            ** GOTO lbl-1000
                        }
                        if (var4_3 > var6_4) break block9;
                        this.d0 = var3_2;
                        ** GOTO lbl-1000
                    }
                    var1_1 = var4_3 - var6_4;
                    var4_3 = var6_4;
lbl-1000:
                    // 3 sources

                    {
                        var8_5.position(var4_3);
                        var4_3 = var1_1;
                        continue;
                    }
                }
                return this;
lbl-1000:
                // 1 sources

                {
                    var8_7 = new ClosedChannelException();
                    throw var8_7;
lbl33:
                    // 1 sources

                    var9_9 = new StringBuilder();
                    var9_9.append("Negative position: ");
                    var9_9.append(var1_1);
                    var8_8 = new IOException(var9_9.toString());
                    throw var8_8;
                }
            }
            throw var8_6;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(ByteBuffer var1_1) throws IOException {
        synchronized (this) {
            block11: {
                block10: {
                    try {
                        if (this.isOpen()) {
                            var4_3 = var1_1.hasRemaining();
                            var2_4 = 0;
                            if (var4_3) break block10;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_2) {
                        break block11;
                    }
                    return 0;
                }
                while (var1_1.hasRemaining() && this.d0 < this.q.size()) {
                    var5_6 = this.q.get(this.d0);
                    var3_5 = var5_6.read((ByteBuffer)var1_1);
                    if (var3_5 == -1) {
                        ++this.d0;
                        continue;
                    }
                    if (var5_6.position() >= var5_6.size()) {
                        ++this.d0;
                    }
                    var2_4 += var3_5;
                }
                if (var2_4 > 0) {
                    this.c0 += (long)var2_4;
                    return var2_4;
                }
                return -1;
lbl-1000:
                // 1 sources

                {
                    var1_1 = new ClosedChannelException();
                    throw var1_1;
                }
            }
            throw var1_2;
        }
    }

    @Override
    public long size() throws IOException {
        if (this.isOpen()) {
            Iterator<SeekableByteChannel> iterator = this.q.iterator();
            long l8 = 0L;
            while (iterator.hasNext()) {
                l8 += iterator.next().size();
            }
            return l8;
        }
        throw new ClosedChannelException();
    }

    public SeekableByteChannel truncate(long l8) {
        throw new NonWritableChannelException();
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        throw new NonWritableChannelException();
    }
}

