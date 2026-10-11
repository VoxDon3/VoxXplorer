/*
 * Decompiled with CFR 0.152.
 */
package ax.Wa;

import ax.Va.b;
import ax.Va.c;
import ax.Va.e;
import ax.me.f;
import ax.me.o;
import ax.me.p;
import ax.me.t;
import okhttp3.ResponseBody;

public interface a {
    @o(value="/v1/disk/resources/copy")
    public ax.ke.b<ResponseBody> a(@t(value="from") String var1, @t(value="path") String var2, @t(value="overwrite") Boolean var3);

    @f(value="/v1/disk")
    public ax.ke.b<b> b(@t(value="fields") String var1);

    @o(value="/v1/disk/resources/move")
    public ax.ke.b<ResponseBody> c(@t(value="from") String var1, @t(value="path") String var2, @t(value="overwrite") Boolean var3);

    @f(value="/v1/disk/resources/upload")
    public ax.ke.b<c> d(@t(value="path") String var1, @t(value="overwrite") Boolean var2);

    @f(value="/v1/disk/resources")
    public ax.ke.b<e> e(@t(value="path") String var1, @t(value="fields") String var2, @t(value="limit") Integer var3, @t(value="offset") Integer var4, @t(value="sort") String var5, @t(value="preview_size") String var6, @t(value="preview_crop") Boolean var7);

    @f(value="/v1/disk/resources/download")
    public ax.ke.b<c> f(@t(value="path") String var1);

    @p(value="/v1/disk/resources")
    public ax.ke.b<ResponseBody> g(@t(value="path") String var1);
}

