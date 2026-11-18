/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.N9.e;
import ax.N9.e0;
import ax.S9.c;
import ax.b3.j;
import ax.c3.G;
import com.voxdon.xplorer.file.F;
import com.microsoft.graph.extensions.UploadSession;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.List;

public class E<UploadType> {
    private final e0 a;
    private final G b;
    private final String c;
    private final long d;
    private final ax.L9.a<UploadType> e;
    private int f;

    public E(UploadSession uploadSession, e0 e02, G g8, long l8, Class<UploadType> clazz) {
        if (uploadSession != null) {
            if (e02 != null) {
                if (g8 != null) {
                    if (l8 > 0L) {
                        this.a = e02;
                        this.f = 0;
                        this.b = g8;
                        this.d = l8;
                        this.c = uploadSession.e;
                        this.e = new ax.L9.a<UploadType>(clazz);
                        return;
                    }
                    throw new InvalidParameterException("Stream size should larger than 0.");
                }
                throw new InvalidParameterException("Input stream is null.");
            }
            throw new InvalidParameterException("OneDrive client is null.");
        }
        throw new InvalidParameterException("Upload session is null.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(List<c> list, ax.u3.c c8, ax.L9.e<UploadType> e8, int ... object) throws IOException, j {
        Throwable throwable2;
        block10: {
            int n8 = ((int[])object).length > 0 ? object[0] : 0x500000;
            int n9 = ((int[])object).length > 1 ? object[1] : 3;
            if (n8 % 327680 != 0) {
                throw new IllegalArgumentException("Chunk size must be a multiple of 320 KiB");
            }
            if (n8 > 0x3C00000) {
                throw new IllegalArgumentException("Please set chunk size smaller than 60 MiB");
            }
            object = this.b.b();
            if (object == null) {
                throw new IOException("no input stream");
            }
            object = new a(this.b, (InputStream)object);
            try {
                long l8;
                int n10;
                long l9;
                while ((l9 = (long)(n10 = this.f)) < (l8 = this.d)) {
                    n10 = (int)Math.min((long)n8, l8 - (long)n10);
                    Object object2 = new F(this.c, this.a, list, (a)object, n10, c8, n9, this.f, this.d, e8);
                    object2 = ((F)object2).a(this.e);
                    this.f += n10;
                    if (((e)object2).e()) {
                        l8 = this.d;
                        e8.a(l8, l8);
                        e8.c(((e)object2).c());
                    } else {
                        if (((e)object2).a()) {
                            e8.a(this.f, this.d);
                            continue;
                        }
                        if (!((e)object2).d()) continue;
                        e8.b(((e)object2).b());
                    }
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block10;
            }
            object.b.close();
            return;
        }
        object.b.close();
        throw throwable2;
    }

    public static class a {
        G a;
        InputStream b;

        a(G g8, InputStream inputStream) {
            this.a = g8;
            this.b = inputStream;
        }
    }
}

