/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.os.ParcelFileDescriptor;
import ax.W2.h;
import ax.W2.j;
import ax.W2.u;
import ax.a3.x;
import ax.c3.d0;
import ax.c3.k;
import ax.u3.b;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import java.util.List;
import java.util.Locale;

public class t
extends h {
    private o d;
    private String e;
    private n f;
    private k g;
    private ParcelFileDescriptor h;
    private String i;
    private a j;
    private List<n> k;
    private List<n> l;
    x.b m;

    public static a k(String string) {
        if (string == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid archive : ");
            stringBuilder.append(string);
            b.g(stringBuilder.toString());
            return a.q;
        }
        String string2 = d0.j(string);
        string = string.toLowerCase(Locale.ROOT);
        if (!("tar".equals(string2) || string.endsWith(".tar.xz") || "txz".equals(string2) || string.endsWith(".tar.gz") || "tgz".equals(string2))) {
            if (!"xz".equals(string2) && !"txz".equals(string2)) {
                if (!"gz".equals(string2) && !"tgz".equals(string2)) {
                    if (!"jar".equals(string2) && !"zip".equals(string2)) {
                        if ("7z".equals(string2)) {
                            return a.f0;
                        }
                        return a.q;
                    }
                    return a.q;
                }
                return a.d0;
            }
            return a.c0;
        }
        return a.e0;
    }

    public static t n() {
        return new t();
    }

    @Override
    protected j b() {
        if (this.l != null) {
            return new u(this.f(), this.l, this.d, this.m, this.i);
        }
        return new u(this.f(), this.j, this.e, this.h, this.f, this.g, this.d, this.i, this.k);
    }

    public void l(a a8, String string, ParcelFileDescriptor parcelFileDescriptor, n n8, k k8, o o8, String string2, List<n> list, h.a a9) {
        if (parcelFileDescriptor == null && k8 == null) {
            b.f();
        }
        this.j = a8;
        this.h = parcelFileDescriptor;
        this.f = n8;
        this.g = k8;
        this.e = string;
        this.d = o8;
        this.i = string2;
        this.k = list;
        this.i(a9);
        this.j(h.c.c0);
    }

    public void m(List<n> list, o o8, x.b b8, String string, h.a a8) {
        if (list == null || list.isEmpty()) {
            b.f();
        }
        this.l = list;
        this.d = o8;
        this.m = b8;
        this.i = string;
        this.i(a8);
        this.j(h.c.c0);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        private static final a[] g0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = new a();
            f0 = new a();
            g0 = a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0, e0, f0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])g0.clone();
        }
    }
}

