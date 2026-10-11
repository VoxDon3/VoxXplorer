package ax.c3;

import android.os.ParcelFileDescriptor;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.b0;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.C3590i;
import com.voxdon.xplorer.file.C3605y;
import j$.nio.channels.DesugarChannels;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class F {

    class a extends G {
        final /* synthetic */ byte[] a;

        a(byte[] bArr) {
            this.a = bArr;
        }

        @Override // ax.c3.G
        public boolean a() {
            return true;
        }

        @Override // ax.c3.G
        public InputStream c(long j) throws C1495j {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a);
                if (j <= 0) {
                    return byteArrayInputStream;
                }
                byteArrayInputStream.skip(j);
                return byteArrayInputStream;
            } catch (IOException e) {
                throw new C1495j(e);
            }
        }

        @Override // ax.c3.G
        public long d() {
            return this.a.length;
        }
    }

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                ax.Z.f.a(autoCloseable);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            return c(inputStream, outputStream, -1L, null, null);
        } catch (C1486a unused) {
            return -1L;
        }
    }

    public static long c(InputStream inputStream, OutputStream outputStream, long j, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1486a, IOException {
        return d(inputStream, outputStream, j, new byte[8192], false, -1L, interfaceC3185c, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long d(InputStream inputStream, OutputStream outputStream, long j, byte[] bArr, boolean z, long j2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1486a, IOException {
        boolean z2;
        long j3;
        int i;
        if (ax.X2.Q.F() && ((inputStream instanceof ParcelFileDescriptor.AutoCloseInputStream) || (inputStream instanceof b0.a))) {
            ax.X2.Q.l(37);
            z2 = true;
        } else {
            z2 = false;
        }
        long j4 = 0;
        long j5 = 0;
        while (true) {
            if (z2) {
                try {
                    i = inputStream.read(bArr);
                    j3 = 0;
                } catch (IOException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        break;
                    }
                    j3 = 0;
                    if (!message.contains("ENOENT")) {
                        break;
                    }
                    int available = inputStream.available();
                    if (available > 0) {
                        i = inputStream.read(bArr, 0, inputStream.available());
                    } else {
                        if (available != 0) {
                            C3184b.e("io utils error :" + message);
                            throw e;
                        }
                        i = -1;
                    }
                    C3184b.e("io utils error :" + message);
                    throw e;
                }
            } else {
                j3 = 0;
                i = inputStream.read(bArr);
            }
            if (i < 0) {
                outputStream.flush();
                if (iVar != null) {
                    iVar.a(j4, j);
                }
                return j4;
            }
            if (i == 0) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException unused) {
                }
            } else {
                outputStream.write(bArr, 0, i);
                j4 += i;
                if (j4 - j5 >= 262144) {
                    if (iVar != null) {
                        if (z && (inputStream instanceof ax.Kc.o)) {
                            iVar.a(((ax.Kc.o) inputStream).a(), j);
                        } else {
                            iVar.a(j4, j);
                        }
                    }
                    if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                        throw new C1486a();
                    }
                    j5 = j4;
                }
                if (j2 > j3 && j4 > j2) {
                    throw new IOException("Size limit exceeded");
                }
            }
        }
    }

    public static G e(byte[] bArr) {
        return new a(bArr);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0018: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:25), block:B:51:0x0017 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.io.InputStream r8, java.io.File r9, long r10, ax.u3.InterfaceC3185c r12) throws java.io.IOException, ax.b3.C1486a {
        /*
            r1 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1d ax.b3.C1486a -> L21
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L1d ax.b3.C1486a -> L21
            r7 = 0
            r2 = r8
            r4 = r10
            r6 = r12
            c(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L16 ax.b3.C1486a -> L1a
            if (r2 == 0) goto L12
            r2.close()     // Catch: java.io.IOException -> L12
        L12:
            r3.close()     // Catch: java.io.IOException -> L15
        L15:
            return
        L16:
            r0 = move-exception
            r8 = r0
            r1 = r3
            goto L37
        L1a:
            r0 = move-exception
            r8 = r0
            goto L25
        L1d:
            r0 = move-exception
            r2 = r8
        L1f:
            r8 = r0
            goto L37
        L21:
            r0 = move-exception
            r2 = r8
            r8 = r0
            r3 = r1
        L25:
            r3.close()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L29
            goto L2a
        L29:
            r1 = r3
        L2a:
            boolean r10 = r9.exists()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L36
            r9.delete()     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r0 = move-exception
            goto L1f
        L36:
            throw r8     // Catch: java.lang.Throwable -> L34
        L37:
            if (r2 == 0) goto L3e
            r2.close()     // Catch: java.io.IOException -> L3d
            goto L3e
        L3d:
        L3e:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.io.IOException -> L43
        L43:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.F.f(java.io.InputStream, java.io.File, long, ax.u3.c):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ax.Dc.S, java.lang.AutoCloseable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] g(ax.c3.AbstractC1823k r4, java.lang.String r5) throws ax.b3.C1495j {
        /*
            r0 = 0
            boolean r1 = ax.c3.C1809B.P(r4)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            if (r1 == 0) goto L1e
            ax.Dc.S r1 = new ax.Dc.S     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            com.voxdon.xplorer.file.y r4 = (com.voxdon.xplorer.file.C3605y) r4     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            java.lang.String r4 = r4.K0()     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            r4 = r0
            goto L39
        L14:
            r4 = move-exception
            r5 = r0
            r1 = r5
            goto L8a
        L19:
            r4 = move-exception
            r5 = r0
            r1 = r5
            goto L7d
        L1e:
            com.voxdon.xplorer.file.i r4 = (com.voxdon.xplorer.file.C3590i) r4     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            r1 = 1
            android.os.ParcelFileDescriptor r4 = r4.e0(r1)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            java.io.FileDescriptor r4 = r4.getFileDescriptor()     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L19
            java.nio.channels.FileChannel r4 = ax.T.l.a(r1)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7b
            ax.Dc.S r2 = new ax.Dc.S     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7b
            r4 = r1
            r1 = r2
        L39:
            ax.Dc.I r5 = r1.g(r5)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L71
            if (r5 != 0) goto L48
            if (r4 == 0) goto L44
            a(r4)
        L44:
            a(r1)
            return r0
        L48:
            java.io.InputStream r0 = r1.j(r5)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L71
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L71
            r2 = 8192(0x2000, float:1.14794E-41)
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L71
            b(r0, r5)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L71
            r5.close()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L71
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L71
            if (r0 == 0) goto L62
            a(r0)
        L62:
            if (r4 == 0) goto L67
            a(r4)
        L67:
            a(r1)
            return r5
        L6b:
            r5 = move-exception
            r3 = r1
            r1 = r4
            r4 = r5
        L6f:
            r5 = r3
            goto L8a
        L71:
            r5 = move-exception
            r3 = r1
            r1 = r4
            r4 = r5
            r5 = r0
            r0 = r3
            goto L7d
        L78:
            r4 = move-exception
            r5 = r0
            goto L8a
        L7b:
            r4 = move-exception
            r5 = r0
        L7d:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L86
            ax.b3.j r2 = new ax.b3.j     // Catch: java.lang.Throwable -> L86
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L86
            throw r2     // Catch: java.lang.Throwable -> L86
        L86:
            r4 = move-exception
            r3 = r0
            r0 = r5
            goto L6f
        L8a:
            if (r0 == 0) goto L8f
            a(r0)
        L8f:
            if (r1 == 0) goto L94
            a(r1)
        L94:
            if (r5 == 0) goto L99
            a(r5)
        L99:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.F.g(ax.c3.k, java.lang.String):byte[]");
    }

    public static byte[] h(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String i(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toString("UTF-8");
    }

    public static String j(InputStream inputStream, int i, long j) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        try {
            d(inputStream, byteArrayOutputStream, -1L, new byte[8192], false, j, null, null);
            return byteArrayOutputStream.toString("UTF-8");
        } catch (C1486a unused) {
            C3184b.f();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [ax.Dc.S, java.lang.AutoCloseable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(ax.c3.AbstractC1823k r6, java.lang.String r7, java.io.File r8) throws ax.b3.C1495j {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.F.k(ax.c3.k, java.lang.String, java.io.File):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.FileOutputStream, java.io.OutputStream, java.lang.AutoCloseable] */
    public static ax.B.b<String> l(AbstractC1823k abstractC1823k, File file, ax.B.b<String> bVar) throws C1495j {
        FileInputStream fileInputStream;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        FileInputStream fileInputStream2;
        ax.Dc.S s;
        InputStream inputStream;
        if (!file.exists()) {
            file.mkdirs();
        }
        String[] list = file.list();
        if (list != null && list.length != 0) {
            throw new C1495j("Destination directory is not empty.");
        }
        ax.Dc.S s2 = null;
        ax.B.b<String> bVar2 = bVar != null ? new ax.B.b<>() : null;
        try {
            try {
                if (C1809B.P(abstractC1823k)) {
                    s = new ax.Dc.S(((C3605y) abstractC1823k).K0());
                    fileInputStream2 = null;
                } else {
                    FileInputStream fileInputStream3 = new FileInputStream(((C3590i) abstractC1823k).e0(true).getFileDescriptor());
                    try {
                        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream3.getChannel());
                        ax.Dc.S s3 = new ax.Dc.S(convertMaybeLegacyFileChannelFromLibrary);
                        fileInputStream2 = fileInputStream3;
                        s = s3;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        throw new C1495j(e);
                    }
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                Enumeration<ax.Dc.I> f = s.f();
                while (f.hasMoreElements()) {
                    ax.Dc.I nextElement = f.nextElement();
                    String name = nextElement.getName();
                    if (bVar != null && !bVar.contains(name)) {
                    }
                    File file2 = new File(file, name);
                    if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator)) {
                        throw new C1495j("Illegal name: " + name);
                    }
                    if (nextElement.isDirectory()) {
                        file2.mkdirs();
                    } else {
                        new File(file2.getParent()).mkdirs();
                        try {
                            inputStream = s.j(nextElement);
                            try {
                                ?? fileOutputStream = new FileOutputStream(file2);
                                try {
                                    b(inputStream, fileOutputStream);
                                    a(fileOutputStream);
                                    if (inputStream != null) {
                                        a(inputStream);
                                    }
                                    if (bVar2 != null) {
                                        bVar2.add(name);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    s2 = fileOutputStream;
                                    if (s2 != null) {
                                        a(s2);
                                    }
                                    if (inputStream != null) {
                                        a(inputStream);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    }
                }
                a(s);
                if (fileInputStream2 != null) {
                    a(fileInputStream2);
                }
                return bVar2;
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                throw new C1495j(e);
            } catch (Throwable th5) {
                s2 = s;
                fileInputStream = fileInputStream2;
                th = th5;
                if (s2 != null) {
                    a(s2);
                }
                if (fileInputStream != null) {
                    a(fileInputStream);
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th6) {
            th = th6;
            fileInputStream = null;
        }
    }

    public static void m(File file, String str) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException unused) {
        }
    }
}
