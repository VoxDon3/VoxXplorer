package com.box.androidsdk.content.models;

import ax.O4.d;
import ax.O4.g;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.Writer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BoxJsonObject extends BoxObject {
    private static final long serialVersionUID = 7174936367401884790L;
    private CacheMap mCacheMap;

    class CacheMap implements Serializable {
        private d mJsonObject;
        private transient HashMap<String, Object> q = new LinkedHashMap();

        public CacheMap(d dVar) {
            this.mJsonObject = dVar;
        }

        public Boolean a(String str) {
            g g = g(str);
            if (g == null) {
                return null;
            }
            return Boolean.valueOf(g.g());
        }

        public Date b(String str) {
            g g = g(str);
            if (g != null && !g.p()) {
                Date date = (Date) this.q.get(str);
                if (date != null) {
                    return date;
                }
                try {
                    Date c = ax.H3.a.c(g.k());
                    this.q.put(str, c);
                    return c;
                } catch (ParseException e) {
                    ax.H3.b.b("BoxJsonObject", "getAsDate", e);
                }
            }
            return null;
        }

        public Double c(String str) {
            g g = g(str);
            if (g == null || g.p()) {
                return null;
            }
            return Double.valueOf(g.h());
        }

        public ax.O4.a d(String str) {
            g g = g(str);
            if (g == null || g.p()) {
                return null;
            }
            return g.e();
        }

        public <T extends BoxJsonObject> T e(b<T> bVar, String str) {
            if (this.q.get(str) != null) {
                return (T) this.q.get(str);
            }
            g g = g(str);
            if (g == null || g.p() || !g.q()) {
                return null;
            }
            T a = bVar.a(g.i());
            this.q.put(str, a);
            return a;
        }

        public boolean equals(Object obj) {
            return this.mJsonObject.equals(((CacheMap) obj).mJsonObject);
        }

        public <T extends BoxJsonObject> ArrayList<T> f(b<T> bVar, String str) {
            if (this.q.get(str) != null) {
                return (ArrayList) this.q.get(str);
            }
            g g = g(str);
            if (g != null && !g.n() && g.q()) {
                ArrayList<T> arrayList = new ArrayList<>(1);
                arrayList.add(bVar.a(g.i()));
                this.q.put(str, arrayList);
                return arrayList;
            }
            ax.O4.a d = d(str);
            if (d == null) {
                return null;
            }
            ArrayList<T> arrayList2 = new ArrayList<>(d.size());
            Iterator<g> it = d.iterator();
            while (it.hasNext()) {
                arrayList2.add(bVar.a(it.next().i()));
            }
            this.q.put(str, arrayList2);
            return arrayList2;
        }

        public g g(String str) {
            return this.mJsonObject.D(str);
        }

        public String h(String str) {
            g g = g(str);
            if (g == null || g.p()) {
                return null;
            }
            return g.k();
        }

        public int hashCode() {
            return this.mJsonObject.hashCode();
        }

        public List<String> i() {
            return this.mJsonObject.G();
        }

        public void j(String str, BoxJsonObject boxJsonObject) {
            this.mJsonObject.M(str, boxJsonObject.B());
            if (this.q.containsKey(str)) {
                this.q.remove(str);
            }
        }

        public void k(String str, Long l) {
            this.mJsonObject.K(str, l.longValue());
            if (this.q.containsKey(str)) {
                this.q.remove(str);
            }
        }

        public void l(String str, String str2) {
            this.mJsonObject.N(str, str2);
            if (this.q.containsKey(str)) {
                this.q.remove(str);
            }
        }

        public String m() {
            return this.mJsonObject.toString();
        }

        public void n(Writer writer) throws IOException {
            this.mJsonObject.A(writer);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements b<T> {
        final /* synthetic */ Class a;

        a(Class cls) {
            this.a = cls;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lax/O4/d;)TT; */
        @Override // com.box.androidsdk.content.models.BoxJsonObject.b
        public BoxJsonObject a(d dVar) {
            try {
                BoxJsonObject boxJsonObject = (BoxJsonObject) this.a.newInstance();
                boxJsonObject.i(dVar);
                return boxJsonObject;
            } catch (IllegalAccessException e) {
                ax.H3.b.b("BoxJsonObject", "getBoxJsonObjectCreator " + this.a, e);
                return null;
            } catch (InstantiationException e2) {
                ax.H3.b.b("BoxJsonObject", "getBoxJsonObjectCreator " + this.a, e2);
                return null;
            }
        }
    }

    public interface b<E extends BoxJsonObject> {
        E a(d dVar);
    }

    public BoxJsonObject() {
        i(new d());
    }

    public static <T extends BoxJsonObject> b<T> l(Class<T> cls) {
        return new a(cls);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        i(d.I(new BufferedReader(new InputStreamReader(objectInputStream))));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(objectOutputStream));
        this.mCacheMap.n(bufferedWriter);
        bufferedWriter.flush();
    }

    public String A() {
        return this.mCacheMap.m();
    }

    public d B() {
        return d.J(A());
    }

    public boolean equals(Object obj) {
        if (obj instanceof BoxJsonObject) {
            return this.mCacheMap.equals(((BoxJsonObject) obj).mCacheMap);
        }
        return false;
    }

    public int hashCode() {
        return this.mCacheMap.hashCode();
    }

    public void i(d dVar) {
        this.mCacheMap = new CacheMap(dVar);
    }

    public void k(String str) {
        i(d.J(str));
    }

    public List<String> n() {
        return this.mCacheMap.i();
    }

    protected Boolean p(String str) {
        return this.mCacheMap.a(str);
    }

    protected Date q(String str) {
        return this.mCacheMap.b(str);
    }

    protected <T extends BoxJsonObject> T r(b<T> bVar, String str) {
        return (T) this.mCacheMap.e(bVar, str);
    }

    protected <T extends BoxJsonObject> ArrayList<T> s(b<T> bVar, String str) {
        return this.mCacheMap.f(bVar, str);
    }

    protected Long t(String str) {
        if (this.mCacheMap.c(str) == null) {
            return null;
        }
        return Long.valueOf(this.mCacheMap.c(str).longValue());
    }

    protected String u(String str) {
        return this.mCacheMap.h(str);
    }

    public g w(String str) {
        g g = this.mCacheMap.g(str);
        if (g == null) {
            return null;
        }
        return g.t(g.toString());
    }

    protected void x(String str, BoxJsonObject boxJsonObject) {
        this.mCacheMap.j(str, boxJsonObject);
    }

    protected void y(String str, Long l) {
        this.mCacheMap.k(str, l);
    }

    protected void z(String str, String str2) {
        this.mCacheMap.l(str, str2);
    }

    public BoxJsonObject(d dVar) {
        i(dVar);
    }
}
