package ax.X3;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class d implements ax.M3.l<Bitmap> {
    public static final ax.M3.i<Integer> a = ax.M3.i.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final ax.M3.i<Bitmap.CompressFormat> b = ax.M3.i.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    private Bitmap.CompressFormat d(Bitmap bitmap, ax.M3.j jVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) jVar.c(b);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // ax.M3.l
    public ax.M3.c b(ax.M3.j jVar) {
        return ax.M3.c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #3 {all -> 0x0058, blocks: (B:3:0x0038, B:11:0x0054, B:14:0x0079, B:16:0x007f, B:40:0x00cb, B:38:0x00ce, B:32:0x0074), top: B:2:0x0038 }] */
    @Override // ax.M3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(ax.P3.s<android.graphics.Bitmap> r8, java.io.File r9, ax.M3.j r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.d(r8, r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "encode: ["
            r2.append(r3)
            int r3 = r8.getWidth()
            r2.append(r3)
            java.lang.String r3 = "x"
            r2.append(r3)
            int r3 = r8.getHeight()
            r2.append(r3)
            java.lang.String r3 = "] "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            ax.Y.u.a(r2)
            long r2 = ax.k4.d.b()     // Catch: java.lang.Throwable -> L58
            ax.M3.i<java.lang.Integer> r4 = ax.X3.d.a     // Catch: java.lang.Throwable -> L58
            java.lang.Object r4 = r10.c(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L58
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L58
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r8.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L60
            r6.close()     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L60
            r6.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5b
            goto L5b
        L58:
            r8 = move-exception
            goto Lcf
        L5b:
            r9 = 1
            goto L78
        L5d:
            r8 = move-exception
            r5 = r6
            goto Lc9
        L60:
            r9 = move-exception
            r5 = r6
            goto L66
        L63:
            r8 = move-exception
            goto Lc9
        L65:
            r9 = move-exception
        L66:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L72
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r9)     // Catch: java.lang.Throwable -> L63
        L72:
            if (r5 == 0) goto L77
            r5.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L77
        L77:
            r9 = 0
        L78:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto Lc5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r4.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "Compressed with type: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L58
            r4.append(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = " of size "
            r4.append(r1)     // Catch: java.lang.Throwable -> L58
            int r1 = ax.k4.i.g(r8)     // Catch: java.lang.Throwable -> L58
            r4.append(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = " in "
            r4.append(r1)     // Catch: java.lang.Throwable -> L58
            double r1 = ax.k4.d.a(r2)     // Catch: java.lang.Throwable -> L58
            r4.append(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = ", options format: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L58
            ax.M3.i<android.graphics.Bitmap$CompressFormat> r1 = ax.X3.d.b     // Catch: java.lang.Throwable -> L58
            java.lang.Object r10 = r10.c(r1)     // Catch: java.lang.Throwable -> L58
            r4.append(r10)     // Catch: java.lang.Throwable -> L58
            java.lang.String r10 = ", hasAlpha: "
            r4.append(r10)     // Catch: java.lang.Throwable -> L58
            boolean r8 = r8.hasAlpha()     // Catch: java.lang.Throwable -> L58
            r4.append(r8)     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L58
            android.util.Log.v(r0, r8)     // Catch: java.lang.Throwable -> L58
        Lc5:
            ax.Y.u.b()
            return r9
        Lc9:
            if (r5 == 0) goto Lce
            r5.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> Lce
        Lce:
            throw r8     // Catch: java.lang.Throwable -> L58
        Lcf:
            ax.Y.u.b()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X3.d.a(ax.P3.s, java.io.File, ax.M3.j):boolean");
    }
}
