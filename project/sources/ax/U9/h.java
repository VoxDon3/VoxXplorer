package ax.U9;

import j$.util.DesugarCollections;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class h {
    private String a;
    private String b;
    private final PropertyChangeSupport c;
    private final e d;
    private Date e;
    private String f;
    private Set<String> g;
    private String h;

    h(e eVar) {
        if (eVar == null) {
            throw new AssertionError();
        }
        this.d = eVar;
        this.c = new PropertyChangeSupport(this);
    }

    boolean a(Iterable<String> iterable) {
        if (iterable == null) {
            return true;
        }
        if (this.g == null) {
            return false;
        }
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            if (!this.g.contains(it.next())) {
                return false;
            }
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

    void e(v vVar) {
        this.a = vVar.d();
        this.h = vVar.i().toString().toLowerCase();
        if (vVar.j()) {
            this.b = vVar.e();
        }
        if (vVar.k()) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, vVar.f());
            h(calendar.getTime());
        }
        if (vVar.l()) {
            this.f = vVar.g();
        }
        if (vVar.m()) {
            j(Arrays.asList(vVar.h().split(" ")));
        }
    }

    void f(String str) {
        String str2 = this.a;
        this.a = str;
        this.c.firePropertyChange("accessToken", str2, str);
    }

    void g(String str) {
        String str2 = this.b;
        this.b = str;
        this.c.firePropertyChange("authenticationToken", str2, str);
    }

    void h(Date date) {
        Date date2 = this.e;
        Date date3 = new Date(date.getTime());
        this.e = date3;
        this.c.firePropertyChange("expiresIn", date2, date3);
    }

    void i(String str) {
        String str2 = this.f;
        this.f = str;
        this.c.firePropertyChange("refreshToken", str2, str);
    }

    void j(Iterable<String> iterable) {
        Set<String> set = this.g;
        this.g = new HashSet();
        if (iterable != null) {
            Iterator<String> it = iterable.iterator();
            while (it.hasNext()) {
                this.g.add(it.next());
            }
        }
        Set<String> unmodifiableSet = DesugarCollections.unmodifiableSet(this.g);
        this.g = unmodifiableSet;
        this.c.firePropertyChange("scopes", set, unmodifiableSet);
    }

    void k(String str) {
        String str2 = this.h;
        this.h = str;
        this.c.firePropertyChange("tokenType", str2, str);
    }

    public String toString() {
        return String.format("LiveConnectSession [accessToken=%s, authenticationToken=%s, expiresIn=%s, refreshToken=%s, scopes=%s, tokenType=%s]", this.a, this.b, this.e, this.f, this.g, this.h);
    }
}
