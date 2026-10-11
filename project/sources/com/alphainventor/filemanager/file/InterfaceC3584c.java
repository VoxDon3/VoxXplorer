package com.voxdon.xplorer.file;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.voxdon.xplorer.file.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3584c {

    /* renamed from: com.voxdon.xplorer.file.c$a */
    public interface a {
        void B();

        void T(boolean z, Object obj);
    }

    InputStream A(String str, String str2, String str3) throws IOException;

    boolean B(AbstractC3595n abstractC3595n);

    List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j;

    void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a;

    void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a;

    void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a;

    int G(String str, String str2);

    String H(AbstractC3595n abstractC3595n);

    void I(AbstractC3595n abstractC3595n) throws C1495j;

    InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j;

    void K(Activity activity, Fragment fragment, a aVar);

    boolean L();

    boolean M(AbstractC3595n abstractC3595n);

    boolean N(AbstractC3595n abstractC3595n);

    boolean O();

    void P(AbstractC3595n abstractC3595n) throws C1495j;

    boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2);

    boolean a();

    void b();

    AbstractC3595n z(String str) throws C1495j;
}
