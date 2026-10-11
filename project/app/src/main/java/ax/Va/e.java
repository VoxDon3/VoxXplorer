/*
 * Decompiled with CFR 0.152.
 */
package ax.Va;

import ax.Va.f;
import ax.Xa.a;
import ax.Xa.b;
import ax.s8.c;
import java.util.Date;

public class e {
    @c(value="public_key")
    String a;
    @c(value="_embedded")
    f b;
    @c(value="name")
    String c;
    @c(value="created")
    String d;
    @c(value="public_url")
    String e;
    @c(value="origin_path")
    String f;
    @c(value="modified")
    String g;
    @c(value="deleted")
    String h;
    @c(value="path")
    String i;
    @c(value="md5")
    String j;
    @c(value="type")
    String k;
    @c(value="mime_type")
    String l;
    @c(value="media_type")
    String m;
    @c(value="preview")
    String n;
    @c(value="size")
    long o;
    @c(value="custom_properties")
    Object p;

    public Date a() {
        String string = this.d;
        if (string != null) {
            return ax.Xa.a.a(string);
        }
        return null;
    }

    public Date b() {
        String string = this.h;
        if (string != null) {
            return ax.Xa.a.a(string);
        }
        return null;
    }

    public String c() {
        return this.l;
    }

    public Date d() {
        String string = this.g;
        if (string != null) {
            return ax.Xa.a.a(string);
        }
        return null;
    }

    public String e() {
        return this.c;
    }

    public b f() {
        String string = this.f;
        if (string != null) {
            return new b(string);
        }
        return null;
    }

    public b g() {
        String string = this.i;
        if (string != null) {
            return new b(string);
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resource{publicKey='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", resourceList=");
        stringBuilder.append(this.b);
        stringBuilder.append(", name='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", created='");
        stringBuilder.append(this.a());
        stringBuilder.append('\'');
        stringBuilder.append(", publicUrl='");
        stringBuilder.append(this.e);
        stringBuilder.append('\'');
        stringBuilder.append(", originPath='");
        stringBuilder.append(this.f());
        stringBuilder.append('\'');
        stringBuilder.append(", modified='");
        stringBuilder.append(this.d());
        stringBuilder.append('\'');
        stringBuilder.append(", deleted='");
        stringBuilder.append(this.b());
        stringBuilder.append('\'');
        stringBuilder.append(", path='");
        stringBuilder.append(this.g());
        stringBuilder.append('\'');
        stringBuilder.append(", md5='");
        stringBuilder.append(this.j);
        stringBuilder.append('\'');
        stringBuilder.append(", type='");
        stringBuilder.append(this.k);
        stringBuilder.append('\'');
        stringBuilder.append(", mimeType='");
        stringBuilder.append(this.l);
        stringBuilder.append('\'');
        stringBuilder.append(", mediaType='");
        stringBuilder.append(this.m);
        stringBuilder.append('\'');
        stringBuilder.append(", preview='");
        stringBuilder.append(this.n);
        stringBuilder.append('\'');
        stringBuilder.append(", size=");
        stringBuilder.append(this.o);
        stringBuilder.append(", properties=");
        stringBuilder.append(this.p);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

