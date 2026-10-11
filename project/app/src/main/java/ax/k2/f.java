/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import ax.Gb.l;
import ax.k2.u;
import ax.l2.a;
import ax.o2.h;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class f {
    public final Context a;
    public final String b;
    public final h.c c;
    public final u.e d;
    public final List<u.b> e;
    public final boolean f;
    public final u.d g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    private final Set<Integer> m;
    public final String n;
    public final File o;
    public final Callable<InputStream> p;
    public final List<Object> q;
    public final List<a> r;
    public final boolean s;

    @SuppressLint(value={"LambdaLast"})
    public f(Context context, String string, h.c c8, u.e e8, List<? extends u.b> list, boolean bl, u.d d8, Executor executor, Executor executor2, Intent intent, boolean bl2, boolean bl3, Set<Integer> set, String string2, File file, Callable<InputStream> callable, u.f f8, List<? extends Object> list2, List<? extends a> list3) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(c8, "sqliteOpenHelperFactory");
        ax.Gb.l.f(e8, "migrationContainer");
        ax.Gb.l.f((Object)d8, "journalMode");
        ax.Gb.l.f(executor, "queryExecutor");
        ax.Gb.l.f(executor2, "transactionExecutor");
        ax.Gb.l.f(list2, "typeConverters");
        ax.Gb.l.f(list3, "autoMigrationSpecs");
        this.a = context;
        this.b = string;
        this.c = c8;
        this.d = e8;
        this.e = list;
        this.f = bl;
        this.g = d8;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = bl2;
        this.l = bl3;
        this.m = set;
        this.n = string2;
        this.o = file;
        this.p = callable;
        this.q = list2;
        this.r = list3;
        bl = intent != null;
        this.s = bl;
    }

    public boolean a(int n8, int n9) {
        Set<Integer> set;
        if (n8 > n9 && this.l) {
            return false;
        }
        return this.k && ((set = this.m) == null || !set.contains(n8));
    }
}

