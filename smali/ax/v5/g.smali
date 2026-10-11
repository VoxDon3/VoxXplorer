.class public final Lax/v5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/r5/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/r5/b<",
        "Lax/w5/f;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lax/ib/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/ib/a<",
            "Lax/z5/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/ib/a;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/ib/a<",
            "Lax/z5/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/v5/g;->a:Lax/ib/a;

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

.method public static a(Lax/z5/a;)Lax/w5/f;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/v5/f;->a(Lax/z5/a;)Lax/w5/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lax/r5/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lax/w5/f;

    .line 10
    .line 11
    return-object p0
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

.method public static b(Lax/ib/a;)Lax/v5/g;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/ib/a<",
            "Lax/z5/a;",
            ">;)",
            "Lax/v5/g;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/v5/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/v5/g;-><init>(Lax/ib/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
.method public c()Lax/w5/f;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/v5/g;->a:Lax/ib/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/ib/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/z5/a;

    .line 8
    .line 9
    invoke-static {v0}, Lax/v5/g;->a(Lax/z5/a;)Lax/w5/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/v5/g;->c()Lax/w5/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
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
.end method
