package com.voxdon.xplorer.file;

import ax.N9.C0841e;
import ax.N9.InterfaceC0842e0;
import ax.b3.C1495j;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.E;
import com.voxdon.xplorer.file.OneDriveFileHelper;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class F {
    private final E.a a;
    private final int b;
    private final InterfaceC3185c c;
    ax.L9.e d;
    int e;
    long f;
    private final ax.P9.b g;
    private final int h;
    private int i = 0;

    class a extends ax.P9.b {
        a(String str, ax.M9.f fVar, List list, Class cls) {
            super(str, fVar, list, cls);
        }
    }

    public F(String str, InterfaceC0842e0 interfaceC0842e0, List<ax.S9.c> list, E.a aVar, int i, InterfaceC3185c interfaceC3185c, int i2, int i3, long j, ax.L9.e eVar) {
        this.a = aVar;
        this.b = i;
        this.c = interfaceC3185c;
        this.d = eVar;
        this.f = j;
        this.e = i3;
        this.h = i2;
        a aVar2 = new a(str, interfaceC0842e0, list, C0841e.class);
        this.g = aVar2;
        aVar2.t(ax.P9.k.PUT);
        aVar2.k("Content-Range", String.format(Locale.US, "bytes %1$d-%2$d/%3$d", Integer.valueOf(i3), Integer.valueOf((i3 + i) - 1), Long.valueOf(j)));
    }

    public <UploadType> C0841e a(ax.L9.a<UploadType> aVar) throws C1495j {
        String str;
        C0841e c0841e;
        ax.M9.d dVar = null;
        while (true) {
            if (this.i >= this.h) {
                break;
            }
            try {
                Thread.sleep(r0 * 2000 * r0);
            } catch (InterruptedException e) {
                this.g.m().a().b("Exception while waiting upload file retry", e);
            }
            try {
                c0841e = (C0841e) this.g.m().b().c(this.g, C0841e.class, new OneDriveFileHelper.i(this.a.b, this.b, this.c, new b()), aVar);
            } catch (ax.M9.d e2) {
                dVar = e2;
                this.g.m().a().a("Request failed with, retry if necessary.");
                c0841e = null;
            }
            if (c0841e != null && c0841e.a()) {
                return c0841e;
            }
            if (c0841e != null && c0841e.d()) {
                dVar = c0841e.b();
            }
            InterfaceC3185c interfaceC3185c = this.c;
            if ((interfaceC3185c != null && interfaceC3185c.isCancelled()) || !this.a.a.a()) {
                break;
            }
            try {
                this.a.b.close();
            } catch (IOException unused) {
            }
            E.a aVar2 = this.a;
            aVar2.b = aVar2.a.c(this.e);
            this.i++;
        }
        if (dVar != null) {
            str = "Upload session failed too many times (" + dVar.getMessage() + ")";
        } else {
            str = "Upload session failed too many times.";
        }
        return new C0841e(new ax.M9.d(str, dVar, ax.M9.e.UploadSessionIncomplete));
    }

    class b implements ax.L9.e {
        b() {
        }

        @Override // ax.L9.e
        public void a(long j, long j2) {
            F f = F.this;
            ax.L9.e eVar = f.d;
            if (eVar != null) {
                eVar.a(f.e + j, f.f);
            }
        }

        @Override // ax.L9.c
        public void c(Object obj) {
        }

        @Override // ax.L9.c
        public void b(ax.M9.d dVar) {
        }
    }
}
