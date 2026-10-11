package ax.c3;

/* renamed from: ax.c3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1827o {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r2.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[Catch: all -> 0x0025, Exception -> 0x0028, TryCatch #10 {Exception -> 0x0028, all -> 0x0025, blocks: (B:8:0x0014, B:10:0x001d, B:11:0x0036, B:13:0x003a, B:16:0x003f, B:30:0x002b, B:32:0x002f, B:33:0x0063), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002b A[Catch: all -> 0x0025, Exception -> 0x0028, TryCatch #10 {Exception -> 0x0028, all -> 0x0025, blocks: (B:8:0x0014, B:10:0x001d, B:11:0x0036, B:13:0x003a, B:16:0x003f, B:30:0x002b, B:32:0x002f, B:33:0x0063), top: B:7:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(ax.c3.AbstractC1823k r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            boolean r2 = r5.k0()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r3 = 1
            if (r2 == 0) goto L13
            android.os.ParcelFileDescriptor r2 = r5.e0(r3)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11 ax.b3.C1495j -> L13
            goto L14
        Lf:
            r5 = move-exception
            goto L6c
        L11:
            goto L72
        L13:
            r2 = r1
        L14:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r4.<init>()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r4.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r2 == 0) goto L2b
            java.io.FileDescriptor r5 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            android.graphics.BitmapFactory.decodeFileDescriptor(r5, r1, r4)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            goto L36
        L25:
            r5 = move-exception
            r1 = r2
            goto L6c
        L28:
            r1 = r2
            goto L72
        L2b:
            boolean r1 = r5 instanceof com.voxdon.xplorer.file.C3605y     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r1 == 0) goto L63
            java.lang.String r5 = r5.E()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            android.graphics.BitmapFactory.decodeFile(r5, r4)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
        L36:
            int r5 = r4.outWidth     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r5 < 0) goto L5d
            int r5 = r4.outHeight     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r5 >= 0) goto L3f
            goto L5d
        L3f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r5.<init>()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            int r1 = r4.outWidth     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r5.append(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            java.lang.String r1 = " x "
            r5.append(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            int r1 = r4.outHeight     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r5.append(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.lang.Exception -> L5c
        L5c:
            return r5
        L5d:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.lang.Exception -> L62
        L62:
            return r0
        L63:
            ax.u3.C3184b.f()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r2 == 0) goto L6b
            r2.close()     // Catch: java.lang.Exception -> L6b
        L6b:
            return r0
        L6c:
            if (r1 == 0) goto L71
            r1.close()     // Catch: java.lang.Exception -> L71
        L71:
            throw r5
        L72:
            if (r1 == 0) goto L77
            r1.close()     // Catch: java.lang.Exception -> L77
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1827o.a(ax.c3.k):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(ax.c3.AbstractC1823k r6) {
        /*
            r0 = 0
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L83 java.lang.RuntimeException -> L86
            r1.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.RuntimeException -> L86
            boolean r2 = r6.k0()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            if (r2 == 0) goto L1f
            r2 = 1
            android.os.ParcelFileDescriptor r0 = r6.e0(r2)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18 ax.b3.C1495j -> L1e
            goto L1f
        L12:
            r6 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L9b
        L18:
            r6 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L88
        L1e:
        L1f:
            java.lang.String r2 = "--:--"
            if (r0 == 0) goto L2b
            java.io.FileDescriptor r6 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            r1.setDataSource(r6)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            goto L36
        L2b:
            boolean r3 = r6 instanceof com.voxdon.xplorer.file.C3605y     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            if (r3 == 0) goto L5c
            java.lang.String r6 = r6.E()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            r1.setDataSource(r6)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
        L36:
            r6 = 9
            java.lang.String r6 = r1.extractMetadata(r6)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            if (r6 != 0) goto L49
            r1.release()     // Catch: java.lang.Exception -> L42
            goto L43
        L42:
        L43:
            if (r0 == 0) goto L48
            r0.close()     // Catch: java.io.IOException -> L48
        L48:
            return r2
        L49:
            long r2 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            java.lang.String r6 = ax.u3.C3180B.n(r2)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            r1.release()     // Catch: java.lang.Exception -> L55
            goto L56
        L55:
        L56:
            if (r0 == 0) goto L5b
            r0.close()     // Catch: java.io.IOException -> L5b
        L5b:
            return r6
        L5c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            java.lang.String r4 = "loc:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            ax.Q2.f r6 = r6.P()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            java.lang.String r6 = r6.I()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            r3.append(r6)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            ax.u3.C3184b.g(r6)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L18
            r1.release()     // Catch: java.lang.Exception -> L7c
            goto L7d
        L7c:
        L7d:
            if (r0 == 0) goto L82
            r0.close()     // Catch: java.io.IOException -> L82
        L82:
            return r2
        L83:
            r6 = move-exception
            r1 = r0
            goto L9b
        L86:
            r6 = move-exception
            r1 = r0
        L88:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r6 = ""
            if (r0 == 0) goto L94
            r0.release()     // Catch: java.lang.Exception -> L93
            goto L94
        L93:
        L94:
            if (r1 == 0) goto L99
            r1.close()     // Catch: java.io.IOException -> L99
        L99:
            return r6
        L9a:
            r6 = move-exception
        L9b:
            if (r0 == 0) goto La2
            r0.release()     // Catch: java.lang.Exception -> La1
            goto La2
        La1:
        La2:
            if (r1 == 0) goto La7
            r1.close()     // Catch: java.io.IOException -> La7
        La7:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1827o.b(ax.c3.k):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(ax.c3.AbstractC1823k r6) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> La3 java.lang.RuntimeException -> La6
            r2.<init>()     // Catch: java.lang.Throwable -> La3 java.lang.RuntimeException -> La6
            boolean r3 = r6.k0()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            if (r3 == 0) goto L21
            r3 = 1
            android.os.ParcelFileDescriptor r1 = r6.e0(r3)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a ax.b3.C1495j -> L20
            goto L21
        L14:
            r6 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto Lb9
        L1a:
            r6 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto La8
        L20:
        L21:
            if (r1 == 0) goto L2b
            java.io.FileDescriptor r6 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r2.setDataSource(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            goto L36
        L2b:
            boolean r3 = r6 instanceof com.voxdon.xplorer.file.C3605y     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            if (r3 == 0) goto L7c
            java.lang.String r6 = r6.E()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r2.setDataSource(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
        L36:
            r6 = 17
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            if (r6 != 0) goto L49
            r2.release()     // Catch: java.lang.Exception -> L42
            goto L43
        L42:
        L43:
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.lang.Exception -> L48
        L48:
            return r0
        L49:
            r6 = 18
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r3 = 19
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r4.append(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            java.lang.String r6 = " x "
            r4.append(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r4.append(r3)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r2.release()     // Catch: java.lang.Exception -> L75
            goto L76
        L75:
        L76:
            if (r1 == 0) goto L7b
            r1.close()     // Catch: java.lang.Exception -> L7b
        L7b:
            return r6
        L7c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r3.<init>()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            java.lang.String r4 = "deviceFileInfo:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            ax.c3.K r6 = r6.R()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            java.lang.String r6 = r6.k()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r3.append(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            ax.u3.C3184b.g(r6)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L1a
            r2.release()     // Catch: java.lang.Exception -> L9c
            goto L9d
        L9c:
        L9d:
            if (r1 == 0) goto La2
            r1.close()     // Catch: java.lang.Exception -> La2
        La2:
            return r0
        La3:
            r6 = move-exception
            r2 = r1
            goto Lb9
        La6:
            r6 = move-exception
            r2 = r1
        La8:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto Lb2
            r1.release()     // Catch: java.lang.Exception -> Lb1
            goto Lb2
        Lb1:
        Lb2:
            if (r2 == 0) goto Lb7
            r2.close()     // Catch: java.lang.Exception -> Lb7
        Lb7:
            return r0
        Lb8:
            r6 = move-exception
        Lb9:
            if (r1 == 0) goto Lc0
            r1.release()     // Catch: java.lang.Exception -> Lbf
            goto Lc0
        Lbf:
        Lc0:
            if (r2 == 0) goto Lc5
            r2.close()     // Catch: java.lang.Exception -> Lc5
        Lc5:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1827o.c(ax.c3.k):java.lang.String");
    }
}
