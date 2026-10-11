/*
 * Decompiled with CFR 0.152.
 */
package ax.Ia;

import ax.Oa.a;
import com.socialnmobile.dav.gson.Propstat;
import com.socialnmobile.dav.gson.Resourcetype;
import com.socialnmobile.dav.gson.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

public class c {
    private static final Logger n = Logger.getLogger(c.class.getName());
    private final String a;
    private final Date b;
    private final Date c;
    private final String d;
    private final String e;
    private final String f;
    private final List<QName> g;
    private final String h;
    private final Long i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public c(Response response) throws URISyntaxException {
        this.a = response.getHref();
        this.b = ax.Oa.a.d(this.e(response));
        this.c = ax.Oa.a.d(this.m(response));
        this.d = this.d(response);
        this.i = this.b(response);
        this.e = this.g(response);
        this.f = this.f(response);
        this.g = this.p(response);
        this.h = this.a(response);
        this.k = this.o(response);
        this.j = this.r(response);
        this.l = this.j(response);
        this.m = this.h(response);
    }

    private String a(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return null;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Propstat propstat = (Propstat)iterator.next();
            if (propstat.getProp() == null) continue;
            Object object = propstat.getProp().getResourcetype();
            if (object != null && ((Resourcetype)object).getCollection() != null) {
                return "httpd/unix-directory";
            }
            object = propstat.getProp().getGetcontentlanguage();
            if (object == null) continue;
            return object;
        }
        return null;
    }

    private long b(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return -1L;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            String string;
            Propstat propstat = (Propstat)iterator.next();
            if (propstat.getProp() == null || (string = propstat.getProp().getGetcontentlength()) == null || "".equals(string)) continue;
            try {
                long l8 = Long.parseLong(string);
                return l8;
            }
            catch (NumberFormatException numberFormatException) {
                n.warning(String.format("Failed to parse content length %s", string));
            }
        }
        return -1L;
    }

    private String d(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return null;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object = (Propstat)iterator.next();
            if (((Propstat)object).getProp() == null) continue;
            Resourcetype resourcetype = ((Propstat)object).getProp().getResourcetype();
            if (resourcetype != null && resourcetype.getCollection() != null) {
                return "httpd/unix-directory";
            }
            if (ax.Oa.a.c((CharSequence)(object = ((Propstat)object).getProp().getGetcontenttype()))) continue;
            return object;
        }
        return "application/octet-stream";
    }

    private String e(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return null;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object = (Propstat)iterator.next();
            if (((Propstat)object).getProp() == null || (object = ((Propstat)object).getProp().getCreationdate()) == null) continue;
            return object;
        }
        return null;
    }

    private String f(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return null;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object = (Propstat)iterator.next();
            if (((Propstat)object).getProp() == null || (object = ((Propstat)object).getProp().getDisplayname()) == null) continue;
            return object;
        }
        return null;
    }

    private String g(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return null;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object = (Propstat)iterator.next();
            if (((Propstat)object).getProp() == null || (object = ((Propstat)object).getProp().getGetetag()) == null) continue;
            return object;
        }
        return null;
    }

    private String h(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return null;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Propstat propstat = (Propstat)iterator.next();
            if (propstat.getProp() == null) continue;
            return propstat.getProp().getHasPreview();
        }
        return null;
    }

    private String j(Response object) {
        if ((object = ((Response)object).getPropstat()).isEmpty()) {
            return null;
        }
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (Propstat)iterator.next();
            if (((Propstat)object).getProp() == null) continue;
            return ((Propstat)object).getProp().getHasthumbnail();
        }
        return null;
    }

    private String m(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return null;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object = (Propstat)iterator.next();
            if (((Propstat)object).getProp() == null || (object = ((Propstat)object).getProp().getGetlastmodified()) == null) continue;
            return object;
        }
        return null;
    }

    private String o(Response iterator) {
        if ((iterator = ((Response)((Object)iterator)).getPropstat()).isEmpty()) {
            return null;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Propstat propstat = (Propstat)iterator.next();
            if (propstat.getProp() == null) continue;
            return propstat.getProp().getReadonly();
        }
        return null;
    }

    private List<QName> p(Response object) {
        List<Propstat> list = ((Response)((Object)object)).getPropstat();
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        object = new ArrayList<QName>();
        for (Propstat propstat : list) {
            Resourcetype resourcetype;
            if (propstat.getProp() == null || (resourcetype = propstat.getProp().getResourcetype()) == null) continue;
            if (resourcetype.getCollection() != null) {
                object.add(ax.Oa.a.a("collection"));
            }
            if (resourcetype.getPrincipal() == null) continue;
            object.add(ax.Oa.a.a("principal"));
        }
        return object;
    }

    private String r(Response object) {
        if ((object = ((Response)object).getPropstat()).isEmpty()) {
            return null;
        }
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (Propstat)iterator.next();
            if (((Propstat)object).getProp() == null) continue;
            return ((Propstat)object).getProp().getVisible();
        }
        return null;
    }

    public Long c() {
        return this.i;
    }

    public boolean i() {
        String string = this.m;
        return string != null && string.equalsIgnoreCase("true");
    }

    public String k() {
        return this.a;
    }

    public Date l() {
        return this.c;
    }

    public String n() {
        return this.k;
    }

    public String q() {
        return this.j;
    }

    public boolean s() {
        return "httpd/unix-directory".equals(this.d);
    }

    public String toString() {
        return this.a;
    }
}

