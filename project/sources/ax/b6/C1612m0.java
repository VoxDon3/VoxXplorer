package ax.b6;

import java.io.File;

/* renamed from: ax.b6.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1612m0 implements InterfaceC1620n0 {
    C1612m0() {
    }

    @Override // ax.b6.InterfaceC1620n0
    public final /* synthetic */ String b(File file, String str) {
        return c(file, str, AbstractC1628o0.a);
    }

    @Override // ax.b6.InterfaceC1620n0
    public final /* synthetic */ String c(File file, String str, AbstractC1628o0 abstractC1628o0) {
        return d(new File(file, str).getPath(), abstractC1628o0);
    }

    @Override // ax.b6.InterfaceC1620n0
    public final /* synthetic */ String d(String str, AbstractC1628o0 abstractC1628o0) {
        return a(str, abstractC1628o0, EnumC1636p0.RAW_FILE_IO_TYPE);
    }

    @Override // ax.b6.InterfaceC1620n0
    public final /* synthetic */ String h(String str) {
        return d(str, AbstractC1628o0.a);
    }

    @Override // ax.b6.InterfaceC1620n0
    public final String a(String str, AbstractC1628o0 abstractC1628o0, EnumC1636p0 enumC1636p0) {
        return str;
    }
}
