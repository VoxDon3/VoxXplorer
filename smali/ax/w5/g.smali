.class public final synthetic Lax/w5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/p5/p;

.field public final synthetic d0:I

.field public final synthetic e0:Ljava/lang/Runnable;

.field public final synthetic q:Lax/w5/r;


# direct methods
.method public synthetic constructor <init>(Lax/w5/r;Lax/p5/p;ILjava/lang/Runnable;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/g;->q:Lax/w5/r;

    iput-object p2, p0, Lax/w5/g;->c0:Lax/p5/p;

    iput p3, p0, Lax/w5/g;->d0:I

    iput-object p4, p0, Lax/w5/g;->e0:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/w5/g;->q:Lax/w5/r;

    iget-object v1, p0, Lax/w5/g;->c0:Lax/p5/p;

    iget v2, p0, Lax/w5/g;->d0:I

    iget-object v3, p0, Lax/w5/g;->e0:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Lax/w5/r;->i(Lax/w5/r;Lax/p5/p;ILjava/lang/Runnable;)V

    return-void
.end method
