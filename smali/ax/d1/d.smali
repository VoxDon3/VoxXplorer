.class public final synthetic Lax/d1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/net/Uri;

.field public final synthetic q:Lax/d1/c$c;


# direct methods
.method public synthetic constructor <init>(Lax/d1/c$c;Landroid/net/Uri;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/d1/d;->q:Lax/d1/c$c;

    iput-object p2, p0, Lax/d1/d;->c0:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d1/d;->q:Lax/d1/c$c;

    iget-object v1, p0, Lax/d1/d;->c0:Landroid/net/Uri;

    invoke-static {v0, v1}, Lax/d1/c$c;->a(Lax/d1/c$c;Landroid/net/Uri;)V

    return-void
.end method
