package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1492g;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.c3.k0;
import ax.h5.C2156f;
import ax.h5.InterfaceC2155e;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.voxdon.xplorer.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class U extends AbstractC3594m {
    private InterfaceC2155e h;

    private static class a extends AbstractC3199q<String, Void, Boolean> {
        Context h;
        InterfaceC3584c.a i;
        U j;
        String k;

        a(Context context, U u, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.h = context;
            this.i = aVar;
            this.j = u;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(String... strArr) {
            String str;
            try {
                ax.Q2.o.i().e(this.h);
                InterfaceC2155e k = ax.Q2.o.i().k();
                this.j.n0(k);
                return k == null ? Boolean.FALSE : Boolean.TRUE;
            } catch (ax.b3.C unused) {
                this.k = this.h.getString(R.string.storage_device_not_recognized);
                return Boolean.FALSE;
            } catch (ax.b3.G e) {
                if (e.a() == 7) {
                    Context context = this.h;
                    str = context.getString(R.string.not_supported_filesystem, context.getString(R.string.ntfs_exfat_hpfs));
                } else {
                    str = null;
                }
                this.k = str;
                return Boolean.FALSE;
            } catch (C1495j unused2) {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (this.i != null) {
                if (bool.booleanValue()) {
                    this.i.T(true, null);
                } else {
                    this.i.T(false, this.k);
                }
            }
        }
    }

    private boolean k0(AbstractC3595n abstractC3595n, boolean z) {
        InterfaceC2155e l0;
        try {
            if (!abstractC3595n.n() && (l0 = l0(abstractC3595n.T())) != null) {
                String B = abstractC3595n.B();
                if (z) {
                    l0.n(B);
                    return true;
                }
                l0.p0(B).close();
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e2) {
            e2.printStackTrace();
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
        }
        return false;
    }

    private InterfaceC2155e l0(String str) throws IOException {
        C3184b.c(d0.B(str));
        InterfaceC2155e interfaceC2155e = this.h;
        if (interfaceC2155e == null) {
            return null;
        }
        return d0.D(v(), str) ? interfaceC2155e : interfaceC2155e.H0(str.substring(1));
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        if (!a()) {
            return null;
        }
        try {
            return J(z(str2), 0L);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        C3184b.c(abstractC3595n.isDirectory());
        try {
            try {
                ArrayList arrayList = new ArrayList();
                InterfaceC2155e l0 = l0(abstractC3595n.E());
                if (l0 == null) {
                    throw new ax.b3.t();
                }
                if (!l0.isDirectory()) {
                    throw new C1495j("This is not directory");
                }
                InterfaceC2155e[] B0 = l0.B0();
                if (B0 != null) {
                    for (InterfaceC2155e interfaceC2155e : B0) {
                        String name = interfaceC2155e.getName();
                        if (!TextUtils.isEmpty(name) && d0.A(name)) {
                            V v = new V(this, d0.Q(abstractC3595n.E(), name), interfaceC2155e);
                            if (interfaceC2155e.isDirectory()) {
                                try {
                                    v.d0(interfaceC2155e.c0().length);
                                } catch (IOException unused) {
                                }
                            }
                            arrayList.add(v);
                        } else if (TextUtils.isEmpty(name)) {
                            ax.Ha.c.h().f().d("USB CHILD NAME 1").g("name:" + name + ":lfn:" + interfaceC2155e.W0() + ":short:" + interfaceC2155e.z()).h();
                        } else {
                            ax.Ha.c.h().f().d("USB CHILD NAME 2").g("name:" + name + ":lfn:" + interfaceC2155e.W0() + ":short:" + interfaceC2155e.z()).h();
                        }
                    }
                }
                return arrayList;
            } catch (IllegalArgumentException e) {
                ax.Ha.c.h().b("USB illegalargument").l(e).h();
                throw new C1495j(e);
            }
        } catch (com.github.mjdev.libaums.a e2) {
            throw new C1492g(e2);
        } catch (IOException e3) {
            throw new C1495j(e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n.n());
        InputStream inputStream = null;
        try {
            try {
                InterfaceC2155e l0 = l0(abstractC3595n.T());
                if (l0 == null) {
                    throw new ax.b3.t();
                }
                InterfaceC2155e p0 = l0.p0(abstractC3595n.B());
                byte[] bArr = new byte[8192];
                InputStream b = g.b();
                long j2 = 0;
                while (true) {
                    int read = b.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    p0.l(j2, ByteBuffer.wrap(bArr, 0, read));
                    j2 += read;
                    if (iVar != null) {
                        iVar.a(j2, j);
                    }
                }
                if (l != null && l.longValue() > 0) {
                    try {
                        p0.R0(l.longValue());
                    } catch (Exception unused) {
                    }
                }
                p0.close();
                try {
                    b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            if (e3.getMessage() == null || !e3.getMessage().startsWith("Could not write")) {
                ax.Ha.c.h().f().d("!!USB writeFile 3").g(e3.getMessage()).h();
            } else if (ax.Q2.o.i().a(p())) {
                ax.Ha.c.h().f().d("!!USB writeFile 1 : could not write").g(e3.getMessage()).h();
            }
            if (!ax.Q2.o.i().a(p())) {
                throw new ax.b3.H(e3);
            }
            throw new C1495j(e3);
        } catch (ArrayIndexOutOfBoundsException e4) {
            e = e4;
            throw new C1495j(e);
        } catch (IllegalArgumentException e5) {
            e = e5;
            throw new C1495j(e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        try {
            InterfaceC2155e l0 = l0(abstractC3595n.E());
            if (l0 == null) {
                throw new C1495j("Cannot get source usb file");
            }
            long length = l0.getLength();
            String T = abstractC3595n.T();
            String T2 = abstractC3595n2.T();
            if (T.equals(T2)) {
                l0.w0(abstractC3595n2.B());
            } else {
                InterfaceC2155e l02 = l0(T2);
                if (l02 == null) {
                    throw new C1495j("Target parent does not exist");
                }
                if (!abstractC3595n.B().equals(abstractC3595n2.B())) {
                    l0.w0(abstractC3595n2.B());
                }
                l0.X0(l02);
            }
            if (iVar != null) {
                iVar.a(length, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new C1495j(e);
        } catch (IllegalArgumentException e2) {
            throw new C1495j(e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        D(abstractC3595n2, s(abstractC3595n), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (EnumC1837z.IMAGE != abstractC3595n.G()) {
            return null;
        }
        return C1809B.Y(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        C3184b.g("not support delete file recursively");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        try {
            InterfaceC2155e l0 = l0(abstractC3595n.E());
            if (l0 == null) {
                throw new C1495j("UsbFile is null");
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new C2156f(l0));
            if (j == 0) {
                return bufferedInputStream;
            }
            bufferedInputStream.skip(j);
            return bufferedInputStream;
        } catch (IOException e) {
            if (ax.Q2.o.i().a(p())) {
                throw new C1495j(e);
            }
            throw new ax.b3.H(e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new C1495j(e);
        } catch (UnsupportedOperationException e3) {
            e = e3;
            throw new C1495j(e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        if (aVar != null) {
            aVar.B();
        }
        try {
            new a(p(), this, aVar).h(new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        return k0(abstractC3595n, true);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        return k0(abstractC3595n, false);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            InterfaceC2155e l0 = l0(abstractC3595n.E());
            if (l0 == null) {
                throw new C1495j("USBFile is null");
            }
            l0.delete();
        } catch (com.github.mjdev.libaums.a e) {
            e.printStackTrace();
            throw new C1495j(e);
        } catch (IOException e2) {
            e2.printStackTrace();
            if (!ax.Q2.o.i().a(p())) {
                throw new ax.b3.H(e2);
            }
            ax.Ha.c.h().f().d("Usb delete 1").g(e2.getMessage()).h();
            throw new C1495j(e2);
        } catch (IllegalArgumentException e3) {
            ax.Ha.c.h().f().d("USB IllegalArgumentException?").l(e3).h();
            throw new C1495j(e3);
        } catch (IllegalStateException e4) {
            ax.Ha.c.h().f().d("DELETE USB ROOT?").g(abstractC3595n.E()).h();
            throw new C1495j(e4);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean Y() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return this.h != null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        ax.Q2.o.i().d();
        n0(null);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public V z(String str) throws C1495j {
        try {
            return d0.D(v(), str) ? new V(this, str, this.h) : new V(this, str, l0(str));
        } catch (IOException e) {
            e.printStackTrace();
            if (ax.Q2.o.i().a(p())) {
                throw new C1495j(e);
            }
            throw new ax.b3.H(e);
        } catch (IllegalArgumentException e2) {
            throw new C1495j(e2);
        }
    }

    void n0(InterfaceC2155e interfaceC2155e) {
        this.h = interfaceC2155e;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        return new k0(ax.Q2.o.i().h(), ax.Q2.o.i().j(), 0);
    }
}
