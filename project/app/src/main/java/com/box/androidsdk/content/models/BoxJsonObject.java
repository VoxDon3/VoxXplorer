/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import ax.O4.a;
import ax.O4.d;
import ax.O4.g;
import com.box.androidsdk.content.models.BoxObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.Writer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class BoxJsonObject
extends BoxObject {
    private static final long serialVersionUID = 7174936367401884790L;
    private CacheMap mCacheMap;

    public BoxJsonObject() {
        this.i(new d());
    }

    public BoxJsonObject(d d8) {
        this.i(d8);
    }

    public static <T extends BoxJsonObject> b<T> l(Class<T> clazz) {
        return new b<T>(clazz){
            final Class a;
            {
                this.a = clazz;
            }

            @Override
            public T a(d serializable) {
                block4: {
                    InstantiationException instantiationException2;
                    block3: {
                        BoxJsonObject boxJsonObject;
                        try {
                            boxJsonObject = (BoxJsonObject)this.a.newInstance();
                            boxJsonObject.i((d)serializable);
                        }
                        catch (IllegalAccessException illegalAccessException) {
                        }
                        catch (InstantiationException instantiationException2) {
                            break block3;
                        }
                        return boxJsonObject;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("getBoxJsonObjectCreator ");
                        stringBuilder.append(this.a);
                        ax.H3.b.b("BoxJsonObject", stringBuilder.toString(), illegalAccessException);
                        break block4;
                    }
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append("getBoxJsonObjectCreator ");
                    ((StringBuilder)serializable).append(this.a);
                    ax.H3.b.b("BoxJsonObject", ((StringBuilder)serializable).toString(), instantiationException2);
                }
                return null;
            }
        };
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.i(d.I(new BufferedReader(new InputStreamReader(objectInputStream))));
    }

    private void writeObject(ObjectOutputStream closeable) throws IOException {
        closeable = new BufferedWriter(new OutputStreamWriter((OutputStream)closeable));
        this.mCacheMap.n((Writer)closeable);
        ((BufferedWriter)closeable).flush();
    }

    public String A() {
        return this.mCacheMap.m();
    }

    public d B() {
        return d.J(this.A());
    }

    public boolean equals(Object object) {
        if (object instanceof BoxJsonObject) {
            return this.mCacheMap.equals(((BoxJsonObject)object).mCacheMap);
        }
        return false;
    }

    public int hashCode() {
        return this.mCacheMap.hashCode();
    }

    public void i(d d8) {
        this.mCacheMap = new CacheMap(this, d8);
    }

    public void k(String string) {
        this.i(d.J(string));
    }

    public List<String> n() {
        return this.mCacheMap.i();
    }

    protected Boolean p(String string) {
        return this.mCacheMap.a(string);
    }

    protected Date q(String string) {
        return this.mCacheMap.b(string);
    }

    protected <T extends BoxJsonObject> T r(b<T> b8, String string) {
        return this.mCacheMap.e(b8, string);
    }

    protected <T extends BoxJsonObject> ArrayList<T> s(b<T> b8, String string) {
        return this.mCacheMap.f(b8, string);
    }

    protected Long t(String string) {
        if (this.mCacheMap.c(string) == null) {
            return null;
        }
        return this.mCacheMap.c(string).longValue();
    }

    protected String u(String string) {
        return this.mCacheMap.h(string);
    }

    public g w(String object) {
        if ((object = this.mCacheMap.g((String)object)) == null) {
            return null;
        }
        return g.t(((g)object).toString());
    }

    protected void x(String string, BoxJsonObject boxJsonObject) {
        this.mCacheMap.j(string, boxJsonObject);
    }

    protected void y(String string, Long l8) {
        this.mCacheMap.k(string, l8);
    }

    protected void z(String string, String string2) {
        this.mCacheMap.l(string, string2);
    }

    class CacheMap
    implements Serializable {
        private d mJsonObject;
        private transient HashMap<String, Object> q;
        final BoxJsonObject this$0;

        public CacheMap(BoxJsonObject boxJsonObject, d d8) {
            this.this$0 = boxJsonObject;
            this.mJsonObject = d8;
            this.q = new LinkedHashMap<String, Object>();
        }

        public Boolean a(String object) {
            if ((object = this.g((String)object)) == null) {
                return null;
            }
            return ((g)object).g();
        }

        public Date b(String string) {
            g g8 = this.g(string);
            if (g8 != null && !g8.p()) {
                Date date = (Date)this.q.get(string);
                if (date != null) {
                    return date;
                }
                try {
                    date = ax.H3.a.c(g8.k());
                    this.q.put(string, date);
                    return date;
                }
                catch (ParseException parseException) {
                    ax.H3.b.b("BoxJsonObject", "getAsDate", parseException);
                }
            }
            return null;
        }

        public Double c(String object) {
            if ((object = this.g((String)object)) != null && !((g)object).p()) {
                return ((g)object).h();
            }
            return null;
        }

        public a d(String object) {
            if ((object = this.g((String)object)) != null && !((g)object).p()) {
                return ((g)object).e();
            }
            return null;
        }

        public <T extends BoxJsonObject> T e(b<T> b8, String string) {
            if (this.q.get(string) != null) {
                return (T)((BoxJsonObject)this.q.get(string));
            }
            g g8 = this.g(string);
            if (g8 != null && !g8.p() && g8.q()) {
                b8 = b8.a(g8.i());
                this.q.put(string, b8);
                return (T)b8;
            }
            return null;
        }

        public boolean equals(Object object) {
            return this.mJsonObject.equals(((CacheMap)object).mJsonObject);
        }

        public <T extends BoxJsonObject> ArrayList<T> f(b<T> b8, String string) {
            if (this.q.get(string) != null) {
                return (ArrayList)this.q.get(string);
            }
            Serializable serializable = this.g(string);
            if (serializable != null && !((g)serializable).n() && ((g)serializable).q()) {
                ArrayList<T> arrayList = new ArrayList<T>(1);
                arrayList.add(b8.a(((g)serializable).i()));
                this.q.put(string, arrayList);
                return arrayList;
            }
            Object object = this.d(string);
            if (object == null) {
                return null;
            }
            serializable = new ArrayList(((a)object).size());
            object = ((a)object).iterator();
            while (object.hasNext()) {
                ((ArrayList)serializable).add(b8.a(((g)object.next()).i()));
            }
            this.q.put(string, serializable);
            return serializable;
        }

        public g g(String string) {
            return this.mJsonObject.D(string);
        }

        public String h(String object) {
            if ((object = this.g((String)object)) != null && !((g)object).p()) {
                return ((g)object).k();
            }
            return null;
        }

        public int hashCode() {
            return this.mJsonObject.hashCode();
        }

        public List<String> i() {
            return this.mJsonObject.G();
        }

        public void j(String string, BoxJsonObject boxJsonObject) {
            this.mJsonObject.M(string, boxJsonObject.B());
            if (this.q.containsKey(string)) {
                this.q.remove(string);
            }
        }

        public void k(String string, Long l8) {
            this.mJsonObject.K(string, l8);
            if (this.q.containsKey(string)) {
                this.q.remove(string);
            }
        }

        public void l(String string, String string2) {
            this.mJsonObject.N(string, string2);
            if (this.q.containsKey(string)) {
                this.q.remove(string);
            }
        }

        public String m() {
            return this.mJsonObject.toString();
        }

        public void n(Writer writer) throws IOException {
            this.mJsonObject.A(writer);
        }
    }

    public static interface b<E extends BoxJsonObject> {
        public E a(d var1);
    }
}

