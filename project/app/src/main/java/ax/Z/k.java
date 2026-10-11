/*
 * Decompiled with CFR 0.152.
 */
package ax.Z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import ax.Z.e;
import ax.Z.i;
import ax.Z.j;
import ax.b0.g;

public class k {
    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bArray) {
        return ax.T.e.b(context, cancellationSignal, bArray, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, i i8) throws PackageManager.NameNotFoundException {
        return e.e(context, i8, cancellationSignal);
    }

    public static Typeface c(Context context, i i8, int n8, boolean bl, int n9, Handler object, c c8) {
        object = new ax.Z.a(c8, (Handler)object);
        if (bl) {
            return j.e(context, i8, (ax.Z.a)object, n8, n9);
        }
        return j.d(context, i8, n8, null, (ax.Z.a)object);
    }

    public static class a {
        private final int a;
        private final b[] b;

        @Deprecated
        public a(int n8, b[] bArray) {
            this.a = n8;
            this.b = bArray;
        }

        static a a(int n8, b[] bArray) {
            return new a(n8, bArray);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    public static class b {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        @Deprecated
        public b(Uri uri, int n8, int n9, boolean bl, int n10) {
            this.a = g.g(uri);
            this.b = n8;
            this.c = n9;
            this.d = bl;
            this.e = n10;
        }

        static b a(Uri uri, int n8, int n9, boolean bl, int n10) {
            return new b(uri, n8, n9, bl, n10);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static class c {
        public void a(int n8) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }
}

