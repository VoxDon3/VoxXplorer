.class public final synthetic Lax/b1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/b1/u;

.field public final synthetic d0:Ljava/lang/Exception;

.field public final synthetic q:Lax/b1/u$a;


# direct methods
.method public synthetic constructor <init>(Lax/b1/u$a;Lax/b1/u;Ljava/lang/Exception;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/b1/q;->q:Lax/b1/u$a;

    iput-object p2, p0, Lax/b1/q;->c0:Lax/b1/u;

    iput-object p3, p0, Lax/b1/q;->d0:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b1/q;->q:Lax/b1/u$a;

    iget-object v1, p0, Lax/b1/q;->c0:Lax/b1/u;

    iget-object v2, p0, Lax/b1/q;->d0:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lax/b1/u$a;->e(Lax/b1/u$a;Lax/b1/u;Ljava/lang/Exception;)V

    return-void
.end method
