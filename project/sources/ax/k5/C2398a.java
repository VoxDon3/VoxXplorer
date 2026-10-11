package ax.k5;

import android.util.Log;
import ax.e5.InterfaceC1979a;
import ax.h5.InterfaceC2152b;
import ax.j5.C2315c;
import ax.j5.InterfaceC2314b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.k5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2398a implements InterfaceC2314b {
    private static final String b = "a";
    List<C2315c> a = new ArrayList();

    public C2398a(InterfaceC1979a interfaceC1979a, InterfaceC2152b interfaceC2152b) {
        String str = b;
        Log.i(str, "Found a device without partition table, yay!");
        int b2 = ((int) interfaceC2152b.b()) / interfaceC1979a.d();
        if (interfaceC2152b.b() % interfaceC1979a.d() != 0) {
            Log.w(str, "fs capacity is not multiple of block size");
        }
        this.a.add(new C2315c(interfaceC2152b.a(), 0, b2));
    }

    @Override // ax.j5.InterfaceC2314b
    public List<C2315c> a() {
        return this.a;
    }
}
