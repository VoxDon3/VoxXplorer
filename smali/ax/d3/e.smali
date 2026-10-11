.class public final synthetic Lax/d3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/os/storage/StorageManager;Ljava/lang/String;I)Landroid/app/PendingIntent;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/os/storage/StorageManager;->getManageSpaceActivityIntent(Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method
