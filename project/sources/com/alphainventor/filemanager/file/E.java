package com.voxdon.xplorer.file;

import ax.N9.C0841e;
import ax.N9.InterfaceC0842e0;
import ax.b3.C1495j;
import ax.u3.InterfaceC3185c;
import com.microsoft.graph.extensions.UploadSession;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.List;

/* loaded from: classes.dex */
public class E<UploadType> {
    private final InterfaceC0842e0 a;
    private final ax.c3.G b;
    private final String c;
    private final long d;
    private final ax.L9.a<UploadType> e;
    private int f;

    public static class a {
        ax.c3.G a;
        InputStream b;

        a(ax.c3.G g, InputStream inputStream) {
            this.a = g;
            this.b = inputStream;
        }
    }

    public E(UploadSession uploadSession, InterfaceC0842e0 interfaceC0842e0, ax.c3.G g, long j, Class<UploadType> cls) {
        if (uploadSession == null) {
            throw new InvalidParameterException("Upload session is null.");
        }
        if (interfaceC0842e0 == null) {
            throw new InvalidParameterException("OneDrive client is null.");
        }
        if (g == null) {
            throw new InvalidParameterException("Input stream is null.");
        }
        if (j <= 0) {
            throw new InvalidParameterException("Stream size should larger than 0.");
        }
        this.a = interfaceC0842e0;
        this.f = 0;
        this.b = g;
        this.d = j;
        this.c = uploadSession.e;
        this.e = new ax.L9.a<>(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(List<ax.S9.c> list, InterfaceC3185c interfaceC3185c, ax.L9.e<UploadType> eVar, int... iArr) throws IOException, C1495j {
        int i = iArr.length > 0 ? iArr[0] : 5242880;
        int i2 = iArr.length > 1 ? iArr[1] : 3;
        if (i % 327680 != 0) {
            throw new IllegalArgumentException("Chunk size must be a multiple of 320 KiB");
        }
        if (i > 62914560) {
            throw new IllegalArgumentException("Please set chunk size smaller than 60 MiB");
        }
        InputStream b = this.b.b();
        if (b == null) {
            throw new IOException("no input stream");
        }
        a aVar = new a(this.b, b);
        while (true) {
            try {
                int i3 = this.f;
                long j = i3;
                long j2 = this.d;
                if (j >= j2) {
                    break;
                }
                int min = (int) Math.min(i, j2 - i3);
                C0841e a2 = new F(this.c, this.a, list, aVar, min, interfaceC3185c, i2, this.f, this.d, eVar).a(this.e);
                this.f += min;
                if (a2.e()) {
                    long j3 = this.d;
                    eVar.a(j3, j3);
                    eVar.c(a2.c());
                    break;
                } else if (a2.a()) {
                    eVar.a(this.f, this.d);
                } else if (a2.d()) {
                    eVar.b(a2.b());
                    break;
                }
            } catch (Throwable th) {
                aVar.b.close();
                throw th;
            }
        }
        aVar.b.close();
    }
}
