.class final Lax/B/a$b;
.super Lax/B/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/B/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/B/g<",
        "TK;>;"
    }
.end annotation


# instance fields
.field final synthetic e0:Lax/B/a;


# direct methods
.method constructor <init>(Lax/B/a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/B/a$b;->e0:Lax/B/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/B/k;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-direct {p0, p1}, Lax/B/g;-><init>(I)V

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


# virtual methods
.method protected b(I)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/B/a$b;->e0:Lax/B/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->f(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected c(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/B/a$b;->e0:Lax/B/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->i(I)Ljava/lang/Object;

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
