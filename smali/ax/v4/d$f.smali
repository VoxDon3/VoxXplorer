.class final Lax/v4/d$f;
.super Lax/v4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/v4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lax/v4/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final b:Lax/v4/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/v4/c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/v4/c;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/v4/c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/v4/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/v4/d$f;->b:Lax/v4/c;

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
.method public a(Lax/T4/j;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/T4/j;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/T4/m;->w0:Lax/T4/m;

    .line 6
    .line 7
    if-ne v0, v1, :cond_d

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_d
    iget-object v0, p0, Lax/v4/d$f;->b:Lax/v4/c;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
.end method

.method public k(Ljava/lang/Object;Lax/T4/g;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lax/T4/g;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_6

    .line 2
    .line 3
    invoke-virtual {p2}, Lax/T4/g;->p()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_6
    iget-object v0, p0, Lax/v4/d$f;->b:Lax/v4/c;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
