package ax.Z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import ax.b0.C1446g;

/* loaded from: classes.dex */
public class k {

    public static class a {
        private final int a;
        private final b[] b;

        @Deprecated
        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = bVarArr;
        }

        static a a(int i, b[] bVarArr) {
            return new a(i, bVarArr);
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
        public b(Uri uri, int i, int i2, boolean z, int i3) {
            this.a = (Uri) C1446g.g(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        static b a(Uri uri, int i, int i2, boolean z, int i3) {
            return new b(uri, i, i2, z, i3);
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
        public void a(int i) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return ax.T.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, i iVar) throws PackageManager.NameNotFoundException {
        return e.e(context, iVar, cancellationSignal);
    }

    public static Typeface c(Context context, i iVar, int i, boolean z, int i2, Handler handler, c cVar) {
        ax.Z.a aVar = new ax.Z.a(cVar, handler);
        return z ? j.e(context, iVar, aVar, i, i2) : j.d(context, iVar, i, null, aVar);
    }
}
