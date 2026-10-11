package androidx.work;

import android.net.Network;
import android.net.Uri;
import ax.B2.f;
import ax.B2.n;
import ax.B2.u;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {
    private UUID a;
    private b b;
    private Set<String> c;
    private a d;
    private int e;
    private Executor f;
    private ax.N2.c g;
    private u h;
    private n i;
    private f j;
    private int k;

    public static class a {
        public List<String> a;
        public List<Uri> b;
        public Network c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.a = list;
            this.b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i, int i2, Executor executor, ax.N2.c cVar, u uVar, n nVar, f fVar) {
        this.a = uuid;
        this.b = bVar;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.k = i2;
        this.f = executor;
        this.g = cVar;
        this.h = uVar;
        this.i = nVar;
        this.j = fVar;
    }

    public Executor a() {
        return this.f;
    }

    public f b() {
        return this.j;
    }

    public UUID c() {
        return this.a;
    }

    public b d() {
        return this.b;
    }

    public u e() {
        return this.h;
    }
}
