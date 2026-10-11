package ax.c3;

import android.os.ParcelFileDescriptor;
import android.system.Os;
import ax.X2.C1171q;
import ax.b3.C1495j;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class b0 extends AbstractC1818f {
    private ParcelFileDescriptor a;
    private boolean b = true;

    public b0(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // ax.c3.G
    public boolean a() {
        return true;
    }

    @Override // ax.c3.G
    public InputStream c(long j) throws C1495j {
        try {
            if (this.b) {
                this.b = false;
            } else {
                if (this.a.canDetectErrors()) {
                    this.a.checkError();
                }
                if (ax.X2.Q.P1()) {
                    Os.lseek(this.a.getFileDescriptor(), 0L, 0);
                } else {
                    C1171q.a(this.a, 0L);
                }
            }
            a aVar = new a(this.a);
            if (j > 0) {
                aVar.skip(j);
            }
            return aVar;
        } catch (IOException e) {
            e.printStackTrace();
            throw new C1495j(e);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new C1495j(e2);
        }
    }

    @Override // ax.c3.G
    public long d() {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor.getStatSize();
        }
        return -1L;
    }

    @Override // ax.c3.AbstractC1818f
    public void e() {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static class a extends FileInputStream implements InputStreamRetargetInterface {
        private final ParcelFileDescriptor q;

        a(ParcelFileDescriptor parcelFileDescriptor) {
            super(parcelFileDescriptor.getFileDescriptor());
            this.q = parcelFileDescriptor;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read == -1 && this.q.canDetectErrors()) {
                this.q.checkError();
            }
            return read;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int read = super.read(bArr);
            if (read == -1 && this.q.canDetectErrors()) {
                this.q.checkError();
            }
            return read;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read == -1 && this.q.canDetectErrors()) {
                this.q.checkError();
            }
            return read;
        }
    }
}
