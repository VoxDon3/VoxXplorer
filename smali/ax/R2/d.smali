.class public final synthetic Lax/R2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Lcom/voxdon/xplorer/activity/LaunchActivity;)Landroid/app/ComponentCaller;
    .registers 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getCaller()Landroid/app/ComponentCaller;

    move-result-object p0

    return-object p0
.end method
