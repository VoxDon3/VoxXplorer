.class public final synthetic Lax/U2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/app/usage/StorageStats;)J
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/app/usage/StorageStats;->getExternalCacheBytes()J

    move-result-wide v0

    return-wide v0
.end method
