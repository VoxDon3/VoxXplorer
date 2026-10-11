package ax.Wa;

import ax.Va.e;
import ax.ke.InterfaceC2430b;
import ax.me.f;
import ax.me.o;
import ax.me.p;
import ax.me.t;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public interface a {
    @o("/v1/disk/resources/copy")
    InterfaceC2430b<ResponseBody> a(@t("from") String str, @t("path") String str2, @t("overwrite") Boolean bool);

    @f("/v1/disk")
    InterfaceC2430b<ax.Va.b> b(@t("fields") String str);

    @o("/v1/disk/resources/move")
    InterfaceC2430b<ResponseBody> c(@t("from") String str, @t("path") String str2, @t("overwrite") Boolean bool);

    @f("/v1/disk/resources/upload")
    InterfaceC2430b<ax.Va.c> d(@t("path") String str, @t("overwrite") Boolean bool);

    @f("/v1/disk/resources")
    InterfaceC2430b<e> e(@t("path") String str, @t("fields") String str2, @t("limit") Integer num, @t("offset") Integer num2, @t("sort") String str3, @t("preview_size") String str4, @t("preview_crop") Boolean bool);

    @f("/v1/disk/resources/download")
    InterfaceC2430b<ax.Va.c> f(@t("path") String str);

    @p("/v1/disk/resources")
    InterfaceC2430b<ResponseBody> g(@t("path") String str);
}
