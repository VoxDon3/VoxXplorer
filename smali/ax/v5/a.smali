.class public final synthetic Lax/v5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/p5/p;

.field public final synthetic d0:Lax/n5/j;

.field public final synthetic e0:Lax/p5/i;

.field public final synthetic q:Lax/v5/c;


# direct methods
.method public synthetic constructor <init>(Lax/v5/c;Lax/p5/p;Lax/n5/j;Lax/p5/i;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/v5/a;->q:Lax/v5/c;

    iput-object p2, p0, Lax/v5/a;->c0:Lax/p5/p;

    iput-object p3, p0, Lax/v5/a;->d0:Lax/n5/j;

    iput-object p4, p0, Lax/v5/a;->e0:Lax/p5/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/v5/a;->q:Lax/v5/c;

    iget-object v1, p0, Lax/v5/a;->c0:Lax/p5/p;

    iget-object v2, p0, Lax/v5/a;->d0:Lax/n5/j;

    iget-object v3, p0, Lax/v5/a;->e0:Lax/p5/i;

    invoke-static {v0, v1, v2, v3}, Lax/v5/c;->c(Lax/v5/c;Lax/p5/p;Lax/n5/j;Lax/p5/i;)V

    return-void
.end method
