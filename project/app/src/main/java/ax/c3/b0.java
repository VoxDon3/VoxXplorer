/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.os.ParcelFileDescriptor;
import android.system.Os;
import ax.X2.Q;
import ax.X2.q;
import ax.b3.j;
import ax.c3.f;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class b0
extends f {
    private ParcelFileDescriptor a;
    private boolean b;

    public b0(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
        this.b = true;
    }

    @Override
    public boolean a() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream c(long l8) throws j {
        IOException iOException2;
        block10: {
            Exception exception2;
            block9: {
                block8: {
                    block7: {
                        try {
                            if (!this.b) break block7;
                            this.b = false;
                            break block8;
                        }
                        catch (Exception exception2) {
                            break block9;
                        }
                        catch (IOException iOException2) {
                            break block10;
                        }
                    }
                    if (this.a.canDetectErrors()) {
                        this.a.checkError();
                    }
                    if (Q.P1()) {
                        Os.lseek((FileDescriptor)this.a.getFileDescriptor(), (long)0L, (int)0);
                    } else {
                        q.a(this.a, 0L);
                    }
                }
                a a8 = new a(this.a);
                if (l8 > 0L) {
                    ((InputStream)a8).skip(l8);
                }
                return a8;
            }
            exception2.printStackTrace();
            throw new j(exception2);
        }
        iOException2.printStackTrace();
        throw new j(iOException2);
    }

    @Override
    public long d() {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor.getStatSize();
        }
        return -1L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e() {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        if (parcelFileDescriptor == null) return;
        try {
            parcelFileDescriptor.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static class a
    extends FileInputStream
    implements j.InputStreamRetargetInterface {
        private final ParcelFileDescriptor q;

        a(ParcelFileDescriptor parcelFileDescriptor) {
            super(parcelFileDescriptor.getFileDescriptor());
            this.q = parcelFileDescriptor;
        }

        @Override
        public int read() throws IOException {
            int n8 = super.read();
            if (n8 == -1 && this.q.canDetectErrors()) {
                this.q.checkError();
            }
            return n8;
        }

        @Override
        public int read(byte[] byArray) throws IOException {
            int n8 = super.read(byArray);
            if (n8 == -1 && this.q.canDetectErrors()) {
                this.q.checkError();
            }
            return n8;
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            if ((n8 = super.read(byArray, n8, n9)) == -1 && this.q.canDetectErrors()) {
                this.q.checkError();
            }
            return n8;
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }
}

