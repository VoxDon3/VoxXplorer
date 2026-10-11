package ax.M5;

import android.accounts.Account;
import android.view.View;
import ax.h6.C2157a;
import com.google.android.gms.common.api.Scope;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.M5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0809d {
    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final C2157a i;
    private Integer j;

    /* renamed from: ax.M5.d$a */
    public static final class a {
        private Account a;
        private ax.B.b b;
        private String c;
        private String d;
        private final C2157a e = C2157a.k0;

        public C0809d a() {
            return new C0809d(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.b == null) {
                this.b = new ax.B.b();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String str) {
            this.d = str;
            return this;
        }
    }

    public C0809d(Account account, Set set, Map map, int i, View view, String str, String str2, C2157a c2157a, boolean z) {
        this.a = account;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = c2157a == null ? C2157a.k0 : c2157a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((A) it.next()).a);
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.a;
    }

    @Deprecated
    public String b() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> d() {
        return this.c;
    }

    public Set<Scope> e(ax.K5.a<?> aVar) {
        A a2 = (A) this.d.get(aVar);
        if (a2 == null || a2.a.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(a2.a);
        return hashSet;
    }

    public String f() {
        return this.g;
    }

    public Set<Scope> g() {
        return this.b;
    }

    public final C2157a h() {
        return this.i;
    }

    public final Integer i() {
        return this.j;
    }

    public final String j() {
        return this.h;
    }

    public final void k(Integer num) {
        this.j = num;
    }
}
