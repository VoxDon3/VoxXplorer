/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

final class h {
    static GZIPInputStream a(InputStream inputStream) throws IOException {
        return new GZIPInputStream(new a(inputStream));
    }

    private static final class a
    extends FilterInputStream
    implements j.InputStreamRetargetInterface {
        private int q = 0;

        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override
        public int available() throws IOException {
            if (this.q > -1) {
                return Integer.MAX_VALUE;
            }
            return 0;
        }

        @Override
        public int read() throws IOException {
            int n8;
            this.q = n8 = super.read();
            return n8;
        }

        @Override
        public int read(byte[] byArray) throws IOException {
            int n8;
            this.q = n8 = super.read(byArray);
            return n8;
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            this.q = n8 = super.read(byArray, n8, n9);
            return n8;
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }
}

