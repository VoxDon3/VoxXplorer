/*
 * Decompiled with CFR 0.152.
 */
package ax.k;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class e {
    private static final b h = new b(null);
    private final Map<Integer, String> a = new LinkedHashMap<Integer, String>();
    private final Map<String, Integer> b = new LinkedHashMap<String, Integer>();
    private final Map<String, c> c = new LinkedHashMap<String, c>();
    private final List<String> d = new ArrayList<String>();
    private final transient Map<String, a<?>> e = new LinkedHashMap();
    private final Map<String, Object> f = new LinkedHashMap<String, Object>();
    private final Bundle g = new Bundle();

    public static /* synthetic */ void a(e e8, String string, ax.k.b b8, ax.l.a a8, h h8, d.a a9) {
        ax.k.e.n(e8, string, b8, a8, h8, a9);
    }

    private final void d(int n8, String string) {
        this.a.put(n8, string);
        this.b.put(string, n8);
    }

    private final <O> void g(String string, int n8, Intent intent, a<O> a8) {
        ax.k.b<O> b8 = a8 != null ? a8.a() : null;
        if (b8 != null && this.d.contains(string)) {
            a8.a().a(a8.b().c(n8, intent));
            this.d.remove(string);
            return;
        }
        this.f.remove(string);
        this.g.putParcelable(string, (Parcelable)new ax.k.a(n8, intent));
    }

    private final int h() {
        Iterator<Integer> iterator = ax.Nb.h.f(ax.k.e$d.q).iterator();
        while (iterator.hasNext()) {
            Number number = iterator.next();
            int n8 = number.intValue();
            if (this.a.containsKey(n8)) continue;
            return number.intValue();
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private static final void n(e e8, String string, ax.k.b b8, ax.l.a a8, h object, d.a a9) {
        l.f(e8, "this$0");
        l.f(string, "$key");
        l.f(b8, "$callback");
        l.f(a8, "$contract");
        l.f(object, "<anonymous parameter 0>");
        l.f((Object)a9, "event");
        if (d.a.ON_START == a9) {
            e8.e.put(string, new a(b8, a8));
            if (e8.f.containsKey(string)) {
                object = e8.f.get(string);
                e8.f.remove(string);
                b8.a(object);
            }
            if ((object = ax.Y.b.a(e8.g, string, ax.k.a.class)) != null) {
                e8.g.remove(string);
                b8.a(a8.c(((ax.k.a)object).b(), ((ax.k.a)object).a()));
                return;
            }
        } else {
            if (d.a.ON_STOP == a9) {
                e8.e.remove(string);
                return;
            }
            if (d.a.ON_DESTROY == a9) {
                e8.p(string);
            }
        }
    }

    private final void o(String string) {
        if (this.b.get(string) != null) {
            return;
        }
        this.d(this.h(), string);
    }

    public final boolean e(int n8, int n9, Intent intent) {
        String string = this.a.get(n8);
        if (string == null) {
            return false;
        }
        this.g(string, n9, intent, this.e.get(string));
        return true;
    }

    public final <O> boolean f(int n8, O o8) {
        String string = this.a.get(n8);
        if (string == null) {
            return false;
        }
        a<?> a8 = this.e.get(string);
        ax.k.b<?> b8 = a8 != null ? a8.a() : null;
        if (b8 == null) {
            this.g.remove(string);
            this.f.put(string, o8);
        } else {
            b8 = a8.a();
            l.d(b8, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
            if (this.d.remove(string)) {
                b8.a(o8);
            }
        }
        return true;
    }

    public abstract <I, O> void i(int var1, ax.l.a<I, O> var2, I var3, ax.P.c var4);

    public final void j(Bundle object) {
        if (object != null) {
            ArrayList arrayList = object.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList arrayList2 = object.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (arrayList2 != null && arrayList != null) {
                Object object2 = object.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (object2 != null) {
                    this.d.addAll((Collection<String>)object2);
                }
                if ((object = object.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT")) != null) {
                    this.g.putAll(object);
                }
                int n8 = arrayList2.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    object2 = (String)arrayList2.get(i8);
                    if (this.b.containsKey(object2)) {
                        object = this.b.remove(object2);
                        if (!this.g.containsKey((String)object2)) {
                            z.b(this.a).remove(object);
                        }
                    }
                    object = arrayList.get(i8);
                    l.e(object, "rcs[i]");
                    int n9 = ((Number)object).intValue();
                    object = arrayList2.get(i8);
                    l.e(object, "keys[i]");
                    this.d(n9, (String)object);
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        l.f(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<Integer>(this.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<String>(this.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.g));
    }

    public final <I, O> ax.k.c<I> l(String charSequence, h object, ax.l.a<I, O> a8, ax.k.b<O> b8) {
        l.f(charSequence, "key");
        l.f(object, "lifecycleOwner");
        l.f(a8, "contract");
        l.f(b8, "callback");
        androidx.lifecycle.d d8 = object.getLifecycle();
        if (!d8.b().h(d.b.e0)) {
            this.o((String)charSequence);
            c c8 = this.c.get(charSequence);
            object = c8;
            if (c8 == null) {
                object = new c(d8);
            }
            ((c)object).a(new ax.k.d(this, (String)charSequence, b8, a8));
            this.c.put((String)charSequence, (c)object);
            return new ax.k.c<I>(this, (String)charSequence, a8){
                final e a;
                final String b;
                final ax.l.a<I, O> c;
                {
                    this.a = e8;
                    this.b = string;
                    this.c = a8;
                }

                @Override
                public void b(I i8, ax.P.c object) {
                    Object v8 = this.a.b.get(this.b);
                    ax.l.a a8 = this.c;
                    if (v8 != null) {
                        int n8 = ((Number)v8).intValue();
                        this.a.d.add(this.b);
                        try {
                            this.a.i(n8, this.c, i8, (ax.P.c)object);
                            return;
                        }
                        catch (Exception exception) {
                            this.a.d.remove(this.b);
                            throw exception;
                        }
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                    ((StringBuilder)object).append(a8);
                    ((StringBuilder)object).append(" and input ");
                    ((StringBuilder)object).append(i8);
                    ((StringBuilder)object).append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    throw new IllegalStateException(((StringBuilder)object).toString().toString());
                }

                @Override
                public void c() {
                    this.a.p(this.b);
                }
            };
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("LifecycleOwner ");
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(" is attempting to register while current state is ");
        ((StringBuilder)charSequence).append((Object)d8.b());
        ((StringBuilder)charSequence).append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(((StringBuilder)charSequence).toString().toString());
    }

    public final <I, O> ax.k.c<I> m(String string, ax.l.a<I, O> a8, ax.k.b<O> b8) {
        Object object;
        l.f(string, "key");
        l.f(a8, "contract");
        l.f(b8, "callback");
        this.o(string);
        this.e.put(string, new a<O>(b8, a8));
        if (this.f.containsKey(string)) {
            object = this.f.get(string);
            this.f.remove(string);
            b8.a(object);
        }
        if ((object = ax.Y.b.a(this.g, string, ax.k.a.class)) != null) {
            this.g.remove(string);
            b8.a(a8.c(((ax.k.a)object).b(), ((ax.k.a)object).a()));
        }
        return new ax.k.c<I>(this, string, a8){
            final e a;
            final String b;
            final ax.l.a<I, O> c;
            {
                this.a = e8;
                this.b = string;
                this.c = a8;
            }

            @Override
            public void b(I i8, ax.P.c object) {
                Object v8 = this.a.b.get(this.b);
                ax.l.a a8 = this.c;
                if (v8 != null) {
                    int n8 = ((Number)v8).intValue();
                    this.a.d.add(this.b);
                    try {
                        this.a.i(n8, this.c, i8, (ax.P.c)object);
                        return;
                    }
                    catch (Exception exception) {
                        this.a.d.remove(this.b);
                        throw exception;
                    }
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                ((StringBuilder)object).append(a8);
                ((StringBuilder)object).append(" and input ");
                ((StringBuilder)object).append(i8);
                ((StringBuilder)object).append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(((StringBuilder)object).toString().toString());
            }

            @Override
            public void c() {
                this.a.p(this.b);
            }
        };
    }

    public final void p(String string) {
        Object object;
        l.f(string, "key");
        if (!this.d.contains(string) && (object = this.b.remove(string)) != null) {
            this.a.remove(object);
        }
        this.e.remove(string);
        if (this.f.containsKey(string)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Dropping pending result for request ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(this.f.get(string));
            Log.w((String)"ActivityResultRegistry", (String)((StringBuilder)object).toString());
            this.f.remove(string);
        }
        if (this.g.containsKey(string)) {
            object = ax.Y.b.a(this.g, string, ax.k.a.class);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Dropping pending result for request ");
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append(object);
            Log.w((String)"ActivityResultRegistry", (String)stringBuilder.toString());
            this.g.remove(string);
        }
        if ((object = this.c.get(string)) != null) {
            ((c)object).b();
            this.c.remove(string);
        }
    }

    private static final class a<O> {
        private final ax.k.b<O> a;
        private final ax.l.a<?, O> b;

        public a(ax.k.b<O> b8, ax.l.a<?, O> a8) {
            l.f(b8, "callback");
            l.f(a8, "contract");
            this.a = b8;
            this.b = a8;
        }

        public final ax.k.b<O> a() {
            return this.a;
        }

        public final ax.l.a<?, O> b() {
            return this.b;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

    private static final class c {
        private final androidx.lifecycle.d a;
        private final List<f> b;

        public c(androidx.lifecycle.d d8) {
            l.f(d8, "lifecycle");
            this.a = d8;
            this.b = new ArrayList<f>();
        }

        public final void a(f f8) {
            l.f(f8, "observer");
            this.a.a(f8);
            this.b.add(f8);
        }

        public final void b() {
            for (f f8 : (Iterable)this.b) {
                this.a.c(f8);
            }
            this.b.clear();
        }
    }
}

