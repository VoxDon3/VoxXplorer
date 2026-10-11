.class Lax/r0/k0$c;
.super Lax/r0/k0$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/r0/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/r0/k0<",
        "TK;TV;>.g;"
    }
.end annotation


# instance fields
.field final synthetic c0:Lax/r0/k0;


# direct methods
.method private constructor <init>(Lax/r0/k0;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/r0/k0$c;->c0:Lax/r0/k0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lax/r0/k0$g;-><init>(Lax/r0/k0;Lax/r0/k0$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lax/r0/k0;Lax/r0/k0$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/r0/k0$c;-><init>(Lax/r0/k0;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/r0/k0$b;

    .line 2
    .line 3
    iget-object v1, p0, Lax/r0/k0$c;->c0:Lax/r0/k0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lax/r0/k0$b;-><init>(Lax/r0/k0;Lax/r0/k0$a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
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
