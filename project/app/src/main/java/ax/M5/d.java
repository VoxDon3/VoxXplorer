/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.accounts.Account;
import android.view.View;
import ax.B.b;
import ax.M5.A;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class d {
    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final ax.h6.a i;
    private Integer j;

    public d(Account object, Set iterator, Map object2, int n8, View view, String string, String string2, ax.h6.a a8, boolean bl) {
        this.a = object;
        object = iterator == null ? Collections.EMPTY_SET : java.util.DesugarCollections.unmodifiableSet((Set)((Object)iterator));
        this.b = object;
        iterator = object2;
        if (object2 == null) {
            iterator = Collections.EMPTY_MAP;
        }
        this.d = iterator;
        this.f = view;
        this.e = n8;
        this.g = string;
        this.h = string2;
        object2 = a8;
        if (a8 == null) {
            object2 = ax.h6.a.k0;
        }
        this.i = object2;
        object = new HashSet(object);
        iterator = iterator.values().iterator();
        while (iterator.hasNext()) {
            object.addAll(((A)iterator.next()).a);
        }
        this.c = java.util.DesugarCollections.unmodifiableSet((Set)object);
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
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    public Set<Scope> d() {
        return this.c;
    }

    public Set<Scope> e(ax.K5.a<?> object) {
        A a8 = (A)this.d.get(object);
        if (a8 != null && !a8.a.isEmpty()) {
            object = new HashSet(this.b);
            object.addAll(a8.a);
            return object;
        }
        return this.b;
    }

    public String f() {
        return this.g;
    }

    public Set<Scope> g() {
        return this.b;
    }

    public final ax.h6.a h() {
        return this.i;
    }

    public final Integer i() {
        return this.j;
    }

    public final String j() {
        return this.h;
    }

    public final void k(Integer n8) {
        this.j = n8;
    }

    public static final class a {
        private Account a;
        private b b;
        private String c;
        private String d;
        private final ax.h6.a e = ax.h6.a.k0;

        public d a() {
            return new d(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        public a b(String string) {
            this.c = string;
            return this;
        }

        public final a c(Collection collection) {
            if (this.b == null) {
                this.b = new b();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String string) {
            this.d = string;
            return this;
        }
    }
}

