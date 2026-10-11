.class Lax/r3/e$a;
.super Lax/ea/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/r3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lax/r3/e;


# direct methods
.method public constructor <init>(Lax/r3/e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/r3/e$a;->c:Lax/r3/e;

    invoke-direct {p0}, Lax/ea/a$a;-><init>()V

    return-void
.end method

.method public constructor <init>(Lax/r3/e;IZ)V
    .registers 4

    .line 2
    iput-object p1, p0, Lax/r3/e$a;->c:Lax/r3/e;

    .line 3
    invoke-direct {p0, p2, p3}, Lax/ea/a$a;-><init>(IZ)V

    return-void
.end method
