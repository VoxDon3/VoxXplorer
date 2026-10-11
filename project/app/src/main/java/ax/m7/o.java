/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class o
extends ByteArrayOutputStream
implements AutoCloseable {
    private final int c0;
    private boolean d0;
    private final Level e0;
    private final Logger f0;
    private int q;

    public o(Logger logger, Level level, int n8) {
        this.f0 = v.d(logger);
        this.e0 = v.d(level);
        boolean bl = n8 >= 0;
        v.a(bl);
        this.c0 = n8;
    }

    private static void a(StringBuilder stringBuilder, int n8) {
        if (n8 == 1) {
            stringBuilder.append("1 byte");
            return;
        }
        stringBuilder.append(NumberFormat.getInstance().format(n8));
        stringBuilder.append(" bytes");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block4: {
                    block5: {
                        StringBuilder stringBuilder;
                        block6: {
                            try {
                                if (this.d0) break block4;
                                if (this.q == 0) break block5;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Total: ");
                                o.a(stringBuilder, this.q);
                                int n8 = this.count;
                                if (n8 == 0 || n8 >= this.q) break block6;
                                stringBuilder.append(" (logging first ");
                                o.a(stringBuilder, this.count);
                                stringBuilder.append(")");
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        this.f0.config(stringBuilder.toString());
                        if (this.count != 0) {
                            this.f0.log(this.e0, this.toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                        }
                    }
                    this.d0 = true;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        v.a(this.d0 ^ true);
                        ++this.q;
                        if (this.count >= this.c0) break block4;
                        super.write(n8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] byArray, int n8, int n9) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    int n10;
                    try {
                        v.a(this.d0 ^ true);
                        this.q += n9;
                        n10 = this.count;
                        int n11 = this.c0;
                        if (n10 >= n11) break block6;
                        int n12 = n10 + n9;
                        n10 = n9;
                        if (n12 > n11) {
                            n10 = n9 + (n11 - n12);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    {
                        super.write(byArray, n8, n10);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

