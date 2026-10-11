.class Lax/i1/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/v7/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/i1/u;->n(Lax/i1/C$a;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/v7/b<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lax/i1/u;


# direct methods
.method constructor <init>(Lax/i1/u;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/i1/u$a;->a:Lax/i1/u;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/i1/u$a;->a:Lax/i1/u;

    .line 2
    .line 3
    invoke-static {p1}, Lax/i1/u;->f(Lax/i1/u;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b(Ljava/lang/Throwable;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/u$a;->a:Lax/i1/u;

    .line 2
    .line 3
    invoke-static {v0}, Lax/i1/u;->h(Lax/i1/u;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
