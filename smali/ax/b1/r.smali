.class public final synthetic Lax/b1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/b1/u;

.field public final synthetic q:Lax/b1/u$a;


# direct methods
.method public synthetic constructor <init>(Lax/b1/u$a;Lax/b1/u;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/b1/r;->q:Lax/b1/u$a;

    iput-object p2, p0, Lax/b1/r;->c0:Lax/b1/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b1/r;->q:Lax/b1/u$a;

    iget-object v1, p0, Lax/b1/r;->c0:Lax/b1/u;

    invoke-static {v0, v1}, Lax/b1/u$a;->f(Lax/b1/u$a;Lax/b1/u;)V

    return-void
.end method
