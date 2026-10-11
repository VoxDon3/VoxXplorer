.class public final synthetic Lax/b1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/b1/u;

.field public final synthetic d0:I

.field public final synthetic q:Lax/b1/u$a;


# direct methods
.method public synthetic constructor <init>(Lax/b1/u$a;Lax/b1/u;I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/b1/o;->q:Lax/b1/u$a;

    iput-object p2, p0, Lax/b1/o;->c0:Lax/b1/u;

    iput p3, p0, Lax/b1/o;->d0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b1/o;->q:Lax/b1/u$a;

    iget-object v1, p0, Lax/b1/o;->c0:Lax/b1/u;

    iget v2, p0, Lax/b1/o;->d0:I

    invoke-static {v0, v1, v2}, Lax/b1/u$a;->c(Lax/b1/u$a;Lax/b1/u;I)V

    return-void
.end method
