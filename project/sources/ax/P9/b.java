package ax.P9;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class b implements o {
    private k a;
    private final String b;
    private final ax.M9.f c;
    private final List<ax.S9.b> d = new ArrayList();
    protected final List<ax.S9.d> e = new ArrayList();
    protected final List<ax.S9.a> f = new ArrayList();
    private final Class g;
    private boolean h;

    public b(String str, ax.M9.f fVar, List<ax.S9.c> list, Class cls) {
        this.b = str;
        this.c = fVar;
        this.g = cls;
        if (list != null) {
            for (ax.S9.c cVar : list) {
                if (cVar instanceof ax.S9.b) {
                    this.d.add((ax.S9.b) cVar);
                }
                if (cVar instanceof ax.S9.d) {
                    this.e.add((ax.S9.d) cVar);
                }
                if (cVar instanceof ax.S9.a) {
                    this.f.add((ax.S9.a) cVar);
                }
            }
        }
        this.d.add(new ax.S9.b("SdkVersion", String.format("graph-android-v%s", "1.7.0")));
    }

    private String l() {
        StringBuilder sb = new StringBuilder(this.b);
        if (n().size() > 0) {
            sb.append("(");
            int i = 0;
            while (i < this.f.size()) {
                ax.S9.a aVar = this.f.get(i);
                sb.append(aVar.a());
                sb.append("=");
                if (aVar.b() == null) {
                    sb.append("null");
                } else if (aVar.b() instanceof String) {
                    sb.append("'" + aVar.b() + "'");
                } else {
                    sb.append(aVar.b());
                }
                i++;
                if (i < this.f.size()) {
                    sb.append(",");
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // ax.P9.o
    public List<ax.S9.b> a() {
        return this.d;
    }

    @Override // ax.P9.o
    public URL d() {
        Uri.Builder buildUpon = Uri.parse(l()).buildUpon();
        for (ax.S9.d dVar : this.e) {
            buildUpon.appendQueryParameter(dVar.a(), dVar.b().toString());
        }
        try {
            return new URL(buildUpon.toString());
        } catch (MalformedURLException e) {
            throw new ax.M9.d("Invalid URL: " + buildUpon.toString(), e, ax.M9.e.InvalidRequest);
        }
    }

    @Override // ax.P9.o
    public boolean g() {
        return this.h;
    }

    @Override // ax.P9.o
    public k h() {
        return this.a;
    }

    @Override // ax.P9.o
    public void k(String str, String str2) {
        this.d.add(new ax.S9.b(str, str2));
    }

    public ax.M9.f m() {
        return this.c;
    }

    public List<ax.S9.a> n() {
        return this.f;
    }

    public List<ax.S9.c> o() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.d);
        linkedList.addAll(this.e);
        linkedList.addAll(this.f);
        return DesugarCollections.unmodifiableList(linkedList);
    }

    public List<ax.S9.d> p() {
        return this.e;
    }

    public Class q() {
        return this.g;
    }

    protected <T1, T2> T1 r(k kVar, T2 t2) throws ax.M9.d {
        this.a = kVar;
        return (T1) this.c.b().a(this, this.g, t2);
    }

    protected <T1, T2> void s(k kVar, ax.L9.c<T1> cVar, T2 t2) {
        this.a = kVar;
        this.c.b().b(this, cVar, this.g, t2);
    }

    public void t(k kVar) {
        this.a = kVar;
    }
}
