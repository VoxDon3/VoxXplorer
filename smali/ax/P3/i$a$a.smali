.class Lax/P3/i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/l4/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P3/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/l4/a$d<",
        "Lax/P3/f<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lax/P3/i$a;


# direct methods
.method constructor <init>(Lax/P3/i$a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/P3/i$a$a;->a:Lax/P3/i$a;

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
.method public bridge synthetic a()Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/P3/i$a$a;->b()Lax/P3/f;

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

.method public b()Lax/P3/f;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/P3/f<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/P3/f;

    .line 2
    .line 3
    iget-object v1, p0, Lax/P3/i$a$a;->a:Lax/P3/i$a;

    .line 4
    .line 5
    iget-object v2, v1, Lax/P3/i$a;->a:Lax/P3/f$e;

    .line 6
    .line 7
    iget-object v1, v1, Lax/P3/i$a;->b:Lax/b0/d;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lax/P3/f;-><init>(Lax/P3/f$e;Lax/b0/d;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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
