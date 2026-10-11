/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.b;
import ax.B2.f;
import ax.B2.n;
import ax.B2.u;
import ax.N2.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    private UUID a;
    private b b;
    private Set<String> c;
    private a d;
    private int e;
    private Executor f;
    private c g;
    private u h;
    private n i;
    private f j;
    private int k;

    public WorkerParameters(UUID uUID, b b8, Collection<String> collection, a a8, int n8, int n9, Executor executor, c c8, u u8, n n10, f f8) {
        this.a = uUID;
        this.b = b8;
        this.c = new HashSet<String>(collection);
        this.d = a8;
        this.e = n8;
        this.k = n9;
        this.f = executor;
        this.g = c8;
        this.h = u8;
        this.i = n10;
        this.j = f8;
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

    public static class a {
        public List<String> a;
        public List<Uri> b;
        public Network c;

        public a() {
            List list;
            this.a = list = Collections.EMPTY_LIST;
            this.b = list;
        }
    }
}

