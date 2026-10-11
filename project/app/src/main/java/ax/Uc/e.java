/*
 * Decompiled with CFR 0.152.
 */
package ax.Uc;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class e
extends FilterOutputStream {
    private boolean q = false;

    public e(OutputStream outputStream) {
        super(outputStream);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(int n8) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        if (n8 == 10) break block4;
                        if (n8 != 13) break block5;
                        try {
                            this.q = true;
                            this.out.write(13);
                            return;
                        }
                        catch (Throwable throwable2) {}
                        break block6;
                    }
                    if (!this.q) {
                        this.out.write(13);
                    }
                }
                this.q = false;
                this.out.write(n8);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] byArray) throws IOException {
        synchronized (this) {
            this.write(byArray, 0, byArray.length);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        synchronized (this) {
            while (n9 > 0) {
                this.write(byArray[n8]);
                ++n8;
                --n9;
            }
            return;
        }
    }
}

