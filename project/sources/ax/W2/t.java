package ax.W2;

import android.os.ParcelFileDescriptor;
import ax.W2.h;
import ax.a3.C1367x;
import ax.c3.AbstractC1823k;
import ax.c3.d0;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class t extends h {
    private C3596o d;
    private String e;
    private AbstractC3595n f;
    private AbstractC1823k g;
    private ParcelFileDescriptor h;
    private String i;
    private a j;
    private List<AbstractC3595n> k;
    private List<AbstractC3595n> l;
    C1367x.b m;

    public enum a {
        ZIP,
        XZ,
        GZ,
        TAR,
        SEVENZ
    }

    public static a k(String str) {
        if (str != null) {
            String j = d0.j(str);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            return ("tar".equals(j) || lowerCase.endsWith(".tar.xz") || "txz".equals(j) || lowerCase.endsWith(".tar.gz") || "tgz".equals(j)) ? a.TAR : ("xz".equals(j) || "txz".equals(j)) ? a.XZ : ("gz".equals(j) || "tgz".equals(j)) ? a.GZ : ("jar".equals(j) || "zip".equals(j)) ? a.ZIP : "7z".equals(j) ? a.SEVENZ : a.ZIP;
        }
        C3184b.g("invalid archive : " + str);
        return a.ZIP;
    }

    public static t n() {
        return new t();
    }

    @Override // ax.W2.h
    protected j b() {
        return this.l != null ? new u(f(), this.l, this.d, this.m, this.i) : new u(f(), this.j, this.e, this.h, this.f, this.g, this.d, this.i, this.k);
    }

    public void l(a aVar, String str, ParcelFileDescriptor parcelFileDescriptor, AbstractC3595n abstractC3595n, AbstractC1823k abstractC1823k, C3596o c3596o, String str2, List<AbstractC3595n> list, h.a aVar2) {
        if (parcelFileDescriptor == null && abstractC1823k == null) {
            C3184b.f();
        }
        this.j = aVar;
        this.h = parcelFileDescriptor;
        this.f = abstractC3595n;
        this.g = abstractC1823k;
        this.e = str;
        this.d = c3596o;
        this.i = str2;
        this.k = list;
        i(aVar2);
        j(h.c.FILLED);
    }

    public void m(List<AbstractC3595n> list, C3596o c3596o, C1367x.b bVar, String str, h.a aVar) {
        if (list == null || list.isEmpty()) {
            C3184b.f();
        }
        this.l = list;
        this.d = c3596o;
        this.m = bVar;
        this.i = str;
        i(aVar);
        j(h.c.FILLED);
    }
}
