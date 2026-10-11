package ax.i7;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
final class h {

    private static final class a extends FilterInputStream implements InputStreamRetargetInterface {
        private int q;

        a(InputStream inputStream) {
            super(inputStream);
            this.q = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            if (this.q > -1) {
                return SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            return 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            this.q = read;
            return read;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int read = super.read(bArr);
            this.q = read;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            this.q = read;
            return read;
        }
    }

    static GZIPInputStream a(InputStream inputStream) throws IOException {
        return new GZIPInputStream(new a(inputStream));
    }
}
