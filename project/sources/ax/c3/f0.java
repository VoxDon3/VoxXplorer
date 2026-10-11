package ax.c3;

import android.media.MediaDataSource;
import ax.b3.C1495j;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class f0 extends MediaDataSource implements AutoCloseable {
    private static final Logger i0 = Logger.getLogger("FileManager.RemoteMediaDataSource");
    private long c0;
    private long d0;
    private int e0;
    private AbstractC3594m f0;
    private AbstractC3595n g0;
    private InterfaceC3185c h0;
    private a q;

    static class a extends BufferedInputStream implements InputStreamRetargetInterface {
        public a(InputStream inputStream, int i) {
            super(inputStream, i);
        }

        boolean a() {
            return ((BufferedInputStream) this).markpos >= 0;
        }

        int b() {
            if (((BufferedInputStream) this).markpos >= 0) {
                return -1;
            }
            ((BufferedInputStream) this).markpos = 0;
            return ((BufferedInputStream) this).pos;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }
    }

    public f0(AbstractC3594m abstractC3594m, AbstractC3595n abstractC3595n, InterfaceC3185c interfaceC3185c) {
        this.f0 = abstractC3594m;
        this.g0 = abstractC3595n;
        this.h0 = interfaceC3185c;
    }

    private void a(long j) throws IOException, C1495j {
        a aVar = this.q;
        if (aVar != null) {
            aVar.close();
            this.q = null;
        }
        this.e0++;
        a aVar2 = new a(this.f0.J(this.g0, j), 147456);
        this.q = aVar2;
        aVar2.mark(147456);
        this.d0 = j;
        this.c0 = j;
    }

    private void b() {
        int b;
        a aVar = this.q;
        if (aVar == null || aVar.a() || (b = this.q.b()) < 0) {
            return;
        }
        this.c0 = this.d0 - b;
    }

    private long c(long j) throws IOException {
        if (this.q == null) {
            return 0L;
        }
        long j2 = 0;
        int i = 0;
        do {
            long skip = this.q.skip(j - j2);
            if (skip < 0) {
                break;
            }
            if (skip == 0) {
                i++;
                if (i > 10) {
                    throw new IOException("Too many skip zero");
                }
            } else {
                i = 0;
            }
            j2 += skip;
        } while (j2 < j);
        this.d0 += j2;
        return j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a aVar = this.q;
        if (aVar != null) {
            try {
                aVar.close();
            } catch (Exception unused) {
            }
            this.q = null;
        }
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        return this.g0.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[Catch: j -> 0x003d, TryCatch #0 {j -> 0x003d, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x0039, B:22:0x0073, B:24:0x007f, B:28:0x0084, B:34:0x003f, B:36:0x0045, B:38:0x004b, B:40:0x0051, B:42:0x0057, B:43:0x0065, B:45:0x006b, B:47:0x006f), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: j -> 0x003d, TRY_LEAVE, TryCatch #0 {j -> 0x003d, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x0039, B:22:0x0073, B:24:0x007f, B:28:0x0084, B:34:0x003f, B:36:0x0045, B:38:0x004b, B:40:0x0051, B:42:0x0057, B:43:0x0065, B:45:0x006b, B:47:0x006f), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[EDGE_INSN: B:33:0x0082->B:27:0x0082 BREAK  A[LOOP:0: B:22:0x0073->B:32:?], SYNTHETIC] */
    @Override // android.media.MediaDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readAt(long r9, byte[] r11, int r12, int r13) throws java.io.IOException {
        /*
            r8 = this;
            ax.u3.c r0 = r8.h0
            if (r0 == 0) goto L1c
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L1c
            ax.c3.f0$a r9 = r8.q
            if (r9 == 0) goto L14
            r9.close()
            r9 = 0
            r8.q = r9
        L14:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "cancelled"
            r9.<init>(r10)
            throw r9
        L1c:
            ax.c3.f0$a r0 = r8.q     // Catch: ax.b3.C1495j -> L3d
            if (r0 == 0) goto L43
            long r1 = r8.d0     // Catch: ax.b3.C1495j -> L3d
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 <= 0) goto L43
            long r3 = r9 - r1
            r5 = 147456(0x24000, double:7.2853E-319)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L43
            long r1 = r9 - r1
            long r3 = r8.c(r1)     // Catch: ax.b3.C1495j -> L3d
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L3f
            r8.b()     // Catch: ax.b3.C1495j -> L3d
            goto L72
        L3d:
            r9 = move-exception
            goto L8f
        L3f:
            r8.a(r9)     // Catch: ax.b3.C1495j -> L3d
            goto L72
        L43:
            if (r0 == 0) goto L65
            long r1 = r8.d0     // Catch: ax.b3.C1495j -> L3d
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L65
            long r1 = r8.c0     // Catch: ax.b3.C1495j -> L3d
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 < 0) goto L65
            boolean r0 = r0.a()     // Catch: ax.b3.C1495j -> L3d
            if (r0 == 0) goto L65
            ax.c3.f0$a r0 = r8.q     // Catch: ax.b3.C1495j -> L3d
            r0.reset()     // Catch: ax.b3.C1495j -> L3d
            long r0 = r8.c0     // Catch: ax.b3.C1495j -> L3d
            r8.d0 = r0     // Catch: ax.b3.C1495j -> L3d
            long r9 = r9 - r0
            r8.c(r9)     // Catch: ax.b3.C1495j -> L3d
            goto L72
        L65:
            long r0 = r8.d0     // Catch: ax.b3.C1495j -> L3d
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L6f
            ax.c3.f0$a r0 = r8.q     // Catch: ax.b3.C1495j -> L3d
            if (r0 != 0) goto L72
        L6f:
            r8.a(r9)     // Catch: ax.b3.C1495j -> L3d
        L72:
            r9 = 0
        L73:
            ax.c3.f0$a r10 = r8.q     // Catch: ax.b3.C1495j -> L3d
            int r0 = r12 + r9
            int r1 = r13 - r9
            int r10 = r10.read(r11, r0, r1)     // Catch: ax.b3.C1495j -> L3d
            if (r10 < 0) goto L82
            int r9 = r9 + r10
            if (r9 < r13) goto L73
        L82:
            if (r9 <= 0) goto L8e
            long r10 = r8.d0     // Catch: ax.b3.C1495j -> L3d
            long r12 = (long) r9     // Catch: ax.b3.C1495j -> L3d
            long r10 = r10 + r12
            r8.d0 = r10     // Catch: ax.b3.C1495j -> L3d
            r8.b()     // Catch: ax.b3.C1495j -> L3d
            return r9
        L8e:
            return r10
        L8f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.f0.readAt(long, byte[], int, int):int");
    }
}
