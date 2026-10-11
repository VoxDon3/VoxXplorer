.class public final synthetic Lax/o3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/net/nsd/NsdServiceInfo;)Ljava/util/List;
    .registers 1

    .line 1
    invoke-virtual {p0}, Landroid/net/nsd/NsdServiceInfo;->getHostAddresses()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
