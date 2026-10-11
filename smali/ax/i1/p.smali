.class public final synthetic Lax/i1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/u;


# instance fields
.field public final synthetic q:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/p;->q:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i1/p;->q:Ljava/lang/Class;

    invoke-static {v0}, Lax/i1/r$a;->b(Ljava/lang/Class;)Lax/i1/F$a;

    move-result-object v0

    return-object v0
.end method
