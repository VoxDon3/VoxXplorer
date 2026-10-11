package ax.Va;

import ax.s8.InterfaceC3061c;
import java.util.Date;

/* loaded from: classes3.dex */
public class e {

    @InterfaceC3061c("public_key")
    String a;

    @InterfaceC3061c("_embedded")
    f b;

    @InterfaceC3061c("name")
    String c;

    @InterfaceC3061c("created")
    String d;

    @InterfaceC3061c("public_url")
    String e;

    @InterfaceC3061c("origin_path")
    String f;

    @InterfaceC3061c("modified")
    String g;

    @InterfaceC3061c("deleted")
    String h;

    @InterfaceC3061c("path")
    String i;

    @InterfaceC3061c("md5")
    String j;

    @InterfaceC3061c("type")
    String k;

    @InterfaceC3061c("mime_type")
    String l;

    @InterfaceC3061c("media_type")
    String m;

    @InterfaceC3061c("preview")
    String n;

    @InterfaceC3061c("size")
    long o;

    @InterfaceC3061c("custom_properties")
    Object p;

    public Date a() {
        String str = this.d;
        if (str != null) {
            return ax.Xa.a.a(str);
        }
        return null;
    }

    public Date b() {
        String str = this.h;
        if (str != null) {
            return ax.Xa.a.a(str);
        }
        return null;
    }

    public String c() {
        return this.l;
    }

    public Date d() {
        String str = this.g;
        if (str != null) {
            return ax.Xa.a.a(str);
        }
        return null;
    }

    public String e() {
        return this.c;
    }

    public ax.Xa.b f() {
        String str = this.f;
        if (str != null) {
            return new ax.Xa.b(str);
        }
        return null;
    }

    public ax.Xa.b g() {
        String str = this.i;
        if (str != null) {
            return new ax.Xa.b(str);
        }
        return null;
    }

    public String h() {
        return this.n;
    }

    public f i() {
        return this.b;
    }

    public long j() {
        return this.o;
    }

    public boolean k() {
        return "dir".equalsIgnoreCase(this.k);
    }

    public String toString() {
        return "Resource{publicKey='" + this.a + "', resourceList=" + this.b + ", name='" + this.c + "', created='" + a() + "', publicUrl='" + this.e + "', originPath='" + f() + "', modified='" + d() + "', deleted='" + b() + "', path='" + g() + "', md5='" + this.j + "', type='" + this.k + "', mimeType='" + this.l + "', mediaType='" + this.m + "', preview='" + this.n + "', size=" + this.o + ", properties=" + this.p + '}';
    }
}
