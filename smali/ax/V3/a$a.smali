.class public Lax/V3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/U3/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/V3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/U3/n<",
        "Lax/U3/g;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lax/U3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/U3/l<",
            "Lax/U3/g;",
            "Lax/U3/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/U3/l;

    .line 5
    .line 6
    const/16 v1, 0x1f4

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lax/U3/l;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/V3/a$a;->a:Lax/U3/l;

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public b(Lax/U3/q;)Lax/U3/m;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/U3/q;",
            ")",
            "Lax/U3/m<",
            "Lax/U3/g;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lax/V3/a;

    .line 2
    .line 3
    iget-object v0, p0, Lax/V3/a$a;->a:Lax/U3/l;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lax/V3/a;-><init>(Lax/U3/l;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
