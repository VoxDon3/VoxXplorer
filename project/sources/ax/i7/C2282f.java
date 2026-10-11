package ax.i7;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: ax.i7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2282f implements j {

    /* renamed from: ax.i7.f$a */
    class a extends BufferedOutputStream implements AutoCloseable {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                flush();
            } catch (IOException unused) {
            }
        }
    }

    @Override // ax.i7.j
    public void a(ax.m7.y yVar, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new a(outputStream));
        yVar.b(gZIPOutputStream);
        gZIPOutputStream.close();
    }

    @Override // ax.i7.j
    public String getName() {
        return "gzip";
    }
}
