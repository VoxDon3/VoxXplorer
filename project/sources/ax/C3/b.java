package ax.C3;

import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class b {
    private static final Pattern a = Pattern.compile("^(?:.*;)?base64,.*");
    public static final c b = c.NORMAL;

    private static class a implements d {
        protected final ContentResolver a;
        protected final Uri b;

        public a(ContentResolver contentResolver, Uri uri) {
            this.a = contentResolver;
            this.b = uri;
        }

        @Override // ax.C3.b.d
        public InputStream createInputStream() throws FileNotFoundException {
            return this.a.openInputStream(this.b);
        }
    }

    /* renamed from: ax.C3.b$b, reason: collision with other inner class name */
    private static class C0058b extends a {
        private byte[] c;

        public C0058b(ContentResolver contentResolver, Uri uri) {
            super(contentResolver, uri);
        }

        private byte[] a(Uri uri) {
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            try {
                if (schemeSpecificPart.startsWith("base64,")) {
                    return Base64.decode(schemeSpecificPart.substring(7), 8);
                }
                if (b.a.matcher(schemeSpecificPart).matches()) {
                    return Base64.decode(schemeSpecificPart.substring(schemeSpecificPart.indexOf("base64,") + 7), 0);
                }
                return null;
            } catch (IllegalArgumentException e) {
                Log.e("ImageUtils", "Mailformed data URI: " + e);
                return null;
            }
        }

        @Override // ax.C3.b.a, ax.C3.b.d
        public InputStream createInputStream() throws FileNotFoundException {
            if (this.c == null) {
                byte[] a = a(this.b);
                this.c = a;
                if (a == null) {
                    return super.createInputStream();
                }
            }
            return new ByteArrayInputStream(this.c);
        }
    }

    public enum c {
        EXTRA_SMALL,
        SMALL,
        NORMAL
    }

    public interface d {
        InputStream createInputStream() throws IOException;
    }

    public static d b(ContentResolver contentResolver, Uri uri) {
        return "data".equals(uri.getScheme()) ? new C0058b(contentResolver, uri) : new a(contentResolver, uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r5 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.A3.b.a c(ax.C3.b.d r10, int r11, boolean r12) {
        /*
            ax.A3.b$a r0 = new ax.A3.b$a
            r0.<init>()
            r1 = 1
            android.graphics.Point r2 = e(r10)     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            if (r2 != 0) goto L2a
            r0.e = r1     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            java.lang.Exception r10 = new java.lang.Exception     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            java.lang.String r11 = "image bounds == null"
            r10.<init>(r11)     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            r0.h = r10     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            return r0
        L18:
            r10 = move-exception
            goto L95
        L1b:
            r10 = move-exception
            goto L9b
        L1e:
            r10 = move-exception
            goto L9b
        L21:
            r10 = move-exception
            goto La0
        L24:
            r10 = move-exception
            goto La5
        L27:
            r10 = move-exception
            goto Laa
        L2a:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            r3.<init>()     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            int r4 = r2.x     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            int r4 = r4 / r11
            int r5 = r2.y     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            int r5 = r5 / r11
            int r11 = java.lang.Math.max(r4, r5)     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            r3.inSampleSize = r11     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            r11 = 0
            r4 = 0
            java.io.InputStream r5 = r10.createInputStream()     // Catch: java.lang.Throwable -> L6a java.lang.RuntimeException -> L6c
            ax.y0.a r6 = new ax.y0.a     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            int r7 = r6.y()     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            com.android.ex.photo.c r8 = new com.android.ex.photo.c     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            r0.i = r8     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            int r9 = r2.x     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            r8.j = r9     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            int r9 = r2.y     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            r8.k = r9     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            r8.a = r11     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            r8.h = r6     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L68
            if (r5 == 0) goto L80
        L5f:
            r5.close()     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L63 java.lang.IllegalArgumentException -> Lae
            goto L80
        L63:
            goto L80
        L65:
            r10 = move-exception
            r4 = r5
            goto L8f
        L68:
            goto L6e
        L6a:
            r10 = move-exception
            goto L8f
        L6c:
            r5 = r4
        L6e:
            if (r5 == 0) goto L73
            r5.close()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L73
        L73:
            java.io.InputStream r5 = r10.createInputStream()     // Catch: java.lang.Throwable -> L65
            r6 = -1
            int r7 = ax.C3.a.a(r5, r6)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L80
            goto L5f
        L80:
            if (r12 == 0) goto L88
            android.graphics.Bitmap r10 = d(r10, r4, r3, r7)     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            r0.c = r10     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
        L88:
            r0.d = r7     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            r0.a = r2     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            r0.e = r11     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
            goto Lae
        L8f:
            if (r4 == 0) goto L94
            r4.close()     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L94 java.lang.IllegalArgumentException -> Lae
        L94:
            throw r10     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.NullPointerException -> L1b java.lang.StringIndexOutOfBoundsException -> L1e java.lang.SecurityException -> L21 java.io.IOException -> L24 java.io.FileNotFoundException -> L27 java.lang.IllegalArgumentException -> Lae
        L95:
            r11 = 2
            r0.e = r11
            r0.h = r10
            goto Lae
        L9b:
            r0.e = r1
            r0.h = r10
            goto Lae
        La0:
            r0.e = r1
            r0.h = r10
            goto Lae
        La5:
            r0.e = r1
            r0.h = r10
            goto Lae
        Laa:
            r0.e = r1
            r0.h = r10
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.C3.b.c(ax.C3.b$d, int, boolean):ax.A3.b$a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap d(ax.C3.b.d r0, android.graphics.Rect r1, android.graphics.BitmapFactory.Options r2, int r3) throws java.io.IOException {
        /*
            java.io.InputStream r0 = r0.createInputStream()     // Catch: java.lang.Throwable -> L28
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0, r1, r2)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            if (r1 != 0) goto L22
            boolean r2 = r2.inJustDecodeBounds     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L11
            goto L22
        L11:
            java.lang.String r1 = "ImageUtils"
            java.lang.String r2 = "ImageUtils#decodeStream(InputStream, Rect, Options): Image bytes cannot be decoded into a Bitmap"
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L20
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "Image bytes cannot be decoded into a Bitmap."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            goto L2a
        L22:
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.io.IOException -> L27
        L27:
            return r1
        L28:
            r1 = move-exception
            r0 = 0
        L2a:
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.io.IOException -> L2f
        L2f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.C3.b.d(ax.C3.b$d, android.graphics.Rect, android.graphics.BitmapFactory$Options, int):android.graphics.Bitmap");
    }

    private static Point e(d dVar) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        d(dVar, null, options, 0);
        return new Point(options.outWidth, options.outHeight);
    }
}
