.class public final synthetic Lax/q4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/content/Intent;

.field public final synthetic d0:Ljava/lang/String;

.field public final synthetic q:Lcom/dropbox/core/android/AuthActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/dropbox/core/android/AuthActivity;Landroid/content/Intent;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/q4/a;->q:Lcom/dropbox/core/android/AuthActivity;

    iput-object p2, p0, Lax/q4/a;->c0:Landroid/content/Intent;

    iput-object p3, p0, Lax/q4/a;->d0:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/q4/a;->q:Lcom/dropbox/core/android/AuthActivity;

    iget-object v1, p0, Lax/q4/a;->c0:Landroid/content/Intent;

    iget-object v2, p0, Lax/q4/a;->d0:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/dropbox/core/android/AuthActivity;->a(Lcom/dropbox/core/android/AuthActivity;Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method
