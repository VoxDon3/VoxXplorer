package ax.Ia;

import com.socialnmobile.dav.gson.Propstat;
import com.socialnmobile.dav.gson.Resourcetype;
import com.socialnmobile.dav.gson.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

/* loaded from: classes3.dex */
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
        this.b = ax.Oa.a.d(e(response));
        this.c = ax.Oa.a.d(m(response));
        this.d = d(response);
        this.i = Long.valueOf(b(response));
        this.e = g(response);
        this.f = f(response);
        this.g = p(response);
        this.h = a(response);
        this.k = o(response);
        this.j = r(response);
        this.l = j(response);
        this.m = h(response);
    }

    private String a(Response response) {
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null) {
                Resourcetype resourcetype = propstat2.getProp().getResourcetype();
                if (resourcetype != null && resourcetype.getCollection() != null) {
                    return "httpd/unix-directory";
                }
                String getcontentlanguage = propstat2.getProp().getGetcontentlanguage();
                if (getcontentlanguage != null) {
                    return getcontentlanguage;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r0 = r0.getProp().getGetcontentlength();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long b(com.socialnmobile.dav.gson.Response r8) {
        /*
            r7 = this;
            java.util.List r8 = r8.getPropstat()
            boolean r0 = r8.isEmpty()
            r1 = -1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.util.Iterator r8 = r8.iterator()
        L11:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r8.next()
            com.socialnmobile.dav.gson.Propstat r0 = (com.socialnmobile.dav.gson.Propstat) r0
            com.socialnmobile.dav.gson.Prop r3 = r0.getProp()
            if (r3 == 0) goto L11
            com.socialnmobile.dav.gson.Prop r0 = r0.getProp()
            java.lang.String r0 = r0.getGetcontentlength()
            if (r0 == 0) goto L11
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L11
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L3a
            return r0
        L3a:
            java.util.logging.Logger r3 = ax.Ia.c.n
            java.lang.String r4 = "Failed to parse content length %s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            java.lang.String r0 = java.lang.String.format(r4, r5)
            r3.warning(r0)
            goto L11
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Ia.c.b(com.socialnmobile.dav.gson.Response):long");
    }

    private String d(Response response) {
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null) {
                Resourcetype resourcetype = propstat2.getProp().getResourcetype();
                if (resourcetype != null && resourcetype.getCollection() != null) {
                    return "httpd/unix-directory";
                }
                String getcontenttype = propstat2.getProp().getGetcontenttype();
                if (!ax.Oa.a.c(getcontenttype)) {
                    return getcontenttype;
                }
            }
        }
        return "application/octet-stream";
    }

    private String e(Response response) {
        String creationdate;
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null && (creationdate = propstat2.getProp().getCreationdate()) != null) {
                return creationdate;
            }
        }
        return null;
    }

    private String f(Response response) {
        String displayname;
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null && (displayname = propstat2.getProp().getDisplayname()) != null) {
                return displayname;
            }
        }
        return null;
    }

    private String g(Response response) {
        String getetag;
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null && (getetag = propstat2.getProp().getGetetag()) != null) {
                return getetag;
            }
        }
        return null;
    }

    private String h(Response response) {
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null) {
                return propstat2.getProp().getHasPreview();
            }
        }
        return null;
    }

    private String j(Response response) {
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null) {
                return propstat2.getProp().getHasthumbnail();
            }
        }
        return null;
    }

    private String m(Response response) {
        String getlastmodified;
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null && (getlastmodified = propstat2.getProp().getGetlastmodified()) != null) {
                return getlastmodified;
            }
        }
        return null;
    }

    private String o(Response response) {
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null) {
                return propstat2.getProp().getReadonly();
            }
        }
        return null;
    }

    private List<QName> p(Response response) {
        Resourcetype resourcetype;
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null && (resourcetype = propstat2.getProp().getResourcetype()) != null) {
                if (resourcetype.getCollection() != null) {
                    arrayList.add(ax.Oa.a.a("collection"));
                }
                if (resourcetype.getPrincipal() != null) {
                    arrayList.add(ax.Oa.a.a("principal"));
                }
            }
        }
        return arrayList;
    }

    private String r(Response response) {
        List<Propstat> propstat = response.getPropstat();
        if (propstat.isEmpty()) {
            return null;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null) {
                return propstat2.getProp().getVisible();
            }
        }
        return null;
    }

    public Long c() {
        return this.i;
    }

    public boolean i() {
        String str = this.m;
        return str != null && str.equalsIgnoreCase("true");
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
