.class public final synthetic Lax/i1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/u;


# instance fields
.field public final synthetic c0:Lax/U0/g$a;

.field public final synthetic q:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Lax/U0/g$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/m;->q:Ljava/lang/Class;

    iput-object p2, p0, Lax/i1/m;->c0:Lax/U0/g$a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/m;->q:Ljava/lang/Class;

    iget-object v1, p0, Lax/i1/m;->c0:Lax/U0/g$a;

    invoke-static {v0, v1}, Lax/i1/r$a;->a(Ljava/lang/Class;Lax/U0/g$a;)Lax/i1/F$a;

    move-result-object v0

    return-object v0
.end method
