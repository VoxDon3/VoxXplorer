package ax.k2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import ax.k2.AbstractC2390u;
import ax.l2.InterfaceC2463a;
import ax.o2.h;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ax.k2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2375f {
    public final Context a;
    public final String b;
    public final h.c c;
    public final AbstractC2390u.e d;
    public final List<AbstractC2390u.b> e;
    public final boolean f;
    public final AbstractC2390u.d g;
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
    public final List<InterfaceC2463a> r;
    public final boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public C2375f(Context context, String str, h.c cVar, AbstractC2390u.e eVar, List<? extends AbstractC2390u.b> list, boolean z, AbstractC2390u.d dVar, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, AbstractC2390u.f fVar, List<? extends Object> list2, List<? extends InterfaceC2463a> list3) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cVar, "sqliteOpenHelperFactory");
        ax.Gb.l.f(eVar, "migrationContainer");
        ax.Gb.l.f(dVar, "journalMode");
        ax.Gb.l.f(executor, "queryExecutor");
        ax.Gb.l.f(executor2, "transactionExecutor");
        ax.Gb.l.f(list2, "typeConverters");
        ax.Gb.l.f(list3, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = list;
        this.f = z;
        this.g = dVar;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = list2;
        this.r = list3;
        this.s = intent != null;
    }

    public boolean a(int i, int i2) {
        Set<Integer> set;
        return (i <= i2 || !this.l) && this.k && ((set = this.m) == null || !set.contains(Integer.valueOf(i)));
    }
}
