package ax.M5;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import ax.J5.C0747h;
import ax.K5.a;
import ax.K5.g;
import ax.L5.InterfaceC0791c;
import ax.L5.InterfaceC0797i;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: ax.M5.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0812g<T extends IInterface> extends AbstractC0808c<T> implements a.f {
    private final C0809d G0;
    private final Set H0;
    private final Account I0;

    @Deprecated
    protected AbstractC0812g(Context context, Looper looper, int i, C0809d c0809d, g.a aVar, g.b bVar) {
        this(context, looper, i, c0809d, (InterfaceC0791c) aVar, (InterfaceC0797i) bVar);
    }

    private final Set l0(Set set) {
        Set<Scope> k0 = k0(set);
        Iterator<Scope> it = k0.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return k0;
    }

    @Override // ax.M5.AbstractC0808c
    protected final Set<Scope> C() {
        return this.H0;
    }

    @Override // ax.K5.a.f
    public Set<Scope> d() {
        return o() ? this.H0 : Collections.EMPTY_SET;
    }

    protected final C0809d j0() {
        return this.G0;
    }

    @Override // ax.M5.AbstractC0808c
    public final Account u() {
        return this.I0;
    }

    @Override // ax.M5.AbstractC0808c
    protected Executor w() {
        return null;
    }

    protected AbstractC0812g(Context context, Looper looper, int i, C0809d c0809d, InterfaceC0791c interfaceC0791c, InterfaceC0797i interfaceC0797i) {
        this(context, looper, AbstractC0813h.c(context), C0747h.o(), i, c0809d, (InterfaceC0791c) C0821p.l(interfaceC0791c), (InterfaceC0797i) C0821p.l(interfaceC0797i));
    }

    protected AbstractC0812g(Context context, Looper looper, AbstractC0813h abstractC0813h, C0747h c0747h, int i, C0809d c0809d, InterfaceC0791c interfaceC0791c, InterfaceC0797i interfaceC0797i) {
        super(context, looper, abstractC0813h, c0747h, i, interfaceC0791c == null ? null : new F(interfaceC0791c), interfaceC0797i != null ? new G(interfaceC0797i) : null, c0809d.j());
        this.G0 = c0809d;
        this.I0 = c0809d.a();
        this.H0 = l0(c0809d.d());
    }

    protected Set<Scope> k0(Set<Scope> set) {
        return set;
    }
}
