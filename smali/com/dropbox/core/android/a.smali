.class public final Lcom/dropbox/core/android/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dropbox/core/android/a$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/dropbox/core/android/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/dropbox/core/android/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/dropbox/core/android/a$a;-><init>(Lax/Gb/g;)V

    sput-object v0, Lcom/dropbox/core/android/a;->a:Lcom/dropbox/core/android/a$a;

    return-void
.end method

.method public static final a()Lax/u4/a;
    .registers 1

    .line 1
    sget-object v0, Lcom/dropbox/core/android/a;->a:Lcom/dropbox/core/android/a$a;

    invoke-virtual {v0}, Lcom/dropbox/core/android/a$a;->a()Lax/u4/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Landroid/content/Context;Ljava/lang/String;Lax/p4/m;)V
    .registers 4

    .line 1
    sget-object v0, Lcom/dropbox/core/android/a;->a:Lcom/dropbox/core/android/a$a;

    invoke-virtual {v0, p0, p1, p2}, Lcom/dropbox/core/android/a$a;->c(Landroid/content/Context;Ljava/lang/String;Lax/p4/m;)V

    return-void
.end method
