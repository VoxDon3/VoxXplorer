/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import ax.U9.e;
import ax.U9.v;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class h {
    private String a;
    private String b;
    private final PropertyChangeSupport c;
    private final e d;
    private Date e;
    private String f;
    private Set<String> g;
    private String h;

    h(e e8) {
        if (e8 != null) {
            this.d = e8;
            this.c = new PropertyChangeSupport(this);
            return;
        }
        throw new AssertionError();
    }

    boolean a(Iterable<String> object) {
        if (object == null) {
            return true;
        }
        if (this.g == null) {
            return false;
        }
        object = object.iterator();
        while (object.hasNext()) {
            String string = (String)object.next();
            if (this.g.contains(string)) continue;
            return false;
        }
        return true;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f;
    }

    public boolean d() {
        if (this.e == null) {
            return true;
        }
        return new Date().after(this.e);
    }

    void e(v v8) {
        this.a = v8.d();
        this.h = ((Object)((Object)v8.i())).toString().toLowerCase();
        if (v8.j()) {
            this.b = v8.e();
        }
        if (v8.k()) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, v8.f());
            this.h(calendar.getTime());
        }
        if (v8.l()) {
            this.f = v8.g();
        }
        if (v8.m()) {
            this.j(Arrays.asList(v8.h().split(" ")));
        }
    }

    void f(String string) {
        String string2 = this.a;
        this.a = string;
        this.c.firePropertyChange("accessToken", string2, string);
    }

    void g(String string) {
        String string2 = this.b;
        this.b = string;
        this.c.firePropertyChange("authenticationToken", string2, string);
    }

    void h(Date date) {
        Date date2 = this.e;
        this.e = date = new Date(date.getTime());
        this.c.firePropertyChange("expiresIn", date2, date);
    }

    void i(String string) {
        String string2 = this.f;
        this.f = string;
        this.c.firePropertyChange("refreshToken", string2, string);
    }

    void j(Iterable<String> object) {
        Set<String> set = this.g;
        this.g = new HashSet<String>();
        if (object != null) {
            object = object.iterator();
            while (object.hasNext()) {
                String string = (String)object.next();
                this.g.add(string);
            }
        }
        this.g = object = java.util.DesugarCollections.unmodifiableSet(this.g);
        this.c.firePropertyChange("scopes", set, object);
    }

    void k(String string) {
        String string2 = this.h;
        this.h = string;
        this.c.firePropertyChange("tokenType", string2, string);
    }

    public String toString() {
        return String.format("LiveConnectSession [accessToken=%s, authenticationToken=%s, expiresIn=%s, refreshToken=%s, scopes=%s, tokenType=%s]", this.a, this.b, this.e, this.f, this.g, this.h);
    }
}

